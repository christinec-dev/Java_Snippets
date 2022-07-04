class Student
{
    public int stud_no;
    public String name;

    Student(int stud_no, String name)
    {
        this.stud_no = stud_no;
        this.name = name;
    }
}

public class ArrayWithClass {
    public static void main (String[] args)
    {
        Student[] arr;
 
        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
 
        // initialize the first elements of the array
        arr[0] = new Student(1,"cindy");
        arr[1] = new Student(2,"christine");
        arr[2] = new Student(3,"gerhard");
        arr[3] = new Student(4,"bobby");
        arr[4] = new Student(5,"mohit");
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " + arr[i].stud_no +" "+ arr[i].name);
    }      
}
