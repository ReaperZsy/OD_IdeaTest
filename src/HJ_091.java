import java.util.Scanner;

/**
 * ClassName: HJ_091
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/29 12:32
 * @Version 1.0
 */
public class HJ_091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(Solution(m, n));
        }
    }

    public static int Solution(int m, int n) {
        if(m == 1 && n == 0) {
            return 1;
        } else if (m == 0 && n == 1) {
            return 1;
        }else {
            return Solution(m, n - 1) + Solution(m - 1, n);
        }
    }
}
