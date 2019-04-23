package com.aaupush.com;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
@Entity
/**
 * Created by pcc on 4/21/2019.
 */
public class Post {
    private int id;
    private String content;
    private int type;
    private String date;
    @Id
    @ManyToMany(mappedBy="Post")
    private Collection<Student> StudentList= new ArrayList();

    public Collection<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(Collection<Student> studentList) {
        StudentList = studentList;
    }

private int Id;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}