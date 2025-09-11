package atividade1;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(8000, 500000, 4, 2000); // RAM 8GB, SSD 500GB
        SistemaOperacional so = new SistemaOperacional(pc);

        Programa p1 = new Programa(2000, 200, 2, 10000000); // executa
        Programa p2 = new Programa(16000, 100, 2, 50000000); // erro RAM
        Programa p3 = new Programa(4000, 600000, 2, 30000000); // erro SSD

        so.executarPrograma(p1);
        so.executarPrograma(p2);
        so.executarPrograma(p3);
    }
}
