class Employee {
   
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;
   
    // it is made static because it is keep common among all and shared by all objects
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show()
    {
        System.out.println("Id=" + ID + "\nName=" + name
                           + "\nAge=" + age);
    }
    public void showNextId()
    {
        System.out.println("Next employee id will be="
                           + nextId);
    }
    protected void finalize()
    {
        --nextId;
        // In this case, gc will call finalize() for 2 times for 2 objects.
    }
}
 
public class App {
    public static void main(String[] args)
    {
        Employee E = new Employee("Christine", 56);
        Employee F = new Employee("Cindy", 45);
        Employee G = new Employee("Bobby", 25);

        E.show();
        F.show();
        G.show();

        E.showNextId();
        F.showNextId();
        G.showNextId();
        {
            // It is sub block to keep all those interns.
            Employee X = new Employee("Gerhard", 23);
            Employee Y = new Employee("Steph", 21);

            X.show();
            Y.show();

            X.showNextId();
            Y.showNextId();
            
            X = Y = null;
            System.gc();
            System.runFinalization();
        }
        E.showNextId();
    }
}