class SuperMan extends Man {

  public SuperMan(String name, String desc) {
    super(name, desc);
  }

  public SuperMan() {
    super("SuperMan", "I can fly");
  }

  public void move() {
    System.out.println("I am flying...");
  }

  public void fly() {
    System.out.println("fly, I am a SuperMan");
  }

  public int changeSomething() {
    return inc();
  }

}
