/**
 *
 * @author axel
 *
 */

import java.util.Random;

public class TestNumbers {

  public void randomNumbers(int[] array){

    Random randomGenerator = new Random();

    for (int x=0; x<2000; x++){
      array[x] = randomGenerator.nextInt(2000);
    }
  }

  public void sortedNumbers(int[] array){
    for (int x=0; x<2000; x++){
      array[x] = x+1;
    }
  }

}
