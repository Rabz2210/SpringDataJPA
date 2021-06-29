#############################################Identity Generator#######################

create table employee(
                         id int primary key AUTO_INCREMENT,
                         name varchar(100)
);

select * from employee;

#####################################Table Generator : Bus: Id_gen is the generator########################
#Id Generator Table
create table id_gen(
                       gen_name varchar(60) PRIMARY KEY,
                       gen_val int(20)
);

#Table that will be using the ID generator
create table Bus(
                    id int PRIMARY KEY,
                    name varchar(20)
);

Select * from Bus;

select * from id_gen;

#########################################Custom Random Id Generator ##################################

create table car(
                    id varchar(255) primary key ,
                    name varchar(255)
);

select * from car;