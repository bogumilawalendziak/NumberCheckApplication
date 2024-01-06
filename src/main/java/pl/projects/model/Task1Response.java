package pl.projects.model;

import java.util.List;

public class Task1Response implements Response {

  private List<Integer> list;
  private int count;
  private long distinct;
  private int min;
  private int max;

  public Task1Response(List<Integer> list, int count, long distinct, int min, int max) {
    this.list = list;
    this.count = count;
    this.distinct = distinct;
    this.min = min;
    this.max = max;
  }

  @Override
  public String toString() {

    return "\n" + list + '\n' + "count: " + count + '\n' + "distinct: " + distinct + '\n' + "min: "
        + min + '\n' + "max: " + max;
  }

  public List<Integer> getList() {
    return list;
  }

  public int getCount() {
    return count;
  }

  public long getDistinct() {
    return distinct;
  }

  public int getMin() {
    return min;
  }

  public int getMax() {
    return max;
  }
}
