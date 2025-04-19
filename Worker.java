public class Worker extends Employee {

    double calculateSalary(){
        return 5000;
    }

    public void display() {
        System.out.println("Worker Salary : " + calculateSalary());
    }
}
