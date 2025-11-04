/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author xcall
 */
import model.*;
import util.DB;
import java.sql.*;
import java.util.*;

public class DataCandidateImpl implements DataCandidate {

    @Override
    public boolean insert(Candidate c) throws Exception {
        String base = "INSERT INTO Candidate(CandidateId,FirstName,LastName,BirthYear,Address,Phone,Email,CandidateType)"
                    + " VALUES(?,?,?,?,?,?,?,?)";
        try (Connection cn = DB.getConnection()) {
            cn.setAutoCommit(false);
            try (PreparedStatement ps = cn.prepareStatement(base)) {
                ps.setString(1, c.getCandidateId());
                ps.setString(2, c.getFirstName());
                ps.setString(3, c.getLastName());
                ps.setInt(4, c.getBirthDate());
                ps.setString(5, c.getAddress());
                ps.setString(6, c.getPhone());
                ps.setString(7, c.getEmail());
                ps.setInt(8, c.getCandidateType());
                ps.executeUpdate();
            }
            if (c instanceof Experience e) {
                try (PreparedStatement ps = cn.prepareStatement(
                        "INSERT INTO Experience(CandidateId,ExpInYear,ProSkill) VALUES(?,?,?)")) {
                    ps.setString(1, e.getCandidateId());
                    ps.setInt(2, e.getExpInYear());
                    ps.setString(3, e.getProSkill());
                    ps.executeUpdate();
                }
            } else if (c instanceof Fresher f) {
                try (PreparedStatement ps = cn.prepareStatement(
                        "INSERT INTO Fresher(CandidateId,GraduationYear,GraduationRank,Education) VALUES(?,?,?,?)")) {
                    ps.setString(1, f.getCandidateId());
                    ps.setInt(2, f.getGraduationDate());
                    ps.setString(3, f.getGraduationRank());
                    ps.setString(4, f.getEducation());
                    ps.executeUpdate();
                }
            } else if (c instanceof Intern i) {
                try (PreparedStatement ps = cn.prepareStatement(
                        "INSERT INTO Intern(CandidateId,Majors,Semester,UniversityName) VALUES(?,?,?,?)")) {
                    ps.setString(1, i.getCandidateId());
                    ps.setString(2, i.getMajors());
                    ps.setInt(3, i.getSemester());
                    ps.setString(4, i.getUniversityName());
                    ps.executeUpdate();
                }
            }
            cn.commit();
            return true;
        }
    }

    @Override
    public boolean update(Candidate c) throws Exception {
        String base = "UPDATE Candidate SET FirstName=?,LastName=?,BirthYear=?,Address=?,Phone=?,Email=?,CandidateType=? WHERE CandidateId=?";
        try (Connection cn = DB.getConnection()) {
            cn.setAutoCommit(false);
            try (PreparedStatement ps = cn.prepareStatement(base)) {
                ps.setString(1, c.getFirstName());
                ps.setString(2, c.getLastName());
                ps.setInt(3, c.getBirthDate());
                ps.setString(4, c.getAddress());
                ps.setString(5, c.getPhone());
                ps.setString(6, c.getEmail());
                ps.setInt(7, c.getCandidateType());
                ps.setString(8, c.getCandidateId());
                ps.executeUpdate();
            }
            if (c instanceof Experience e) {
                try (PreparedStatement ps = cn.prepareStatement(
                        "UPDATE Experience SET ExpInYear=?, ProSkill=? WHERE CandidateId=?")) {
                    ps.setInt(1, e.getExpInYear());
                    ps.setString(2, e.getProSkill());
                    ps.setString(3, e.getCandidateId());
                    ps.executeUpdate();
                }
            } else if (c instanceof Fresher f) {
                try (PreparedStatement ps = cn.prepareStatement(
                        "UPDATE Fresher SET GraduationYear=?, GraduationRank=?, Education=? WHERE CandidateId=?")) {
                    ps.setInt(1, f.getGraduationDate());
                    ps.setString(2, f.getGraduationRank());
                    ps.setString(3, f.getEducation());
                    ps.setString(4, f.getCandidateId());
                    ps.executeUpdate();
                }
            } else if (c instanceof Intern i) {
                try (PreparedStatement ps = cn.prepareStatement(
                        "UPDATE Intern SET Majors=?, Semester=?, UniversityName=? WHERE CandidateId=?")) {
                    ps.setString(1, i.getMajors());
                    ps.setInt(2, i.getSemester());
                    ps.setString(3, i.getUniversityName());
                    ps.setString(4, i.getCandidateId());
                    ps.executeUpdate();
                }
            }
            cn.commit();
            return true;
        }
    }

    @Override
    public boolean deleteById(String id) throws Exception {
        try (Connection cn = DB.getConnection();
             PreparedStatement ps = cn.prepareStatement("DELETE FROM Candidate WHERE CandidateId=?")) {
            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public Optional<Candidate> findById(String id) throws Exception {
        try (Connection cn = DB.getConnection();
             PreparedStatement ps = cn.prepareStatement("SELECT * FROM Candidate WHERE CandidateId=?")) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) return Optional.empty();
                int type = rs.getInt("CandidateType");
                Candidate base = mapBase(rs);
                return Optional.of(attachSubType(cn, base, type));
            }
        }
    }

    @Override
    public List<Candidate> findAllByType(int type) throws Exception {
        try (Connection cn = DB.getConnection();
             PreparedStatement ps = cn.prepareStatement("SELECT * FROM Candidate WHERE CandidateType=?")) {
            ps.setInt(1, type);
            try (ResultSet rs = ps.executeQuery()) {
                List<Candidate> out = new ArrayList<>();
                while (rs.next()) {
                    Candidate base = mapBase(rs);
                    out.add(attachSubType(cn, base, type));
                }
                return out;
            }
        }
    }

    @Override
    public List<String> listNamesByType(int type) throws Exception {
        try (Connection cn = DB.getConnection();
             PreparedStatement ps = cn.prepareStatement(
                     "SELECT FirstName, LastName FROM Candidate WHERE CandidateType=? ORDER BY LastName, FirstName")) {
            ps.setInt(1, type);
            try (ResultSet rs = ps.executeQuery()) {
                List<String> names = new ArrayList<>();
                while (rs.next()) names.add(rs.getString(1) + " " + rs.getString(2));
                return names;
            }
        }
    }

    @Override
    public List<Candidate> searchByNameAndType(String kw, int type) throws Exception {
        String sql = "SELECT * FROM Candidate WHERE CandidateType=? AND (LOWER(FirstName) LIKE ? OR LOWER(LastName) LIKE ?)";
        try (Connection cn = DB.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            String like = "%" + kw.toLowerCase() + "%";
            ps.setInt(1, type);
            ps.setString(2, like);
            ps.setString(3, like);
            try (ResultSet rs = ps.executeQuery()) {
                List<Candidate> out = new ArrayList<>();
                while (rs.next()) {
                    Candidate base = mapBase(rs);
                    out.add(attachSubType(cn, base, type));
                }
                return out;
            }
        }
    }

    // ===== helpers =====
    private Candidate mapBase(ResultSet rs) throws Exception {
        return new Candidate(
                rs.getString("CandidateId"),
                rs.getString("FirstName"),
                rs.getString("LastName"),
                rs.getInt("BirthYear"),
                rs.getString("Address"),
                rs.getString("Phone"),
                rs.getString("Email"),
                rs.getInt("CandidateType")
        ) {}; 
    }

    private Candidate attachSubType(Connection cn, Candidate base, int type) throws Exception {
        String id = base.getCandidateId();
        if (type == 0) {
            try (PreparedStatement ps = cn.prepareStatement(
                    "SELECT ExpInYear, ProSkill FROM Experience WHERE CandidateId=?")) {
                ps.setString(1, id);
                try (ResultSet r = ps.executeQuery()) {
                    if (r.next()) return new Experience(
                            id, base.getFirstName(), base.getLastName(), base.getBirthDate(),
                            base.getAddress(), base.getPhone(), base.getEmail(), 0,
                            r.getInt(1), r.getString(2));
                }
            }
        } else if (type == 1) {
            try (PreparedStatement ps = cn.prepareStatement(
                    "SELECT GraduationYear, GraduationRank, Education FROM Fresher WHERE CandidateId=?")) {
                ps.setString(1, id);
                try (ResultSet r = ps.executeQuery()) {
                    if (r.next()) return new Fresher(
                            id, base.getFirstName(), base.getLastName(), base.getBirthDate(),
                            base.getAddress(), base.getPhone(), base.getEmail(), 1,
                            r.getInt(1), r.getString(2), r.getString(3));
                }
            }
        } else if (type == 2) {
            try (PreparedStatement ps = cn.prepareStatement(
                    "SELECT Majors, Semester, UniversityName FROM Intern WHERE CandidateId=?")) {
                ps.setString(1, id);
                try (ResultSet r = ps.executeQuery()) {
                    if (r.next()) return new Intern(
                            id, base.getFirstName(), base.getLastName(), base.getBirthDate(),
                            base.getAddress(), base.getPhone(), base.getEmail(), 2,
                            r.getString(1), r.getInt(2), r.getString(3));
                }
            }
        }
        return base;
    }
}