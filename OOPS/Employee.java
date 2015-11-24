public class Employee {
    String test;

    public Employee(String test){
        this.test=test;
        System.out.println(this.test);
    }
    public Employee(){

    }

    public String toString() {
        return "MyToStringMethod";
    }

    public String superToString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Employee b = new Employee();
        Employee c = new Employee("Test");
        
        System.out.println(c);
        System.out.println(b);
        System.out.println("*******************");
        System.out.println(b.superToString());
    }
}
 class Manager{

}