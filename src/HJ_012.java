import java.util.Scanner;

/**
 * ClassName: HJ_012
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/27 9:29
 * @Version 1.0
 */
public class HJ_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s =sc.nextLine();
            String result = "";
            for (int i = s.length() - 1; i >= 0 ; i--) {
                result += s.charAt(i);
            }
            System.out.println(result);
        }
    }
}
