# https://www.hackerrank.com/challenges/the-company/problem?h_r=next-challenge&h_v=zen

#  I didn't get this on my own but was close
select c.company_code,
       c.founder,
       count(distinct e.lead_manager_code),
       count(distinct e.senior_manager_code),
       count(distinct e.manager_code),
       count(distinct e.employee_code)
from company c

#     firstly I tried to join the lead_manger table, not noticing the employee table had all columns necessary for the query.
#     AGAIN, read the instructions more carefully.

#     secondly,  although didn't make a difference, i tried a join and not an inner join. Obviously you want only the rows where there is a match

         inner join employee e on e.company_code = c.company_code
#     thirdly the group by requires all the fields to be used for te group by, error was sql_mode=only_full_group_by. This is why c.founder is needed as well.
group by c.company_code, c.founder
order by c.company_code;


