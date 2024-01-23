import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int N = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            StringBuilder result = new StringBuilder();

            for (int i=0; i<N; ++i) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String command = st.nextToken();

                switch (command) {
                    case "push":
                        stack.push(Integer.parseInt(st.nextToken()));
                        break;
                    case "pop":
                        if (stack.isEmpty()) result.append(-1).append("\n");
                        else result.append(stack.pop()).append("\n");
                        break;
                    case "size":
                        result.append(stack.size()).append("\n");
                        break;
                    case "empty":
                        if (stack.isEmpty()) result.append(1).append("\n");
                        else result.append(0).append("\n");
                        break;
                    case "top":
                        if (stack.isEmpty()) result.append(-1).append("\n");
                        else result.append(stack.peek()).append("\n");
                        break;
                }
            }
            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}