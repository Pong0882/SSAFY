package pre_learning.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            result += N.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
