# https://www.hackerrank.com/challenges/african-cities/problem?h_r=next-challenge&h_v=zen
SELECT c.NAME
FROM CITY c
         JOIN COUNTRY cc ON c.CountryCode = cc.Code
WHERE cc.CONTINENT = 'Africa';