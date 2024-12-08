package com.quest.garbagecollection;

public class GarbageClass {
    public static void main(String[] ag){
        GarbageClass gc1=new GarbageClass();
        GarbageClass gc2=new GarbageClass();
        //Garbage Collector handled by Daemon thread that keeps running in the background
        gc1=null;
        System.gc();

        gc2=null;
        Runtime.getRuntime().gc();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("gc called"+ this);    }

    @Override
    public String toString() {
        return super.toString();
    }
}
