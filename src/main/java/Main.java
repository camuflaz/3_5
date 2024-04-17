import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe:");
    int n = scanner.nextInt();
    System.out.println("Podaj znak:");
    char znak = scanner.next().charAt(0);
    for (int i = 0; i < n-1; i++){
      for(int j = 0; j < n+1; j++){
        if(i == n || j == n-1){
          System.out.print(znak);
        }else{
          System.out.print(" ");
        }
      }
      System.out.print("");
      for(int k =0; k<n; i++){
        System.out.print("");
      }
    }
  }
}