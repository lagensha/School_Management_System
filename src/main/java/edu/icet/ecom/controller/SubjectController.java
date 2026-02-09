package edu.icet.ecom.controller;

import edu.icet.ecom.dto.SubjectDTO;
import edu.icet.ecom.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/subjects")
@RequiredArgsConstructor
public class SubjectController {

    final SubjectService subjectService;

    @PostMapping("/Add")
    public void addSubjects(@RequestBody SubjectDTO subjectDTO) {
            subjectService.addSubjects(subjectDTO);
    }

@PutMapping("/Update")
    public void updateSubjects(@RequestBody SubjectDTO subjectDTO) {
        subjectService.updateSubjects(subjectDTO);
    }

    @DeleteMapping("/Delete-By-Id/{subjectId}")
    public void deleteSubjects(@PathVariable Integer subjectId) {
        subjectService.deleteSubjects(subjectId);
    }

    @GetMapping("Search-By-Id/{subjectId}")
    public SubjectDTO searchByID(@PathVariable Integer subjectId) {
        return subjectService.searchByID(subjectId);
    }

    @GetMapping("/GetAll")
    public List<SubjectDTO> getAll() {
        return subjectService.getAll() ;
    }
}
