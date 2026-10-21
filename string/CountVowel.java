package string;

public class CountVowel {
   public static void main(String[] args) {
      String t ="aioudf" ;
       int count =0;
       for(char c:t.toCharArray()){
           if(c=='a'||c=='i'||c=='o'){
               count++;
       }
       }
       System.out.print(count);
   } 
}