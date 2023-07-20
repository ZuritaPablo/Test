/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mousesystem.controller;

import ec.edu.espe.mousesystem.model.Mouse;
import ec.edu.espe.mousesystem.utils.MongoDBConnection;
import org.bson.Document;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class MouseController {
    private String id;
    private String model;
    private String weigth;
    private String color;
    private String sensorType;
    private String rgbLeds;
    private int price=10;
    Mouse mouse = new Mouse(id, model, weigth, color, sensorType, rgbLeds);
    public static void insertMouse(Mouse mouse){
        
        
        Document document = new Document();
            document.append("id", mouse.getId());
            document.append("model", mouse.getModel());
            document.append("weigth", mouse.getWeigth());
            document.append("color", mouse.getColor());
            document.append("sensorType", mouse.getSensorType());
            document.append("rgbLeds", mouse.getRgbLeds());
        
        MongoDBConnection mongoDbConnection = new MongoDBConnection();
        mongoDbConnection.connection("Mouse", document);    
        
    
        
    }
}
