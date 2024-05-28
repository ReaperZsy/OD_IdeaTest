import java.util.Scanner;

/**
 * ClassName: HJ_046
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/28 9:24
 * @Version 1.0
 */
public class HJ_046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int end = Integer.parseInt(sc.nextLine());
            //System.out.println(end);
            if (s.length() < end) {
                break;
            }else {
                System.out.println(s.substring(0, end));
            }
        }
    }
}
