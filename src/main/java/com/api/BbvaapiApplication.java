package com.api;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class BbvaapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbvaapiApplication.class, args);

		AllData allData = new AllData();
		MongoClient mongo = new MongoClient("10.8.1.24", 27017);
		DB db = mongo.getDB("AuditTrail");
		List<String> dbs = mongo.getDatabaseNames();
		DBCollection table = db.getCollection("QADTAUD");
		Set<String> tables = db.getCollectionNames();

		for(String coll : tables){
			System.out.println(coll);
		}

	}
}
