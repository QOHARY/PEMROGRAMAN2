package PRATIKUM5.SOAL1;

public abstract class Shape {
    private String shapeName;
    public Shape(String name) {
        shapeName = name;
    }
    public abstract double area();
    public String toString() {
        return shapeName;
    }
}