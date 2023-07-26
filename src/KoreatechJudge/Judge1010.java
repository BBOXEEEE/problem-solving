package KoreatechJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * KoreatechJudge 1010
 * Title: 접두 소수
 */

public class Judge1010 {
    public static boolean isPrime(int x) {
        for (int i=2; i*i<=x; ++i) {
            if(x % i == 0) return false;
        }
        return true;
    }

    public static void solve(int n, int digit) {
        if (digit == 1) {
            System.out.println(n);
            return;
        }
        n *= 10;
        for (int i=0; i<10; ++i) {
            if (i == 5) continue;
            if (isPrime(n + i))
                solve(n+i, digit-1);
        }
    }

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int digit = Integer.parseInt(br.readLine());
            solve(2, digit);
            solve(3, digit);
            solve(5, digit);
            solve(7, digit);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
