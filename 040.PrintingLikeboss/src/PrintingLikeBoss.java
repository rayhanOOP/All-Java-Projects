public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
       
        System.out.print("*");
       
        i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i<amount){
       
            System.out.print(" ");
            i++;
                }
            }

    public static void printTriangle(int size) {
        int i = 0;// 40.2
        int j = size;
        while ( i < size){
            i++;
            j--;  
            printWhitespaces(j);
            printStars(i);  
        }
    }

    public static void xmasTree(int height) {
       int i = 0; // 40.3
       int j = height;
       while (i <= height){
           i++;
           j--;
           printWhitespaces(j);
           height++;
           printStars(i);
           
             i++;
             if(height == i) {
             height++;
             break;
             } 
       }
            printWhitespaces((i/2)-2);
            printStars(3);
            printWhitespaces((i/2)-2);
            printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        //printWhitespaces(7);
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
