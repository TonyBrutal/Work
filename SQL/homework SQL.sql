/*select /*only one of a value appears if there are multiple*/ distinct district from public.address;*/

select CU.first_name, CU.last_name from public.customer AS /*whatever is chosen here goes in front of the table names*/ CU;

/*select first_name, last_name AS surname from public.customer AS CU;*/
/*
select MV.film_id, MV.title as movie_title, (MV.rental_rate*1.2) as rental_with_markup from public.film as MV;

select rental_id, rental_date, extract(year from rental_date) as "rental year" from public.rental;

select R.rental_id as "Rental ID", R.rental_date as "Rental Date" from public.rental as R;
*/
select film_id, title, rating,
CASE rating
WHEN 'PG' THEN 'Parental Guidance'
else 'Caution'
end as rating_description 
from public.film 
order by film_id /*DESC*/

/*
select rental_id, rental_date, staff_id,
case staff_id
	when 1 then 'mike'
	when 2 then 'john'
end as Staff_Name
from public.rental;
*/

Select category_id, name
from public.category;