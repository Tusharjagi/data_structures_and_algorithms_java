void main(String[] args) {
//    decalration
//    int arr[];
//    allocation
//    arr = new int[5];
//    init
//    int brr[] = {20, 40, 70, 90, 30};

//    System.out.println(brr[0]);
//    System.out.println(brr[1]);
//    System.out.println(brr[2]);
//    System.out.println(brr[3]);
//    System.out.println(brr[4]);
//    int n = brr.length;
//    for (int i=0; i <= n-1; i++) {
//        System.out.println(brr[i] + " ");
//    }

//    for (int val:brr) {
//        System.out.println(val);
//    }

//    int arr [] = new int[5];
//    int n = arr.length;
//    Scanner sc = new Scanner(System.in);
//    for (int i = 0; i <= n -1; i++) {
//        System.out.print("Enter your value: ");
//        arr[i] = sc.nextInt();
//    }

//
//    System.out.println("Your contains");
//    for (int val: arr) {
//        System.out.println(val);
//    }

//    int arr[] = {12, 14, 56, 23, 46};
//
//    int n = arr.length;
//
//    for (int i = 0; i <= n - 1; i++) {
//        System.out.println("Arr values: " + arr[i]);
//    }

//    sum of array
//    int arr[] = {10, 20, 30, 50, 40};
//    int sum = 0;
//
//    for (int val: arr) {
//        sum += val;
//    }
//
//    System.out.println(sum);

//    multiplication of array
//    int arr[] = {2, 3, 10, 20};
//    int result = 1;
//    int n = arr.length;
//
//    for (int i = 0; i <= n - 1; i++) {
//        result *= arr[i];
//    }
//
//    System.out.println(result);

//    find maximum value in array

//    int arr[] = {4, 2, -5, 21, 45};
//    int max = arr[0];
//    int n = arr.length;
//
//    for (int i = 0; i <= n - 1; i++) {
//        if (max < arr[i]) {
//            max = arr[i];
//        }
//    }
//
//    System.out.println(max);

//    find the minimum in array
//    int arr[] = {4, 2, -5, 21, 45};
//
//    int minval = arr[0];
//    int n = arr.length;
//
//    for (int i = 0; i <= n - 1; i++) {
//        if (arr[i] < minval) {
//            minval = arr[i];
//        }
//    }
//
//    System.out.println(minval);

//    2D arrays
//    decalartion
//    int arr[][];
//  allocation;
//    arr = new int[3][4];
//    init
//    int [][] brr = {
//            {1, 2},
//            {2, 3, 4, 5},
//            {3, 4, 5, 2, 2},
//            {4, 5}
//    };
//
//    System.out.println(brr[3][1]);
//    int rowLength = brr.length;
//    int colLength = brr[0].length;
//
//    for(int row = 0; row <= rowLength - 1; row++) {
//        int colLength = brr[row].length;
//        for (int col = 0; col <= colLength - 1; col++) {
//            System.out.print(brr[row][col] + " ");
//        }
//        System.out.println();
//    }

    // Allocate memory for the 3 rows only (Columns are left unallocated/null)
//    int[][] jaggedMatrix = new int[3][];

// Manually allocate different memory sizes for each individual row
//    jaggedMatrix[0] = new int[2]; // Row 0 has 2 columns
//    jaggedMatrix[1] = new int[5]; // Row 1 has 5 columns
//    jaggedMatrix[2] = new int[3]; // Row 2 has 3 columns

//    int [][] arr = {
//          {1, 2},
//          {2, 3},
//          {3, 4},
//          {4, 5}
//    };
//
//    int rowIndex = arr.length;
//    int colIndex = arr[0].length;
//
//    int ans = 1;
//
//    for (int i = 0; i < rowIndex; i++) {
//        for (int j = 0; j < colIndex; j++) {
//            ans *= arr[i][j];
//        }
//    }
//
//    System.out.println("Answer: " + ans);

//    find maximum
    int arr[][] = {{1,2,3}, {21, 45, 52}};

    int rowLength = arr.length;
    int colLength = arr[0].length;

    int maxValue = arr[0][0];

    for(int rowIndex = 0; rowIndex < rowLength; rowIndex++) {
        for (int colIndex = 0; colIndex < colLength; colIndex++) {
            if (arr[rowIndex][colIndex] > maxValue) {
                maxValue = arr[rowIndex][colIndex];
            }
        }
    }

    System.out.println("Result: " + maxValue);


}