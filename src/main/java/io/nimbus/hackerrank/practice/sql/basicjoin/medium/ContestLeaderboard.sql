# https://www.hackerrank.com/challenges/contest-leaderboard/problem


#  my attempt. Makes sense why it's incorrect, my WHERE statement is randomly using the score
#  not related to the correct hacker.

/*correct*/
SELECT h.hacker_id, h.name, SUM(s.score) AS total_score
FROM Hackers h
         INNER JOIN
     /*INCORRECT, should have joined on the result set with the max already there.*/
         Submissions s
      /*correct*/
     ON h.hacker_id = s.hacker_id
/*INCORRECT*/
WHERE s.score in (SELECT MAX(score) FROM Submissions GROUP BY challenge_id, hacker_id)
/*correct*/
GROUP BY h.hacker_id, h.name
/*correct*/
HAVING total_score > 0
/*correct*/
ORDER BY total_score DESC, hacker_id


# the correct solution, the inner joining of a result set with the max score already, not from the table

SELECT h.hacker_id, h.name, sum(score) AS total_score
FROM hackers h
         INNER JOIN
     /* find max_score*/
         (SELECT hacker_id, max(score) AS score FROM submissions GROUP BY challenge_id, hacker_id) max_score
     ON h.hacker_id = max_score.hacker_id
GROUP BY h.hacker_id, h.name

/* don't accept hackers with total_score=0 */
HAVING total_score > 0

/* finally order as required */
ORDER BY total_score DESC, h.hacker_id