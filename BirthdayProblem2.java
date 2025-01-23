
public class Main {
  public static int[] birthday(int pop_size) {
      int[] arr = new int[pop_size];
      for (int i = 0; i < arr.length; i++) 
        {
          arr[i] = (int) (Math.random() * 365);
        }
    return arr;
  }

  public static int matcher(int pop_size){
    int[] birthdays = birthday(pop_size);
    for (int i = 0; i < birthdays.length; i++)
      {
        for(int j = i + 1; j < birthdays.length; j++)
          {
            if(birthdays[i] == birthdays[j])
            {
              return 1;
            }
          }
      }
      return 0;
  }

  public static double prob(int pop_size, int num_iters){
    double counter = 0.0;
    for (int i = 0; i < num_iters; i++)
      {
        counter += matcher(pop_size);
      }
    return counter/num_iters;
  }

  public static void main(String[] args) {
    System.out.println(prob(23, 1000));
  }
}
