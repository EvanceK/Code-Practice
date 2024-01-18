/*
Weather Observation Station 6
SQL (Basic)
Difficulty Easy
Description:
Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
Input Format
The STATION table is described as follows:
*/

SELECT CITY
FROM STATION
WHERE CITY REGEXP '^a' or CITY REGEXP'^e' or CITY REGEXP'^i' or CITY REGEXP'^o' or
CITY REGEXP'^u'
ORDER BY CITY ASC;