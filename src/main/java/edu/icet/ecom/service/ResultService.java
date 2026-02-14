package edu.icet.ecom.service;


import edu.icet.ecom.dto.ResultDTO;

import java.util.List;

public interface ResultService {
    void addResults(ResultDTO resultDTO);
    void updateResults(ResultDTO resultDTO);
    void deleteResults(Integer resultId);
    ResultDTO searchByID(Integer resultId);
    List<ResultDTO> getAll();
}
