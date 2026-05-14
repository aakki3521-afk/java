import java.util.Scanner;
public class Name {
   public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
    String name=scan.nextLine();
    String reverse= "";
    for(int i=name.length()-1; i>=0 ;i--){
        reverse=reverse+name.charAt(i);
        
    }
    System.out.println(reverse);
}
}

