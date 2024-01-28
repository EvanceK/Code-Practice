/*
African Cities
SQL (Basic)
Difficulty Easy
Description:
Given the CITY and COUNTRY tables, query the names of 
all cities where the CONTINENT is 'Africa'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
*/
SELECT ct.NAME
FROM CITY ct JOIN COUNTRY c
ON ct.`CountryCode` = c.`Code`
WHERE CONTINENT IN ('Africa');