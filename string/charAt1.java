package string;

public class charAt1 {
    public static void main(String[] args) {
        String aa="Hello";
        for (int i = 0; i < aa.length(); i++) {
    System.out.println("i = " + i + " , " + aa.charAt(i));
}

    char[] chars=aa.toCharArray();
    int count= 0;
    for(char c :chars){
        count++;
    }
    System.out.println(count);
    
    char f = aa.charAt(aa.length()-1);
    char l = aa.charAt(0);

    System.out.println("First char: " + f);
        System.out.println("Last char: " + l);

        String s = "hello world java";

        for(int i =s.length()-1;i >=0;i--){
                    System.out.print(s.charAt(i));

    }

    



}

    
}
