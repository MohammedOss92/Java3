package string;

public class str {
    public static void main(String[] args) {
        String a ="a s d";
        for(int i = 0; i<a.length();i++){
            System.out.print(a.charAt(i)+" ");
        }

        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)!=' '){
            System.out.print(a.charAt(i)+" ");}
        }
    }
}
