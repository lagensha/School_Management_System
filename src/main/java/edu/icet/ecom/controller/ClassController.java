package edu.icet.ecom.controller;

import edu.icet.ecom.dto.ClassDTO;
import edu.icet.ecom.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Classes")
@RequiredArgsConstructor
public class ClassController {

    final ClassService classService;

    @PostMapping("/Add")
    public void addClasses(@RequestBody ClassDTO classDTO) {
        classService.addClasses(classDTO);
    }

    @PutMapping("/Update")
    public void updateClasses(@RequestBody ClassDTO classDTO) {
        classService.updateClasses(classDTO);
    }

    @DeleteMapping("/Delete-By-Id/{classId}")
    public void deleteClasses(@PathVariable Integer classId) {
        classService.deleteClasses(classId);
    }

    @GetMapping("/Search-By-Id/{classId}")
    public ClassDTO searchByID(@PathVariable Integer classId) {
        return classService.searchByID(classId);
    }

    @GetMapping("/GetAll")
    public List<ClassDTO> getAll() {
        return classService.getAll();
    }
}
