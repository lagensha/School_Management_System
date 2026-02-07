package edu.icet.ecom.controller;

import edu.icet.ecom.dto.StudentDTO;
import edu.icet.ecom.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController{
    final StudentService studentService;

 @PostMapping("/Add")
    public void addStudents(@RequestBody StudentDTO studentDTO) {
            studentService.addStudents(studentDTO);
    }

   @PostMapping("/Update")
    public void updateStudents(@RequestBody StudentDTO studentDTO) {
        studentService.updateStudents(studentDTO);
    }

   @DeleteMapping("/Delete-By-Id/{studentId}")
    public void deleteStudents(@PathVariable Integer studentId) {
        studentService.deleteStudents(studentId);
    }

   @GetMapping("Search-By-Id/{studentId}")
    public StudentDTO searchByID(@PathVariable Integer studentId) {
        return studentService.searchByID(studentId);
    }

    @GetMapping("/GetAll")
    public List<StudentDTO> getAll() {
        return studentService.getAll();
    }
}
