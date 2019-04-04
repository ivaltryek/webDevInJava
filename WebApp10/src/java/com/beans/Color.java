/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author user1
 */
public class Color {
    private String name;
    private String rgbValue;

    public Color(){}
    
    public Color(String name,String value){
        this.name=name;
        this.rgbValue=value;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRgbValue() {
        return rgbValue;
    }

    public void setRgbValue(String rgbValue) {
        this.rgbValue = rgbValue;
    }
    
    @Override
    public String toString(){
        return "Color name:"+name+"<br> RGB value:"+rgbValue+"<br>";
    }
}
