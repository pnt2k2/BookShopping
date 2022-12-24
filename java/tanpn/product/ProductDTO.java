/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanpn.product;

import java.io.Serializable;

/**
 *
 * @author Nhat Tan
 */
public class ProductDTO implements Serializable{
    private String sku;
    private String name;
    private String description;
    private int quantity;
    private float price;
    private boolean status;

    public ProductDTO(String sku, String name, int quantity, float price) {
        this.sku = sku;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    
   
     
    
    
    public ProductDTO(String sku, String name, String description, int quantity, float price, boolean status) {
        this.sku = sku;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    public ProductDTO() {
    }

    public String getSku() {
        return sku;
    }

    
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
            
}
