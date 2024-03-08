package com.codegym.demo26.repository;

import com.codegym.demo26.model.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComputerRepository extends CrudRepository<Computer,Integer> {
}
