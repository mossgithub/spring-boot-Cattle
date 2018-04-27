package com.moss;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by feng.lin2 on 2018/4/25.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过年龄查询
    public List<Girl> findByAge (Integer age);

}
