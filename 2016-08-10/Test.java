public class Test {
  static public void main(String[] args) {
    Test test = new Test();
    System.out.println(test.sum(10));
  }
  public int sum(int i) {
    return sum(i, 0);
  }

  private int sum(int i, int s) {
    if (i <= 0) {
      return s;
    }
    else {
      return sum(i - 1, s + i);
    }
  }
}

