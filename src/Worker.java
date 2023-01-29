public class Worker {
    public String name;
    public String surname;
    public int salary;
    private int workerNo;
    private double workerLvl;

    Worker() {
        System.out.println("Default constructor");
    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Public constructor");
    }

    public String getNameSurname(){
        System.out.println("method getNameSurname");
        return this.name + " " + this.surname;
    }

    public void setSalary (int salary){
        this.salary = salary;
    }
}