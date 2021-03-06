create table livro (
	id bigint auto_increment not null,
	titulo varchar(30) not null,
	
	primary key (id)
);

create table Cliente (
	id bigint auto_increment not null,
	nome varchar(80) not null,
	
	primary key (id)
);

create table Reserva (
	id bigint auto_increment not null,
	idCliente bigint not null,
	idLivro bigint not null,
	date datadeReserva not null,
	int valor not null,

	CONSTRAINT fk_idCliente FOREING KEY (idCliente) REFERENCES Cliente,
	CONSTRAINT fk_idLivro FOREING KEY (idLivro) REFERENCES Livro,
);

create table Aluguel (
	id bigint auto_increment not null,
	idCliente bigint not null,
	idLivro bigint not null,
	date datadeAluguel not null,
	int valor not null,

	CONSTRAINT fk_idCliente FOREING KEY (idCliente) REFERENCES Cliente,
	CONSTRAINT fk_idLivro FOREING KEY (idLivro) REFERENCES Livro,
);
