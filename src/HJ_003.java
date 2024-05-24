import java.util.Scanner;
import java.util.TreeSet;

/**
 * ClassName: HJ_003
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/23 9:57
 * @Version 1.0
 */
public class HJ_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入读取有问题
        while (sc.hasNextLine()){
            int nums = Integer.parseInt(sc.nextLine());
            TreeSet<Integer> ts = new TreeSet<Integer>();
            for(int i = 0; i < nums; i++){
                ts.add(Integer.parseInt(sc.nextLine()));
            }
            for(Integer I1 : ts.descendingSet()){
                System.out.println(I1);
            }
        }
    }
}
