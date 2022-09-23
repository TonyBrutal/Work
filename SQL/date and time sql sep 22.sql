/*
select rental_id, rental_date, return_date
from public.rental
where rental_date >= '2005-05-25' and rental_date < '2005-05-26'

select
	now() as "now",
	CURRENT_TIMESTAMP as "Current_Timestamp"

select extract(century from timestamp '2000-12-16 12:21:13');
select extract(Day from timestamp '2001-02-16 20:38:40');
select extract(decade from timestamp '2001-02-16 20:38:40');

select date '2001-09-28' + time '03:00';
select date '2001-09-28'+interval '1 day '+ interval '1 hours';
*/

/*
drop table if exists publc.actorDemo;

CREATE TABLE IF NOT EXISTS public.actor
(
    actor_id integer NOT NULL DEFAULT nextval('actor_actor_id_seq'::regclass),
    first_name character varying(45) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(45) COLLATE pg_catalog."default" NOT NULL,
    last_update timestamp without time zone NOT NULL DEFAULT now(),
    CONSTRAINT actor_pkey PRIMARY KEY (actor_id)
)
*/


