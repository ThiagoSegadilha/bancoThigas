public class TestaProjeto {

    public static void main(String[] args) {

        ContaCorrente contaC = new ContaCorrente(2345, 1);
        contaC.deposita(200);

        ContaPoupanca contaP = new ContaPoupanca(1234, 2);
        contaP.deposita(50);

        contaC.transfere(100, contaP);

        System.out.println("Saldo da conta " + contaC.getAgencia() + ": " + contaC.getSaldo());
        System.out.println("Saldo da conta " + contaP.getAgencia() + ": " + contaP.getSaldo());
    }

}
