import java.util.Scanner;

/**
 * ClassName: HJ_040
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/27 15:20
 * @Version 1.0
 */
public class HJ_040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            int letter = 0;
            int space = 0;
            int num = 0;
            int other = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num += 1;
                } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    letter += 1;
                } else if (s.charAt(i) == ' ') {
                    space += 1;
                }
                else {
                    other += 1;
                }

            }
            System.out.println(letter);
            System.out.println(space);
            System.out.println(num);
            System.out.println(other);
        }
    }
}
