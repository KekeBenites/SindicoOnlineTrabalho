create database sindico_online_db;

use sindico_online_db;

drop table morador;
drop table apto;
drop table bloco;
drop table predio;
drop table sindico;

create table predio (
idPredio int auto_increment primary key,
nomePredio varchar(50)
);

create table bloco (
idBloco int auto_increment primary key,
nomeBloco varchar(50),
valorBloco decimal(10,2),
idPredio int not null,
foreign key (idPredio) references predio(idPredio)
);

create table apto(
idApto int auto_increment primary key,
numeroApto int not null,
idBloco int not null,
foreign key (idBloco) references bloco(idBloco)
);


create table morador(
idMorador int auto_increment primary key,
nomeMorador varchar(50) not null,
cpfMorador varchar(15),
loginMorador varchar(50) not null,
senhaMorador varchar(50) not null,
idApto int,
foreign key (idApto) references apto(idApto));

insert into morador(nomeMorador,loginMorador,senhaMorador) values ("Sindico", "sindico","123");

create table locacao(
idLocacao int auto_increment not null primary key,
descricaoLocacao varchar(50) not null,
valorLocacao decimal(10,2) not null,
idBloco int not null,
foreign key (idBloco) references blocos(idBloco)
);

create table agenda(
idAgenda int auto_increment primary key not null,
idLocacao int not null,
idBloco int not null,
idMorador int not null,
dataAgenda date not null,
foreign key(idLocacao) references locacao(idLocacao),
foreign key(idBloco) references bloco(idBloco),
foreign key(idMorador) references morador(idMorador)
);

create table reclamacao (
idReclamacao int auto_increment primary key not null,
idMorador int not null,
descricaoReclamacao varchar(255),
foreign key (idMorador)references morador(idMorador)
);

create table avisos(
idAviso int auto_increment primary key not null,
descricaoAviso varchar(50) not null,
nomeSindico varchar(50) not null,
idPredio int not null,
foreign key(idPredio) references predio(idPredio));


create table multa(
idMulta int auto_increment primary key not null,
descricaoMulta varchar(50) not null,
valorMulta decimal(10,2),
idMorador int not null,
nomeSindico varchar(50) not null,
foreign key (idMorador) references morador(idMorador));
