package sk.itsovy.ganoczi.array;

import sk.itsovy.ganoczi.school.Student;
import sk.itsovy.ganoczi.school.Teacher;

import java.util.Random;

public class MyArray {


        public static void test1() {
            int[] arr = new int[7];
            int i;

            for (i = 0; i <= 6; i++) {
                arr[i] = i + 1;
            }

            for (i = 6; i >= 0; i--) {
                System.out.println(arr[i] + " ");
            }
        }

        public static void test2() {
            int[] arr = new int[10];
            int i;

            Random random = new Random();
            int number = 0;

            for (i = 0; i <= 9; i++) {
                number = random.nextInt(90) + 10;
                arr[i] = number;
            }

            for (i = 0; i <= 9; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");

            for (i = 9; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            i = 0;
            while (i <= 9) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }
                i++;
            }
        }

        public static void test3() {
            int[] arr = new int[12];
            int i;
            int sum = 0;

            Random random = new Random();
            int number = 0;

            System.out.print("Numbers in array: ");

            for (i = 0; i <= 11; i++) {
                number = random.nextInt(90) + 10;
                arr[i] = number;
            }
            for (i = 0; i <= 11; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");

            for (i = 0; i <= 11; i++) {
                sum += arr[i];
            }

            double average = sum / 12.0;

            System.out.println("Sum of numbers: " + sum + " Average: " + average);

            int min = arr[0];
            int max = arr[0];
            int secondmax = arr[0];

            for (i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("MIN :" + min);
            System.out.println("MAX :" + max);

            int even = 0;
            int odd = 0;

            for (i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    even++;

                } else {
                    odd++;
                }

            }
            System.out.println("Sum of even numbers :" + even + " Sum of odd numbers :" + odd);

        }

        public static void test4() {
            int[] fibonacci = new int[20];
            int i;

            fibonacci[0] = 1;
            fibonacci[1] = 1;
            System.out.print("Fibonacci sequence: 1 1 ");
            for (i = 2; i <= 19; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

                System.out.print(fibonacci[i] + " ");
            }

        }

        public static void minMax(int a, int b, int c) {
            System.out.println(" ");
            int[] result = new int[3];
            int i;
            result[0] = a;
            result[1] = b;
            result[2] = c;

            int min = result[0];
            int max = result[0];
            for (i = 0; i < result.length; i++) {

                if (result[i] < min) {
                    min = result[i];
                }
                if (result[i] > max) {
                    max = result[i];
                }
            }
            System.out.println(min + " " + max);


        }

        public static void test6() {
            int[] field = new int[10];
            int[] field2 = new int[10];
            int i;
            field[0] = 1;
            field[1] = 2;

            for (i = 2; i <= 9; i++) {
                field[i] = 2 * field[i - 1];

            }
            for (i = 0; i <= 9; i++) {
                System.out.print(field[i] + " ");
            }
            System.out.println(" ");
            int count = 0;
            for (i = 9; i >= 0; i--) {                  //for(i=0; i<10; i++){ field2[9-i]=field1[i] } ale dalsi for na vypis !!
                field2[count] = field[i];
                System.out.print(field2[count] + " ");
                count++;
            }
        }

        public static void test7() {
            int[] b = {12, 38, 47, 5, 29, 16, 10, 112, 48, 65, 75, 9};

            int i, size = 0;

            for (i = 0; i < b.length; i++) {
                if (b[i] % 3 != 0) {
                    size++;
                }
            }
            int[] b3n = new int[size];
            int j = 0;
            for (i = 0; i < b.length; i++) {
                if (b[i] % 3 != 0) {
                    b3n[j] = b[i];
                    j++;
                }
            }
            for (int value : b3n) {
                System.out.println(value);
            }

            int[] c = new int[b.length];
            for (i = 0; i < b.length; i++) { // KOPIA POLA
                c[i] = b[i];
            }
            c[1] = 1524;
            System.out.println();
            for (i = 0; i < c.length; i++) {
                System.out.println(c[i]);
            }

            int d[];// KOPIA POLA
            d = b.clone();

            System.arraycopy(b, 0, c, 0, b.length); //KOPIA pola, mozno ovplyvnit dlzku skopirovaneho pola

        }

        public static void test8() {
            int[] arr = new int[20];
            Random random = new Random();


            int i, j;

            for (i = 0; i < arr.length; i++) {
                int count = 0, temp;
                temp = random.nextInt(50) + 1;
                for (j = 0; j < i; j++) {
                    if (temp == arr[j]) {
                        count = 1;
                        break;
                    }
                }
                if (count == 0) arr[i] = temp;
                else i--;
            }


            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void test9() {
            Student[] arr = new Student[5];
            Random random = new Random();
            int i;


            for (i = 0; i < 5; i++) {
                arr[i] = new Student("noname" + (i + 1), random.nextInt(28) + 10, "1N");
            }

            for (Student temp : arr) {
                System.out.println(temp.getName() + " " + temp.getAge());

            }

            for (Student temp : arr) {
                if (temp.getAge() < 18) {
                    System.out.println("Neplnolety: " + temp.getName() + " " + temp.getAge());
                }
            }

            Teacher[] arrTeacher = new Teacher[8];

            for (i = 0; i < 8; i++) {
                arrTeacher[i] = new Teacher("teacher" + (i + 1), random.nextInt(38) + 10, random.nextInt(1000) + 100);
            }

            for (Teacher temp : arrTeacher) {
                System.out.println(temp.getName() + " " + temp.getAge() + " " + temp.getSalary());
            }
            System.out.println();
            for (Teacher temp : arrTeacher) {
                if (temp.getSalary() > 765 && temp.getSalary() < 935) {
                    System.out.println(temp.getName() + " " + temp.getAge() + " " + temp.getSalary());
                }
            }
        }

        public static void test10() {
            String[] names = {"Ivan", "Marek", "Marcel", "Jana", "Peter", "Martin", "Lucia"};
            int i;
            for (i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
            System.out.println("Dlzka pola " + names.length);

            for (String name : names) { //FOR EACH cyklus
                System.out.println(name);
            }
            System.out.println();
            for (i = 0; i < names.length; i++) {
                if (names[i].contains("a") || names[i].contains("A"))
                    System.out.println(names[i] + " ");
            }
            int min = names[0].length();
            int max = names[0].length();
            for (i = 0; i < names.length; i++) {
                if (max < names[i].length()) {
                    max = names[i].length();
                }
                if (min > names[i].length()) {
                    min = names[i].length();
                }
            }
            System.out.println();
            //VYPIS NAJDLHSICH MIEN
            for (i = 0; i < names.length; i++)
                if (max == names[i].length()) {
                    System.out.println(names[i]);
                }
            System.out.println("MAX : " + max);
            //VYPIS NAJKRATSICH MIEN
            for (i = 0; i < names.length; i++) {
                if (min == names[i].length()) {
                    System.out.println(names[i]);
                }
            }
            System.out.println("MIN : " + min);
            //VYPIS MIEN VELKYMI PISMENAMI
            for (i=0; i<names.length; i++){
                System.out.println(names[i].toUpperCase() );
            }
            //VYPIS MIEN ALE NAMIESTO SAMOHLASOK VYPISAT BODKU
            for (i=0; i<names.length; i++){
                String name=names[i];
                for (int j=0; j<name.length(); j++){
                    String z=String.valueOf(name.charAt(j));
                    if ("AEIOUYaeiouy".contains(z)){
                        System.out.print(".");
                    } else{
                        System.out.print(z);
                    }
                    System.out.print(" ");


                } System.out.println();
            }

        }

        public static void test12(){
            int[] arr={54,22,10,3,27};

            for (int i=0; i<arr.length-1; i++){
                for (int j=0;j<arr.length-1-i; j++){
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for (int i=0;i<arr.length; i++){
                System.out.println(arr[i]);
            }

        }


    }


