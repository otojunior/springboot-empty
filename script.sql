drop table if exists item;

create table if not exists item (
  id bigserial primary key,
  codigo integer,
  nome varchar(20));

insert into item (codigo, nome)
select
	(generate_series*10)::integer codigo,
	('item'||generate_series)::varchar(20) nome
from generate_series(1,20);
