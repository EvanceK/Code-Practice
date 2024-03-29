/*
Higher Than 75 Marks
SQL (Basic)
Difficulty Easy
Description:
Query the Name of any student in STUDENTS who scored higher than Marks. 
Order your output by the last three characters of each name. 
If two or more students both have names ending in the same last three characters 
(i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.
*/

SELECT NAME
From STUDENTS
WHERE marks>75
ORDER by SUBSTRING(NAME,-3), ID ASC;