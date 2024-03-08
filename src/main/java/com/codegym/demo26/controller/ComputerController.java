package com.codegym.demo26.controller;

import com.codegym.demo26.model.Computer;
import com.codegym.demo26.model.Staff;
import com.codegym.demo26.service.IComputerService;
import com.codegym.demo26.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
@Controller
@RequestMapping("C")
public class ComputerController {
    @Autowired
    private IComputerService iComputerService;
    @GetMapping("")
    private ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("/index");
        Iterable<Computer> staff=iComputerService.findAll();
        modelAndView.addObject("staff",staff);

        return modelAndView;
    }
    @PostMapping("/saveStaff")
    private ResponseEntity<Computer> saveBook(@RequestBody Computer computer) {
        return new ResponseEntity<>(iComputerService.save(computer), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computer> showById(@PathVariable int id){
        Optional<Computer> computer = iComputerService.findById(id);
//        Staff staff2 = new Staff(staff1.get().getId(),staff1.get().getLastName(),staff1.get().getSex(),staff1.get().getAge(),staff1.get().getDateOfBirth(),staff1.get().getAddress(),staff1.get().getPhoneNumber(),staff1.get().getEmail(),staff1.get().getPart(),staff1.get().getPosition(),staff1.get().getWage(),staff1.get().getStartDay(),staff1.get().getLastDay());
        if (!computer.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(computer.get(),HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Computer> updateById(@PathVariable int id,@RequestBody Computer computer){
        Optional<Computer> book1 = iComputerService.findById(id);

        if (!book1.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(iComputerService.save(computer),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Computer> deleteById(@PathVariable int id,@RequestBody Computer computer){
        Optional<Computer> computer1 = iComputerService.findById(id);
        if (!computer1.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iComputerService.deleteById(id);
        return new ResponseEntity<>(computer1.get(),HttpStatus.OK);
    }
}
