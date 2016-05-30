
package com.symbio.supplyQuery.domain;

/**
 * @author Zhang Wuhui on 5/30/16
 */
public class ProductRawMaterial {
    String product;
    String material;
    int amount;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

