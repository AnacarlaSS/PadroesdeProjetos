package Atividade03Builder;

public class Cliente {
    public static void main(String[] args){
        MontadoraDirector montadora = new MontadoraDirector(new Modelobuilder1());
        montadora.construirCarro();
        Carrocorridaproduct carro = montadora.getCarro();
        System.out.println("*********************  FICHA TECNICA *******************");
        System.out.println(" CARRO DE CORRIDA: " +carro.modelo+
                " \n TORQUE: " +carro.Torque+ " \n CAPACIDADE: "  +carro.pacidadetanque+ " litros de  " +carro.combustivel+ "\n VELOCIDADE MAXIMA: " +carro.velocidadeMaxima+ "");
        System.out.println(" CONTROLE DE ESTABILIDADE: " +carro.controleestabil+ "\n MOTOR:  " +carro.tipodemotor+ "\n POSSUI " +carro.valvulas+ " VALVULAS. " );
        System.out.println("**************************************");

        System.out.println();
        montadora = new MontadoraDirector(new Modelobuilder2());
        montadora.construirCarro();
         carro = montadora.getCarro();
        System.out.println("*********************  FICHA TECNICA *******************");
        System.out.println(" CARRO DE CORRIDA: " +carro.modelo+
                " \n TORQUE: " +carro.Torque+ " \n CAPACIDADE: "  +carro.pacidadetanque+ " litros de  " +carro.combustivel+ "\n VELOCIDADE MAXIMA: " +carro.velocidadeMaxima+ "");
        System.out.println(" CONTROLE DE ESTABILIDADE: " +carro.controleestabil+ "\n MOTOR:  " +carro.tipodemotor+ "\n POSSUI " +carro.valvulas+ " VALVULAS. " );
        System.out.println("**************************************");
    }
}
