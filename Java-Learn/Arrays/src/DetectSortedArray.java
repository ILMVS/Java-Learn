public class DetectSortedArray {
    public static void main(String[] args) {
       int[] descArray = {10,9,8,7,6,5,4,3,2,1};
       int[] ascArray = {1,2,3,4,5,6,7,8,9,10};
       int[] unSortedArray = {5,7,8,9,4,6,3,1,2,10};
        int[] allTheSameArray = {1,1,1,1,1,1,1,1,1,1};

        getSortedDirection(descArray);
        getSortedDirection(ascArray);
        getSortedDirection(unSortedArray);
        getSortedDirection(allTheSameArray);
    }

    public static void getSortedDirection(int[] arrayNumber) {

        boolean descDir = false;
        boolean ascDir = false;
        for(int i=0;i<arrayNumber.length - 1;i++){
            if(arrayNumber[i] < arrayNumber[i+1])
                descDir = true;
            if(arrayNumber[i] > arrayNumber[i+1])
                ascDir = true;
        }
        if(descDir && ascDir)
            System.out.println("Unsorted");
        if(!descDir && !ascDir)
            System.out.println("All The Same");
        if(!descDir && ascDir)
            System.out.println("Descending");
        if(descDir && !ascDir)
            System.out.println("Ascending");
    }
}
