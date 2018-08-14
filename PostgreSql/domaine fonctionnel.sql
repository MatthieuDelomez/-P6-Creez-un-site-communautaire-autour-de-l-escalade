
CREATE TABLE sites (
                nom_du_site VARCHAR(100) NOT NULL,
                nombre_de_secteur BIGINT NOT NULL,
                CONSTRAINT sites_pk PRIMARY KEY (nom_du_site)
);


CREATE TABLE secteur (
                nom_secteur VARCHAR(100) NOT NULL,
                nom_du_site VARCHAR(100) NOT NULL,
                CONSTRAINT secteur_pk PRIMARY KEY (nom_secteur, nom_du_site)
);


CREATE TABLE voies (
                nom_voies VARCHAR(100) NOT NULL,
                nom_secteur VARCHAR(100) NOT NULL,
                nom_du_site VARCHAR(100) NOT NULL,
                CONSTRAINT voies_pk PRIMARY KEY (nom_voies)
);


CREATE TABLE utilisateur (
                pseudo VARCHAR(25) NOT NULL,
                nom VARCHAR(30) NOT NULL,
                prenom VARCHAR(30) NOT NULL,
                email VARCHAR(150) NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (pseudo)
);


CREATE TABLE espace_de_pret (
                disponible BOOLEAN NOT NULL,
                date_de_location VARCHAR(150) NOT NULL,
                pseudo_proprio VARCHAR(25) NOT NULL,
                CONSTRAINT espace_de_pret_pk PRIMARY KEY (disponible)
);


CREATE TABLE publication (
                Titre VARCHAR(100) NOT NULL,
                description VARCHAR(1000) NOT NULL,
                date_maj VARCHAR(10) NOT NULL,
                pseudo VARCHAR(25) NOT NULL,
                CONSTRAINT publication_pk PRIMARY KEY (Titre)
);


CREATE TABLE topo (
                ref VARCHAR(150) NOT NULL,
                nom VARCHAR(100) NOT NULL,
                descriptif VARCHAR(1000) NOT NULL,
                niveau_du_topo VARCHAR(10) NOT NULL,
                type_de_topo VARCHAR(10) NOT NULL,
                Titre_publication VARCHAR(100) NOT NULL,
                disponible BOOLEAN NOT NULL,
                nom_du_site VARCHAR(100) NOT NULL,
                CONSTRAINT topo_pk PRIMARY KEY (ref)
);


CREATE TABLE commentaire (
                id BIGINT NOT NULL,
                Titre VARCHAR(100) NOT NULL,
                pseudo VARCHAR(25) NOT NULL,
                CONSTRAINT commentaire_pk PRIMARY KEY (id)
);


ALTER TABLE secteur ADD CONSTRAINT sites_secteur_fk
FOREIGN KEY (nom_du_site)
REFERENCES sites (nom_du_site)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE topo ADD CONSTRAINT sites_topo_fk
FOREIGN KEY (nom_du_site)
REFERENCES sites (nom_du_site)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE voies ADD CONSTRAINT secteur_voies_fk
FOREIGN KEY (nom_secteur, nom_du_site)
REFERENCES secteur (nom_secteur, nom_du_site)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE publication ADD CONSTRAINT utilisateur_publication_fk
FOREIGN KEY (pseudo)
REFERENCES utilisateur (pseudo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE espace_de_pret ADD CONSTRAINT utilisateur_espace_de_pret_fk
FOREIGN KEY (pseudo_proprio)
REFERENCES utilisateur (pseudo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE commentaire ADD CONSTRAINT utilisateur_commentaire_fk
FOREIGN KEY (pseudo)
REFERENCES utilisateur (pseudo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE topo ADD CONSTRAINT espace_de_pret_topo_fk
FOREIGN KEY (disponible)
REFERENCES espace_de_pret (disponible)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE commentaire ADD CONSTRAINT publication_commentaire_fk
FOREIGN KEY (Titre)
REFERENCES publication (Titre)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE topo ADD CONSTRAINT publication_topo_fk
FOREIGN KEY (Titre_publication)
REFERENCES publication (Titre)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
