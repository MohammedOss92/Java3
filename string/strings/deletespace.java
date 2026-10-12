package string.strings;

public class deletespace {
    public static void main(String[] args) {
        String s = "hello world java";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) != ' ') {
        result += s.charAt(i);
    }
}

System.out.println(result);
//*************** */
// result = "";
for(int i=0;i<s.length();i++){
    if(s.charAt(i)!=' '){
        result+=s.charAt(i);
    }
}
System.out.println(result);


    }
}
