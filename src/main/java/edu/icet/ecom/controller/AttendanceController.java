package edu.icet.ecom.controller;

import edu.icet.ecom.dto.AttendanceDTO;
import edu.icet.ecom.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/Attendances")
@RequiredArgsConstructor
public class AttendanceController  {

    final AttendanceService attendanceService;

    @PostMapping("/Add")
    public void addAttendance(@RequestBody AttendanceDTO attendanceDTO) {
        attendanceService.addAttendance(attendanceDTO);
    }

    @PutMapping("/Update")
    public void updateAttendance(@RequestBody AttendanceDTO attendanceDTO) {
        attendanceService.updateAttendance(attendanceDTO);
    }

    @DeleteMapping("/Delete-By-Id{attendanceId}")
    public void deleteAttendance(@PathVariable Integer attendanceId) {
        attendanceService.deleteAttendance(attendanceId);
    }

@GetMapping("/Search-By-Id{attendanceId}")
    public AttendanceDTO searchByID(@PathVariable Integer attendanceId) {
        return attendanceService.searchByID(attendanceId);
    }
@GetMapping("/GetAll")
    public List<AttendanceDTO> getAll() {
        return attendanceService.getAll();
    }
}
