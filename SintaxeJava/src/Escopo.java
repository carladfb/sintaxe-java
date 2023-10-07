public class Escopo {
    double saldo = 10; // variavel da classe

    public void sacar(double valor) {
        double novoSaldo = 11; // variavel local do metodo
    }

    public void imprimirSaldo() {
        System.out.println(saldo); // variavel disponivel em toda classe
        System.out.println(novoSaldo); // variavel local do sacar, outro metodo não consegue ler
    }

    public double calcularDivida() {
        double valorParcela = 50.0; // variavel local do metodo
        double valorMontate = 0.0; // variavel local do metodo
        for (int i = 0; i < 2; i++) {
            double valorCalculado = valorParcela * 1; // variavel local do bloco
            valorMontate = valorCalculado; // unica variavel que pode ser exibida no bloco de codigo
        }
        return valorMontate;
    }
}
