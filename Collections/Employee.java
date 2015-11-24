
import java.util.Date;


public class Employee implements Comparable<Employee>{
	
	private String firstName;
	private String lastName;
	private Date hireDate;



	public Employee(String firstName, String lastName,Date hireDate){
		this.firstName=firstName;
		this.lastName=lastName;
		this.hireDate=hireDate;
	}
	public boolean equals(Object o) {
        if (!(o instanceof Employee))
            return false;
        Employee e = (Employee) o;
        return e.hireDate.equals(hireDate);
    }

    public int hashCode() {
        return 31*firstName.hashCode() + lastName.hashCode();
    }

    public String toString(){
    	return lastName+" , "+firstName;
    }

	public int compareTo(Employee e){
		
		return (this.hireDate.compareTo(e.hireDate));
	}

	public Date getHireDate(){
		return this.hireDate;
	}


}