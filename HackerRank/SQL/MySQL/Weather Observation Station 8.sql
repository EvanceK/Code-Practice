/*
Weather Observation Station 8
SQL (Basic)
Difficulty Easy
Description:
Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) 
as both their first and last characters. Your result cannot contain duplicates.
*/
-- 方法一
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^a|^e|^i|^o|^u' AND CITY REGEXP 'a$|e$|i$|o$|u$';
-- 方法二
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[aeiouAEIOU]'AND CITY REGEXP'[aeiouAEIOU]$';
-- 方法三
SELECT DISTINCT CITY 
FROM STATION 
WHERE LEFT(CITY,1) IN ('A','E','I','O','U') AND RIGHT(CITY,1) IN ('a','e','i','o','u');