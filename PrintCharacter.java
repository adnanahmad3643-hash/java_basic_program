import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrintCharacter{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=120;
        while (num>0)
        {
            num=num/10;
        }
        for(int i=0; i<10; i++)
        {
            System.out.println("HELLO..");
        }
        do {
            
        } while (num!=0);
    }
}