
public class Main {
    public static void main(String[] args)
    {
        //Problem1
        /*
        float[ ] marks = {42.3f,89.3f,33.25f,29.3f};
        float sum = 0;
        for (float elements:marks) {
            sum = sum+elements;

        }
        System.out.println(sum);
         */

        //Problem 2 Find element in array
        /*
        float[ ] marks = {42.3f,89.3f,33.25f,29.3f};
        float num = 42.3f;
        boolean isInArray = false;
        for (float elements:marks) {
            if(num==elements){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Value is present in array");
        }
        else {
            System.out.println("not present");
        }
         */

        //practice3 calculate average

        /*
        float[ ] marks = {42.3f,89.3f,33.25f,29.3f};
        float sum = 0;
        for (float elements:marks) {
            sum = sum+elements;
        }
        System.out.println("average is"+ sum/marks.length);
         */

        //problem 4 add two metrices of size 2x3
        int [][] mat1 = { {1,2,3},{4,5,6}};
        int [][] mat2 = { {10,22,13},{41,54,56}};
        int [][] result = { {0,0,0},{0,0,0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result [i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }




    }
}