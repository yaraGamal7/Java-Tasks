import java.util.function.Function;
class task1{ 
  public static void main(String args[]){
    Function<Double,Double> convertTemprature  = (Double temp) -> { return (1.8 *temp)+32; };
    Double result = convertTemprature.apply(134.0);
    System.out.println("This is temp by F"+" "+result);
  }
}