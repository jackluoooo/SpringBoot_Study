package com.immoc.repository;

import com.immoc.damain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlResponsitory extends JpaRepository<Girl,Integer> {
    public List<Girl> findByAge(Integer age);
}
