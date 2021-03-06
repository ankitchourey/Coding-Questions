import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        StringBuilder res=new StringBuilder();
        k=k%26;
        for(char ch : s.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                char encrypted = (char)(ch+k);
                if(encrypted>90){
                    encrypted=(char)(encrypted-26);
                }
                res.append(encrypted);
            }else if(Character.isLowerCase(ch))
            {
                char encrypted = (char)(ch+k);
                if(encrypted>122){
                    encrypted=(char)(encrypted-26);
                }
                res.append(encrypted);
            }else //symbol
            {
                res.append(ch);
            }
        }
        return res.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
