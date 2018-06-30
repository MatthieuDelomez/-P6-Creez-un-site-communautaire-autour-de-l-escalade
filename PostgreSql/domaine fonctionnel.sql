
CREATE TABLE utilisateur (
                pseudo VARCHAR(25) NOT NULL,
                nom VARCHAR(30) NOT NULL,
                prenom VARCHAR(30) NOT NULL,
                email VARCHAR(150) NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (pseudo)
);


CREATE TABLE topo (
                ref VARCHAR(150) NOT NULL,
                nom VARCHAR(100) NOT NULL,
                descriptif VARCHAR(1000) NOT NULL,
                niveau_du_topo VARCHAR(10) NOT NULL,
                localite VARCHAR(300) NOT NULL,
                type_de_topo VARCHAR(10) NOT NULL,
                auteur_pseudo VARCHAR(25) NOT NULL,
                topo_louable BOOLEAN NOT NULL,
                CONSTRAINT topo_pk PRIMARY KEY (ref)
);


CREATE TABLE proprio (
                pseudo_proprio VARCHAR(25) NOT NULL,
                email VARCHAR(150) NOT NULL,
                ref_topo_proprio VARCHAR(150) NOT NULL,
                CONSTRAINT proprio_pk PRIMARY KEY (pseudo_proprio)
);


CREATE TABLE espace_de_pret (
                id VARCHAR(25) NOT NULL,
                disponible BOOLEAN NOT NULL,
                ref VARCHAR(150) NOT NULL,
                date_de_location VARCHAR(150) NOT NULL,
                pseudo_proprio VARCHAR(25) NOT NULL,
                CONSTRAINT espace_de_pret_pk PRIMARY KEY (id, disponible, ref)
);


CREATE TABLE commentaire (
                id BIGINT NOT NULL,
                description VARCHAR(1000) NOT NULL,
                utilisateur_pseudo VARCHAR(25) NOT NULL,
                ref_topo VARCHAR(150) NOT NULL,
                CONSTRAINT commentaire_pk PRIMARY KEY (id)
);


ALTER TABLE commentaire ADD CONSTRAINT utilisateur_commentaire_fk
FOREIGN KEY (utilisateur_pseudo)
REFERENCES utilisateur (pseudo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE topo ADD CONSTRAINT utilisateur_topo_fk
FOREIGN KEY (auteur_pseudo)
REFERENCES utilisateur (pseudo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE commentaire ADD CONSTRAINT topo_commentaire_fk
FOREIGN KEY (ref_topo)
REFERENCES topo (ref)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE proprio ADD CONSTRAINT topo_proprio_fk
FOREIGN KEY (ref_topo_proprio)
REFERENCES topo (ref)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE espace_de_pret ADD CONSTRAINT topo_espace_de_pret_fk
FOREIGN KEY (ref)
REFERENCES topo (ref)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE espace_de_pret ADD CONSTRAINT proprio_espace_de_pret_fk
FOREIGN KEY (pseudo_proprio)
REFERENCES proprio (pseudo_proprio)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
