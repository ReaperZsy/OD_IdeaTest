import java.util.Scanner;

/**
 * ClassName: ${NAME}
 * PackageName:
 * Description:
 *
 * @Author Reaper Cheung
 * @Create ${DATE} ${TIME}
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
    }
}