
public class Array5{

    public static void main(String args[]){
boolean isFound = false;
int[] numbers = {10, 25, 30, 15, 40};
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == 30) {
        isFound = true;
    }
}
if (isFound)
    System.out.println("Found");
else
    System.out.println("Not Found");

    }
}
