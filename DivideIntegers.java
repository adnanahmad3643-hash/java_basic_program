import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DivideIntegers {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER FIRST NUMBER ");
        int first=Integer.parseInt(br.readLine());
        System.out.println("ENTER SECOND NUMBER ");
        int second=Integer.parseInt(br.readLine()) ;
        int  sum=first/second;
        System.out.println("MULTIPLICATION  OF  TO NUMBER = "+sum); 
    }
}
