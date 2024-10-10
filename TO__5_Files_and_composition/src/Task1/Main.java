package Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer c1 = new Customer("Egon", "Olsen", "EGO007");
        Customer c2 = new Customer("Kjeld", "Benny", "KjeBe");

        customers.add(c1);
        customers.add(c2);

        printCustomers(customers);


    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }

    }
}

