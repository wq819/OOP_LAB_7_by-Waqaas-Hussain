public class Manager extends Employee{

    double calculateSalary(){
        return 10000 ;
    }

    public void display(){
        System.out.println("Manager Salary : " + calculateSalary());
    }

}
