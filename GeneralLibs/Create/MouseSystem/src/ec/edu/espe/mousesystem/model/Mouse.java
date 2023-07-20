/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mousesystem.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Mouse {
    private String id;
    private String model;
    private String weigth;
    private String color;
    private String sensorType;
    private String rgbLeds;
    private int price=10;

    public Mouse(String id, String model, String weigth, String color, String sensorType, String rgbLeds) {
        this.id = id;
        this.model = model;
        this.weigth = weigth;
        this.color = color;
        this.sensorType = sensorType;
        this.rgbLeds = rgbLeds;
        this.price = price+calculatePrice();
    }

    private int calculatePrice(){
        int finalPrice=0;
        finalPrice = priceOfSensor(sensorType, finalPrice)+priceOfModel(model, finalPrice);
        return finalPrice;
    }

    private int priceOfSensor(String sensorType, int finalPrice) {
        if ("optical".equals(sensorType)) {
            finalPrice=finalPrice+15;
        } else if ("laser".equals(sensorType)) {
            finalPrice=finalPrice+5;
        }
        return finalPrice;
    }

    private int priceOfModel(String model, int finalPrice) {
        if ("gamer".equals(model)) {
            finalPrice= finalPrice+10;
        } else if ("common".equals(model)) {
            finalPrice=finalPrice+5;
        }
        return finalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeigth() {
        return weigth;
    }

    public void setWeigth(String weigth) {
        this.weigth = weigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getRgbLeds() {
        return rgbLeds;
    }

    public void setRgbLeds(String rgbLeds) {
        this.rgbLeds = rgbLeds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
    
    
   
}
