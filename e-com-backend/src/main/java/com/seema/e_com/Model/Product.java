package com.seema.e_com.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private double price;
    private String category;
    private Date releasedate;
    private boolean productAvailable;
    private int stockQuantity;


    private String imageName;
    private String imageType;
     @Lob
    private byte[] imageData;



    public int getId() { return id; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public String getName() { return name; }
    public Double getPrice() { return price; }
    public Boolean getProductAvailable() { return productAvailable; }
    public Integer getQuantity() { return stockQuantity; }
    public Date getReleaseDate() { return releasedate; }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
    public String getImageName() {
        return imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public byte[] getImageData() {
        return imageData;
    }
}
