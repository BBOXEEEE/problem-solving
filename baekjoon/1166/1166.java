import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static double solve(int N, int L, int W, int H) {
        double low = 0;
        double high = Math.max(L, Math.max(W, H));

        while (low < high) {
            double mid = (low + high) / 2;
            long count = (long)(L/mid) * (long)(W/mid) * (long)(H/mid);

            if (count >= N) {
                if (low == mid) break;
                low = mid;
            }
            else {
                if (high == mid) break;
                high = mid;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());

            System.out.println(solve(N, L, W, H));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}