package tw.thu.tool;
public class Tool 
{
  public static double[][] multiply(double[][] a,double[][] b)
  {
    //your code here
    if (a == null || b == null)
      throw new IllegalArgumentException("Parameters must not be null");
    if (a.length == 0 || a[0] == null || a[0].length == 0 ||
        b.length == 0 || b[0] == null || b[0].length == 0)
      throw new IllegalArgumentException("Matrix dimension cannot be 0");
    if (a[0].length != b.length)
      throw new IllegalArgumentException("Invalid matrix multiplication");

    int rowCount = a.length;
    int colCount = b[0].length;

    int mulCount = b.length;

    double[][] ret = new double [rowCount][colCount];
    for (int i = 0; i < rowCount; ++i) {
      for (int j = 0; j < colCount; ++j) {
        for (int k = 0; k < mulCount; ++k) {
          ret[i][j] = a[i][k] * b[k][j];
        }
      }
    }
    
    return ret;
  }
  /**
   * Assuming 
   *  
   * 
   */
  public static void main(String[] args)
  {
    double[][] a={{1,0.2,3},{4,5,6}};
    double[][] b={{3,4,2,5},{0.1,0.2,0.3,0.4},{1,8,9,10}};
    double[][] c=multiply(a,b);
    for(double[] row:c)
    {
      for(double ele:row)
      {
        System.out.print(ele+"\t");
      }
      System.out.println();
    }
  }
}
