package edu.icet.ecom.repository;

import edu.icet.ecom.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity , Integer> {
}
