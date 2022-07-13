import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (((x2 - x1) * (v2 - v1)) < 0) {
            return (x1 - x2) % (v2 - v1) == 0 ? "YES" : "NO";
        } else {
            return "NO";
        }
    }
}

public class NumberLineJumps {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int x1 = Integer.parseInt(firstMultipleInput[0]);
        int v1 = Integer.parseInt(firstMultipleInput[1]);
        int x2 = Integer.parseInt(firstMultipleInput[2]);
        int v2 = Integer.parseInt(firstMultipleInput[3]);
        String result = Solution.kangaroo(x1, v1, x2, v2);
        bufferedReader.close();
        System.out.println(result);
    }
}
