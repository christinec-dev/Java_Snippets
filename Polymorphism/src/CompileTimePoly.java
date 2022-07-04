//via overloading

class Helper {
    static int Multiply(int a, int b){
        return a * b;
    }

    static int Multiply(int a, int b, int c)
    {
        return a * b * c;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) throws Exception {
        System.out.println(Helper.Multiply(2,4));
        System.out.println(Helper.Multiply(2,4,9));
    }
}
