# https://www.hackerrank.com/challenges/what-type-of-triangle/problem

# SELECT ROUND(SQRT(
#                          POWER(MAX(LAT_N) - MIN(LAT_N), 2) +
#                          POWER(MAX(LONG_W) - MIN(LONG_W), 2)
#                  ), 4)
# FROM STATION