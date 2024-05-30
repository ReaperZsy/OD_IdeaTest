import java.util.Scanner;

/**
 * ClassName: HJ_097
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/28 14:36
 * @Version 1.0
 */
public class HJ_097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int[] nums = new int[num];
            double sum = 0.0;
            int minus = 0;
            for (int i = 0; i < num; i++) {
                nums[i] = sc.nextInt();
                if(nums[i] > 0) {
                    sum += nums[i];
                }else if(nums[i] < 0) {
                    minus += 1;
                }else {
                    continue;
                }
            }
            if(sum > 0) {
                System.out.println(minus);
                System.out.printf("%.1f", sum / (num - minus));
            }else {
                System.out.println(minus);
                System.out.printf("%.1f", sum);
            }
        }
    }
}
