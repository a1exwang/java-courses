import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.StringJoiner;
import java.util.Arrays;
// NOTE: requires java 8+
class Test2 {
  public static String toNumbers(String str) {
    String arr[] = str.split("[^0-9]+");
    return String.join("@", Arrays.copyOfRange(arr, 1, arr.length));
  }
  public static void main(String[] args) {
    String test1 = "hello123mot098hha111";
    String test2 = "djfaj00urowpq,cnd11kdmmdfs45jsjdf77uu2bb2qq2mdfjsi0323748596ppqa";
    System.out.println(toNumbers(test1));
    System.out.println(toNumbers(test2));

  }
}
