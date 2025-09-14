# Write your MySQL query statement below
select MAX(salary) as Secondhighestsalary
    from Employee
        WHERE salary < (select max(salary) from Employee)