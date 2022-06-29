SELECT TOP 10 t.course_id
FROM cis55_35.dbo.takes t
WHERE ID=12345
--For the student with ID =12345 (or any other value you for specific student ID), show all course_id and title of all courses registered for by that student.
SELECT Top 10 t.course_id, c.title, SUM (c.credits) as Credits
FROM cis55_35.dbo.takes t, cis55_35.dbo.course c
WHERE t.course_id=c.course_id
  AND ID=12345
group by t.course_id, c.title


SELECT TOP 10 t.course_id, c.title
FROM cis55_35.dbo.takes t
         INNER JOIN cis55_35.dbo.course c ON t.course_id = c.course_id
WHERE ID=12345

SELECT TOP 501 t.*
FROM cis55_35.dbo.instructor t
WHERE dept_name='Biology';

SELECT TOP 501 t.*
FROM cis55_35.dbo.instructor t
ORDER BY salary

DELETE FROM cis55_35.dbo.student
WHERE dept_name='Biology';

--  Increase the salary of each instructor in the 'History'. department by 17%.
UPDATE cis55_35.dbo.instructor
SET salary = salary * 1.17
WHERE dept_name='History';

--  Delete all courses that have never been offered (that is, do not occur in the section relation).
DELETE FROM cis55_35.dbo.course
WHERE course_id NOT IN (SELECT course_id FROM cis55_35.dbo.section);

--For the student with ID =12345 (or any other value you for specific student ID),show the total number of credits for such courses (taken by that student). Don't display the tot_creds value from the student table, you should use SQL aggregation on courses taken by the student.


--display the total credits for each of the students, along with the ID of the student; don't bother about the name of the student
SELECT SUM(t.tot_cred), t.ID
FROM cis55_35.dbo.student t
GROUP BY t.ID



--As above, but display the total credits for each student, along with the student ID; don't bother about the student's name.
SELECT SUM(t.tot_cred), t.ID
FROM cis55_35.dbo.student t
GROUP BY t.ID



--Find the names of all students who have taken any Comp. Sci. course ever (there should be no duplicate names)
SELECT DISTINCT s.name
FROM cis55_35.dbo.student s, cis55_35.dbo.takes t
WHERE s.ID=t.ID
  AND t.course_id IN (SELECT course_id FROM cis55_35.dbo.section);





--Create a view of faculty showing only the ID, name, and department of instructors. Create a view CSinstructors, showing all information about instructors from the Comp. Sci. department.
CREATE VIEW CISinstructors AS
SELECT ID, name, dept_name
FROM cis55_35.dbo.instructor
WHERE dept_name='Comp. Sci.';
