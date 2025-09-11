package atividade1;


public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: SSD ocupado maior que o disponível. Programa não instalado.");
            return false;
        }

        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: Memória insuficiente para executar o programa.");
            return false;
        }

        double tempoExecucao = (double) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso em " + tempoExecucao + " segundos.");
        return true;
    }

    // Getter e Setter
    public Computador getComputador() { return computador; }
    public void setComputador(Computador computador) { this.computador = computador; }
}
