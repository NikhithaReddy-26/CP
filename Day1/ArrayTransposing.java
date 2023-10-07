class ArrayTransposing {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 } };
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println(rows);
        System.out.println(cols);
        int[][] tarr = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tarr[j][i] = arr[i][j];
                System.out.print(tarr[j][i] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(tarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
