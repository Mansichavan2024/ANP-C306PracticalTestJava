
package com.mymart.model;

public class Product {
	
	int productId;
	String productName;
	float productPrice;
	
	Product(int id,String name,float price){
		
		this.productId =id;
		this.productName = name;
		this.productPrice=price;
		
	}
    public void setName(String productName) {
        this.productName = productName;
    }
    
    public void setId(int productId) {
        this.productId = productId;
    }
    public void setPrice(float productPrice) {
        this.productPrice = productPrice;
    }
 
    public String getName() {
    	
    	 return productName;
    }
    
    public int getId() {
    	 return productId;  
    }
    public float getPrice() {
        return productPrice;
    }
    
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
		return true;
   
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + productId;
        result = 31 * result + productName.hashCode();
        return result;
    }
}