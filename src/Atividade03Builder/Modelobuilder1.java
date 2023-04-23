package Atividade03Builder;

public class Modelobuilder1 extends  CarroBuilder {


    @Override
    public void modeloBuilder() {
        carro.modelo = "Porsche 959";
    }

    @Override
    public void motorBuilder() {
        carro.tipodemotor =  "Boxer 6";
    }

    @Override
    public void combustivelBuilder() {
        carro.combustivel = "Gasolina";

    }

    @Override
    public void cacidadetanqueBuilder() {
        carro.pacidadetanque = 9.0 ;
    }

    @Override
    public void controleestabilBuilder() {
        carro.controleestabil = "Estavel";
    }

    @Override
    public void velocidadeMaximaBuilder() {
        carro.velocidadeMaxima = " 200 Mph / 322 Km/h";
    }

    @Override
    public void VálvulasBuilder() {
        carro.valvulas = 24;
    }

    @Override
    public void TorqueBuilder() {
        carro.Torque = "5000 rpm";
    }
}
