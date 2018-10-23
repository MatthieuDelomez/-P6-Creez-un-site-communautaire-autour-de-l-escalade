
CREATE TABLE public.sites (
                nom_du_site VARCHAR(100) NOT NULL,
                nombre_de_secteur BIGINT NOT NULL,
                CONSTRAINT sites_pk PRIMARY KEY (nom_du_site)
);


CREATE TABLE public.secteur (
                nom_secteur VARCHAR(100) NOT NULL,
                nom_du_site VARCHAR(100) NOT NULL,
                CONSTRAINT secteur_pk PRIMARY KEY (nom_secteur, nom_du_site)
);


CREATE TABLE public.voies (
                nom_voies VARCHAR(100) NOT NULL,
                nom_secteur VARCHAR(100) NOT NULL,
                nom_du_site VARCHAR(100) NOT NULL,
                CONSTRAINT voies_pk PRIMARY KEY (nom_voies)
);


CREATE TABLE public.topo (
                ref VARCHAR(150) NOT NULL,
                nom VARCHAR(100) NOT NULL,
                descriptif VARCHAR(1000) NOT NULL,
                niveau_du_topo VARCHAR(10) NOT NULL,
                type_de_topo VARCHAR(10) NOT NULL,
                nom_du_site VARCHAR(100) NOT NULL,
                CONSTRAINT topo_pk PRIMARY KEY (ref)
);


CREATE TABLE public.utilisateur (
                pseudo VARCHAR(25) NOT NULL,
                nom VARCHAR(30) NOT NULL,
                prenom VARCHAR(30) NOT NULL,
                email VARCHAR(150) NOT NULL,
                motpasse VARCHAR(255) NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (pseudo)
);


CREATE TABLE public.espace_de_pret (
                id_pret INTEGER NOT NULL,
                date_de_location VARCHAR(150) NOT NULL,
                disponible BOOLEAN NOT NULL,
                pseudo_proprio VARCHAR(25) NOT NULL,
                CONSTRAINT espace_de_pret_pk PRIMARY KEY (id_pret)
);


CREATE TABLE public.publication (
                Titre VARCHAR(100) NOT NULL,
                description VARCHAR(1000) NOT NULL,
                date_maj VARCHAR(10) NOT NULL,
                pseudo VARCHAR(25) NOT NULL,
                CONSTRAINT publication_pk PRIMARY KEY (Titre)
);


CREATE TABLE public.commentaire (
                id BIGINT NOT NULL,
                Titre VARCHAR(100) NOT NULL,
                pseudo VARCHAR(25) NOT NULL,
                publicationId INTEGER NOT NULL,
                createdAt DATE NOT NULL,
                CONSTRAINT commentaire_pk PRIMARY KEY (id)
);


ALTER TABLE public.secteur ADD CONSTRAINT sites_secteur_fk
FOREIGN KEY (nom_du_site)
REFERENCES public.sites (nom_du_site)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.topo ADD CONSTRAINT sites_topo_fk
FOREIGN KEY (nom_du_site)
REFERENCES public.sites (nom_du_site)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.voies ADD CONSTRAINT secteur_voies_fk
FOREIGN KEY (nom_secteur, nom_du_site)
REFERENCES public.secteur (nom_secteur, nom_du_site)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.publication ADD CONSTRAINT utilisateur_publication_fk
FOREIGN KEY (pseudo)
REFERENCES public.utilisateur (pseudo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.espace_de_pret ADD CONSTRAINT utilisateur_espace_de_pret_fk
FOREIGN KEY (pseudo_proprio)
REFERENCES public.utilisateur (pseudo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.commentaire ADD CONSTRAINT utilisateur_commentaire_fk
FOREIGN KEY (pseudo)
REFERENCES public.utilisateur (pseudo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.commentaire ADD CONSTRAINT publication_commentaire_fk
FOREIGN KEY (Titre)
REFERENCES public.publication (Titre)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
