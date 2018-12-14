package com.liaoin.frame.dao.jpa.dao;

import com.liaoin.frame.entity.admin.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminRepository extends JpaRepository<Admin,String>, JpaSpecificationExecutor<Admin> {

}
