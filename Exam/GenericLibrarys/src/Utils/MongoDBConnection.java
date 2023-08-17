package Utils;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 *
 * @author Pablo Zurita, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class MongoDBConnection {
    private static MongoCollection dataBaseConnection(String nameOfCollection) {
        String uri = "mongodb+srv://pzurita:pzurita@cluster0.ohfzkul.mongodb.net/?retryWrites=true&w=majority";
        String db = "Exam";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase(db);
            MongoCollection<Document> collection = database.getCollection(nameOfCollection);
            return collection;
        }
    }
    
    public static void addObjectToCollection(String nameOfCollection, Object object) {
        MongoCollection<Document> collection = dataBaseConnection(nameOfCollection);
        Document document = objectToDocument(object);
        collection.insertOne(document);
    }

    public static Document objectToDocument(Object object) {
        Gson gson = new Gson();
        Document document = Document.parse(gson.toJson(object));
        return document;
    }

    public static void findObjectToCollection(String nameOfCollection, Object object) {
        MongoCollection<Document> collection = dataBaseConnection(nameOfCollection);
        
        
    }

    
    
}
