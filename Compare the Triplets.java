import java.io.*;
import java.math.*;
import java.nio.BufferUnderflowException;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                x++;
            }
            if (a.get(i) == b.get(i)) {
                continue;
            }
            if (a.get(i) < b.get(i)) {
                y++;
            }
        }
        List<Integer> l = Arrays.asList(x, y);
        return l;
    }
}

public class ComparetheTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Solution.compareTriplets(a, b);
        for (int i : result) {
            System.out.printf("%d ", i);
        }

        bufferedReader.close();
    }
}
