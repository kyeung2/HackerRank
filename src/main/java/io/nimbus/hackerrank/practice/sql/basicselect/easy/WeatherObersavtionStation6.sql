# https://www.hackerrank.com/challenges/weather-observation-station-6/problem
SELECT distinct CITY
FROM STATION
WHERE CITY like 'a%'
   or CITY like 'e%'
   or CITY like 'i%'
   or CITY like 'o%'
   or CITY like 'u%';

# potentially better ways using some sort of regex