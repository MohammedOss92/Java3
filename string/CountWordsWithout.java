
public class CountWordsWithout {
   public static void main(String args[]){
     String a="Java  is   very powerful";
int count = 0;
boolean inWord = false;
for(char c:a.toCharArray()) {
    
    if(c!=' '){
        inWord = true;
    }
    else if(inWord){
        count++;
    inWord=false;
    }
}  

if (inWord) {
    count++;
}
System.out.println(count);    
   }       
}
