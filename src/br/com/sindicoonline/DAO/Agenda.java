package br.com.sindicoonline.DAO;

import java.sql.Date;

/*
create table agenda(
idAgenda int auto_increment primary key not null,
idLocacao int not null,
idBloco int not null,
idMorador int not null,
dataAgenda date not null,
foreign key(idLocacao) references locacao(idLocacao),
foreign key(idBloco) references blocos(idBloco),
foreign key(idMorador) references morador(idMorador)
);

 */
public class Agenda {

    private int idAgenda;
    private int idLocacao;
    private Bloco bloco;
    private Morador morador;
    Date dataAgenda;

}
