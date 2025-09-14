public class Array2D {
    public static void main(String[] args) {
//        int [][] arr2D = new int [3][4];
//        for(int i =0; i<arr2D.length; i++){
//            for (int j = 0; j<arr2D[i].length; j++){
//                arr2D[i][j] = i+j;
//            }
//        }
//        for(int i =0; i<arr2D.length; i++){
//            for (int j = 0; j<arr2D[i].length; j++){
//                System.out.println(arr2D[i][j]);
//            }
//        }

        //Jagged Array
        int [][] arrJagged = new int [3][];
        arrJagged[0] = new int[2];
        arrJagged[1] = new int[1];
        arrJagged[2] = new int[3];
        for(int i =0; i<arrJagged.length; i++){
            for (int j = 0; j<arrJagged[i].length; j++){
                arrJagged[i][j] = i+j;
            }
        }
        for(int i =0; i<arrJagged.length; i++){
            for (int j = 0; j<arrJagged[i].length; j++){
                System.out.println(arrJagged[i][j]);
            }
        }
    }
}
