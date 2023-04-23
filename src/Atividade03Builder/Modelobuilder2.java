package Atividade03Builder;

public class Modelobuilder2 extends CarroBuilder {
    @Override
    public void modeloBuilder() {
        carro.modelo = "McLaren 620R ";
    }

    @Override
    public void motorBuilder() {
        carro.tipodemotor = "McL M838TE ";
    }

    @Override
    public void combustivelBuilder() {
        carro.combustivel = "Gasolina";
    }

    @Override
    public void cacidadetanqueBuilder() {
        carro.pacidadetanque = 72 ;
    }

    @Override
    public void controleestabilBuilder() {
        carro.controleestabil = "-ok-";
    }

    @Override
    public void velocidadeMaximaBuilder() {
        carro.velocidadeMaxima = "322 Km/h" ;
    }

    @Override
    public void VálvulasBuilder() {
        carro.valvulas = 32;
    }

    @Override
    public void TorqueBuilder() {
        carro.Torque =  " 3500 rpm";
    }
}
