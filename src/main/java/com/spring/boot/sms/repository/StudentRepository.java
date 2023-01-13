package com.spring.boot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.sms.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
