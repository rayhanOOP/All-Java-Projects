import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
            
            for (String word : words){
                      words.add(word);  
                      
                }
                  while (true)  {
                   
                   System.out.println("Type a word: ");
                    String word = reader.nextLine();
                    words.add(word);
                    
                    if (word.isEmpty()){
                        System.out.println("You typed the following words: " + words );
                        break;
                    }
                 }
                  
//     MOOC solution              
//public class Words {
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        ArrayList<String> words = new ArrayList<String>();
//        while (true) {
//            System.out.print("Type a word: ");
//            String word = reader.nextLine();
//            if (word.equals("")) {
//                break;
//            }
//            words.add(word);
//        }
// 
//        System.out.println("You typed the following words:");
//         
//        for (String word : words) {
//            System.out.println(word);
//        }
//    }
//}
    
                      
    }
}

                
                
            
           
        
            



