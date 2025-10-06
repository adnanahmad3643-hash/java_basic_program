import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcatinateString {
    public static void main(String[] args) throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("ENTER FIRST STRING VALUE ");
         String str1=br.readLine();
         System.out.println("ENTER SECOND STRING VALUE ");
         String str2=br.readLine();
         String temp=str1+str2;
         System.out.println("CONCATINATE OF TWO STRING IS : "+temp);2
    }
}
