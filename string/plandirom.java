package string;

public class plandirom {
    public static void main(String[] args) {
        String s ="ass";
        int i =0;
        int j = s.length()-1;
        boolean ispland = true;

        while(i<j){
        if (s.charAt(i)!=s.charAt(j)) {
            ispland = false;
                break;
            
            }
            j--;
            i++;
    }

    if (ispland)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
