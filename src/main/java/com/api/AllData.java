package com.api;

import com.rhcloud.mongo.annotation.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by lday15 on 3/28/2017.
 */
@Document(collectionName = "QADTAUD")
public class AllData {

    @Id private String id;
    @Field
    private int taud_BRN_LOCATION;
    @Field
    private int taud_DAT_OPERATION;



    public int getTaud_BRN_LOCATION() {
        return taud_BRN_LOCATION;
    }

    public void setTaud_BRN_LOCATION(int taud_BRN_LOCATION){
        this.taud_BRN_LOCATION = taud_BRN_LOCATION;
    }

    public int getTaud_DAT_OPERATION(){
        return taud_BRN_LOCATION;
    }

    public void setTaud_DAT_OPERATION(int taud_DAT_OPERATION){
        this.taud_DAT_OPERATION = taud_DAT_OPERATION;

    }

}
