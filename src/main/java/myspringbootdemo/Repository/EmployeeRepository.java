package myspringbootdemo.Repository;

import org.springframework.stereotype.Repository;
import myspringbootdemo.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    
    // Optional: Add custom query methods if you need them later
    List<EmployeeEntity> findByName(String name);
    List<EmployeeEntity> findByDesignation(String designation);
}
