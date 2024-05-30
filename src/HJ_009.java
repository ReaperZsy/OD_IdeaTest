import java.util.Scanner;
import java.util.Stack;

/**
 * ClassName: HJ_009
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/30 9:57
 * @Version 1.0
 */
public class HJ_009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            Stack<Character> st = new Stack<Character>();
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s).reverse();
            String ss = sb.toString();
            sb.delete(0, ss.length());
            for (int i = 0; i < ss.length(); i++) {
                if (!st.contains(ss.charAt(i))){
                    st.push(ss.charAt(i));
                    sb.append(ss.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
