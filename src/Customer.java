public class Customer {
    private int accountNo;
    private String firstName;
    private String lastName;
    private String phno;
    private String address;
    private int balance=0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Customer(int acc,String firstname,String lastname,String phno,String address){
        this.accountNo=acc;
        this.firstName=firstname;
        this.lastName=lastname;
        this.phno=phno;
        this.address=address;
    }
}
