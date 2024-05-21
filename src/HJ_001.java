import java.util.Scanner;

/**
 * ClassName: HJ_01
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/20 11:29
 * @Version 1.0
 */
public class HJ_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] ss = sc.nextLine().split(" ");
            System.out.println(ss[ss.length - 1].length());
        }
    }
}
