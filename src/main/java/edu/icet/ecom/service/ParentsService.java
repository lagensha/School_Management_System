package edu.icet.ecom.service;

import edu.icet.ecom.dto.ParentsDTO;
import edu.icet.ecom.dto.StudentDTO;

import java.util.List;

public interface ParentsService {
    void addParents(ParentsDTO parentsDTO);
    void updateParents(ParentsDTO parentsDTO);
    void deleteParents(Integer  parentId);
  ParentsDTO searchByID(Integer  parentId);
    List<ParentsDTO> getAll();
}
