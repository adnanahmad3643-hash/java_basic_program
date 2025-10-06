import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllPrimitive {
    public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER YOUR NAME ");
    String name=br.readLine();
    System.out.println("ENTER YOUR AGE ");
    byte age=Byte.parseByte(br.readLine());
    System.out.println("ENTER ROLL NUMBER ");
    short rollNumber=Short.parseShort(br.readLine());
    System.out.println("ENTER PIN CODE ");
    int pincode=Integer.parseInt(br.readLine());
    System.out.println("ENTER YOUR CGPA");
    float cgpa=Float.parseFloat(br.readLine());
    System.out.println("ENTER MOBILE NUMBER ");
    long mob=Long.parseLong(br.readLine());
    System.out.println("ENTER YOUR GRADE ");
    char grade=br.readLine().charAt(0);
    System.out.println("ENTER YOUR BANK BALENCE AMOUNT ");
    double balence=Double.parseDouble(br.readLine());
    System.out.println(" NAME OF STUDENT :"+name+" \n AGE : "+age+"\n ROLL NUMBER : "+rollNumber+" \n PIN CODE : "+pincode+"\n CGPA : "+cgpa+"\n MOBILE NUMBR : "+mob+" \n GRADE : "+grade+" \n BANK AMOUNT "+balence);
    }
}
