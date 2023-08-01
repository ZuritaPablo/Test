/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ShoppStereo.controller;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.ShoppStereo.utils.MongoDBConnection;
import org.bson.Document;
import ec.edu.espe.ShoppStereo.model.Stereo;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class StereoController {
    
   public void deleteSpeaker(Professor professor) {
        MongoDBConnection db = new MongoDBConnection();
        db.connection("SpeakerInventory");
        MongoCollection<Document> speakerCollection = db.getCollection();
        Document filter = new Document("id", stereo.getId());
        System.out.println("Deleting document with id: " + stereo.getId());
        speakerCollection.deleteMany(filter);
        System.out.println("Document with id " + stereo.getId() + " deleted successfully.");
   }
   
   public static void insertProfessor(Professor professor){
        
        
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
   
    public static String countSpeaker(MongoCollection<Document> collection) {
      try {
          long count = collection.countDocuments();
          return String.valueOf(count); // Convertimos el resultado a String
      } catch (Exception e) {
          System.err.println("Error al contar objetos en la colección: " + e.getMessage());
          return "Error";
      }
  }
    
}
