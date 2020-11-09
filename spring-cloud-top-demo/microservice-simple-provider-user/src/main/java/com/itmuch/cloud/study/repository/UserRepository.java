package com.itmuch.cloud.study.repository;

import com.itmuch.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: lanyong_csd
 * @Create: 2019/10/10 15:16
 * @Company: Si-tech
 * @Description:
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
