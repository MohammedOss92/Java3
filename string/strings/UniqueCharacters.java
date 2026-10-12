package string.strings;

public class UniqueCharacters {
    public static void main(String[] args) {
        String Unique = "asdfghjklasd";
        for(char c:Unique.toCharArray()){
        int count =0;

            for(char cc :Unique.toCharArray()){
                if (cc == c) {
                    count++;
                }
            }
             if (count == 1) {
                System.out.println(c);
            }
        }
    }
    
}
