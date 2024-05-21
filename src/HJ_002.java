import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: HJ_002
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/20 14:11
 * @Version 1.0
 */
public class HJ_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine().toLowerCase();
            HashMap<Character, Integer> dir = new HashMap<Character, Integer>();
            for (int i = 0; i < s.length(); i++) {
                if (dir.containsKey(s.charAt(i))) {
                    dir.put(s.charAt(i), dir.get(s.charAt(i)) + 1);
                }else {
                    dir.put(s.charAt(i), 1);
                }
            }
            if(dir.containsKey(sc.nextLine().toLowerCase().charAt(0))) {
                System.out.println(dir.get(sc.nextLine().toLowerCase().charAt(0)));
            }else {
                System.out.println("0");
            }
        }
    }
}
