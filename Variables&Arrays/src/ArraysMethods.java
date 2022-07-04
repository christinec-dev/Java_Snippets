public class ArraysMethods {
    public static void main(String args[])
    {
        //passing of array to method
        int arr[] = {3, 1, 2, 5, 4};
        sum(arr);

        //return array from method
        int arr2[] = m1();
         
        for (int i = 0; i < arr2.length; i++)
        { 
            System.out.print(arr2[i]+" ");
        }
     
    }
         
    // getting array values
    public static void sum(int[] arr)
    {
        int sum = 0;
         
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        } 
         
        System.out.println("Sum of array values : " + sum);
    } 

    // returning  array
    public static int[] m1()
    {
        return new int[]{1,2,3};
    }
}
