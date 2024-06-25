package pl.kurs.zadanie04.model;

import java.util.Objects;

public abstract class Figure {
    private static int counter = 0;
    private int number;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public Figure() {
    }

    public static Square createSquare(double a) {
        Square square = new Square(a);
        ((Figure) square).setNumber(++counter);
        return square;
    }

    public static Circle createCircle(double r) {
        Circle circle = new Circle(r);
        ((Figure) circle).setNumber(++counter);
        return circle;
    }

    public static Rectangle createRectangle(double a, double b) {
        Rectangle rectangle = new Rectangle(a, b);
        ((Figure) rectangle).setNumber(++counter);
        return rectangle;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;
        Figure figure = (Figure) o;
        return number == figure.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
