-- https://www.hackerrank.com/challenges/sql-projects/problem


-- pretty smart solution. I didn't get anywhere on this on on my own.
-- the insight was to see what values where needed in the final result set and extracting them out. It turned out to be
-- their uniqueness in the opposite column, i.e. if the start_date appears as the end_date it is part of the same task.
SELECT Start_Date, MIN(End_Date)
FROM
/* Choose start dates that are not end dates of other projects (if a start date is an end date, it is part of the same project) */
    (SELECT Start_Date FROM Projects WHERE Start_Date NOT IN (SELECT End_Date FROM Projects)) a,
/* Choose end dates that are not end dates of other projects */
    (SELECT End_Date FROM Projects WHERE End_Date NOT IN (SELECT Start_Date FROM PROJECTS)) b
/* At this point, we should have a list of start dates and end dates that don't necessarily correspond with each other */
/* This makes sure we only choose end dates that fall after the start date, and choosing the MIN means for the particular start_date,
   we get the closest end date that does not coincide with the start of another task */
where Start_Date < End_Date
GROUP BY Start_Date

-- didn't know about the DATEDIFF() function
ORDER BY DATEDIFF(Start_Date, MIN(End_Date)) DESC, Start_Date
