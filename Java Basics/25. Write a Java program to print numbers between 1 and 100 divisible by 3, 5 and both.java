// 25. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

public class practice{
    public static void main (String args[]){
        
        System.out.println("Numbers Divided By 3 : ");
        for(int i =1;i<=100;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
         System.out.println();
         System.out.println();
        
        System.out.println("Numbers Divided By 5 : ");
        for(int i =1;i<=100;i++){
            if(i%5==0){
                System.out.print(i+" ");
            }
        }
         System.out.println();
         System.out.println();
        
        System.out.println("Numbers Divided By 3 & 5 : ");
        for(int i =1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.print(i+" ");
            }
        }
        
    }
}