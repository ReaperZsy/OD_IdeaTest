import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: HJ_034
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/6/12 21:07
 * @Version 1.0
 */
public class HJ_034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            Solution(s);
        }
        sc.close();
    }

    public static void Solution(String s) {
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        System.out.println(String.valueOf(chs));
    }
}
