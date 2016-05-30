
package com.symbio.supplyQuery.domain;

import java.util.List;

/**
 * @author Zhang Wuhui on 5/30/16
 */
public class Product {
    String id;
    List<Material> materials;

    public String id(){
        return id;
    }
}