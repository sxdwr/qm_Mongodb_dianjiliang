package com.cdutetc.service;

import com.cdutetc.pojo.View;
import com.cdutetc.util.MongoUtils;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;

public class pageViewService {
    private  MongoCollection<Document> collection ;

    public pageViewService(){
        this.collection = MongoUtils.getMongodbCollection();
    }
    public void  Insert(View view){
        Document doc = new Document();
        doc.append("brandID",view.getBrandID());
        doc.append("imageURL",view.getImageURL());
        doc.append("imageTitle",view.getImageTitle());
        doc.append("priceNow",view.getPriceNow());
        doc.append("forecast",view.getForecast());
        doc.append("dateline",view.getDateline());
        doc.append("readNum",view.getReadNum());
        doc.append("participateNum",view.getParticipateNum());
        collection.insertOne(doc);
    }

    public Document QueryById(int brandID){
        FindIterable<Document> documents = collection.find();
        for (Document document : documents) {
            int id = (int) document.get("brandID");
            if (id == brandID){
                return document;
            }
        }
        return null;
    }

    public  ArrayList QueryAll(){
        FindIterable<Document> documents = collection.find();
        ArrayList<Document> datas = new ArrayList<>();
        for (Document document : documents) {
            datas.add(document);
        }
       return  datas;
    }

    public void Update(View view){
        Bson eq = Filters.eq("brandID",view.getBrandID());
//        System.out.println(view);
        collection.updateOne(eq,new Document("$set",new Document("readNum",view.getReadNum() + 1)));
//        collection.updateOne(eq,new Document("$set",view.getParticipateNum()));
    }

    public  void Delete(int brandID){
        Bson eq = Filters.eq("brandID",brandID);
        collection.deleteOne(eq);
    }

}
