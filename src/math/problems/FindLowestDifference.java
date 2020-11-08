package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        cal();


    }
    public static void cal (){
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int tmp;
        int finalResult=0;
        for (int i=0; i<=array1.length;i++){
            tmp=array1[i+1];
            finalResult = array1 [i] - tmp;


        }
        System.out.println("The lowest difference is " + finalResult);

    }

}
