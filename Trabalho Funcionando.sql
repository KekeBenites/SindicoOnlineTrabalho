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
describe apto;

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



SELECT * FROM apto inner join morador where idBloco = 9 and morador.idApto; 

select * from apto where idBloco = 9 ;
select * from morador;


select * from predio;
select * from bloco;
select * from apto;
select * from morador;
select * from reclamacao;

SELECT idApto FROM apto where numeroApto = 1001  and idBloco = 2;

SELECT idBloco FROM bloco where nomeBloco = "C" and idPredio = 2;
SELECT * FROM bloco where idPredio = 6;
select idApto from morador;

SELECT idApto FROM apto where idBloco = 6 and not exists (select idApto from morador where idApto = apto.idApto); 

insert into reclamacao(idMorador,descricaoReclamacao) values (1,"Barulho após o horario");
insert into reclamacao(idMorador,descricaoReclamacao) values (1,"Bicicleta");
insert into reclamacao(idMorador,descricaoReclamacao) values (1,"Bebida");
insert into reclamacao(idMorador,descricaoReclamacao) values (2,"Xixi de Cachorro");

-- Morador
select * from reclamacao where idMorador = 1;

select idMorador from morador where nomeMorador = 'kleber';

select  * from bloco inner join predio on bloco.idPredio = predio.idPredio;
select * from morador inner join bloco on bloco.idBloco = morador.idBloco;
select * from apto inner join bloco on apto.idBloco = bloco.idBloco;

select predio.nomePredio, bloco.nomeBloco, bloco.valorBloco from bloco inner join predio on bloco.idPredio = predio.idPredio;
select bloco.idBloco,bloco.nomeBloco,bloco.valorBloco, predio.nomePredio from bloco inner join predio on bloco.idPredio = predio.idPredio;
select apto.idApto, predio.nomePredio, bloco.nomeBloco, apto.numeroApto  from bloco inner join apto   on  bloco.idBloco = apto.idBloco  inner join predio on bloco.idPredio = predio.idPredio;
                                                                                   
  select  predio.idPredio from predio where nomePredio = "UNG";                                                                                
                                                                                   
select morador.idMorador, morador.nomeMorador, morador.cpfMorador, apto.numeroApto, bloco.nomeBloco, predio.nomePredio, morador.loginMorador, morador.senhaMorador from morador inner join apto on morador.idApto = apto.idApto inner join bloco on apto.idBloco = bloco.idBloco inner join predio on bloco.idPredio = predio.idPredio;

SELECT numeroApto FROM apto where idBloco = 1;

