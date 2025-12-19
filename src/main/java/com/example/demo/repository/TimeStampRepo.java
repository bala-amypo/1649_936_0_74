package com.example.demo.repository;
import com.example.demo.entity.TimeStamp;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TimeStampRepo extends JpaRepository<ValidationEntity,Long>{

}