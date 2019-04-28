package com.aaupush.com;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.dom4j.Text;
@Entity
public class Forum {
@Id
private int id;
private String forum_id;
private Text description;
private Boolean privacy;
private String join_code;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getForum_id() {
	return forum_id;
}
public void setForum_id(String forum_id) {
	this.forum_id = forum_id;
}
public String getJoin_code() {
	return join_code;
}
public void setJoin_code(String join_code) {
	this.join_code = join_code;
}

public Text getDescription() {
	return description;
}
public void setDescription(Text description) {
	this.description = description;
}
public Boolean getPrivacy() {
	return privacy;
}
public void setPrivacy(Boolean privacy) {
	this.privacy = privacy;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
