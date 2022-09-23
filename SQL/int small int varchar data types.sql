select 1 + '2' as result;

select cast(1 as varchar(10))|| 'abc' as result;

select * from public.actor where first_name = 'Sean';

select * from public.actor where first_name = 'sean';

select address_id,
concat (address, ' ', address2, ', ', city) as FullAddress
from public.address as A
inner join public.city as C
on C.city_id = A.city_id;

select address_id,
address ||'  ' || address2 || '  ' || city as FullAddress
from public.address as A
inner join public.city as C
on C.city_id = A.city_id;

select substring('SQL Demo' ,5,4) as result;

select char_length('SQL Demo');

select * from public.actor where first_name like 'Se%';
/*like is case sensitive, ilike is not case sensitive*/
select * from public.actor where first_name ilike 'se%';

select * from public.actor where first_name similar to 'S[ae]%';

select * from public.actor where first_name similar to '(S[a-e]%)|(C%)';

select * from public.actor where first_name ~ 'S[ae].*';

select * from public.actor where first_name ~ '^S[ae].*';

select * from public.actor where first_name ~ '(S|s)[ae].*';

select * from public.actor where first_name ~ 's[ae].*';

select * from public.actor where first_name ~* 'S[ae].*';
								/* the * makes it case insensitive*/
select * from public.actor where first_name ~ '(S|^s)[ae].*';
											/* ^ makes it start with */
											
											
