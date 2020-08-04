# https://www.hackerrank.com/challenges/the-report/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

# didn't get this on my own but the problem wasn't too hard.

# g.Grade, obviously is needed
SELECT IF(g.Grade > 7, s.Name, NULL) AS Name, g.Grade, s.Marks
FROM Students s
#     the INNER JOIN on the BETWEEN
         INNER JOIN Grades g ON s.Marks BETWEEN g.Min_Mark AND g.Max_Mark
# Ordering was a little silly on the problem. With no indication why the result was not correct.
ORDER BY g.Grade DESC, Name, s.Marks;

