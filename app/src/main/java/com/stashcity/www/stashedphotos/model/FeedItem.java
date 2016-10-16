package com.stashcity.www.stashedphotos.model;

/**
 * Created by sravan on 15/10/16.
 */

public class FeedItem {
    private int id;
    private String name, status, image, profilePic, timeStamp, url;
    private Image imageobj;

    public Image getImageobj() {
        return imageobj;
    }

    public void setImageobj(Image imageobj) {
        this.imageobj = imageobj;
    }

    public FeedItem() {
    }

    public FeedItem(Image imageobj) {
        super();
        this.id = imageobj.getPhotograpId();
        this.name = imageobj.getName();
        this.image = imageobj.getUrl();
        this.status = imageobj.getName();
        this.profilePic = imageobj.getThumbnailUrl();
        this.timeStamp = "1403375851930";
        this.url = imageobj.getUrl();
        this.imageobj=imageobj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImge() {
        return image;
    }

    public void setImge(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}