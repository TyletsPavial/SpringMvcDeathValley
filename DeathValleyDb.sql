create database DeathValleyDB;

use DeathValleyDB;
create table user(
userId int primary key,
name varchar(45),
sureName varchar(45)
);
create table account(
accountId int,
account int,
userId int,
foreign key (userid) references user (userId)
);
SET global time_zone = '-2:00';
insert into user (userid, name, surename) values(1, "pavel", "tylets");
insert into user (userid, name, surename) values(2, "sergey", "orlov");
insert into user (userid, name, surename) values(3, "andrey", "ivanov");
insert into user (userid, name, surename) values(4, "ilya", "yashin");
insert into user (userid, name, surename) values(5, "julia", "kravtsova");
insert into user (userid, name, surename) values(6, "sasha", "kravts");
insert into user (userid, name, surename) values(7, "pavel", "turunen");
insert into user (userid, name, surename) values(8, "emiliya", "raw");
insert into user (userid, name, surename) values(9, "anton", "rash");
insert into user (userid, name, surename) values(10, "olga", "tsar");
insert into account (accountid, account, userid) values(1, 1000, 1);
insert into account (accountid, account, userid) values(2, 1500, 3);
insert into account (accountid, account, userid) values(3, 2000, 6);
insert into account (accountid, account, userid) values(4, 900, 5);
insert into account (accountid, account, userid) values(5, 1200, 7);
insert into account (accountid, account, userid) values(6, 1700, 10);
insert into account (accountid, account, userid) values(7, 2100, 9);
insert into account (accountid, account, userid) values(8, 2400, 1);
insert into account (accountid, account, userid) values(9, 3000, 8);
insert into account (accountid, account, userid) values(10, 2700, 2);
insert into account (accountid, account, userid) values(11, 2200, 4);
insert into account (accountid, account, userid) values(12, 2100, 10);
insert into account (accountid, account, userid) values(13, 1400, 7);

SET global time_zone = '-2:00';
