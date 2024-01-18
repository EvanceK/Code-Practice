/*
Weather Observation Station 9
SQL (Basic)
Difficulty Easy
Description:
Query the list of CITY names from STATION that do not start with vowels. 
Your result cannot contain duplicates.
*/
-- 方法一
SELECT DISTINCT CITY
FROM STATION
WHERE CITY NOT REGEXP '^a|^e|^i|^o|^u';
-- 方法二
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[^aeiouAEIOU]';
-- 方法三
SELECT DISTINCT CITY 
FROM STATION 
WHERE LEFT(CITY,1)NOT IN ('A','E','I','O','U')