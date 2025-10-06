import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFloatVariable {

    public static void main(String[] args)throws IOException 
    {
        // float a=90.0f;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        float f=Float.parseFloat(br.readLine());
        System.out.println(f);
    }
}