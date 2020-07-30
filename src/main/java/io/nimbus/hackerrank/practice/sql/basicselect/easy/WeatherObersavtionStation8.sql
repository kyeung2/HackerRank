# https://www.hackerrank.com/challenges/weather-observation-station-8/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
SELECT DISTINCT CITY
FROM STATION
WHERE CITY RLIKE '^[^aeiou]';

# an alternative
SELECT DISTINCT CITY
FROM STATION
WHERE left(CITY, 1) not in ('a','e','i','o','u')
