package sk.itsovy.ganoczi.project;

public class Main {
    public static void main(String[] args) {

        MyArray myArray=new MyArray(new int[]{10,25,45,32,12,2,54,47,89,11});

        System.out.println("Average value of numbers in array: " + myArray.getAverageValue());
        System.out.println("Min " + myArray.min());
        System.out.println("Max " + myArray.max());
        myArray.generateValues(10,100);
        System.out.println(myArray.contains(10));
        System.out.println("Number 10 in array is: " + myArray.countOfValues(10));
        System.out.println("Count of even numbers in array: " + myArray.countEvenValues());
        myArray.incrementValues();
        System.out.println("Average value of numbers in array: " + myArray.getAverageValue());
        myArray.sort(true);

    }

}
