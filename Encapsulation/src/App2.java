class Account { 
    //private data members to hide the data
    private long acc_no; 
    private String name,email; 
    private float amount; 

    //public getter and setter methods 
    public long getAcc_no() { 
        return acc_no; 
    } 

    public void setAcc_no(long acc_no) { 
        this.acc_no = acc_no; 
    } 

    public String getName() { 
        return name; 
    } 

    public void setName(String name) { 
        this.name = name; 
    } 

    public String getEmail() { 
        return email; 
    } 

    public void setEmail(String email) { 
        this.email = email; 
    } 

    public float getAmount() { 
        return amount; 
    } 

    public void setAmount(float amount) { 
        this.amount = amount; 
    } 
}

public class App2 { 
    public static void main(String[] args) { 
        //creating instance of Account class 
        Account account = new Account(); 

        //setting values through setter methods 
        account.setAcc_no(7310805450L); 
        account.setName("Christine"); 
        account.setEmail("christine@gmail.com"); 
        account.setAmount(100000f); 

        //getting values through getter methods 
        System.out.println(account.getAcc_no()+" "+account.getName()+" "+account.getEmail()+" "+account.getAmount()); 
    } 
}