package BOJ.BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 BruteForce 2231번
 * Title: 분해합
 */
public class BOJ2231 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            String input = br.readLine();
            int number = Integer.parseInt(input);

            int ret = 0;
            for (int i=(number-(input.length())*9); i<number; ++i) {
                int sum = i;
                int digit = i;

                while(digit > 0) {
                    sum += digit % 10;
                    digit /= 10;
                }
                if(sum == number) {
                    ret = i;
                    break;
                }
            }
            System.out.println(ret);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
