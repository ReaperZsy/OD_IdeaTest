import java.util.HashMap;
import java.util.Scanner;

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
                    System.out.println(s.charAt(i));
                    System.out.println(dir.get(s.charAt(i)));
                }else {
                    dir.put(s.charAt(i), 1);
                }
            }
            char c1 = sc.nextLine().toLowerCase().charAt(0);
            if(dir.containsKey(c1)) {
                System.out.println(dir.get(c1));
            }else {
                System.out.println("0");
            }
        }
    }
}


/*简单的方法
* replaceAll()方法
* 原始字符串长度减去替换之后的差即为出现次数
* */
