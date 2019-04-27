package com.aaupush.com;

import javax.persistence.Id;

import org.dom4j.Text;

public class Forum {
@Id
private int id;
private String forumid;
private Text description;
private Boolean privacy;
private String joincode;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getForumid() {
	return forumid;
}
public void setForumid(String forumid) {
	this.forumid = forumid;
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
public String getJoincode() {
	return joincode;
}
public void setJoincode(String joincode) {
	this.joincode = joincode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
