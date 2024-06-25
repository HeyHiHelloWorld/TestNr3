package pl.kurs.zadanie04.model;

import java.util.Objects;

public class Square extends Figure{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Figure.class.getSimpleName()).append(" nr ").append(getNumber()).append(":");
        sb.append(" Kwadrat o boku ").append(a);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a);
    }
}
