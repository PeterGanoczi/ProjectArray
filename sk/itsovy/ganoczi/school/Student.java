package sk.itsovy.ganoczi.school;

public class Student extends Person {
    private String classRoom;

    public Student(String name, int age, String classRoom) {
        super(name, age);
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
