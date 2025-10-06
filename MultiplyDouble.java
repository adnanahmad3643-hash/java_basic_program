import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyDouble {
    public static void main(String[] args) throws IOException
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER FIRST NUMBER ");
        double first=Double.parseDouble(br.readLine());
        System.out.println("ENTER SECOND NUMBER ");
        double second=Double.parseDouble(br.readLine());
        double sum=first*second;
        System.out.println("MULTIPLICATION  OF  TO NUMBER = "+sum);   
    }
}
