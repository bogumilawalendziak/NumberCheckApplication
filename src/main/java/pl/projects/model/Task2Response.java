package pl.projects.model;

import java.util.List;

public class Task2Response implements Response {

  private List<String> pairs;

  public Task2Response(List<String> pairs) {
    this.pairs = pairs;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append('\n');
    for (String pair : pairs) {
      result.append(pair).append('\n');
    }
    result.deleteCharAt(pairs.size()-1);
    return result.toString();
  }

  public List<String> getPairs() {
    return pairs;
  }
}
