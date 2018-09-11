package org.projetoc.escalade.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Commentaire {

	private int id;
	private int userAccountId;
	private int publicationId;
	private int parentId;
	private Date createdAt;
	private Date updateAt;
	private String content;

	private Utilisateur author;
	private Publication publication;
	

	public Commentaire(int id, int userAccountId, int publicationId, int parentId, Date createdAt, Date updateAt,
			String content, Utilisateur author, Publication publication) {
		super();
		this.id = id;
		this.userAccountId = userAccountId;
		this.publicationId = publicationId;
		this.parentId = parentId;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
		this.content = content;
		this.author = author;
		this.publication = publication;
	}

	public Commentaire() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}

	public int getPublicationId() {
		return publicationId;
	}

	public void setPublicationId(int publicationId) {
		this.publicationId = publicationId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
    public String getCreatedAt() {
        if (createdAt != null)
            return new SimpleDateFormat("dd MMMM yyyy, hh:mm").format(createdAt);
        else
            return null;
    }


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

    public String getUpdateAt() {
        if (updateAt != null)
            return new SimpleDateFormat("dd MMMM yyyy, hh:mm").format(updateAt);
        else
            return null;
    }

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Utilisateur getAuthor() {
		return author;
	}

	public void setAuthor(Utilisateur author) {
		this.author = author;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

}
