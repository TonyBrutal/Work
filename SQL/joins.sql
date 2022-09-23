/*old syntax*/
select
	C.customer_id,
	C.first_name,
	C.last_name,
	P.Payment_date,
	P.amount
from public.payment as P, public.customer as C
where C.customer_id = P.customer_id;

/*new syntax*/
Select
	C.customer_id,
	C.first_name,
	C.last_name,
	P.Payment_date,
	P.amount
from public.payment as P
inner join public.customer AS C
on C.customer_id = P.customer_id
order by payment_date;

Select
	C.customer_id,
	C.first_name,
	C.last_name,
	R.rental_id,
	R.inventory_id,
	I.film_id
from public.customer as C
inner join public.rental AS R
	on R.customer_id = C.customer_id
inner join public.inventory as I
	on I.inventory_id = R.inventory_id;
	
Select
	C.customer_id,
	C.first_name,
	C.last_name,
	R.rental_id,
	R.inventory_id,
	I.film_id,
	F.title
from public.customer as C
inner join public.rental AS R
	on R.customer_id = C.customer_id
inner join public.inventory as I
	on I.inventory_id = R.inventory_id
inner join public.film AS F
	on I.film_id = F.film_id;
	
select
	R.rental_id, R.rental_date, R.return_date, P.payment_date, P.amount
from public.rental as R
left outer join public.payment as P
	on R.rental_id = P.rental_id
order by P.amount nulls first

select
	R.rental_id, R.rental_date, R.return_date, P.payment_date, P.amount
from public.rental as R
left outer join public.payment as P
	on R.rental_id = P.rental_id
where P.rental_id is null;

select
	R.rental_id, R.rental_date, R.return_date, P.payment_date, P.amount
from public.rental as R
full outer join public.payment as P
	on R.rental_id = P.rental_id;