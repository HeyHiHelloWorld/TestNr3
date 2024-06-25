package pl.kurs.zadanie04.service;

import pl.kurs.zadanie04.model.Figure;

import java.io.*;
import java.util.List;

public class FiguresWarehouse {
    public static Figure getFigureWithGreatestPerimeter(List<Figure> figures) {
        Figure figureWithGreatestPerimeter = figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).calculatePerimeter() > figureWithGreatestPerimeter.calculatePerimeter()) {
                figureWithGreatestPerimeter = figures.get(i);
            }
        }
        return figureWithGreatestPerimeter;
    }

    public static Figure getFigureWithGreatestArea(List<Figure> figures) {
        Figure figureWithGreatestArea = figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).calculateArea() > figureWithGreatestArea.calculateArea()) {
                figureWithGreatestArea = figures.get(i);
            }
        }
        return figureWithGreatestArea;
    }

    public static void readAndSaveList(String fileName, List<Figure> figures) {
        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            figures = (List<Figure>) ois.readObject();
            if (figures != null) {
                saveList(fileName, figures);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void saveList(String fileName, List<Figure> figures) {
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(figures);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
