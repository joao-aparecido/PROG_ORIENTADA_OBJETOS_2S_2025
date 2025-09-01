public class Simulacao {
    
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.velocidade = 0;
        opala.placa = "ACLR300 ";
        opala.modelo = "Comodoro";
        opala.ano = 76;

        Radar radar = new Radar();
        radar.Modelo = "Pardal";
        radar.LimiteVelocidade = 60;
        radar.Localizacao = "Pistão sul";

        opala.acelerar();//5
        opala.acelerar();//10
        opala.acelerar();//15
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); 
        opala.acelerar();

        radar.avaliarVelocidade(opala);

        opala.acelerar();
        radar.avaliarVelocidade(opala);

        opala.frear();
        radar.avaliarVelocidade(opala);
    }

}
