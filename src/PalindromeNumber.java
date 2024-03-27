import java.util.Arrays;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String num = Integer.toString(x);
        char[] characters = num.toCharArray();

        char[] characters2 = new char[characters.length];

        int j = characters.length -1;

        // inverter
        for (int i = 0; i < characters.length; i++) {
            characters2[i] = characters[j];
            j--;

            System.out.println(characters2[i]);
        }

        return Arrays.equals(characters, characters2);


        // 133 tem q dar false
        // 212 tem q dar true
        // 20102 tem q dar true
        // 3003 tem q dar true


//                Given an integer x, return true if x is a
//                palindrome
//, and false otherwise.
//
//
//
//                Example 1:
//
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//
//                Example 2:
//
//        Input: x = -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//
//        Example 3:
//
//        Input: x = 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.



    }
}
