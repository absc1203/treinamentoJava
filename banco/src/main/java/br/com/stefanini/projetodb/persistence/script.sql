create database bdUm;

use bdUm;

create table usuario(idUsuario int primary key auto_increment,
nome varchar (50), email varchar (100) unique, senha varchar (255),
uuid varchar (50) unique);

create table endereco(idEndereco int primary key auto_increment,
bairro varchar (50), cidade varchar (50), id_usuario int unique,
foreign key(id_usuario) references usuario(idUsuario));

desc usuario;
desc endereco;

show tables;

set @chave=10;
insert into usuario values(@chave,'jose','jose@gmail.com',null,null);
insert into endereco values(null, 'centro','Rio de Janeiro', @cheve);