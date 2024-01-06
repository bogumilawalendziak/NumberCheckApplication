package pl.projects.service;

import pl.projects.model.Task3Response;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Task3 implements Task{

    public Task3Response getResponse(List<Integer> list) {

        if(list.isEmpty()) return new Task3Response(List.of());

        List<Point> points = getPoints(list);
        List<Point> graphs = markWithNull(points);
        List<List<Point>> listOfGraphs = getGraphs(graphs);
        return new Task3Response(listOfGraphs);
    }

    @Override
    public String getInputInfo() {
        return "Enter number of rows, press enter, then enter list of integers separated by space and press enter to process.";
    }

    private static List<Point> getPoints(List<Integer> list) {
        List<Point> points = new ArrayList<>();
        int rows = list.get(0);
        if(list.size()<rows*2){
            throw new IllegalArgumentException("Number of rows [n] must be less or equal to half of the list size." +
                " Actual number of rows: " + rows +
                " Inserted numbers without row number: " + list.subList(1,list.size()) +
                ". Maximum required rows: " + (list.size()-1)/2);
        }
        for (int i = 1; i < rows*2; i += 2) {

            Point point = new Point(list.get(i), list.get(i + 1));
            points.add(point);
        }
        return points;
    }

    private List<List<Point>> getGraphs(List<Point> graphs) {
        List<List<Point>> listOfGraphs = new ArrayList<>();
        List<Point> currentPoints = new ArrayList<Point>();
        for (Point point : graphs) {
            if (null == point) {
                listOfGraphs.add(new ArrayList<>(currentPoints));
                currentPoints.clear();
            } else {
                currentPoints.add(point);
            }
        }

        if (!currentPoints.isEmpty()) {
            listOfGraphs.add(currentPoints);
        }
        return listOfGraphs;
    }

    private List<Point> markWithNull(List<Point> points) {
        List<Point> graphs = new ArrayList<Point>();

        for (int i = 0; i < points.size() - 1; i++) {
            if (isConnected(points.get(i), points.get(i + 1))) {
                graphs.add(points.get(i));
            } else {
                graphs.add(points.get(i));
                graphs.add(null);
            }
        }
        graphs.add(points.get(points.size() - 1));
        return graphs;
    }

    private boolean isConnected(Point A, Point B) {
        return (A.getX() == B.getY()) || (B.getX() == A.getY());
    }
}
