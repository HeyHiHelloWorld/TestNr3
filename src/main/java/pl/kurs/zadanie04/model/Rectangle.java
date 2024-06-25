package pl.kurs.zadanie04.model;

import java.util.Objects;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Figure.class.getSimpleName()).append(" nr ").append(getNumber()).append(":");
        sb.append(" Prostokąt o bokach ").append(a + " x " + b);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b);
    }
}
