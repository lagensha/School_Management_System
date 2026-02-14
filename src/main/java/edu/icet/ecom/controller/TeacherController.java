package edu.icet.ecom.controller;

import edu.icet.ecom.dto.TeacherDTO;
import edu.icet.ecom.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {

    final TeacherService teacherService;

    @PostMapping("/Add")
    public void addTeachers(@RequestBody TeacherDTO teacherDTO) {
        teacherService.addTeachers(teacherDTO);
    }

@PutMapping("/Update")
    public void updateTeachers(@RequestBody TeacherDTO teacherDTO) {
        teacherService.updateTeachers(teacherDTO);
    }

    @DeleteMapping("/Delete-By-Id/{teacherId}")
    public void deleteTeachers(@PathVariable Integer teacherId) {
            teacherService.deleteTeachers(teacherId);
    }

    @GetMapping("/Search-By-Id/{teacherId}")
    public TeacherDTO searchByID(Integer teacherId) {
        return teacherService.searchByID(teacherId);
    }

@GetMapping("/GetAll")
    public List<TeacherDTO> getAll() {
        return teacherService.getAll();
    }
}
