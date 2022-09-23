select
	rental_id, rental_date, return_date
from public.rental
order by rental_date ASC
offset 0 rows fetch first 10 rows only;

select
	rental_id, rental_date, return_date
from public.rental
order by return_date ASC nulls first;

select
	rental_id, rental_date, return_date
from public.rental
order by return_date ASC nulls last;

select
	rental_id, rental_date, return_date
from public.rental
where extract(year from return_date) <> 2005
order by return_date ASC Nulls last;

select
	rental_id, rental_date, return_date
from public.rental
where extract(year from return_date) = 2005
order by return_date ASC Nulls last;

select
	rental_id, rental_date, return_date
from public.rental
where extract(year from return_date) is null
order by return_date ASC Nulls last;

select
	rental_id, rental_date, return_date
from public.rental
where extract(year from return_date) is not null
order by return_date ASC Nulls last;

