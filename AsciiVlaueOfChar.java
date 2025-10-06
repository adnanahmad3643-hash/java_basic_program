import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiVlaueOfChar {
    public static void main(String[] args) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         char ch=br.readLine().charAt(0);
         int asciiValue=ch;
         System.out.println("ASCCI VALUE OF "+ch+" IS = "+asciiValue);
    }
}
