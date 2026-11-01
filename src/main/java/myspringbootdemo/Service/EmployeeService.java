package myspringbootdemo.Service;

import myspringbootdemo.Entity.EmployeeEntity;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    EmployeeEntity saveEmployee(EmployeeEntity employee);
    List<EmployeeEntity> getAllEmployees();
    Optional<EmployeeEntity> getEmployeeById(Long id);
    EmployeeEntity updateEmployee(Long id, EmployeeEntity employee);
    void deleteEmployee(Long id);
}
