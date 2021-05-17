import java.util.Scanner;

public class Math_qiyana {

        public static void main(String[] args) {

            double x;
            double y;
            double z;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Lado x: ");
            x = scanner.nextDouble();
            System.out.println("Lado y: ");
            y = scanner.nextDouble();

            z = Math.sqrt((x*x)+(y*y));

            System.out.println("A hipotenusa é : "+z);

            double w = Math.max(x,y);   //Mat.min faz a mesma coisa com n<
            System.out.println("O lado maior mede : "+w);

            scanner.close();
        }
}
