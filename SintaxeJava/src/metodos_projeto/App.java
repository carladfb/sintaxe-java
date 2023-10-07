package metodos_projeto;

public class App {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nTV ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Qual o canal? " + smartTv.canal);
        
        smartTv.desligar();
        System.out.println("\nTV ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
        
    }
}
