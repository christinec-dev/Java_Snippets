public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.printDetails();
    }

    public class Member {
        public String name;
        public Integer age;
        public Integer phoneNumber;
        public String address;
        public Integer salary;

        public void printSalary() {
            System.out.println("Salary is: R" + salary);
        }
    }

    public class Employee extends Member {
        public String specialization;
        public String department;

        public void printEmployee() {
            name = "Jane Smith";
            age = 23;
            phoneNumber = 1234567890;
            address = "12 Fake Ave, Newcrest";
            salary = 2000;
            specialization = "Digital Design";
            department = "Marketing";

            System.out.println("Employee name: " + name);
            System.out.println("Employee age: " + age);
            System.out.println("Employee phoneNumber: " + phoneNumber);
            System.out.println("Employee address: " + address);
            System.out.println("Employee salary: R" + salary);
            System.out.println("Employee specialization: " + specialization);
            System.out.println("Employee department: " + department);
            System.out.println("\n");
        }
    }

    public class Manager extends Member {
        public String specialization;
        public String department;

        public void printManager() {
            name = "John Doe";
            age = 54;
            phoneNumber = 1234567890;
            address = "132 Fauxburg Street, Newcrest";
            salary = 15000;
            specialization = "Accounting";
            department = "Marketing";

            System.out.println("Manager name: " + name);
            System.out.println("Manager age: " + age);
            System.out.println("Manager phoneNumber: " + phoneNumber);
            System.out.println("Manager address: " + address);
            System.out.println("Manager salary: R" + salary);
            System.out.println("Manager specialization: " + specialization);
            System.out.println("Manager department: " + department);            
            System.out.println("\n");
        }
    }

    public void printDetails() {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Member member = new Member();

        employee.printEmployee();
        manager.printManager();
        member.printSalary();
    }
}
