select actor_id, first_name, last_name from public.actor
where first_name='Penelope' or first_name='Kenneth'
order by last_name;

select distinct first_name from public.actor
where first_name like 'C%'
order by first_name;