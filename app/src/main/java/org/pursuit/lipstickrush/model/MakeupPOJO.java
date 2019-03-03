package org.pursuit.lipstickrush.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MakeupPOJO {


    public List<MakeupPOJO> getMakeupPOJOList() {
        return makeupPOJOList;
    }

    @SerializedName("MakeupPOJO")
    private List<MakeupPOJO>makeupPOJOList;
    private int id;
    private String brand;
    private String name;
    private String price;
    private String price_sign;
    private String currency;
    private String image_link;
    private String product_link;
    private String website_link;
    private String description;
    private String rating;
    private String category;
    private String product_type;
    private List<TagList> tag_list;
    private String created_at;
    private String updated_at;
    private String product_api_url;
    private String api_featured_image;
    private List<ProductsColors>product_colors;

    public MakeupPOJO(List<MakeupPOJO> makeupPOJOList, int id, String brand, String name,
                      String price, String price_sign, String currency,
                      String image_link, String product_link,
                      String website_link, String description,
                      String rating, String category, String product_type,
                      List<TagList> tag_list, String created_at, String updated_at,
                      String product_api_url, String api_featured_image,
                      List<ProductsColors> product_colors) {
        this.makeupPOJOList = makeupPOJOList;
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.price_sign = price_sign;
        this.currency = currency;
        this.image_link = image_link;
        this.product_link = product_link;
        this.website_link = website_link;
        this.description = description;
        this.rating = rating;
        this.category = category;
        this.product_type = product_type;
        this.tag_list = tag_list;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.product_api_url = product_api_url;
        this.api_featured_image = api_featured_image;
        this.product_colors = product_colors;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getPrice_sign() {
        return price_sign;
    }

    public String getCurrency() {
        return currency;
    }

    public String getImage_link() {
        return image_link;
    }

    public String getProduct_link() {
        return product_link;
    }

    public String getWebsite_link() {
        return website_link;
    }

    public String getDescription() {
        return description;
    }

    public String getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }

    public String getProduct_type() {
        return product_type;
    }

    public List<TagList> getTag_list() {
        return tag_list;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getProduct_api_url() {
        return product_api_url;
    }

    public String getApi_featured_image() {
        return api_featured_image;
    }

    public List<ProductsColors> getProduct_colors() {
        return product_colors;
    }



}
