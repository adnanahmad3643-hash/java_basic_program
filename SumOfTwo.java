import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwo {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER FIRST NUMBER ");
        int first=Integer.parseInt(br.readLine());
        System.out.println("ENTER SECOND NUMBER ");
        int second=Integer.parseInt(br.readLine());
        int sum=first+second;
        System.out.println("SUM TO NUMBER = "+sum);
    }
}
