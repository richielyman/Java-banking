public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("MyBank");

        // Add customers
        bank.addCustomer("Jane", "Doe");
        bank.addCustomer("Da", "Pan");   // ._.

        // Create accounts
        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(1).setAccount(new Account(500));

        // Deposit
        bank.getCustomer(0).getAccount().deposit(200);

        // Withdraw
        bank.getCustomer(1).getAccount().withdraw(100);

        // Transfer
        Account acc1 = bank.getCustomer(0).getAccount();
        Account acc2 = bank.getCustomer(1).getAccount();

        acc1.withdraw(300);
        acc2.deposit(300);

        // Display all
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            System.out.println("No." + (i+1));
            Customer c = bank.getCustomer(i);
            System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());

            // display money from account
            if (c.getAccount() != null) {
                System.out.println("Balance: " + c.getAccount().getBalance());
            }
        }
        System.out.println();

        // Delete customer
        bank.deleteCustomer("Jane");

        System.out.println("After deletion:");

        // this shows all curently active account
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            System.out.println("No." + (i+1));
            Customer c = bank.getCustomer(i);
            System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());
            if (c.getAccount() != null) {
                System.out.println("Balance: " + c.getAccount().getBalance());
            }
            System.out.println();
        }
    }
}