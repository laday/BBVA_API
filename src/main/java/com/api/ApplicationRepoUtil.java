package com.api;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by lday15 on 3/28/2017.
 */
@Repository
@Service
public class ApplicationRepoUtil //implements DataService
         {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private MongoRepo mongoRepo;

    /**
     * @return the mongoTemplate
     */
    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }

    /**
     * @return the mongoRepo
     */
    public MongoRepo getMongoRepo() {
        return mongoRepo;
    }


    public AllData findById(String id){
       return convertToData(findById(id));
   }
    private AllData convertToData(AllData model){
        AllData data = new AllData();
        data.setTaud_BRN_LOCATION(model.getTaud_BRN_LOCATION());
        data.setTaud_DAT_OPERATION(model.getTaud_DAT_OPERATION());
        return data;
    }
}
