/*
Average Population of Each Continent
SQL (Basic)
Difficulty Easy
Description:
Given the CITY and COUNTRY tables, 
query the names of all the continents (COUNTRY.Continent) 
and their respective average city populations (CITY.Population) 
rounded down to the nearest integer.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
*/

SELECT c.CONTINENT, TRUNCATE(AVG(ct.POPULATION),0)
FROM CITY ct JOIN COUNTRY c
ON ct.`CountryCode` = c.`Code`
GROUP BY c.CONTINENT