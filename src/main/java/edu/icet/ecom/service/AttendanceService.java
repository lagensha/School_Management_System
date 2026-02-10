package edu.icet.ecom.service;

import edu.icet.ecom.dto.AttendanceDTO;

import java.util.List;

public interface AttendanceService {
    void addAttendance(AttendanceDTO attendanceDTO);
    void updateAttendance(AttendanceDTO attendanceDTO);
    void deleteAttendance(Integer attendanceId);
    AttendanceDTO searchByID(Integer attendanceId);
    List<AttendanceDTO> getAll();
}
