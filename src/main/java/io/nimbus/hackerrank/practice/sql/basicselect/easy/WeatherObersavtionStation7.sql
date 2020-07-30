# https://www.hackerrank.com/challenges/weather-observation-station-7/problem?h_r=next-challenge&h_v=zen
SELECT distinct CITY
FROM STATION
WHERE CITY like '%a'
   or CITY like '%e'
   or CITY like '%i'
   or CITY like '%o'
   or CITY like '%u';