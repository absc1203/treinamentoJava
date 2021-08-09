create database bdcinco;

 use bdcinco;
 
 
  create table usuario(id int primary  key auto_increment,
    nome varchar (50), email varchar (50) not null, senha varchar (250));
    
    create table cliente(idCliente int primary key,
      perfil varchar (50),
      status varchar (50),
      foreign key(idCliente) references usuario(id));
    
      insert into usuario values (100,'omar','omar@gmail.com','123456');
      insert into cliente values (100, 'perfil um', 'ativo');
    
        
      create table vendedor(idVendedor int primary key,
       perfil varchar (50),
       comissao double,
       foreign key(idVendedor) references usuario(id));
   
           insert into usuario values (101,'belem','belem@gmail.com','123456');
           insert into vendedor values (101, 'vendedor', 0.2);   
    
           
      select u.id,  u.nome, u.email, u.senha, c.status, v.comissao from 
          usuario u left join  cliente c 
          on u.id = c.idCliente
          left join vendedor v
           on u.id = v.idVendedor order by 1 asc;
             
             
            
            
              
           
           