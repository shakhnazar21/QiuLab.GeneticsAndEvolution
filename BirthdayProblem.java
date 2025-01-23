
public class Main {
  public static int[] birthday(int pop_size){

    int[] bdays = new int[pop_size];
      for(int i = 0; i < pop_size; i++)
        {
          bdays[i] = (int)(Math.random() * 365);
        }
      return bdays;
  }  

  public static int matcher(int[] bdays, int counter){
    for(int i = 0; i < bdays.length-1; i++)
      {
        for(int y = i+1; y < bdays.length; y++)
          {
            if (bdays[i] == bdays[y])
              {
                counter++;
                return 1;
              }
          }
      }
    return 0;
  }
  
  public static void main(String[] args){
    int[] arr = birthday(25);
    int counter = 0;
      for(int i = 0 ; i < arr.length; i++)
        {
          System.out.println(arr[i]);
          counter = matcher(arr, counter);
        }
    if(counter > 0)
      {
       System.out.println("Matches: " + counter);
      }
    else 
      {
        System.out.println("Matches:0");
      }
  }
}


/* Assignment one: matching bdays, return one if at least one, return zero otherwise
*/

/*
run it a bunch of times and see how many times it matched, use a counter
*/