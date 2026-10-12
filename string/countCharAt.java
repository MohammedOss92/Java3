package string;

public class countCharAt {
    public static void main(String[] args) {
        String text="asgdfghh";
        char tar ='g';
        int count = 0;

        for(int i =0;i<text.length();i++){
            if(text.charAt(i)==tar){
                count++;
            }
        }
        System.out.println(count);
    }
}
