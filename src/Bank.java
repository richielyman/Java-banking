public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public String getBankName() {
        return bankName;
    }

    public void addCustomer(String f, String l) {
        customers[numberOfCustomers] = new Customer(f, l);
        numberOfCustomers++;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer findCustomer(String name) {
        for (int i = 0; i < numberOfCustomers; i++) {
            if (customers[i].getFirstName().equals(name)) {
                return customers[i];
            }
        }
        return null;
    }

    public void deleteCustomer(String name) {
        for (int i = 0; i < numberOfCustomers; i++) {
            if (customers[i].getFirstName().equals(name)) {
                for (int j = i; j < numberOfCustomers - 1; j++) {
                    customers[j] = customers[j + 1];
                }
                numberOfCustomers--;
                break;
            }
        }
    }
}