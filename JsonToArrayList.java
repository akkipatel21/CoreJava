import java.util.*;
class DS {
    public static void main(String[] args) {

dw
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);d
        // Prepare a union
        Set<Integer> union = new HashSet<Integer>(list1);dw
        union.addAll(list2);
        // Prepare an intersection
        Set<Integer> intersection = new HashSet<Integer>(list1);
        intersection.retainAll(list2);
        // Subtract the intersection from the union
        union.removeAll(intersection);
        // Print the result
        for (Integer n : union) {
            System.out.println(n);
        }
    }
}
