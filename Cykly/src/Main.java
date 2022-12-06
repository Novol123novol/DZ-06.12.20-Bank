import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int bankAccount = 10000;
        int numWithdrawalsBankomat = 5;
        int withdrawaLimit = 2500;
        int balanceAccount;

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int numWithdrawals = scanner.nextInt();

        if (user < bankAccount || user == bankAccount) {
        if (user < withdrawaLimit || user == withdrawaLimit){
        if (numWithdrawals < numWithdrawalsBankomat || numWithdrawals == numWithdrawalsBankomat){

            balanceAccount = bankAccount - user;

            System.out.println("Получите свои деньги:" + user + "Остаток на счету:" + balanceAccount);

        }}}else {
             System.out.println("Денег не получите");
         }
         }

        }
