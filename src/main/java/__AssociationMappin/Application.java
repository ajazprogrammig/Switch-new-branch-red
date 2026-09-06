package __AssociationMappin;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import __AssociationMappin.Entity.Address;
import __AssociationMappin.Entity.Employee;
import __AssociationMappin.Repository.AddRepository;
import __AssociationMappin.Repository.EmpRepository;

@SpringBootApplication
public class Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpRepository empRepository = context.getBean(EmpRepository.class);
		AddRepository addRepository = context.getBean(AddRepository.class);
		
		/*
		 * Employee e = new Employee(); e.setApmName("ajaz"); e.setAmpSalary(50000);
		 * 
		 * 
		 * Address a = new Address(); a.setCity("anpara"); a.setCountry("india");
		 * a.setEmployee(e); a.setState("Sonbhadra"); Address a1 = new Address();
		 * a1.setCity("anpara"); a1.setCountry("india"); a1.setEmployee(e);
		 * a1.setState("Sonbhadra"); List<Address> addr = Arrays.asList(a,a1);
		 * e.setAddresses(addr); empRepository.save(e);
		 */	
		/*
		 * List<Employee> list = empRepository.findAll(); list.forEach(s->{
		 * System.out.println(s); });
		 */
	Optional<Address> byId = addRepository.findById(2);
	//Address add = byId.get();
	System.out.println(byId);
	}

}
