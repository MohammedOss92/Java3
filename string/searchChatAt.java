package string;

public class searchChatAt {
    public static void main(String[] args) {
        String a ="asdfgh";
        boolean found = false;
        char tar='n';
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)==tar){
               found = true;
                break;
            }
        }
System.out.println(found);
    }
    
}
