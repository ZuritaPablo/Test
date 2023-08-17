/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.connection;

import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Oswaldo Tipan
 */
public class Main {
    public static void main(String[] args) {
        
        Test test = new Test(0, 25, "Oswaldo");
        String uri = "mongodb+srv://ojtipan:trabatrix2@farm.am6duog.mongodb.net/?retryWrites=true&w=majority";
        //MongoConection.addData("Data", uri, "Test", test);
        //MongoConection.deleteData("Data", uri, "Test", "Jose");
        //MongoConection.updateData("Data", uri, "Test", "Maria", test);
        //System.out.println(MongoConection.getData("Data", uri, "Test", "Maria").get("Name"));
        
        Document sortDocument = new Document().append("_id", new ObjectId())
                .append("unsorted", "Jose")
                .append("size", 23)
                .append("sortAlgorithm", "Simon")
                .append("sorted", "Vamoh a bbr");
        MongoConection.addDataDoc("Data", uri, "Test", sortDocument);
    }
}
