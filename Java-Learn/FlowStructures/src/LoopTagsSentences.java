public class LoopTagsSentences {
    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 5; i++) {
            loop2:
            for (int j = 0; j < 5; j++) {
                if (j == 2 && i == 1) {
                    continue loop1; //continue the outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            loop3:
            while (i < 1) {
                break loop1;
            }

            System.out.println("i = " + i);
        }
        printLoopTagsSentences();
    }

    //search for "LoopTagsSentences" in the project to find this class
    public static void printLoopTagsSentences() {
        String sentence = "how much wood would a woodchuck chuck if a woodchuck could chuck wood";
        String word = "chuck";
        int maxSentence = sentence.length();
        int maxWord = word.length();
        int quantity = 0;
        search:

        //loop full sentence
        for(int i= 0; i < maxSentence; i++) {
            //add an auxiliary variable to keep track of the index in the word
            int k = i;
            //loop through the word
            for(int j = 0; j < maxWord; j++) {
                //if the character in the sentence does not match the character in the word, continue to the next iteration
                if(sentence.charAt(k++) != word.charAt(j)) {
                    //if the character in the sentence does not match the character in the word, break the inner loop
                    continue search;
                }
            }
            //if we reach this point, it means we found the word in the sentence
            quantity++;
        }

        System.out.println("Found \"chuck\" " + quantity + " times in the sentence: " + sentence);
    }

}
