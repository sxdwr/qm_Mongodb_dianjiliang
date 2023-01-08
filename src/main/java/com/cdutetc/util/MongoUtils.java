package com.cdutetc.util;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoUtils {
    private static final String DB = "pvdb";
    private static final String COLLECTION = "pageView";

    public static  MongoCollection<Document> getMongodbCollection(){
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase(DB);
        MongoCollection<Document> collection = database.getCollection(COLLECTION);
        return collection;
    }

}