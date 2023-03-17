import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<> ();
        List<Integer> listaIdade = new ArrayList<> ();
        Scanner scanner = new Scanner (System.in);
        String continuar;

        do {
            System.out.println ("Digite um nome:");
            listaNomes.add (scanner.nextLine ());

            System.out.println ("Digite uma idade:");
            listaIdade.add (scanner.nextInt ());

            System.out.println ("Digite (s/n) para continuar inserindo nomes:");
            scanner.nextLine ();
            continuar = scanner.nextLine ();

        } while (continuar.equals ("s"));

        System.out.println ("Os nomes da lista são:");


        for (int i = 0; i < listaNomes.size (); i++) {
            String nome = listaNomes.get (i);
            int idade = listaIdade.get (i);
            System.out.printf ("%s tem %d anos\n", nome, idade);
        }
    }

}






