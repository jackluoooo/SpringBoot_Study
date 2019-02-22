package com.immoc.Service;

import com.immoc.damain.Girl;
import com.immoc.repository.GirlResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author：魏宏东
 * @Param：
 * @description：
 * @Date 2018/8/28 10:15
 **/
@Service
public class GirlService {
    @Autowired
    private GirlResponsitory girlResponsitory;
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlResponsitory.save(girlA);

        Girl girlB=new Girl();
        girlB.setCupSize("A");
        girlB.setAge(18);
        girlResponsitory.save(girlB);
    }
}
