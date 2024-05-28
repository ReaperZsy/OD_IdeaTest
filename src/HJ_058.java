import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: HJ_058
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/28 10:08
 * @Version 1.0
 */
public class HJ_058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int min_K = sc.nextInt();
            int[] nums = new int[num];
            for (int i = 0; i < num; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
            for (int i = 0; i < min_K - 1; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println(nums[min_K - 1]);
        }
    }
}
