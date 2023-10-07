public class TiposVariaveis {
    // TIPOS PRIMITIVOS

    // tipos integrais
    byte idade = 123;
    short ano = 2021;
    int cep = 21070333; // se começar com 0, talvez precise usar outro tipo
    long cpf = 41295798867L; // se começar com 0, talvez precise usar outro tipo, e se não colocar o L no
                             // final pode dar erro;
    char letra = 'a'; // serve para armazenar um caracter podendo ser letra ou numero, possui um
                      // tamanho do tipo short

    // tipos de pontos flutuantes
    float pi = 3.14F; // se não colocar o F no final pode dar erro
    double salario = 12378.23;
    final float PI = 3.14F; // significa que esse valor nunca irá mudar, e a váriavel tem que ser escrita em
                            // maisculo, e tem que ter final

    // tipo boolean
    boolean verdade = true;
    boolean falso = false; // tipo boolean só pode ser verdadeiro ou fals

    // tipo de texto
    String nome = "carla";
}
