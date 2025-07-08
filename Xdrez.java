public class Xdrez {
    public static void main(String[] args) {
        String[][] tabuleiro = new String[8][8];

        //Matriz vazia
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = "  ";
            }
        }

        // Posições dos peões (bP = peões pretos, wP = peões brancos)
        for (int j = 0; j < 8; j++) {
            char coluna = (char) ('a' + j);
            tabuleiro[1][j] = "bP" + coluna;
            tabuleiro[6][j] = "wP" + coluna;
        }

        // Peças pretas 
        tabuleiro[0][0] = "bRa";
        tabuleiro[0][1] = "bCb";
        tabuleiro[0][2] = "bBc";
        tabuleiro[0][3] = "bQ ";
        tabuleiro[0][4] = "bK ";
        tabuleiro[0][5] = "bBf";
        tabuleiro[0][6] = "bCg";
        tabuleiro[0][7] = "bRh";

        // Peças brancas 
        tabuleiro[7][0] = "wRa";
        tabuleiro[7][1] = "wCb";
        tabuleiro[7][2] = "wBc";
        tabuleiro[7][3] = "wQ ";
        tabuleiro[7][4] = "wK ";
        tabuleiro[7][5] = "wBf";
        tabuleiro[7][6] = "wCg";
        tabuleiro[7][7] = "wRh";

        // Tabuleiro
        System.out.println("    a     b     c     d     e     f     g     h");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print("[" + tabuleiro[i][j] + "]");
            }
            System.out.println(" " + (8 - i));
        }
        System.out.println("    a     b     c     d     e     f     g     h");
    }
}
