/*
Revising Aggregations - Averages
SQL (Basic)
Difficulty Easy
Description:
Query the average population of all cities in CITY where District is California. 
*/

SELECT AVG(POPULATION)
FROM CITY
WHERE DISTRICT IN ('California');