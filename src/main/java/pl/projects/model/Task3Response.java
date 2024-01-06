package pl.projects.model;

import java.awt.Point;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3Response implements Response {

  private List<List<Point>> graphs;

  public Task3Response(List<List<Point>> graphs) {
    this.graphs = graphs;
  }


  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append('\n');
    for (List<Point> graph : graphs) {

      List<Integer> list = graph.stream().flatMapToInt(point -> IntStream.of(point.x, point.y))
          .boxed()
          .distinct()
          .collect(Collectors.toList());
      for (Integer i : list) {
        result.append('[').append(i).append("]-");
      }
      result.deleteCharAt(result.length() - 1);
      result.append('\n');
    }

    return result.toString();
  }

  public List<List<Point>> getGraphs() {
    return graphs;
  }
}
