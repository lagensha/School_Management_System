package edu.icet.ecom.controller;

import edu.icet.ecom.dto.ResultDTO;
import edu.icet.ecom.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Results")
@RequiredArgsConstructor
public class ResultController{

    final ResultService resultService;

    @PostMapping("/Add")
    public void addResults(@RequestBody ResultDTO resultDTO) {
        resultService.addResults(resultDTO);
    }

    @PutMapping("/Update")
    public void updateResults(@RequestBody ResultDTO resultDTO) {
            resultService.updateResults(resultDTO);
    }

    @DeleteMapping("/Delete-By-Id{resultId}")
    public void deleteResults(@PathVariable Integer resultId) {
        resultService.deleteResults(resultId);
    }

    @GetMapping("/Search-By-Id{resultId}")
    public ResultDTO searchByID(Integer resultId) {
        return resultService.searchByID(resultId);
    }

    @GetMapping("/GetAll")
    public List<ResultDTO> getAll() {
        return  resultService.getAll();
    }
}
