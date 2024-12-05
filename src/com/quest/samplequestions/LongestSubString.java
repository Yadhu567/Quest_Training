package com.quest.samplequestions;


public class LongestSubString {
    public static void main(String[] args) {
        String[] strArray={"flower", "flow", "fly"};


        int minLen=strArray[0].length();
        StringBuilder minString = new StringBuilder(strArray[0]);

        int minIndex = 0;
        for(int i=1;i<strArray.length;i++){
            if(strArray[i].length()<minLen){
                minLen=strArray[i].length();
                minString= new StringBuilder(strArray[i]);
                minIndex = i;

            }
        }
        for (int i = minIndex; i < strArray.length - 1; i++) {
            strArray[i] = strArray[i + 1];
        }

        StringBuilder opString=new StringBuilder();

        for (int j = 0; j < minString.length(); j++) {
            char c = minString.charAt(j);
            boolean flag=true;
            for (String str : strArray) {
                if (!str.contains(Character.toString(c))) {
                    flag=false;
                    break;
                }
            }
            if(flag){
                opString.append(c);
            }
        }

        System.out.println(opString);
    }
}
