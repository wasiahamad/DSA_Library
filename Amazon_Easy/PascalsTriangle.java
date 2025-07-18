// Problem Statement:
// Generate the ith row of Pascal's Triangle using a 2D array. Print the triangle. 
// Time Complexity: O(n^2)  Space Complexity: O(n^2) 
// --------------------------------------------------------------------------------------------------------------------------

package DSA_Library.Amazon_Easy;

public class PascalsTriangle {
    public static void generatePascalsTriangle(int n) {
        int[][] triangle = new int[n][n];

        // Fill the triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    triangle[i][j] = 1; // First and last elements of each row are 1
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // Sum of the two elements above
                }
            }
        }
        // Print the triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }    
    // main method for testing
    public static void main(String[] args) {
        int n = 5; // Change this value to generate a different size of Pascal's Triangle
        generatePascalsTriangle(n);
    }
}





// --------------------------------------------------------------------------------------------------------------------------
// USING ARRAYLIST 

// Generate the ith row of Pascal's Triangle 
// https://leetcode.com/problems/pascals-triangle/ 
// Generate the ith row of Pascal's Triangle
// Time Complexity: O(n^2)  Space Complexity: O(n^2)    


//---------------------- CODE IS STARTING FROM HERE ---------------------
// import java.util.ArrayList;
// import java.util.List;

// public class PascalsTriangle {
//     public static List<Integer> getRow(int rowIndex) {
//         int[][] triangle = new int[rowIndex + 1][rowIndex + 1];

//         // Build the triangle
//         for (int i = 0; i <= rowIndex; i++) {
//             for (int j = 0; j <= i; j++) {
//                 if (j == 0 || i == j) {
//                     triangle[i][j] = 1;
//                 } else {
//                     triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
//                 }
//             }
//         }

//         // Extract the desired row into a list
//         List<Integer> row = new ArrayList<>();
//         for (int j = 0; j <= rowIndex; j++) {
//             row.add(triangle[rowIndex][j]);
//         }

//         return row;
//     }

//     // main method for testing
//     public static void main(String[] args) {
//         int rowIndex = 2;
//         List<Integer> result = getRow(rowIndex);
//         System.out.println("Row " + rowIndex + " of Pascal's Triangle: " + result);
//     }
// }

