// LLenar elementos de un array, sin repetidos
// Ordenamiento burbuja
import java.util.Random;
public class Main{
    public static void main(String[] args){

        // Intercambio
        int a = 5;
        int b = 1;

        System.out.print("a = " + a + "\nb = " + b);
        System.out.println("\n");

        int tmp = a;
        a = b;
        b = tmp;

        System.out.print("a = " + a + "\nb = " + b);
        System.out.println("\n");




        Random random = new Random();

        int val = 10000;

        int[] array = new int[val];
        mostrar(array);

        //LLenar elementos, sin repetir
        for(int i = 0; i < array.length; i++){
            int temp = random.nextInt(val) + 1;
            for(int j = 0; j < i; j++){
                while(temp == array[j]){
                    temp = random.nextInt(val) + 1;
                    j = 0;
                    //System.out.println(temp);
                    //mostrar(array);
                }
            }
            array[i] = temp;
        }
        mostrar(array);

        //Ordenamiento burbuja
        for(int i = 0; i < array.length; i++){
            //mostrar(array);
            //System.out.println("----------------");

            boolean con = false;
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    //mostrar(array);
                    con = true;
                }
            }
            if(!con)
                break;
        }
        mostrar(array);
    }

    static void mostrar(int[] array){
        for(int i : array)
            System.out.print(i + " ");
        
        System.out.println();
    }
}
