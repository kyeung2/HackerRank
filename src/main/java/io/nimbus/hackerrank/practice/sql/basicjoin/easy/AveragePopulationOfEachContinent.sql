# https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
SELECT cc.Continent, FLOOR(AVG(c.POPULATION))
FROM CITY c
         JOIN COUNTRY cc ON c.CountryCode = cc.Code
GROUP BY cc.Continent