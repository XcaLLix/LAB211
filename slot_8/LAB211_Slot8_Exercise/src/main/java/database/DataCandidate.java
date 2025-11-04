/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author xcall
 */
import model.Candidate;
import java.util.List;
import java.util.Optional;

public interface DataCandidate {
    
    boolean insert(Candidate c) throws Exception;      
    boolean update(Candidate c) throws Exception;      
    boolean deleteById(String candidateId) throws Exception;

    Optional<Candidate> findById(String candidateId) throws Exception;
    List<Candidate> findAllByType(int candidateType) throws Exception;   
    List<String>  listNamesByType(int candidateType) throws Exception;   
    List<Candidate> searchByNameAndType(String keyword, int candidateType) throws Exception;
}
