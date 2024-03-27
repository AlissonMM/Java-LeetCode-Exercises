import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
//        List<Integer> listaSemDuplicatas = new ArrayList<>();
//
//        listaSemDuplicatas = Arrays.stream(nums)
//                                                .boxed()  // convert int to Integer
//                                                .distinct() //REMOVE DUPLICATES (y)
//                                                .toList();  // Convert an array to list
//
//        for(Integer i:listaSemDuplicatas){
//            k++;
//        }


        //Input: nums = [0,0,1,1,1,2,2,3,3,4]
        //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

        //              0  1
//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]

        // 1 2 null

        // Posição 0, vai pegar valor 1, armazenar em --duplicatas--
        // Posição 1, vai conferir se valor da --duplicata-- é igual a valor da Posição 1
            // Se verdadeiro,

        // Pegar valor, por no novo array
        // Ir para proximo valor, tentar por no novo array. Se esse valor já estiver no novo array, não colocar ele


        int[] numsAux = new int[nums.length];


        int numsAuxPosition = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//
//
//            // se não tem ali dentro, coloca
//            if (!(Arrays.asList(numsAux).contains(nums[i]))) {
//                // krl amem bota
//                numsAux[numsAuxPosition] = nums[i];
//                numsAuxPosition++;
//            }
//
//
//
//        }

        for (int i = 0; i < nums.length; i++) {
            boolean exists = false;

            // Check if nums[i] already exists in numsAux
            for (int j = 0; j < numsAuxPosition; j++) {
                if (numsAux[j] == nums[i]) {
                    exists = true;
                    break;
                }
            }

            // If nums[i] doesn't exist in numsAux, add it
            if (!exists) {
                numsAux[numsAuxPosition] = nums[i];
                numsAuxPosition++;
            }
        }

        nums = numsAux;



        for (int element : nums){
            System.out.println("element = " + element);
            if (element!= 0){
                k++;
            }

        }

            return k;
    }
}
