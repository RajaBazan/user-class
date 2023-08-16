package hello.com;

class User{
    int id;
    String name;
    int age;
    int salary;
    public void printdetails(){
        System.out.println("ID of emplyee: " + id);
        System.out.println("Name of emplyee: " + name);
        System.out.println("Age of emplyee: " + age);
        System.out.println("Salary of emplyee: " + salary);
    }
    public int getSalary(){
        return salary;
    }
}
public class user_class {
    public static void main(String[] args) {
        User a = new User();
        a.id = 1;
        a.name = "Bazan";
        a.age = 21;
        a.salary = 13000;
        a.printdetails();


    }
}
