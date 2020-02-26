/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     26/02/2020 7:35:29 a. m.                     */
/*==============================================================*/


drop table if exists DESECHO;

drop table if exists ORGANICO;

drop table if exists PAPEL;

drop table if exists PLASTICO;

drop table if exists RECICLA;

drop table if exists USUARIO;

drop table if exists VIDRIO;

/*==============================================================*/
/* Table: DESECHO                                               */
/*==============================================================*/
create table DESECHO
(
   ID_DESECHO           int not null,
   primary key (ID_DESECHO)
);

/*==============================================================*/
/* Table: ORGANICO                                              */
/*==============================================================*/
create table ORGANICO
(
   ID_DESECHO           int not null,
   TIPO_ORGANICO        char(10) not null,
   primary key (ID_DESECHO)
);

/*==============================================================*/
/* Table: PAPEL                                                 */
/*==============================================================*/
create table PAPEL
(
   ID_DESECHO           int not null,
   TIPO_PAPEL           char(10) not null,
   primary key (ID_DESECHO)
);

/*==============================================================*/
/* Table: PLASTICO                                              */
/*==============================================================*/
create table PLASTICO
(
   ID_DESECHO           int not null,
   TIPO_PLASTICO        char(10) not null,
   primary key (ID_DESECHO)
);

/*==============================================================*/
/* Table: RECICLA                                               */
/*==============================================================*/
create table RECICLA
(
   USUARIO              varchar(10) not null,
   ID_DESECHO           int not null,
   CANTIDAD_DESECHO     int not null,
   primary key (USUARIO, ID_DESECHO)
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO
(
   USUARIO              varchar(10) not null,
   NOMBRE_USUARIO       varchar(50) not null,
   CONTRASENA_USUARIO   varchar(20) not null,
   TIPO_USUARIO         char(10) not null,
   primary key (USUARIO)
);

/*==============================================================*/
/* Table: VIDRIO                                                */
/*==============================================================*/
create table VIDRIO
(
   ID_DESECHO           int not null,
   TIPO_VIDRIO          char(10) not null,
   primary key (ID_DESECHO)
);

alter table ORGANICO add constraint FK_TIPO3 foreign key (ID_DESECHO)
      references DESECHO (ID_DESECHO) on delete restrict on update restrict;

alter table PAPEL add constraint FK_TIPO2 foreign key (ID_DESECHO)
      references DESECHO (ID_DESECHO) on delete restrict on update restrict;

alter table PLASTICO add constraint FK_TIPO4 foreign key (ID_DESECHO)
      references DESECHO (ID_DESECHO) on delete restrict on update restrict;

alter table RECICLA add constraint FK_RECICLA foreign key (ID_DESECHO)
      references DESECHO (ID_DESECHO) on delete restrict on update restrict;

alter table RECICLA add constraint FK_RECICLA2 foreign key (USUARIO)
      references USUARIO (USUARIO) on delete restrict on update restrict;

alter table VIDRIO add constraint FK_TIPO foreign key (ID_DESECHO)
      references DESECHO (ID_DESECHO) on delete restrict on update restrict;

