public class WhileLoopSentence {
    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean test = true;
        while (test) {
            System.out.println("i = " + i);
            i++;
            if (i == 5) {
                test = false;
            }
        }

        do { //will execute at least once
            System.out.println("i = " + i);
            i++;
        } while (i < 10);
    }
}
