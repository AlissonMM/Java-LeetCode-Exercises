import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public List<Integer> Remove(int nums[], int val) {
        //instanciamento do objeto do tipo lista
        List<Integer> listaSemVal = new ArrayList<>();
        //variável para retorno do método
        int k = 0;

        //inserindo valores na lista
        for (int i : nums) {
            if (i != val){
                listaSemVal.add(i);
            }
            System.out.println(listaSemVal);
        }
        //instanciamenti de um objeto do tipo array que receberá um tamanho a partir do parametro listaSemVal.size()
        // ou seja o tamanho do array será do tamanho da lista
        int[] numeros = new int[listaSemVal.size()];

        //loop para colocar os elementos da lista dentro do array
        for (int i = 0; i < listaSemVal.size(); i++) {
            numeros[i] = listaSemVal.get(i);
        }

       return listaSemVal;
    }
}
