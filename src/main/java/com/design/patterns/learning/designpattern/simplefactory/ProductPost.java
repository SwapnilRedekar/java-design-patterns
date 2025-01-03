package com.design.patterns.learning.designpattern.simplefactory;

public class ProductPost extends Post {

    private String[] imageUrls;

    private String vendor;

    public String[] getImageUrls() {
        return imageUrls;
    }

    public String getVendor() {
        return vendor;
    }

    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

}
