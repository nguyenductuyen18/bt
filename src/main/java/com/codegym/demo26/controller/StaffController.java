package com.codegym.demo26.controller;

import com.codegym.demo26.model.Staff;
import com.codegym.demo26.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class StaffController {
    @Autowired
    private IStaffService iStaffService;
        @RequestMapping("")
        private ModelAndView show(){
            ModelAndView modelAndView = new ModelAndView("/index");
            Iterable<Staff> staff=iStaffService.findAll();
            modelAndView.addObject("staff",staff);

            return modelAndView;
        }
    @PostMapping("/saveStaff")
    private ResponseEntity<Staff> saveBook(@RequestBody  Staff staff) {
        return new ResponseEntity<>(iStaffService.save(staff), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Staff> showById(@PathVariable int id){
        Optional<Staff> staff1 = iStaffService.findById(id);
//        Staff staff2 = new Staff(staff1.get().getId(),staff1.get().getLastName(),staff1.get().getSex(),staff1.get().getAge(),staff1.get().getDateOfBirth(),staff1.get().getAddress(),staff1.get().getPhoneNumber(),staff1.get().getEmail(),staff1.get().getPart(),staff1.get().getPosition(),staff1.get().getWage(),staff1.get().getStartDay(),staff1.get().getLastDay());
        if (!staff1.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(staff1.get(),HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Staff> updateById(@PathVariable int id,@RequestBody Staff staff){
        Optional<Staff> book1 = iStaffService.findById(id);
        if (!book1.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(iStaffService.save(staff),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Staff> deleteById(@PathVariable int id,@RequestBody Staff staff){
        Optional<Staff> book1 = iStaffService.findById(id);
        if (!book1.isPresent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iStaffService.deleteById(id);
        return new ResponseEntity<>(book1.get(),HttpStatus.OK);
    }
}
