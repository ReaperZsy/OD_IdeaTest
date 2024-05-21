import java.util.Scanner;

/**
 * ClassName: LongestConsecutiveSequence
 * PackageName: PACKAGE_NAME
 * Description:
 *
 * @Author Reaper Cheung
 * @Create 2024/5/9 10:59
 * @Version 1.0
 */

/*
* 最长连续子序列
* 输入为两行，第一行为序列，第二行为待搜索的和
* 若有满足的序列和，则输出最长长度，否则输出-1
* 示例：
* input:
* 1 2 3 4 2
* 6
* output:
* 3
* 下例为两层循环暴力解法
* */
public class LongestConsecutiveSequence_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] s = sc.nextLine().split(" ");
            int sum = Integer.parseInt(sc.nextLine());
            int[] nums = new int[s.length];
            int maxLength = -1;
            for(int i = 0; i < s.length; i++){
                nums[i] = Integer.parseInt(s[i]);
                //System.out.println(nums[i]);
            }
            for(int i = 0; i < nums.length; i++){
                int sumsOfNums = 0;
                for(int j = i; j < nums.length; j++){
                    sumsOfNums += nums[j];
                    if(sumsOfNums == sum){
                        maxLength = (maxLength < j - i + 1 ? j - i + 1 : maxLength);
                    }else if(sumsOfNums >= sum){
                        break;
                    }else{
                        continue;
                    }
                }
            }
            System.out.println(maxLength);
        }
        sc.close();
    }
}
