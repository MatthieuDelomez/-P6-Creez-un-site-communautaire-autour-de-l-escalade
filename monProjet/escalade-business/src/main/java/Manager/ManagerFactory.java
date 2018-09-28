package Manager;

import org.projetoc.escalade.consumer.contract.dao.CommentaireDao;
import org.projetoc.escalade.consumer.contract.dao.Espace_de_PretDao;
import org.projetoc.escalade.consumer.contract.dao.PublicationDao;
import org.projetoc.escalade.consumer.contract.dao.SecteurDao;
import org.projetoc.escalade.consumer.contract.dao.SitesDao;
import org.projetoc.escalade.consumer.contract.dao.TopoDao;
import org.projetoc.escalade.consumer.contract.dao.UtilisateurDao;
import org.projetoc.escalade.consumer.contract.dao.VoiesDao;

public interface ManagerFactory {
	
	CommentaireManager getCommentaireManager();
	
	void setCommentaireManager(CommentaireManager commentaireManager);
	
	Espace_de_PretManager getEspace_de_PretManager();
	
	void setEspace_de_pretManager(Espace_de_PretManager espace_de_pretManager);
	    
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
