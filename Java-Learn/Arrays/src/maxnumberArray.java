import java.util.Scanner;

public class maxnumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        int maxNumber = Integer.MIN_VALUE;
        
        for(int i=0 ; i < numbers.length;i++ ){
            if(numbers[i] > maxNumber)
                maxNumber = numbers[i];
            else continue;
                            
        }
        System.out.println("maxNumber = " + maxNumber);
        
        maxNumber = 0; 
        for (int i = 1; i< numbers.length;i++ ){
            maxNumber = numbers[i] > numbers[maxNumber] ?  i : maxNumber;
        }

        System.out.println("The Max number is= " + numbers[maxNumber] + " in position: " + (maxNumber + 1));
    }
}
