package com.fetel.linh.model;

/**
 * Created by NGUYEN DUC LINH on 28/03/2016.
 */
public class ItemSlideMenu {
    private int imgId;
    private String title;

    public ItemSlideMenu(int imgId, String title) {
        this.imgId = imgId;
        this.title = title;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgId() {

        return imgId;
    }

    public String getTitle() {
        return title;
    }
}
