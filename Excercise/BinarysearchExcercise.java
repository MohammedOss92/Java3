
public class BinarysearchExcercise {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numbers = {3, 8, 12, 17, 21, 26, 31, 40, 45};
        int target = 100;
        int low =0;
        int high = numbers.length-1;
        int count =0;
        boolean found=false;
        
        System.out.println("Target = " + target);
        System.out.println("Initial low = " + low);
        System.out.println("Initial high = " + high);
        System.out.println("Initial count = " + count);
        
        System.out.println("--------------------");
        while(low<=high){
            System.out.println("Start of loop");
            System.out.println("low = " + low);
            System.out.println("high = " + high);
            System.out.println("foubd" + found);
            int mid = (low + high) / 2;

            System.out.println("mid = " + mid);
            System.out.println("numbers[mid] = " + numbers[mid]);
             count++;
            System.out.println("count = " + count);
            
            if(target==numbers[mid]){
               System.out.println("Target found!");
                System.out.println("Found at index: " + mid);
                System.out.println("Found value: " + numbers[mid]);
                found=true;
                System.out.println("foubd" + found);
                break; 
            }
            else if(numbers[mid] < target ){
                System.out.println(numbers[mid] + " < " + target);
                System.out.println("Search right");

                low = mid + 1;

                System.out.println("New low = " + low);

            }
            else{
                System.out.println(numbers[mid] + " > " + target);
                System.out.println("Search left");

                high = mid - 1;

                System.out.println("New high = " + high);
            }

            System.out.println("--------------------");
        }

        System.out.println("Loop finished");
        if(found==true){
            System.out.println("foubd" + found);
        }else{
            System.out.println("not foubd" + found);
        }
            }
        
    }
    
