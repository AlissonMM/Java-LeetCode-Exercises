import java.util.*;
public class RomanToInteger {
    public int romanToInt(String s){

        char[] characters = s.toCharArray();

        Map<Character, Integer> getInt = new HashMap<>();
        getInt.put('I', 1);
        getInt.put('V', 5);
        getInt.put('X', 10);
        getInt.put('L', 50);
        getInt.put('C', 100);
        getInt.put('D', 500);
        getInt.put('M', 1000);

        int currentNumber = 0;
        int previousNumber = 0;
        int result = 0;


        for (char character : characters) {
            currentNumber = getInt.get(character);
            if (previousNumber < currentNumber) {
                System.out.println("Este é o previousNumber: " + previousNumber);
                System.out.println("Este é o currentNumber: " + currentNumber);
                result += (currentNumber -  2 * previousNumber); // probleminha
                System.out.println("result dentro do loop:" + result);

            } else {
                result += currentNumber;
            }

            previousNumber = currentNumber;

        }

        return result;
    }

//    private static int getInt(char c){
//        return switch (c) {
//            case 'I' -> 1;
//            case 'V' -> 5;
//            case 'X' -> 10;
//            case 'L' -> 50;
//            case 'C' -> 100;
//            case 'D' -> 500;
//            case 'M' -> 1000;
//            default -> -1; // Retorna -1 para representar um valor inválido
//        };
//    }


//    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//            Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//
//    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
//
//    Given a roman numeral, convert it to an integer.



}






