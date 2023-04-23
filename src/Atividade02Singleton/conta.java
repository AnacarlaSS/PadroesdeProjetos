package Atividade02Singleton;

import java.util.*;

class Conta{

    public String tipoDeConta;
    public double saldo;
    public double deposito;
    public double saque;



    public Conta(String pTipoDeConta){
        tipoDeConta = pTipoDeConta;
        saldo = 500;
    }
    public boolean depositar(double somar){

        if(somar<=1000){
            Log.getInstance(Calendar.getInstance().getTime() + " MSG DE LOG ... ").depositar();
            try {
                Thread.sleep(2000);
                System.out.println("CONCLUIDO .");
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            deposito = somar;
            saldo = saldo + somar;
            return true;
        }else{
            Log.getInstance(Calendar.getInstance().getTime() + " MSG DE LOG ... ").depositar();
            try {
                Thread.sleep(2000);
                System.out.println("NAO CONCLUIDO.");
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            deposito = somar;
            return false;
        }
    }

    public boolean sacar(double debitar){

        if(debitar<=saldo){
            Log.getInstance(Calendar.getInstance().getTime() + "  MSG DE LOG ... ").sacar();
            try {
                Thread.sleep(2000);
                System.out.println("NAO CONCLUIDO ");
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            saque = debitar;
            saldo =  saldo - debitar;
            return true;
        }else{
            Log.getInstance(Calendar.getInstance().getTime() + "  MSG DE LOG ... ").sacar();
            try {
                Thread.sleep(2000);
                System.out.println("NAO CONCLUIDO ");
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            saque = debitar;
            return false;
        }
    }

    public double getSaldo(){
        Log.getInstance(Calendar.getInstance().getTime() + "MSG DE LOG ...  ");
        try {
            Thread.sleep(2000);
            System.out.println("CONCLUIDO ");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        return saldo;
    }
    public void setSaldo(double pSaldo){
        Log.getInstance(Calendar.getInstance().getTime() + "MSG DE LOG ...  ");
        try {
            Thread.sleep(2000);
            System.out.println("CONCLUIDO");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        saldo = pSaldo;
    }
    public double getSaque(){
        Log.getInstance(Calendar.getInstance().getTime() + "  MSG DE LOG ... ");
        try {
            Thread.sleep(2000);
            System.out.println("CONCLUIDO");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        return saque;
    }
    public double getDeposito(){
        Log.getInstance(Calendar.getInstance().getTime() + " MSG DE LOG ...").checar();
        try {
            Thread.sleep(2000);
            System.out.println(" CONCLUIDO ");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        return deposito;
    }


}
