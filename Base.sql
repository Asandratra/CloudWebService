psql -U postgres 

create role enchere login password 'enchere';
create database enchere;
alter database enchere owner to enchere;

\q

psql -U enchere

create table admin(
    idAdmin serial primary key NOT NULL,
    username varchar(255),
    mdp varchar(255)
);

create table utilisateur(
    idutilisateur serial primary key NOT NULL,
    username varchar(255),
    mdp varchar(255)
);

create table compte(
    idCompte serial primary key NOT NULL,
    montant numeric(10),
    idutilisateur int,
    foreign key(idutilisateur) references utilisateur(idutilisateur)
);


insert into admin(
    username,
    mdp
)
VALUES
('admin','admin');

insert into utilisateur(
    username,
    mdp
)
VALUES
('Mamitiana','mamitiana'),
('Sariaka','sariaka'),
('Johary','johary'),
('Ndriana','ndriana'),
('Olivia','olivia');


insert into compte(
    montant,
    idutilisateur
)
VALUES
(1000000,1),
(250000,2),
(40000,3),
(300000,4),
(200000,5);




