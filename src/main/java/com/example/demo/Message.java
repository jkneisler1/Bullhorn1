package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(max=150)
    private String content;

    @NotNull
    private String posteddate;

    @NotNull
    @Size(min=4)
    private String sentby;

    private String headshot;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getPosteddate() {
        return posteddate;
    }

    public String getSentby() {
        return sentby;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPosteddate(String posteddate) {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.posteddate = formatter.format(ts).toString();
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }
}

