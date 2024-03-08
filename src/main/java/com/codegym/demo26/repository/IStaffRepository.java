package com.codegym.demo26.repository;

import com.codegym.demo26.model.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IStaffRepository extends CrudRepository<Staff,Integer> {
}
