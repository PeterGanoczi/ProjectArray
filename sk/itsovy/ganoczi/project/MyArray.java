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
            errorMessage("Not supported yet");
            return 0;

        }

        @Override
        public int max2() {
            return 0;
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


        }

        @Override
        public void addItem(int newValue, int position) {

        }

        @Override
        public int[] copy() {
            return new int[0];
        }

        @Override
        public int getItem(int position) {
            return 0;
        }
    }


