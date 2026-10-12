package string.strings.other;

public class countword {
    public static void main(String[] args) {
        
        String a ="Java is very easy";
        String aa[]=a.split(" ");
        
        System.out.println(aa.length);
    }
}

// split("")   // حروف
// split(" ")  // كلمات مفصولة بمسافة
// split("\\s+")