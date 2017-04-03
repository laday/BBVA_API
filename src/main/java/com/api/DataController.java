package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

/**
 * Created by lday15 on 3/28/2017.
 */
@RestController
@RequestMapping(value = "/data")
public class DataController {
   @Autowired
    ApplicationRepoUtil applicationRepoUtil;
//    @RequestMapping("/test")
  //  public ResponseObject handleRequest() {
/*        System.out
                .println("---------------------Testing method called---------------- Mongo Template :"
                        + applicationRepoUtil.getMongoTemplate()
                        + " Repository Object : "
                        + applicationRepoUtil.getMongoRepo());
        Supplier<ResponseObject> supplier = ResponseObject::new;
        ResponseObject responseObject = supplier.get();

        responseObject.setMessage("Sample Data Object");
        return responseObject;

    }*/

   @RequestMapping("/data")
    public AllData handleRequest() {
        System.out
                .println("---------------------Testing method called---------------- Mongo Template :"
                        + applicationRepoUtil.getMongoTemplate()
                        + " Repository Object : "
                        + applicationRepoUtil.getMongoRepo());

        Supplier<AllData> supplier = AllData::new;
        AllData allData = supplier.get();

        return allData;
    }
   @RequestMapping(value = "{id}", method = RequestMethod.GET)
    AllData findById(@PathVariable("id") String id) {
        return applicationRepoUtil.findById(id);
    }
}
