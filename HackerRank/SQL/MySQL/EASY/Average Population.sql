/*
Average Population
SQL (Basic)
Difficulty Easy
Description:
Query the average population for all cities in CITY, rounded down to the nearest integer.
*/
SELECT TRUNCATE(AVG(POPULATION),0)
FROM CITY;