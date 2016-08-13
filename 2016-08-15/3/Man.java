class Man implements Person {
  private String name;
  private String description;
  private int count;

  public Man(String name, String desc) {
    this.name = name;
    this.description = desc;
    this.count = 0;
  }

  public String getName() {
    return this.name;
  }
  public String getDescription() {
    return this.description;
  }

  public int changeSomething() {
    count--;
    return count;
  }

  public void move() {
    System.out.println("I am moving...");
  }

  protected int inc() {
    count++;
    return count;
  }

}
