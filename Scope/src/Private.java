// Any other class of the same package will not be able to access these members.

class A
{
    public void display()
    {
        System.out.println("GeeksforGeeks");
    }
}
 
class Private
{
    public static void main(String args[])
    {
        A obj = new A();
        // Trying to access private method of another class - WE CAN'T
        obj.display();
    }
}