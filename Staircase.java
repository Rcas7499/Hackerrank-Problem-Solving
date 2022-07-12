import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {
    public static void staircase(int n) {
        for (int i = 1, j = n - 1; i < n + 1; i++, j--) {
            System.out.println(" ".repeat(j) + "#".repeat(i));
        }
    }
}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        Solution.staircase(n);
        bufferedReader.close();
    }
}
