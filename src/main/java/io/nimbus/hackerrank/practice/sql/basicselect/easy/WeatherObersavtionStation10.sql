# https://www.hackerrank.com/challenges/weather-observation-station-10
SELECT DISTINCT CITY
FROM STATION
WHERE CITY RLIKE '[^aeiou]$';

# an alternative
SELECT DISTINCT CITY
FROM STATION
WHERE right(CITY, 1) not in ('a','e','i','o','u')
