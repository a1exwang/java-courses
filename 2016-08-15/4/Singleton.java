class Singleton {
  private Singleton() { }

  private static Singleton theInstance = null;
  public static instance() {
    if (theInstance == null) {
      theInstance = new Singleton();
    }
    return theInstance();
  }
}
