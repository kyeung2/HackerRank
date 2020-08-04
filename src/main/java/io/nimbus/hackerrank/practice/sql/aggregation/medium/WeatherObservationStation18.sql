# https://www.hackerrank.com/challenges/weather-observation-station-18/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

SELECT ROUND(
                   ABS(MAX(LAT_N) - MIN(LAT_N)) +
                   ABS(MAX(LONG_W) - MIN(LONG_W))
           , 4)
FROM STATION