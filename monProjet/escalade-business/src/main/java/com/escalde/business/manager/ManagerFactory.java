package com.escalde.business.manager;

public interface ManagerFactory {

    CommentaireManager getCommentaireManager();

    void setCommentaireManager(CommentaireManager commentaireManager);

    EspacePretManager getEspacePretManager();

    void setEspacePretManager(EspacePretManager espacepretManager);

    PublicationManager getPublicationManager();

    void setPublicationManager(PublicationManager publicationManager);

    SecteurManager getSecteurManager();

    void setSecteurManager(SecteurManager secteurManager);

    SitesManager getSitesManager();

    void setSitesManager(SitesManager sitesManager);

    TopoManager getTopoManager();

    void setTopoManager(TopoManager topoManager);

    UtilisateurManager getUtilisateurManager();

    void setUtilisateurManager(UtilisateurManager utilisateurManager);

    VoiesManager getVoiesManager();

    void setVoiesManager(VoiesManager voiesManager);

}
