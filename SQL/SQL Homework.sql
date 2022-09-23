/*select /*only one of a value appears if there are multiple*/ distinct district from public.address;*/

/*select CU.first_name, CU.last_name from public.customer AS /*whatever is chosen here goes in front of the table names*/ CU;*/

/*select first_name, last_name AS surname from public.customer AS CU;*/
/*
select MV.film_id, MV.title as movie_title, (MV.rental_rate*1.2) as rental_with_markup from public.film as MV;

select rental_id, rental_date, extract(year from rental_date) as "rental year" from public.rental;

select R.rental_id as "Rental ID", R.rental_date as "Rental Date" from public.rental as R;
*/
/*
select film_id, title, rating,
CASE rating
WHEN 'PG' THEN 'Parental Guidance'
else 'Caution'
end as rating_description 
from public.film 
order by film_id /*DESC*/
*/
/*
select rental_id, rental_date, staff_id,
case staff_id
	when 1 then 'mike'
	when 2 then 'john'
end as Staff_Name
from public.rental;
*/

/*
Select category_id, name, /*last_update also a column inside category table*/
from public.category;
*/

/*
select film_id, actor_id
from public.film_actor
order by actor_id, film_id;
*/

/*
select actor_id, first_name as "First Name", last_name as "Last Name"
from public.actor
order by first_name desc, last_name ASC;

select *,
extract(day from rental_date) as "Rental Date"
from public.rental
order by "Rental Date" asc;
*/

/*WHERE (predicate) is used for when a certain condition is applied*/
/*
SELECT column1, column2, ...
FROM table_name
WHERE condition;
*/
/*
select first_name, last_name
from customer
where first_name ='Tracy';
*/
/*
select customer_id, first_name, last_name
from customer
where customer_id ='1';
*/
/*
select
	rental_id, rental_date, return_date,
	extract(day from rental_date) as rentalday
from public.rental
where extract(day from rental_date) = 20;
/*where extract(year from rental_date) < 2020;*/

select customer_id, first_name, last_name
from public.customer
where first_name in ('Willie', 'Jennifer');
*/
/*
select customer_id, first_name, last_name
from public.customer
where first_name not in ('Willie', 'Jennifer');

select customer_id, first_name, last_name
from public.customer
where first_name >= 'Jennifer' and first_name <='Karen';
*/
/*
select customer_id, first_name, last_name
from public.customer
where first_name >= 'A' and first_name <='B';
*/

/*
select customer_id, first_name, last_name
from public.customer
where first_name between 'Jennifer' and 'Karen';
*/
/*
select customer_id, first_name, last_name
from public.customer
where first_name between 'A' and 'C';
*/

select customer_id, first_name, last_name
from public.customer
where customer_id >=500
order by customer_id;

select customer_id, first_name, last_name
from public.customer
where (first_name = 'Willie' or last_name = 'Davis')
order by customer_id;

Select customer_id, first_name, last_name
from public.customer
where first_name like 'Ann%'
order by last_name;

