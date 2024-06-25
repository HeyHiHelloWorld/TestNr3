package pl.kurs.zadanie04.app;

import pl.kurs.zadanie04.model.Figure;
import pl.kurs.zadanie04.model.Square;
import pl.kurs.zadanie04.service.FiguresWarehouse;

import java.util.Arrays;
import java.util.List;

public class FiguresRunner {
    public static void main(String[] args) {

        List<Figure> figures = Arrays.asList(Figure.createSquare(10),
                Figure.createCircle(20), Figure.createRectangle(10, 20));

        for (Figure f : figures) {
            System.out.println(f);
        }
        System.out.println("Figure With Greatest Perimeter = " + FiguresWarehouse.getFigureWithGreatestPerimeter(figures));
        System.out.println("Figure With Greatest Area = " + FiguresWarehouse.getFigureWithGreatestArea(figures));

        System.out.println(figures.contains(new Square(10)));




    }
}
