import java.util.Scanner;

/**
 * ClassName: HJ_013
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/27 10:02
 * @Version 1.0
 */
public class HJ_013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] ss = sc.nextLine().split(" ");
            String result = "";
            for (int i = ss.length - 1; i >= 0; i--) {
                result += ss[i] + " ";
            }
            System.out.println(result.strip());
        }
    }
}
