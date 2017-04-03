package com.api;

import java.util.List;

/**
 * Created by lday15 on 3/30/2017.
 */
public interface DataService {
    AllData create (AllData allData);
    AllData findById(String id);
    List<AllData> findAll();
}
