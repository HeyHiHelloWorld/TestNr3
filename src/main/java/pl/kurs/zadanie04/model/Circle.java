package pl.kurs.zadanie04.model;

import java.util.Objects;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Figure.class.getSimpleName()).append(" nr ").append(getNumber()).append(":");
        sb.append(" Koło o promieniu ").append(r);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), r);
    }
}
