# nomeRefatorado
Não consegui printar na lateral

------------------------------------------------------
Código não refatorado
public class nome {
    public static void main(String[] args) {
        char[][][] alphabet = {
                letraR(), letraU(), letraA(), letraN()
        };
        for (int i = 0; i < 5; i++) {
            for(char[][] letter : alphabet) {
                for (int j = 0; j < 5; j++){
                    System.out.print(letter[i][j] + " ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static char[][] letraR(){
        return new char[][]{
                {'R', 'R', 'R', 'R', ' '},
                {'R', ' ', ' ', 'R', ' '},
                {'R', 'R', 'R', 'R', ' '},
                {'R', ' ', 'R', ' ', ' '},
                {'R', ' ', ' ', 'R', ' '},
        };
    }
    public static char[][] letraU(){
        return new char[][]{
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {' ', 'U', 'U', 'U', ' '},
        };
    }

    public static char[][] letraA(){
        return new char[][]{
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
        };
    }
    public static char[][] letraN(){
        return new char[][]{
                {'N', ' ', ' ', ' ', 'N'},
                {'N', 'N', ' ', ' ', 'N'},
                {'N', ' ', 'N', ' ', 'N'},
                {'N', ' ', ' ', 'N', 'N'},
                {'N', ' ', ' ', ' ', 'N'},
        };
    }
}
