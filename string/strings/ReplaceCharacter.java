package string.strings;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String s = "hello world";
        char target = 'o';
char replacement = 'x';
String result = "";

for(int i=0;i<s.length();i++){
    char c = s.charAt(i);
    if(target==c){
result = result + replacement;
    }
    else {
result = result + c;
}
}
System.out.println(result);    }
}
