public class App {
    public static void main(String[] args) {
        var account = TerminalAccount.getAccount();
        var greeting = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", account.userName, account.agency, account.accountNumber, account.balance);
        System.out.println(greeting);
    }
}
