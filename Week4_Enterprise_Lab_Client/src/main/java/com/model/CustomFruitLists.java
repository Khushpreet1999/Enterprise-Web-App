/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author khushpreetkaurgulati
 */
@XmlRootElement
public class CustomFruitLists {


    
  private List<CustomFruitList> customFruitList;

    /**
     * @return the customGroceryList
     */
    @XmlElement
    public List<CustomFruitList> getCustomFruitList() {
        return customFruitList != null ? customFruitList : new ArrayList<>();
    }

    /**
     * @param customGroceryList the customGroceryList to set
     */
    public void setCustomFruitList(List<CustomFruitList> customFruitList) {
        this.customFruitList = customFruitList;
    }
    
}
    

