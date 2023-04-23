package Atividade06AbstractyFactory;

import java.sql.SQLOutput;

public class ClienteFactory {
    private static Carro montarCarro(String tipo) {
        CarroFactory cf = null;
        switch (tipo) {
            case "luxo":
                cf = new CrroLuxoFactory();
                break;
            case "popular":
                cf = new CarroPopularFactory();
        }
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }
    private static void main(String[]args){
        Carro carro1 = montarCarro("luxo");
        Carro carro2 = montarCarro("popular");
        System.out.println("FIM__");
    }

}
