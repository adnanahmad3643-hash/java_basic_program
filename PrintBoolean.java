import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class PrintBoolean {
       public static void  main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("ENTER YOUR AGE..");
        // int age=Integer.parseInt(br.readLine());
        System.out.println("enter boolean value ");
boolean temp=Boolean.parseBoolean(br.readLine());
System.out.println(temp);

        
    }
}
