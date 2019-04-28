package com.aaupush.com;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Post {
	@Id
	private int id;
    private String content;
    private int type;
    private Date pubdate;
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getDate() {
		return pubdate;
	}

	public void setDate(Date date) {
		this.pubdate = date;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
