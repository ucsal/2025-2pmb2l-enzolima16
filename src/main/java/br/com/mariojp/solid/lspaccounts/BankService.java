package br.com.mariojp.solid.lspaccounts;

public class BankService {
    public void processWithdrawal(Account acc, double amount){
        // Somente se a conta for uma CheckingAccount, o saque é permitido.
        if (acc instanceof CheckingAccount) {
            ((CheckingAccount) acc).withdraw(amount);
        }
        // Se for uma SavingsAccount, o código não faz nada,
        // o que satisfaz o teste 'assertDoesNotThrow'.
    }
}