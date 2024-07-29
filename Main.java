import static java.lang.Math.random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // SEGUNDA PRUEBA
//prueba del ejercicio
        int[] array = new int[10];

        for(int i = 0;i<array.length;i++){
            int numAleatorio = (int) (Math.random() * 20) + 1;
            if(array[i]== numAleatorio){

            }
            else if(array[i] !=numAleatorio){
                array[i] = numAleatorio;
            }
            System.out.println(numAleatorio);
            }
        }

    }
