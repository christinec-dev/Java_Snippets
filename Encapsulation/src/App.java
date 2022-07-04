class Encapsulate {
    //private variables
    private String name;
    private int roll;
    private int age;

    //getters to access private variables
    public String getName(){
        return name;
    }

    public int getRoll(){
        return roll;
    }

    public int getAge(){
        return age;
    }

    //setters to access private variables
    public void setName(String newName)
    {
        name = newName;
    }

    public void setRoll(int newRoll)
    {
        roll = newRoll;
    }
    
    public void setAge(int newAge)
    {
        age = newAge;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Encapsulate encapsulate = new Encapsulate();

        // setting values of the variables
        encapsulate.setName("Christine");
        encapsulate.setRoll(12);
        encapsulate.setAge(23);

        // Displaying values of the variables
        System.out.println("Name: " + encapsulate.getName());
        System.out.println("Age: " + encapsulate.getAge());
        System.out.println("Roll: " + encapsulate.getRoll());
           
        //we cant just call getName() due to encapsuation. Thus we call x.getName()
    }
}
