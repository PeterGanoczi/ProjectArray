package sk.itsovy.ganoczi.project;

public class Main {
    public static void main(String[] args) {

        MyArray myArray=new MyArray(new int[]{10,25,45,32,12,2,54,47,89,11});

        System.out.println("Average value of numbers in array: " + myArray.getAverageValue());
        System.out.println("Min " + myArray.min());
        System.out.println("Max " + myArray.max());
        myArray.generateValues(10,100);
        System.out.println();
        System.out.println("Is there in array number 10? Answer:"+ myArray.contains(10));
        System.out.println("Number 10 is in array: " + myArray.countOfValues(10) + " times");
        System.out.println("Count of even numbers in array: " + myArray.countEvenValues()+ " times");
        myArray.incrementValues();
        System.out.println("Average value of numbers in array: " + myArray.getAverageValue());
        myArray.sort(true);
        myArray.addItem(14);
        myArray.addItem(88,8);
        System.out.println();
        System.out.print("Second min number from array: ");
        System.out.print(myArray.min2());
        System.out.println();
        System.out.print("Second max number from array: ");;
        System.out.println(myArray.max2());

        //spocitat dve lubovolne dlhe cisla jedno cislo bude string aj druhe string moze byt aj 20 ciferne
        //Vynasobit dve lubovolne dlhe cisla jedno cislo bude string aj druhe string moze byt aj 20 ciferne


        myArray.printArray();
        myArray.randomize();
        myArray.printArray();



    }

}
