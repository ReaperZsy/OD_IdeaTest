import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: HJ_101
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/30 14:58
 * @Version 1.0
 */
public class HJ_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int num = Integer.parseInt(sc.nextLine());
            String[] ss = sc.nextLine().split(" ");
            int order = Integer.parseInt(sc.nextLine());
            int[] nums = new int[num];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num; i++) {
                nums[i] = Integer.parseInt(ss[i]);
            }
            Arrays.sort(nums);
            if (order == 0) {
                for (int i = 0; i < num; i++) {
                    sb.append(nums[i]).append(" ");
                }
                System.out.println(sb.toString().trim());
            }else {
                for (int i = num - 1; i >= 0; i--) {
                    sb.append(nums[i]).append(" ");
                }
                System.out.println(sb.toString());
            }
        }
    }
}
