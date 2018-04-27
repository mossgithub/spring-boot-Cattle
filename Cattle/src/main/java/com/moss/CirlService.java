package com.moss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by feng.lin2 on 2018/4/25.
 */

@Service
public class CirlService {

    @Autowired
    private  GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(100);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B111");
        girlB.setAge(1001);
        girlRepository.save(girlB);

    }
}
