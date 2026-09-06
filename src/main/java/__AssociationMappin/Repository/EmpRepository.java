package __AssociationMappin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import __AssociationMappin.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
