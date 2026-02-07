package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.ParentsDTO;
import edu.icet.ecom.entity.ParentsEntity;
import edu.icet.ecom.repository.ParentsRepository;
import edu.icet.ecom.service.ParentsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ParentsImpl implements ParentsService {

    final ParentsRepository parentsRepository;
    final ModelMapper modelMapper;
    @Override
    public void addParents(ParentsDTO parentsDTO) {
        ParentsEntity parentsEntity = modelMapper.map(parentsDTO,ParentsEntity.class);
        parentsRepository.save(parentsEntity);
    }

    @Override
    public void updateParents(ParentsDTO parentsDTO) {
        ParentsEntity parentsEntity = modelMapper.map(parentsDTO,ParentsEntity.class);
        parentsRepository.save(parentsEntity);
    }

    @Override
    public void deleteParents(Integer parentId) {
        parentsRepository.deleteById(parentId);
    }

    @Override
    public ParentsDTO searchByID(Integer parentId) {
        ParentsEntity parentsEntity=parentsRepository.findById(parentId).get();
        ParentsDTO parentsDTO = modelMapper.map(parentsEntity, ParentsDTO.class);
        return parentsDTO;
    }

    @Override
    public List<ParentsDTO> getAll() {
       List<ParentsEntity>parentsEntities=parentsRepository.findAll();
        ArrayList<ParentsDTO>parentsDTOArrayList=new ArrayList<>();
        parentsEntities.forEach(parentsEntity -> {
            ParentsDTO parentsDTO = modelMapper.map(parentsEntity, ParentsDTO.class);
            parentsDTOArrayList.add(parentsDTO);
        });
        return parentsDTOArrayList;
    }
}
