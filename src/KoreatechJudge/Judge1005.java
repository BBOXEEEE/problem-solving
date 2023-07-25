package KoreatechJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * KoreatechJudge 1005
 * Title: 0을 만들자 - Large
 */
public class Judge1005 {
    public static int solve(int[] nums) {
        int count = 0;
        Arrays.sort(nums);

        for (int i=0; i<nums.length-2; ++i){
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    ++count;

                    while(left < right && nums[left] == nums[left+1]) ++left;
                    while(left < right && nums[right] == nums[right-1]) --right;

                    ++left;
                    --right;
                }
                else if (sum < 0) ++left;
                else --right;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int N = Integer.parseInt(br.readLine());
            int[] nums = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            System.out.println(solve(nums));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
