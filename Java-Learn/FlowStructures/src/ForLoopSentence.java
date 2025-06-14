public class ForLoopSentence {
    public static void main(String[] args) {
        int i = 0;
        // for has three parts: initialization, condition, and increment/decrement
        for (; ; ) {
            if (i > 5)
                break;

            System.out.println("i = " + i);
            i++;
        }
        System.out.println("i = " + i);

        decrementalForLoop();
        printOddNumbers();
        SentenceForWithArray();
    }

    public static void decrementalForLoop() {
        for (int i = 5, j = 10; i > j; i++, j--) {
            System.out.println("i = " + i);
        }
    }

    public static void printOddNumbers() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println("Odd number: " + i);
        }
    }

    public static void SentenceForWithArray() {
        String[] names = {"Luis", "Vazquez", "Java", "Programming"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }
    }

}
