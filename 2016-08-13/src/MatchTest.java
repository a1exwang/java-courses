class MatchTest {
  public static void main(String[] args) {
    System.out.println(match("abcdecdefg", "cde"));
    System.out.println(match("abcdecdefg", "cdecf"));
  }

  public static int match(String str, String substr) {
    if (str == null || substr == null) {
      throw new IllegalArgumentException("Arguments cannot be null");
    }

    for (int strIndex = 0; strIndex < str.length(); ++strIndex) {
      boolean matched = true;
      for (int subIndex = 0; subIndex < substr.length(); ++subIndex) {
        if (strIndex + subIndex >= str.length() || 
            str.charAt(strIndex + subIndex) != substr.charAt(subIndex)) {
          matched = false;
          break;
        }
      }
      if (matched) {
        return strIndex;
      }
    }

    return -1;
  }
}
