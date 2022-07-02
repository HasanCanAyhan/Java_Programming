package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {

    public static void main(String[] args) {

        int[][] arr2D1 = { {1,2}, {3,4,5}  };
        int[][] arr2D2 = { {6,7,8,9},{10,11},{12,13,14} };
        int[][] arr2D3 = { {15,16,17,18}  };

        //  for 1d             0       1           0          1       2                 0
        int[][][] arr3D = { {{1,2}, {3,4,5}} , { {6,7,8,9},{10,11},{12,13,14}}, { {15,16,17,18}  }     }; // 3-1 : 3D is a container for 2 dimensional arrays
        // index: for 2d            0                         1                        2

        // [index of 2d array] [index of 1d array] [index of elements]


        System.out.println(Arrays.deepToString(arr3D));

        System.out.println( Arrays.deepToString(arr3D[1] ) ); // [[6, 7, 8, 9], [10, 11], [12, 13, 14]]

        System.out.println(Arrays.toString( arr3D[0][1]) ); // [3, 4, 5]

        System.out.println( Arrays.toString( arr3D[1][0] ) ); // [6, 7, 8, 9]

        System.out.println( arr3D[1][2][2]   ); // 14
        System.out.println( arr3D[2][0][2]   ); // 17

        System.out.println("-------------------------------------------------------");


        for (int i = 0; i < arr3D.length; i++) {// i : index number of each  2d arrays

            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) {// j : index number of each 1 dimensuional array

                int[] each1DArray = each2DArray[j];

                System.out.println(Arrays.toString( each1DArray ));

                for (int k = 0; k < each1DArray.length; k++) { // k: index numbers of each element

                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);

                }

            }

        }




    }


}
