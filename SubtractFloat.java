import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubtractFloat {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER FIRST NUMBER ");
        float first=Float.parseFloat(br.readLine());
        System.out.println("ENTER SECOND NUMBER ");
        float second=Float.parseFloat(br.readLine());
        float sum=first-second;
        System.out.println("SUBTRACTION OF  TO NUMBER = "+sum);
    }
}
