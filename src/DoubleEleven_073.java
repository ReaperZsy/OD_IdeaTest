import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: DoubleEleven_073
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/11 14:41
 * @Version 1.0
 */
public class DoubleEleven_073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] s = sc.nextLine().split(",");
            int money = Integer.parseInt(sc.nextLine());
            Solution(s, money);
        }
        sc.close();
    }

    public static void Solution(String[] s, int money){
        int[] products = new int[s.length];
        for(int i = 0; i < s.length; i++){
            products[i] = Integer.parseInt(s[i]);
        }
        int maxMoney = -1;
        // 将商品价格排序
        Arrays.sort(products);
        for(int i = 0; i < products.length - 2; i++){
            int begin = i + 1;
            int end = products.length - 1;
            while(begin < end){
                // 三件小于手头的钱则更新maxMoney，否则说明目前价值高了，最后的指针往前移一位
                if(products[i] + products[begin] + products[end] <= money) {
                    maxMoney = maxMoney > (products[i] + products[begin] + products[end]) ? maxMoney : (products[i] + products[begin] + products[end]);
                    begin++;
                }else{
                    end--;
                }
            }
        }
        System.out.println(maxMoney);
    }
}

