package com.itmuch.cloud.study.repository;

import com.itmuch.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: lanyong_csd
 * @Create: 2019/10/8 21:41
 * @Company: Si-tech
 * @Description:
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
        }
