package lt.techin.praktinis;

import java.sql.SQLOutput;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {0, 2, 1, 4, 6, 5};

        int first = getFirstElement(arr);
        System.out.println("First Element of array is " + first);
        int last = getLastElement(arr);
        System.out.println("The last element of array is " + last);
        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMax(arr);
        System.out.println("Max mark: " + maxMark);
        int suma = getSum(arr);
        System.out.println("Array sum = " + suma);
        double average = getAverage(arr);
        System.out.println("Average of array is " + average);
        int count = countElements(arr, -1);
        System.out.println("Masyve yra isviso skaiciu: " + count);
        boolean result = contains(arr, -1);
        System.out.println(result);
        int index = lastIndexOf(arr, 0);
        System.out.println("Index of given number is " + index);

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        int f = arr[0];
        return f;
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        int l = 0; //paskutinis masyvo elementas
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                l += arr[i];
                break;
            }
        }
        return l;
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > n) {
                count++;
            }


        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        boolean a = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                a = true;
            }
        }
        return a;

    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                index = i;


            }
        }
        return index;
    }


}
