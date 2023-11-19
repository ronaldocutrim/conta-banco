import java.util.Scanner;

public class TerminalAccount {
    private static final Scanner scanner = new Scanner(System.in);

    public static Account getAccount() {
        var accountNumber = getAccountNumber();
        scanner.nextLine();
        var agency = getAgency();
        var userName = getUserName();
        var balance = getBalance();
        scanner.nextLine();
        scanner.close();
        return new Account(accountNumber, agency, userName, balance);
    }

    private static Integer getAccountNumber() {
        System.out.println("Número da conta:");
        return scanner.nextInt();
    }

    private static String getAgency() {
        System.out.println("Número da agencia:");
        return scanner.next();
    }

    private static String getUserName() {
        System.out.println("Nome completo:");
        return scanner.next();
    }

    private static Double getBalance() {
        System.out.println("Saldo inicial:");
        return scanner.nextDouble();
    }
}
