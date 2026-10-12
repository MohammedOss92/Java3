package string.strings;

public class UppercaseLower {
    public static void main(String[] args) {
        String s = "Hello JAVA World";
        int CUP = 0;
        int LoC = 0;

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(Character.isUpperCase(c)){
                CUP = CUP + 1;
            }
            else if(Character.isLowerCase(c)) {
                LoC+=1;

}
        }
        System.out.println(CUP);
System.out.println(LoC);


    }
    
}
