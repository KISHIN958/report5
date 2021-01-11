package jp.ac.uryukyu.ie.e205727;

public class week1 {
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5.1f", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        double[][] matrix22_1 = {{0., 1.}, {2., 3.}};
        double[][] matrix22_2 = {{4., 5.}, {6., 7.}};
        double[][] matrix23_1 = {{0., 1.}, {2., 3.}, {4., 5.}};
        double[][] matrix23_2 = {{6., 7.}, {8., 9.}, {10., 11.}};
        

        System.out.println("\n# printMatrixの動作確認");
        printMatrix(matrix22_1);
        
        

        // 以下は computeAddMatrix メソッドを実装したあとで実行する内容。
        System.out.println("\n# matrix22_1 + matrix22_2");
        double[][] level2_1 = computeAddMatrix(matrix22_1, matrix22_2);
        printMatrix(level2_1);

        System.out.println("\n# matrix23_1 + matrix23_2"); 
        double[][] level2_2 = computeAddMatrix(matrix23_1, matrix23_2);
        printMatrix(level2_2); 
        System.out.println("\n# 行列サイズ(行数)が異なる場合"); 
        double[][] level2_3 = computeAddMatrix(matrix22_1, matrix23_1);
        printMatrix(level2_3);
        
    }
    
    public static double[][] computeAddMatrix(double[][] matrix1, double[][] matrix2){
        double[] Minimatrix1 = matrix1[0];
        double[] Minimatrix2 = matrix2[0];
        double[][] matrix3 = new double[matrix1.length][matrix1[0].length];
        if((matrix1.length == matrix2.length) && (Minimatrix1.length == Minimatrix2.length)){
           for(int i = 0; i < matrix1.length; i++){
                for(int n = 0; n < matrix1[i].length; n++){
                    matrix3[i][n] = matrix1[i][n] + matrix2[i][n];
                }
            }
            return matrix3;

        }else{
            if(matrix1.length != matrix2.length){
                System.err.println("行数が違います");
                System.exit(0);
            }else{
                System.err.println("列数が違います");
                System.exit(0);
            }
            return matrix3;
        }   
    }
    
    
}    