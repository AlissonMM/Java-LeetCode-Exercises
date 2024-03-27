import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String baseString = strs[0];
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < baseString.length(); i++) {
            char currentChar = baseString.charAt(i);
            for (String str : strs) {
                // Check if the current index is out of bounds or if the character doesn't match
                if (i >= str.length() || str.charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }

        return prefix.toString();
    }



        // "flower","flow","flight", "blight"
        // pegar indice 0 em todos
        // f tem 3 ocorrencias
        // b tem 1 ocorrencia

        // pegar indice 1 em todos
        // l tem 4 ocorrencias

        // pegar indice 2 em todos
        // o tem 2 ocorrencias
        // i tem 2 ocorrencias

        // pegar indice 3 em todos
        // w tem 2 ocorencias
        // g tem



//        int totalLength = 0;
//        for (String str : strs) {
//            totalLength += str.length();
//        }
//
//       // Criar o array de caracteres com o tamanho total
//        char[] charArray = new char[totalLength];
//
//         // Copiar os caracteres de cada string para o array de caracteres
//        int index = 0;
//        for (String str : strs) {
//           for (char c : str.toCharArray()) {
//                charArray[index] = c;
//                System.out.println(charArray[index]);
//                index++;
//
//            }
//        }
//
//        String longestPrefix = "";
//        char currentChar;
//        for (int i = 0; i < charArray.length; i++) {
//            //
//            if () {
//               currentChar = charArray[i];
//                longestPrefix +=
//
//            }
//        }

//        for (int i = 0; i < )


//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println(charArray[i]);
//        }





//        Write a function to find the longest common prefix string amongst an array of strings.
//
//                If there is no common prefix, return an empty string "".
//
//
//
//                Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//
//        Example 2:
//
//        Input: strs = ["dog","racecar","car", "race"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.


        // ["garoto", "garota", "gato"]
        // ["prova", "professora", "produção"]
        // ["pato", "ganso", "pelicano"]
        // [" "]
        // ["pessoa"]
    }

