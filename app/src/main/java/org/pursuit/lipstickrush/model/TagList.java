package org.pursuit.lipstickrush.model;

class TagList {
    private String vegan;
    private String cruelty_free;

    public TagList(String vegan, String cruelty_free) {
        this.vegan = vegan;
        this.cruelty_free = cruelty_free;
    }
    public String getVegan() {
        return vegan;
    }

    public String getCrueltyfree() {
        return cruelty_free;
    }

}
