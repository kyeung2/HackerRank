# https://www.hackerrank.com/challenges/weather-observation-station-11
SELECT DISTINCT CITY
FROM STATION
WHERE CITY RLIKE '^[^aeiou]'
   OR CITY RLIKE '[^aeiou]$';

# an alternative
SELECT DISTINCT CITY
FROM STATION
WHERE left(CITY, 1) not in ('a', 'e', 'i', 'o', 'u')
   OR right(CITY, 1) not in ('a', 'e', 'i', 'o', 'u')

