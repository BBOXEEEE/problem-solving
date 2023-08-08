package KoreatechJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * KoreatechJudge 1009
 * Title: Endian
 */
public class Judge1009 {
    public static int solve(int num) {
        return ((num >> 24) & 0xff) | ((num >> 8) & 0xff00)
                | ((num << 8) & 0xff0000) | ((num << 24) & 0xff000000);
    }
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int T = Integer.parseInt(br.readLine());
            for (int t=0; t<T; ++t) {
                int num = Integer.parseInt(br.readLine());
                System.out.println(solve(num));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
