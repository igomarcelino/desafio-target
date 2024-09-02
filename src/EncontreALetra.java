import java.util.Scanner;

public class EncontreALetra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String palavra = teclado.nextLine().toLowerCase(); // deixa todas letras minusculas
        System.out.print("\nAgora informe uma letra para verificar se a palavra "+palavra+" contem e quantas vezes aparece: ");
        String letra =teclado.nextLine().toLowerCase();// deixa todas letras minusculas
        int encontradaXVezes = acharEContarLetra(palavra,letra);
        // esse if mostra se foi encontrado ou nao , caso encontrado mostra a quantidade de vez que a letra apareceu.
        if (encontradaXVezes!=0){
            System.out.println("A letra "+ letra+" foi encontrada na palavra( "+palavra+" ) "+encontradaXVezes+" vez(es)");
        }else {
            System.out.println("A letra "+ letra+" nao foi encontrada na palavra( "+palavra+" )");
        }
    }

    /**
        Esse metodo recebe uma palavra e uma letra , o mesmo verifica a cada indice da palavra para ver se 
        o char que contem naquele indice e igual ao char informado na String letra para ser procurado
    */
    public static int acharEContarLetra(String palavra,String letra){
        int contagem = 0;
        for (int i = 0; i < palavra.length();i++){
            if (palavra.charAt(i) == letra.charAt(0)){
                contagem++;
            }
        }
        return contagem;
    }
}
