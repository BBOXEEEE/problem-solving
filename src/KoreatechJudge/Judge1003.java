package KoreatechJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * KoreatechJudge 1003
 * Title: 0을 만들자 - Small
 */
public class Judge1003 {
    public static int solve(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; ++i){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<nums.length; ++j){
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int left = j + 1;
                int right = nums.length - 1;
                while(left <= right){
                    int mid = left + (right - left)/2;
                    int sum = nums[i] + nums[j] + nums[mid];
                    if(sum == 0) {
                        ++count;
                        break;
                    }
                    else if(sum > 0) right = mid - 1;
                    else left = mid + 1;
                }
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
