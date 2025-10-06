import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfCircle {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER RADIUS OF CIRCLE ");

        double radius=Double.parseDouble(br.readLine());
    // double area=Math.PI*radius*radius;
    // Area=π×r2
    double area=3.14*radius*radius;
    System.out.println(area);

    }
}
