package Atividade02Singleton;

class Main {
    public static void main(String[] args) {
        System.out.println("");


        Conta contaCorrente = new Conta("Conta Corrente");
        Conta contaPoupanca = new Conta("Conta Salario");


        contaCorrente.depositar(200);
        contaPoupanca.sacar(10);
        contaCorrente.sacar(50);
        contaPoupanca.depositar(3000);


        System.out.println();
        System.out.println("SALDO CONTA CORRENTE : "+contaCorrente.getSaldo());
        System.out.println("SALDO CONTA SALARIO: "+contaPoupanca.getSaldo());

        System.out.println();

        System.out.println(Log.getLog());
    }
}



