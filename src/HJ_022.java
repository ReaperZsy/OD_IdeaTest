import java.util.Scanner;

/**
 * ClassName: HJ_022
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/6/11 13:00
 * @Version 1.0
 */
public class HJ_022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int bottle = sc.nextInt();
            if (bottle == 0)
                break;
            int result = 0;
            // 借瓶子放在循环最后处理，所以只需要满足瓶子大于等于3循环即可
            while (bottle >= 3) {
                result += bottle / 3;
                bottle = (bottle / 3 + (bottle % 3));
                // 向老板借瓶子
                if(bottle == 2)
                    result++;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
