package com.fetel.linh.model;

/**
 * Created by NGUYEN DUC LINH on 25/03/2016.
 */
public class RssItem {
    private String title;
    private String description;
    private String date;
    private String link;
    public RssItem(){
        this.title = null;
        this.description = null;
        this.date = null;
        this.link = null;
    }
    public void setTitle(String title){

        this.title = title;
    }
    public String getTitel(){

        return title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){

        return description;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){

        return date;
    }
    public void setLink(String link){
        this.link = link;
    }
    public String getLink(){

        return link;
    }
}
