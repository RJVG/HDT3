
/**
 *
 * @author axel
 * pograma original encontrado en http://www.java2novice.com/java-sorting-algorithms/quick-sort/
 */
public class QuickSort {

  private void quickSort(int array[]; int lowerIndex, int higherIndex) {

      int i = lowerIndex;
      int j = higherIndex;
      // para el pivote usaremos la mitad del arreglo
      int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
      // se divide en dos arreglos
      while (i <= j) {
          /**
           * En cada interaccion encontraremos un numero del lado izquierdo
           * mayor que el valor del pivote, y tambien encontraremos un numero
           * del lado derecho que sea menor al valor del pivote. Estos numeros
           * los cambiaremos de posicion.
           */
          while (array[i] < pivot) {
              i++;
          }
          while (array[j] > pivot) {
              j--;
          }
          if (i <= j) {
              exchangeNumbers(i, j);
              // avanzamos una posicion para ambos lados
              i++;
              j--;
          }
      }
      // llamamos al metodo quickSort() recursivamente
      if (lowerIndex < j)
          quickSort(lowerIndex, j);
      if (i < higherIndex)
          quickSort(i, higherIndex);
  }

  private void exchangeNumbers(int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
  }


}
