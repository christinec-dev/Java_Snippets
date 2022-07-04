// accessible within the same package or subclasses in different packages.
class A
{
    protected void display()
    {
        System.out.println("GeeksforGeeks");
    }
}

class Protected extends A {
    public static void main(String args[])
    {
        Protected obj = new Protected();
        obj.display();
    }  
}
