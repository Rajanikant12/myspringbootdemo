package myspringbootdemo.Service;

import myspringbootdemo.Entity.EmployeeEntity;
import myspringbootdemo.Repository.EmployeeRepository;
import myspringbootdemo.Service.EmployeeService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    // Constructor injection (Best practice, no @Autowired needed)
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeDetails) {
        return employeeRepository.findById(id).map(existingEmployee -> {
            existingEmployee.setName(employeeDetails.getName());
            existingEmployee.setDesignation(employeeDetails.getDesignation());
            return employeeRepository.save(existingEmployee);
        }).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public void deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }
}
