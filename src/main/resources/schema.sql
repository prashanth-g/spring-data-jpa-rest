create schema if not exists test collate utf8mb4_general_ci;

create table if not exists book
(
	book_id bigint auto_increment
		primary key,
	name varchar(255) null
);

create table if not exists book_category
(
	category_id bigint auto_increment
		primary key,
	name varchar(255) null,
	book_id bigint not null,
	constraint FKnyegcbpvce2mnmg26h0i856fd
		foreign key (book_id) references book (book_id)
);

create table if not exists book_price
(
	price_id bigint auto_increment
		primary key,
	price int not null,
	category_id bigint not null,
	constraint FKb2lxlv9uxvsq1cypw5iebei97
		foreign key (category_id) references book_category (category_id)
);

