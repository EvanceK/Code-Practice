/*
Weather Observation Station 7
SQL (Basic)
Difficulty Easy
Description:
Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.
Input Format
The STATION table is described as follows
*/

SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP 'a$' or CITY REGEXP 'e$' or CITY REGEXP 'i$' or CITY REGEXP 'o$' or CITY REGEXP'u$'