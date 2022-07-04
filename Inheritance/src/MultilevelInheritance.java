//base class
class Animal 
{
    public String breed;
    public String name;

    public Animal(String breed, String name)
    {
        this.name = name;
        this.breed = breed;
    }

    public String toString() {
        return (name + "\n"
        + "is a " + breed);
    }
}

//sub class
class Dog extends Animal {
    public String sound;
    
    //constructor
    public Dog (String name, String breed, String sound)
    {
           //invoking base-class(ANimal) constructor
           super(name, breed);
           this.sound = sound;
    }

    // the Dog subclass adds one more method
    public void setSound(String newValue)
    {
        sound = newValue;
    }

    // overriding toString() method of Animal to print more info
    @Override public String toString()
    {
        return (super.toString() + "\n. They make a sound like: " + sound);
    }
}

//sub class
class Cat extends Animal {
    public String sound;
    
    //constructor
    public Cat (String name, String breed, String sound)
    {
           //invoking base-class(ANimal) constructor
           super(name, breed);
           this.sound = sound;
    }

    // the Cat subclass adds one more method
    public void setSound(String newValue)
    {
        sound = newValue;
    }

    // overriding toString() method of Animal to print more info
    @Override public String toString()
    {
        return (super.toString() + "\n. They make a sound like: " + sound);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) throws Exception {
       //using Dog object
       Animal animal = new Dog("Sam", "Husky", "Woof!");
       System.out.println(animal.toString());

       //using Cat object
       animal = new Cat("Thomas", "Domestic Shorthair", "Meow!");
       System.out.println(animal.toString());
    }
}
