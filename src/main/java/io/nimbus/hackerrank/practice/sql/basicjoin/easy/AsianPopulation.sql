# https://www.hackerrank.com/challenges/asian-population/problem
SELECT SUM(c.POPULATION)
FROM CITY c
         JOIN COUNTRY cc ON c.CountryCode = cc.Code
WHERE cc.CONTINENT = 'Asia';