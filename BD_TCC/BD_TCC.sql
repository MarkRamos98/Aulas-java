create database dbRedeDeTrabalho;

use dbrededetrabalho;

create table tbCliente(
cod_clie int not null auto_increment,
nome_clie varchar(100) not null,
login_clie varchar(20) not null,
senha_clie varchar(12) not null,
tel_clie char(13),
cel_clie char(13) not null,
cpf_clie char(14) not null unique,
email_clie varchar(100) unique,
sexo_clie char(1) default "X" check(sexo_clie in("F","M")),
primary key(cod_clie));

desc tbCliente;

create table tbTrabalhador(
cod_trab int not null auto_increment,
nome_trab varchar(50) not null,
login_trab varchar(20) not null,
senha_trab varchar(12) not null,
end_trab varchar(50) not null,
profis_trab varchar(30) not null,
email_trab varchar(50) not null unique,
tel_trab char(13),
cel_trab char(10) not null,
cpf_trab char(14) not null unique,
sexo_trab char(1) default "X" check(sexo_trab in("F","M")),
primary key (cod_trab));

desc tbTrabalhador;

create table tbServico(
cod_serv int not null auto_increment,
nome_serv varchar(50) not null,
desc_serv varchar(250) not null,
dura_serv datetime not null,
valor_serv decimal (5,2) not null,
incomodo_serv varchar(250),
cod_trab int not null,
primary key(cod_serv),
foreign key (cod_trab) references tbTrabalhador(cod_trab));

desc tbServico;

create table tbPedidos(
cod_ped int not null auto_increment,
cod_clie int not null,
cod_trab int not null,
end_ped char(70) not null,
data_inic_ped date not null,
data_fim_ped date not null,
valor_final_ped decimal (8,2) not null,
hora_inic_ped time not null,
hora_fim_ped time not null,
primary key(cod_ped),
foreign key (cod_clie) references tbCliente(cod_clie),
foreign key (cod_trab) references tbTrabalhador(cod_trab));

desc tbPedidos;

CREATE TABLE tbPedidoServico(
cod_ped INT NOT NULL,
cod_serv INT NOT NULL,
nome_ped_serv varchar(50) not null,
desc_ped_serv varchar(250) not null,
dura_ped_serv datetime not null,
valor_ped_serv decimal (5,2) not null,
obs_ped_serv varchar(250),
PRIMARY KEY (cod_ped, cod_serv),
FOREIGN KEY (cod_ped) REFERENCES tbPedidos(cod_ped),
FOREIGN KEY (cod_serv) REFERENCES tbServico(cod_serv));

desc tbPedidoServico;

create table tbAgenda(
cod_agen int not null auto_increment,
cod_trab int not null,
cod_ped int not null,
PRIMARY KEY (cod_agen),
FOREIGN KEY (cod_ped) REFERENCES tbPedidos(cod_ped),
FOREIGN KEY (cod_trab) REFERENCES tbTrabalhador(cod_trab));

desc tbAgenda;