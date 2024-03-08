package com.codegym.demo26.service;

import com.codegym.demo26.model.Staff;
import com.codegym.demo26.repository.IStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookService implements IStaffService{
    @Autowired
    private IStaffRepository iStaffRepository;
    @Override
    public Iterable<Staff> findAll() {
        return iStaffRepository.findAll();
    }

    @Override
    public Optional<Staff> findById(int id) {
        return iStaffRepository.findById(id);
    }

    @Override
    public Staff save(Staff staff) {
  return iStaffRepository.save(staff);
    }

    @Override
    public void deleteById(int id) {
iStaffRepository.deleteById(id);
    }



}
