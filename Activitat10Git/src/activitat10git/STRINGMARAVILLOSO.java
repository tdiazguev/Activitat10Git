package activitat10git;

public class STRINGMARAVILLOSO {

    public static void imprimirEspacios(int n) {
        for (int i = 0; i < n; i++) System.out.print(" ");
    }
    
    public static void imprimirParteString(String s, int ini, int fin) {
        for (int i = ini; i < fin; i++) System.out.print(s.charAt(i));
    }

    public static void main(String[] args) {

        String M = "MARAVILLOSO";

        System.out.println("LA versió que tenim a github ha estat actualitzada i és mes actual que la que tinc en local");
      System.out.println("LA versió que tenim a github ha estat actualitzada i és mes actual que la que tinc en local");

        //Imprime los primeros dos triangulos de izq a derecha de la primera parte (parte superios)       
        for (int i = 0; i < M.length(); i++) {
            
            //Imprime espacios de la primera parte para el primer triangulo
            imprimirEspacios(i);
            /*
            for (int j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            */
            
            //Imprime el primer triangulo de la primer parte
            imprimirParteString(M, i, M.length());
            /*
            for (int j = i; j < M.length(); ++j) {
                System.out.print(M.charAt(j));
            }
            */
            
            //Imprime espacios entre el primero y segundo triangulo de la primera parte
            imprimirEspacios(M.length() - i);
            /*
            for (int j = i; j < M.length(); ++j) {
                System.out.print(" ");
            }
            */
            
            //Imprime el segundo triangulo de la primera parte
            imprimirParteString(M, M.length() - i - 1, M.length());
            /*
            for (int j = M.length() - i - 1; j < M.length(); ++j) {
                System.out.print(M.charAt(j));
            }
            */
            
            System.out.println();
        }
        
        //Imprime los segundos dos triangulos de izq a derecha de la segunda parte (parte inferior)
        for (int i = 0; i < M.length(); i++) {
            
            //Imprime primer triangulo de la segunda parte
            imprimirParteString(M, i, M.length());
            /*
            for (int j = i; j < M.length(); ++j) {
                System.out.print(M.charAt(j));
            }
            */
            
            //Imprime espacios entre primer y segundo triangulo
            imprimirEspacios(i + 1);
            /*
            for (int j = 0; j <= i; ++j) {
                System.out.print(" ");
            }
            */
            
            //Imprime segundo triangulo de la segunda parte
            imprimirParteString(M, 0, i + 1);
            /*
            for (int j = 0; j < i + 1; ++j) {
                System.out.print(M.charAt(j));
            }
            */
            
            System.out.println();
        }
    }

    public static void imprimeText(String s) {

    }

}
