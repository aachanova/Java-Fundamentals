import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L03_1_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> nums2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultedList = new ArrayList<>();

        int longestLength = Math.max(nums1.size(), nums2.size());
        while (longestLength > 0) {
            if (!nums1.isEmpty()) {
                resultedList.add(nums1.removeFirst());
            }

            if (!nums2.isEmpty()) {
                resultedList.add(nums2.removeFirst());
            }

            longestLength--;
        }

        resultedList.forEach(num -> System.out.print(num + " "));
    }
}
