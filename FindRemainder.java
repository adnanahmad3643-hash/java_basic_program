import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindRemainder {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER ANY NUMBER ");
        int num=Integer.parseInt(br.readLine());
        int temp=num%10;
        System.out.println("REMAINDER OF "+num+"  IS =  "+temp);

    }
}
