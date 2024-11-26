package com.quest.practice_vars;

public class StringDuplicate {
    public static void main(String[] args) {
        String[] arr={"ss","dd","ss","ee","ff","dd"};
        for(int i=0;i< arr.length;i++){
            boolean f=false;
            for(int j=0;j<i;j++){
                if(arr[i].equals(arr[j])){
                    f=true;
                }
            }
            if(f){
                System.out.println(arr[i]);
            }
        }
    }
}
