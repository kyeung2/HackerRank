# https://www.hackerrank.com/challenges/weather-observation-station-5/problem

SELECT CITY, LENGTH(CITY)
FROM STATION
WHERE LENGTH(CITY) IN (
    SELECT MAX(LENGTH(CITY))
    FROM STATION
    UNION
    SELECT MIN(LENGTH(CITY))
    FROM STATION
)
ORDER BY LENGTH(CITY) DESC, CITY
LIMIT 2;

# this only works by luck, the order by LENGTH(CITY) DESC, gives the longest first
# and there is only one city with that length. Otherwise it would limit to 2 of the longest
#  cannot do a LIMIT in the UNION in MySQL