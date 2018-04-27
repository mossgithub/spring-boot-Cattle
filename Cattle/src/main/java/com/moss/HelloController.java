package com.moss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by feng.lin2 on 2018/4/23.
 */


@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private  GirlProperties girlProperties;

//    @RequestMapping(value = "/say",method = RequestMethod.POST)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false, defaultValue = "0") Integer myId){

          return "id:" + myId;
//        return girlProperties.getCupSise() + girlProperties.getAge();
    }
}
