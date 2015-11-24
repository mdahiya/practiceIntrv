
import java.util.*;

public class EmpSort{
	


	public static void main(String[] args){
		Date manishHireDate=new Date("04-Nov-1981");
		Date harHireDate=new Date("28-Mar-1982");
		Date anahiHireDate=new Date("07-May-2015");
		Employee e1=new Employee("Manish","Dahiya",manishHireDate);

		Employee e2=new Employee("Harneet","Sidhu",harHireDate);
		Employee e3=new Employee("Anahi","Dahiya",anahiHireDate);
		
		List<Employee> c=new ArrayList<Employee>();
		c.add(e1);c.add(e2);c.add(e3);
		Collections.sort(c);
		
		System.out.println(c);
		Collections.sort(c,SENIORITY_ORDER);

		System.out.println(c);


	}

	static final Comparator<Employee> SENIORITY_ORDER = 
                                        new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e2.getHireDate().compareTo(e1.getHireDate());
            }
    };

}