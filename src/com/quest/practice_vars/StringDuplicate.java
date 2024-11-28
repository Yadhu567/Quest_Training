package com.quest.practice_vars;

public class StringDuplicate {
    public static void main(String[] args) {
        String[] arr={"java","python","c++","python","kotlin","java","python","c","python"};
        boolean[] visited=new boolean[arr.length];
        for(int i=0;i< arr.length;i++){
            if(visited[i]){
                continue;
            }
            boolean flag=false;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i].equals(arr[j])){
                    visited[j]=true;
                    flag=true;
                }
            }
            if(flag){
                System.out.println(arr[i]);
            }

        }
    }
}
