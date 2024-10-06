package app;

import java.util.Arrays;
import java.util.Random;

public class mainProgram {

    public static void main(String[] arg){

        Random random = new Random();
        int[] array = new int[20];
        int sumOfAllNegativeValue = 0;
        int countOfEven = 0;
        int countOfOdd = 0;
        int maxElement = 0;
        int minElement = 0;
        int indexOfMinElement = 0;
        int indexOfMaxElement = 0;
        boolean isElementAfterNegative = false;
        double sumAfterNegative = 0;
        int countAfterNegative = 0;

        for (int i =0; i< array.length; i++){
            array[i] = random.nextInt(100*2)-100;
        }
//-------------------------------------------------------------------------
        for(int el : array) {
            if (el < 0) {
                sumOfAllNegativeValue +=el;
            }

            if (el %2 == 0){
                countOfEven++;
            } else countOfOdd++;

        }

        System.out.println(Arrays.toString(array));
        System.out.println("Сума від'ємних чисел: " + sumOfAllNegativeValue);
        System.out.println("Кількість парних чисел: " + countOfEven);
        System.out.println("Кількість непарних чисел: " + countOfOdd);
//---------------------------------------------------------------------------------
        for(int i = 0; i < array.length; i++){
            if(array[i]>maxElement){
                maxElement = array[i];
                indexOfMaxElement = i;
            }

            if(array[i]<minElement){
                minElement = array[i];
                indexOfMinElement = i;
            }
        }

        System.out.printf("Найменший елемент: %d (з індексом %d)%n",
                minElement,indexOfMinElement);
        System.out.printf("Найбільший елемент: %d (з індексом %d)%n",
                maxElement,indexOfMaxElement);
//----------------------------------------------------------------------------------
        for (int i = 0; i< array.length; i++){
            if (array[i] < 0 && !isElementAfterNegative){
                isElementAfterNegative = true;
            } else if (isElementAfterNegative) {
                sumAfterNegative +=array[i];
                countAfterNegative++;
            }
        }

        if (countAfterNegative == 0 || !isElementAfterNegative) {
            System.out.println("Від'ємних чисел немає");
        } else
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f",
                    (sumAfterNegative / countAfterNegative));
    }

}
