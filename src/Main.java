public class Main {
    public static void main(String[] args) {
        Letras letras = new Letras();
        Escrever escrever = new Escrever();

        char[][] letraR = letras.criarLetraR();
        escrever.escreverLetras(letraR);
        char[][] letraU = letras.criarLetraU();
        escrever.escreverLetras(letraU);
        char[][] letraA = letras.criarLetraA();
        escrever.escreverLetras(letraA);
        char[][] letraN = letras.criarLetraN();
        escrever.escreverLetras(letraN);
    }

}