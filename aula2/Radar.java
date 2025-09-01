public class Radar {
    public Integer LimiteVelocidade;
    public String Modelo;
    public String Localizacao;

    public void emitirnotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println( "limite de velocidade: "+ this.LimiteVelocidade);
        System.out.println("Velocidade avaliada: "+ velocidadeAvaliada);
        System.out.println("Placa: "+ placa);
    }

    public void avaliarVelocidade(Carro c){
        if (c.velocidade > this.LimiteVelocidade){
            emitirnotificacao (c.placa, c.velocidade);

        }
    }
}
