public class Authenticate {

  private static String PART1 = "MIND YOUR OWN ";
  private static String PART2 = "BUSINESS";
  private static String PWD = PART1 + PART2;
  
  
  
  public boolean validate () {
    return PWD.equals("MIND YOUR OWN BUSINESS");
  }

}
