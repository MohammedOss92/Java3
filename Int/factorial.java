package Int;
public class factorial {

  public static void main(String[] args) {

    int n = 10;
    int sum =1;

    for(int i=n;i>=1;i--){
            System.out.print(i);

        if(i!=1){
            System.out.print("*");
        }

        sum*=i;
    }
    System.out.println(" = " + sum);

}  
}
