package KoreatechJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * KoreatechJudge 1008
 * Title: 순환소수
 */

public class Judge1008 {
    public static String solve(int A, int B) {
        StringBuilder ret = new StringBuilder();
        long integer = A / B;
        long remainder = A % B;

        ret.append(integer).append(".");
        HashMap<Long, Integer> remainderMap = new HashMap<>();
        while(remainder != 0) {
            if(remainderMap.containsKey(remainder)) {
                int start = remainderMap.get(remainder);
                String recurrsing = ret.substring(start);
                return ret.substring(0, start) + "(" + recurrsing + ")";
            }
            remainderMap.put(remainder, ret.length());
            remainder *= 10;
            long quotient = remainder / B;
            ret.append(quotient);
            remainder %= B;
        }

        ret.append("(").append("0)");
        return ret.toString();
    }
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int T = Integer.parseInt(br.readLine());
            for (int t=0; t<T; ++t) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                System.out.println(solve(A, B));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
