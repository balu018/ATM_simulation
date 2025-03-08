import java.util.HashMap;
import java.util.Scanner;

public interface ATM {
    HashMap<Integer,Customer> customerdetails=new HashMap<Integer, Customer>();
    Scanner sc=new Scanner(System.in);
    void checkBankbalance();
    void createAccount();
    void deposit();
    void withdraw();
}
