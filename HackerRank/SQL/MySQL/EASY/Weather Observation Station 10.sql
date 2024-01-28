/*
Weather Observation Station 10
SQL (Basic)
Difficulty Easy
Description:
Query the list of CITY names from STATION that do not end with vowels. 
Your result cannot contain duplicates.
*/

SELECT DISTINCT CITY
FROM STATION
WHERE CITY NOT REGEXP '[aeiou]$';