package com.example.JPA.PART2;

import com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy.Card;
import com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaPart2ApplicationTests {

    //@Autowired
    //PaymentRepository paymentRepository;

    @Test
    void contextLoads() {
    }
 /*@Autowired




	@Test
	public void insert()
	{
		EmployeeTable employee1=new EmployeeTable();
		employee1.setAge(25 );
		employee1.setFirstName("Himani");
		employee1.setLastName("bhardwaj");
	employee1.setSalary(20000);


		employeeRepository.save(employee1);
	}

	@Test
	void getPartialRecords()
	{
		List<Object[]> partialData=employeeRepository.selectPartialRecords();
		for (Object[] objects:partialData)
		{
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

	@Test
	void findAllStudentByFirstName()
	{
		List<EmployeeTable>employees=employeeRepository.findAllStudentsByName("Himani");

		for (EmployeeTable emp:employees)
		{
			System.out.println(emp.getFirstName());
		}


	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void deleteByage()
	{
		employeeRepository.deleteByAge(20);
	}

	@Test
	void findAllStudentsByAge()
	{
		List<EmployeeTable> employees=employeeRepository.findAllStudentsByAge(20,30);

		for (EmployeeTable emp:employees)
		{
			System.out.println(emp.getFirstName());
			System.out.println(emp.getAge());
		}
	}

@Test
	void Paging()
{
	Pageable pageable =PageRequest.of(0,1);
	Page<EmployeeTable> employeeTables= employeeRepository.findAllStudentsPage(pageable);

	employeeTables.forEach(System.out::println);




}



*/

   /* @Test
    public void InheritenceMapping()
    {
        Card c1=new Card();
        c1.setCardNumber(1234435);
        c1.setAmount(300000);
        c1.setId(123);

        paymentRepository.save(c1);


    }*/
}
