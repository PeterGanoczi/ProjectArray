package sk.itsovy.ganoczi.project;

public interface ArrayMethods {
    public double getAverageValue();
    public int min();
    public int max();
    public int min2();// druhy najmensi
    public int max2();
    public void generateValues(int a, int b);
    public boolean contains(int value);
    public int countOfValues(int value);
    public int countEvenValues();
    public void incrementValues();// kazde cislo zvacsi o jedna v celom poli
    public void sort(boolean asc); //asc =ascending
    public void addItem(int newValue);
    public void addItem(int newValue, int position);//najprv musim poposuvat prvky v poli a na uvolnene miesto pridat novu hodnotu
    public int[] copy();
    public int getItem(int position);

}
