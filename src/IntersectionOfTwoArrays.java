import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays extends Run{

//    Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//
//
//
//            Example 1:
//
//    Input: nums1 = [1,2,2,1], nums2 = [2,2]
//    Output: [2]
//
//    Example 2:
//
//    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//    Output: [9,4]
//    Explanation: [4,9] is also accepted


//    List<Integer> num1 = Arrays.asList(1,2,2,1);
//    List<Integer> num2 = Arrays.asList(2, 2);

    List<Integer> num1 = Arrays.asList(4,9,5);

    int[] num1Arr = new int[] {4, 9, 5};
    List<Integer> num2 = Arrays.asList(9,4,9,8,4);
    List<Integer> listWithIntersections = new ArrayList<>();

    List<Integer> distinctNum1 = num1.stream().distinct().toList();
    List<Integer> distinctNum2 = num2.stream().distinct().toList();

    int[] teste1 = new int[] {1,2,3};
    int[] teste2 = new int[] {4,5,6};

    @Override
    public void Run() {
        // Remove duplicates and find intersection

        int[] distinctNum1 = Arrays.stream(teste1).distinct().toArray();
        int[] distinctNum2 = Arrays.stream(teste2).distinct().toArray();

        Arrays.stream(num1Arr).forEach(System.out::println);

        Arrays.stream(distinctNum1).forEach(this::Intersection);

        System.out.println(listWithIntersections);
    }

    public void Intersection(int num) {
        if (distinctNum2.contains(num)) {
            listWithIntersections.add(num);
        }
    }
}
