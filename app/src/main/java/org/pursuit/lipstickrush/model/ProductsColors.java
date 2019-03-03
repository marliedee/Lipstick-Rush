package org.pursuit.lipstickrush.model;

class ProductsColors {
    private String hex_value;
    private String colour_name;

    public ProductsColors(String hex_value, String colour_name) {
        this.hex_value = hex_value;
        this.colour_name = colour_name;
    }

    public String getHex_value() {
        return hex_value;
    }

    public String getColour_name() {
        return colour_name;
    }

}
