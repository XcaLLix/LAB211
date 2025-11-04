CREATE DATABASE CandidateDB;
GO
USE CandidateDB;
GO

-- 2. Bảng cha
CREATE TABLE Candidate (
    CandidateId    VARCHAR(20)  NOT NULL PRIMARY KEY,
    FirstName      NVARCHAR(50) NOT NULL,
    LastName       NVARCHAR(50) NOT NULL,
    BirthYear      INT          NOT NULL CHECK (BirthYear BETWEEN 1900 AND YEAR(GETDATE())),
    Address        NVARCHAR(200) NULL,
    Phone          VARCHAR(20)  NOT NULL CHECK (LEN(Phone) >= 10),
    Email          VARCHAR(100) NOT NULL,
    CandidateType  INT          NOT NULL CHECK (CandidateType IN (0,1,2)),
    CONSTRAINT UQ_Candidate_Email UNIQUE (Email)
);

-- 3. Bảng Experience
CREATE TABLE Experience (
    CandidateId VARCHAR(20) NOT NULL PRIMARY KEY
        FOREIGN KEY REFERENCES Candidate(CandidateId) ON DELETE CASCADE,
    ExpInYear   INT NOT NULL CHECK (ExpInYear BETWEEN 0 AND 100),
    ProSkill    NVARCHAR(100) NOT NULL
);

-- 4. Bảng Fresher
CREATE TABLE Fresher (
    CandidateId     VARCHAR(20) NOT NULL PRIMARY KEY
        FOREIGN KEY REFERENCES Candidate(CandidateId) ON DELETE CASCADE,
    GraduationYear  INT NOT NULL CHECK (GraduationYear BETWEEN 1900 AND YEAR(GETDATE())),
    GraduationRank  NVARCHAR(20) NOT NULL CHECK (GraduationRank IN (N'Excellence',N'Good',N'Fair',N'Poor')),
    Education       NVARCHAR(100) NOT NULL
);

-- 5. Bảng Intern
CREATE TABLE Intern (
    CandidateId    VARCHAR(20) NOT NULL PRIMARY KEY
        FOREIGN KEY REFERENCES Candidate(CandidateId) ON DELETE CASCADE,
    Majors         NVARCHAR(100) NOT NULL,
    Semester       INT NOT NULL CHECK (Semester BETWEEN 1 AND 12),
    UniversityName NVARCHAR(150) NOT NULL
);

-- 6. Index hỗ trợ tìm kiếm theo tên + loại
CREATE INDEX IX_Candidate_Name ON Candidate(FirstName, LastName);
CREATE INDEX IX_Candidate_Type ON Candidate(CandidateType);

