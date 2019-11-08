package sk.itsovy.ganoczi.project;

import jdk.jshell.spi.ExecutionControl;

import java.util.Random;

public class MyArray implements ArrayMethods {
    private int[] arr;
    private int size;

    public MyArray(int size) {
        if (size <= 0) {
            errorMessage("Cannot declare an array!");
        }
        this.size = size;
        arr = new int[size];

        resetArrayToZero();
    }

    private void resetArrayToZero() {
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    public MyArray(int[] input) {
        if (input.length <= 0) {
            errorMessage("Cannot declare an array!");
        }
        this.arr = input;
        this.size = input.length;
    }

    public int getSize() {
        return size;
    }

    private void errorMessage(String message) {
        System.out.println(message);
        System.out.println("Program will terminate");
        System.exit(1);
    }

    @Override
    public double getAverageValue() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];

        }
        return sum / size;
    }

    @Override
    public int min() {
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        return min;
    }

    @Override
    public int max() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }

    @Override
    public int min2() {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }

    @Override
    public int max2() {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }

    @Override
    public void generateValues(int a, int b) {
        Random rnd = new Random();
        if (a < b) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(b - a + 1) + a;
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Wrong input !");
            System.exit(1);
        }


    }

    @Override
    public boolean contains(int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int countOfValues(int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public int countEvenValues() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public void incrementValues() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

    }

    @Override
    public void sort(boolean asc) {

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (asc == true) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public void addItem(int newValue) {
        System.out.println(" ");
        int[] tempArr = new int[size + 1];
        tempArr[size] = newValue;
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
    }

    @Override
    public void addItem(int newValue, int position) {
        System.out.println(" ");
        int[] tempArr = new int[size + 1];

        if (position < tempArr.length) {
            for (int i = 0; i < tempArr.length; i++) {
                if (i < position) {
                    tempArr[i] = arr[i];
                } else if (i == position) {
                    tempArr[i] = newValue;
                } else {
                    tempArr[i] = arr[i - 1];
                }
            }
        } else {
            errorMessage("Wrong input!");
        }

        System.out.println("New value " + newValue + " added on position " + position);
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
    }

    @Override
    public int[] copy() {
        int[] copied = arr.clone();
        return copied;
    }

    @Override
    public int getItem(int position) {

        return arr[position];
    }


    public void reverse(){

        for (int i=0; i<size/2;i++){
            int temp=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;
        }
    }
    public void printArray() {
        System.out.println();
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void randomize(){
        Random rnd=new Random();
        for (int i=0; i<2*size; i++){
            int index1=rnd.nextInt(size);
            int index2=rnd.nextInt(size);
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }
    }

    public String addBigNumbers(String a, String b) {

        int firstNum = a.length();
        int secondNum = b.length();



        if (firstNum < secondNum) {
            int temp = secondNum - firstNum;
            for (int i = 0; i < temp; i++) {
                a += "0";
            }
        }
        if (secondNum < firstNum) {
            int temp = firstNum - secondNum;
            for (int i = 0; i < temp; i++) {
                a += "0";
            }
        }
        return a+ "  "+b;



    }
}


