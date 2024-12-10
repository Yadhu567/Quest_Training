package com.quest.multithreading;

class MatrixThread extends Thread{

    private final int[][] matrix1;
    private final int[][] matrix2;
    private final int[] resRow;
    private final int row;

    public MatrixThread(int[][] matrix1,int[][] matrix2,int[] resRow,int row) {
        this.matrix1=matrix1;
        this.matrix2=matrix2;
        this.resRow=resRow;
        this.row=row;
    }
    @Override
    public void run() {
        int col1=matrix1[0].length;
        int col2=matrix2[0].length;
        for (int j=0;j<col2;j++) {
            resRow[j]=0;
            for (int k=0;k<col1;k++) {
                resRow[j]+=matrix1[row][k]*matrix2[k][j];
            }
        }
    }
}

public class MatrixMultiplication extends Thread {
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //3x4
        int[][] matrix2={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; //4x4

        int[][] res=new int[3][4];
        MatrixThread[] thread=new MatrixThread[3];
        for(int i=0;i<3;i++){
            thread[i]=new MatrixThread(matrix1,matrix2,res[i],i);
            thread[i].start();
        }
        for (MatrixThread t:thread) {
            try{
                t.join();
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
