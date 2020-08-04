# https://www.hackerrank.com/challenges/weather-observation-station-20/problem?h_r=next-challenge&h_v=zen


# couldn't get this on my own. Limitations of LIMIT not able to take a variable so couldn't use the LIMIT 2 OFFSET X approach.
SET @rowI = -1;

SELECT round(avg(lat_n), 4)
FROM (SELECT lat_n,
             (@rowI := @rowI + 1) AS rowindex
      FROM station
      ORDER BY lat_n) AS temp
WHERE temp.rowindex IN (floor(@rowI / 2), ceil(@rowI / 2));