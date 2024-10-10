package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter += 1;
        this.id = counter;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastname(){
        return this.lastName;
    }

    public String getUsername(){
        return this.username;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        String s = "Customer name: " + this.firstName + " " + this.lastName + "\n";
        s += "Username: " + this.username + ", ID: " + this.id;
        return s;
    }
}
