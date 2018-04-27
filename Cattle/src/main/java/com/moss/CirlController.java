package com.moss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by feng.lin2 on 2018/4/25.
 */

@RestController
public class CirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private CirlService cirlService;
    /**
     * 查询列表 get
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加一个信息
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);

      return  girlRepository.save(girl);
    }

    /**
     * 查询一个用户
     * @param id
     * @return
     */
    @GetMapping(value =  "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }

    /**
     * 更新 put
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpate(@PathVariable("id") Integer id,
                          @RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){

        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);

    }

    /**
     * 删除一个用户delete
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
    girlRepository.delete(id);
    }

    /**
     * 根据年龄查询get
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }


    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        cirlService.insertTwo();
    }

}

