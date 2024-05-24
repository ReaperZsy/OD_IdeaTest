import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName: HJ_010
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/24 16:29
 * @Version 1.0
 */
public class HJ_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            Solution(s);
        }
    }

    public static void Solution(String s) {
        if (s.length() == 0) {
            System.out.println("0");
        }
        Set<Character> dir = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 0 && s.charAt(i) <= 127){
                dir.add(s.charAt(i));
            }
        }
        System.out.println(dir.size());
    }
}
