import java.util.Scanner;

/**
 * ClassName: HJ_007
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/30 15:14
 * @Version 1.0
 */
public class HJ_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            int result = (int) num;
            if(num - result >= 0.5) {
                result = result + 1;
            }
            System.out.println(result);
        }
    }
}
