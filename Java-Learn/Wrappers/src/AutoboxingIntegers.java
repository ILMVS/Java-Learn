public class AutoboxingIntegers {
    public static void main(String[] args) {
        Integer[] integerArray = {Integer.valueOf(7),5,2,3,4,5};

        int sum = 0;
        for (Integer integer : integerArray) {
            if(integer.intValue()%2 == 0) {
                sum += integer.intValue();
            }
            System.out.println("integer = " + integer);
            
        }
    }
}
