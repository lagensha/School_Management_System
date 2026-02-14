package edu.icet.ecom.controller;

import edu.icet.ecom.dto.ParentsDTO;
import edu.icet.ecom.service.ParentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/Parents")
@RequiredArgsConstructor
public class ParentsController {

    final ParentsService parentsService;

    @PostMapping("/Add")
    public void addParents(@RequestBody ParentsDTO parentsDTO) {
        parentsService.addParents(parentsDTO);
    }

@PutMapping("/Update")
    public void updateParents(@RequestBody ParentsDTO parentsDTO) {
        parentsService.updateParents(parentsDTO);
    }

@DeleteMapping("/Delete-By-Id/{parentId}")
    public void deleteParents(@PathVariable Integer parentId) {
        parentsService.deleteParents(parentId);
    }

    @GetMapping("/Search-By-Id/{parentId}")
    public ParentsDTO searchByID(@PathVariable Integer parentId) {
        return parentsService.searchByID(parentId);
    }

    @GetMapping("/GetAll")
    public List<ParentsDTO> getAll() {
        return parentsService.getAll();
    }
}
