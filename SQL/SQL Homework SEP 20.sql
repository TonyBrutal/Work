select 
	C.customer_id, C.first_name, C.last_name, R.rental_date
from public.rental as R


left outer join public.inventory as I
on R.inventory_id = I.inventory_id

left outer join public.film as F
on I.film_id = F.film_id

left outer join public.customer as C
on R.customer_id = C.customer_id

where F.title = 'Timberland Sky'

order by R.rental_date;