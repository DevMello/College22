CREATE TABLE Department (

                            Department_ID INT IDENTITY(1,1) PRIMARY KEY NOT NULL,

                            Department_Name VARCHAR (100),

                            Department_Status VARCHAR (100),

                            Department_DateCreated DATE,

                            Department_DateUpdated DATE

)

CREATE TABLE Candidate_Payment (

                                   Payment_ID INT IDENTITY(1,1) PRIMARY KEY NOT NULL,

                                   Department INT,

                                   Recruiter INT,

                                   TimeCard INT,

                                   Check_Amount Decimal (6,2),

                                   Check_Number INT,

                                   Check_Date DATE,

                                   Candidate_Payment_Status VARCHAR (100),

                                   Candidate_Payment_DateCreated DATE,

                                   Candidate_Payment_DateUpdated DATE,

                                   FOREIGN KEY (Department) REFERENCES Department,

                                   FOREIGN KEY (TimeCard) REFERENCES TimeCard,

                                   FOREIGN KEY (Recruiter) REFERENCES Recruiter,

)






