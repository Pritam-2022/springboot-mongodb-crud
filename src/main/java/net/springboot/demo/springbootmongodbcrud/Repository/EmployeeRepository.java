package net.springboot.demo.springbootmongodbcrud.Repository;

import net.springboot.demo.springbootmongodbcrud.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Long> {
}
