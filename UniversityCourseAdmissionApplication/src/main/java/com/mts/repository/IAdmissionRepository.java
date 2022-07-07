package com.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mts.entity.Admission;

@Repository
public interface IAdmissionRepository extends JpaRepository<Admission, Integer> {

}
