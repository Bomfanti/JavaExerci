package Hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'doubleTheChances' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY chances as parameter.
     */

    public static List<Integer> doubleTheChances(List<Integer> chances) {
        // Write your code here
        for (int i=0;i < chances.size();i++)
        {
            chances.set(i, chances.get(i) * 2);
        }
        return chances;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int chancesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> chances = IntStream.range(0, chancesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.doubleTheChances(chances);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }


/*
class Result {

    /*
     * Complete the 'vezesLetraAparece' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING frase
     *  2. STRING letra
     */

    public static int vezesLetraAparece(String frase, String letra) {
        // Write your code here

        int result = frase.length();  //numero de caracteres na frase
        int cont=0;
        for (int i=0;i < frase.length();i++){
            char result1= frase.charAt(i); //result 1 é o char ué
            boolean result2= letra.equalsIgnoreCase(String.valueOf(result1));

            if (result2 == true){
                cont++;
            }
        }
        return cont;
    }

}
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String frase = bufferedReader.readLine();

        String letra = bufferedReader.readLine();

        int result = Result.vezesLetraAparece(frase, letra);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
