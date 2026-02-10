package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.AttendanceDTO;
import edu.icet.ecom.entity.AttendanceEntity;
import edu.icet.ecom.repository.AttendanceRepository;
import edu.icet.ecom.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceImpl implements AttendanceService {
            final AttendanceRepository attendanceRepository;
            final ModelMapper modelMapper;
    @Override
    public void addAttendance(AttendanceDTO attendanceDTO) {
        AttendanceEntity attendanceEntity = modelMapper.map(attendanceDTO,AttendanceEntity.class);
        attendanceRepository.save(attendanceEntity);
    }

    @Override
    public void updateAttendance(AttendanceDTO attendanceDTO) {
        AttendanceEntity attendanceEntity = modelMapper.map(attendanceDTO,AttendanceEntity.class);
        attendanceRepository.save(attendanceEntity);
    }

    @Override
    public void deleteAttendance(Integer attendanceId) {
        attendanceRepository.deleteById(attendanceId);
    }

    @Override
    public AttendanceDTO searchByID(Integer attendanceId) {
        AttendanceEntity attendanceEntity = attendanceRepository.findById(attendanceId).get();
        AttendanceDTO attendanceDTO = modelMapper.map(attendanceEntity,AttendanceDTO.class);
        return attendanceDTO;
    }

    @Override
    public List<AttendanceDTO> getAll() {
        List<AttendanceEntity>attendanceEntities=attendanceRepository.findAll();
        ArrayList<AttendanceDTO>attendanceDTOArrayList=new ArrayList<>();
        attendanceEntities.forEach(attendanceEntity -> {
            AttendanceDTO attendanceDTO = modelMapper.map(attendanceEntity,AttendanceDTO.class);
            attendanceDTOArrayList.add(attendanceDTO);
        });
        return attendanceDTOArrayList;
    }
}
