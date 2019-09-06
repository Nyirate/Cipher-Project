import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        String word;
        int cle;
        char sa;
        String encryptedword = " ";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        word = sc.nextLine();

        System.out.println("Enter key: ");
        cle = sc.nextInt();

        for (int i = 0; i < word.length(); ++i) {
            sa = word.charAt(i);

            if (sa >= 'a' && sa <= 'z') {
                sa = (char) (sa + cle);

                if (sa > 'z') {
                    sa = (char) (sa + 'a'-'z' - 1);
                }

                encryptedword += sa;

            }
            else if(sa >= 'A' && sa <= 'Z'){
                sa = (char)(sa + cle);

                if(sa > 'Z'){
                    sa = (char)(sa + 'A'-'Z' - 1);
                }

                encryptedword += sa;
        }

        }
        System.out.println("Encrypted Word is " + encryptedword);

    }
}





