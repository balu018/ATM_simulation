public class Main implements ATM{
    public static void main(String[] args) {
        while(true){
            System.out.println("1.check bank balance \t 2.deposit \n\n 3.withdrawl \t 4.create account \n enter your choice : ");
            int choice=sc.nextInt();
            Main m=new Main();

            switch (choice){
                case 1:
                    m.checkBankbalance();
                    break;
                case 2:
                    m.deposit();
                    break;
                case 3:
                    m.withdraw();
                    break;
                case 4:
                    m.createAccount();
                    break;
                default:
                    System.out.println("invalid choice...");
            }
        }

    }

    @Override
    public void checkBankbalance() {
        System.out.println("enter account number: ");
        int accoutnno=sc.nextInt();
        Customer c=customerdetails.get(accoutnno);
        System.out.println("your bank balance: "+c.getBalance());
        return;
    }

    @Override
    public void createAccount() {
        int accountno=customerdetails.size()+1;
        System.out.println("enter first name : ");
        String firstname=sc.next();
        System.out.println("enter last name : ");
        String lastname=sc.next();
        System.out.println("enter phone number : ");
        String phno=sc.next();
        System.out.println("enter address name : ");
        String address=sc.next();
        Customer dummy=new Customer(accountno,firstname,lastname,phno,address);
        customerdetails.put(accountno,dummy);
        System.out.println("account created successfully with account no: "+accountno);
        return;
    }

    @Override
    public void deposit() {
        System.out.println("enter the accoutn number : ");
        int accountno=sc.nextInt();
        System.out.println("confirm account number : ");
        int dupliaccount=sc.nextInt();
        while(accountno!=dupliaccount){
            System.out.println("account number and confirm accounr number doesnot match.....");
            deposit();
        }
        Customer customer=customerdetails.get(accountno);
        System.out.println("enter amount to deposit : ");
        int amount=sc.nextInt();
        customer.setBalance(amount);
        customerdetails.put(accountno,customer);
        System.out.println("amount deposited successfully....");
        return;
    }

    @Override
    public void withdraw() {
        System.out.println("enter the accoutn number : ");
        int accountno=sc.nextInt();
        System.out.println("confirm account number : ");
        int dupliaccount=sc.nextInt();
        while(accountno!=dupliaccount){
            System.out.println("account number and confirm accounr number doesnot match.....");
            deposit();
        }
        Customer customer=customerdetails.get(accountno);
        System.out.println("enter amount to deposit : ");
        int amount=sc.nextInt();
        int balance=customer.getBalance();
        if(amount>balance){
            System.out.println("insufficient balance....");
            return;
        }else{
            balance=balance-amount;
            customer.setBalance(balance);
            System.out.println("balance withdrawl successfull  :) ");
        }
        return;
    }
}