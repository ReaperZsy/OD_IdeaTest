import java.util.Scanner;

/**
 * ClassName: HJ_106
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/28 10:27
 * @Version 1.0
 */
public class HJ_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            System.out.println(sb.reverse());
        }
    }
}
