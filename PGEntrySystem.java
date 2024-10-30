import java.util.*;
import java.util.stream.IntStream;

public class PGEntrySystem {
    private Customer[] customers;

    public PGEntrySystem(int size) {
        this.customers = new Customer[size];
    }

    public void addCustomer(int ind, Customer customer) {
        if (ind >= 0 && ind < customers.length) {
            customers[ind] = customer;
        }
    }

    public void displayCustomers() {
        Arrays.sort(customers, (c1, c2) -> {
            if (c1 == null) return 1;
            if (c2 == null) return -1;
            return c1.getName().toLowerCase().compareTo(c2.getName().toLowerCase());
        });

        for (Customer customer : customers) {
            if (customer != null) {
                System.out.println(customer.Details());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-----Welcome to Trustt PG----- ");
        System.out.print("\n*****************************\n");
        System.out.print("Enter the number of customers: ");
        int noCustomers = Integer.parseInt(scanner.nextLine());

        PGEntrySystem pgEntrySystem = new PGEntrySystem(noCustomers);

        // for (int i = 0; i < noCustomers; i++) {
        //     System.out.println("Enter details for customer " + (i + 1) + ":");
        //     System.out.print("Name: ");
        //     String name = scanner.nextLine();

        //     System.out.print("Address Line 1: ");
        //     String addressLine1 = scanner.nextLine();

        //     System.out.print("Address Line 2: ");
        //     String addressLine2 = scanner.nextLine();

        //     System.out.print("City: ");
        //     String city = scanner.nextLine();

        //     System.out.print("State: ");
        //     String state = scanner.nextLine();

        //     System.out.print("Country: ");
        //     String country = scanner.nextLine();

        //     Customer customer = new Customer(name, addressLine1, addressLine2, city, state, country);
        //     pgEntrySystem.addCustomer(i, customer);
        // }
        IntStream.range(0, noCustomers).forEach(i -> {
            System.out.println("Enter details for customer " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address Line 1: ");
            String addressLine1 = scanner.nextLine();
            System.out.print("Address Line 2: ");
            String addressLine2 = scanner.nextLine();
            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("State: ");
            String state = scanner.nextLine();

            System.out.print("Country: ");
            String country = scanner.nextLine();

            Customer customer = new Customer(name, addressLine1, addressLine2, city, state, country);
            pgEntrySystem.addCustomer(i, customer);
        });


        pgEntrySystem.displayCustomers();
        scanner.close();
    }
}
