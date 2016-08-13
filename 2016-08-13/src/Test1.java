import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test1 {
  public static void main(String[] args) {
    // accepted
    String[] dataSet1={"1","1.1","1.0","0.1","1.",".1","1e1","1.1e2","1.0e2","0.1e9","1.e6",".1e0"};
    //denied
    String[] dataSet2={"..1..","1...2e","e","2e","e2"};
    
    Pattern regex = Pattern.compile("\\A((\\d+\\.?)|(\\.\\d+)|(\\d+\\.\\d+))(e\\d+)?\\z");

    System.out.println("accepted:");
    for (String s : dataSet1) {
      Matcher m = regex.matcher(s);
      System.out.println(m.matches());
    }
    
    System.out.println("denied:");
    for (String s : dataSet2) {
      Matcher m = regex.matcher(s);
      System.out.println(m.matches());
    }
      
  }
}
