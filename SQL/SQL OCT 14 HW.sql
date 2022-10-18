select
    c.customer_id,
    c.first_name,
    c.last_name,
    rentals.title as May_Title,
    rentals.rental_date as May_rental_date,
    rentals1.title as June_title,
    rentals1.rental_date as June_rental_date,
    rentals2.title as July_title,
    rentals2.rental_date as July_rental_date
    
from public.customer as c
left join lateral (
    select
        r.rental_date,
        f.title
    from public.rental as r
    inner join public.inventory as i
        on i.inventory_id = r.inventory_id
    inner join public.film as f
        on f.film_id = i.film_id
        where r.customer_id=c.customer_id
        and date_trunc('month', r.rental_date)  = '2005-05-01'
        order by rental_date desc
        offset 0 rows
        fetch first 1 rows only
    ) as rentals
on true
left join lateral (
    select
        r.rental_date,
        f.title
    from public.rental as r
    inner join public.inventory as i
        on i.inventory_id = r.inventory_id
    inner join public.film as f
        on f.film_id = i.film_id
        where r.customer_id=c.customer_id
        and date_trunc('month', r.rental_date)  = '2005-06-01'
        order by rental_date desc
        offset 0 rows
        fetch first 1 rows only
    ) as rentals1
on true
left join lateral (
    select
        r.rental_date,
        f.title
    from public.rental as r
    inner join public.inventory as i
        on i.inventory_id = r.inventory_id
    inner join public.film as f
        on f.film_id = i.film_id
        where r.customer_id=c.customer_id
        and date_trunc('month', r.rental_date)  = '2005-07-01'
        order by rental_date desc
        offset 0 rows
        fetch first 1 rows only
    ) as rentals2
on true
order by c.last_name