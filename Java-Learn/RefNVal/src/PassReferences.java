public class PassReferences {

    public static void main(String[] args) {
        int[] age = {10,11,12};
        for(int i = 0; i < age.length; i++) {
            System.out.println("Before test method with  age[" + i + "] = " + age[i]);
        }
        test(age);
        for(int i = 0; i < age.length; i++) {
            System.out.println("After test method with  age[" + i + "] = " + age[i]);
        }
    }

    public static void  test(int[] age) {
        System.out.println("" + age[0]);
        for(int i = 0; i < age.length; i++) {
            age[i] = 20 + i; // Modify the array elements
            System.out.println("In test method with age =  = " + age[i]);
        }
    }

}
