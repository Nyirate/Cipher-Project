import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        String word;
        int cle;
        char sa;
        String cyphertext = " ";
        Scanner emma = new Scanner(System.in);

        System.out.println("Your word: ");
        word = emma.nextLine();

        System.out.println("The shift: ");
        cle = emma.nextInt();

        for (int i = 0; i < word.length(); ++i) {
            sa = word.charAt(i);

            if (sa >= 'a' && sa <= 'z') {
                sa = (char) (sa + cle);

                if (sa > 'z') {
                    sa = (char) (sa + 'a'-'z' - 1);
                }

                cyphertext += sa;

            }
            else if(sa >= 'A' && sa <= 'Z'){
                sa = (char)(sa + cle);

                if(sa > 'Z'){
                    sa = (char)(sa + 'A'-'Z' - 1);
                }

               cyphertext += sa;
        }

        }
        System.out.println("Encrypted Word is " + cyphertext);

    }
}





