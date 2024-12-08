package com.quest.modifierexample;

public class MainClass {
    public static void main(String[] args) {
        AcessModifierExample obj = new AcessModifierExample();

        System.out.println(obj.publicVar);
        obj.displayPublic();

        System.out.println(obj.protectedVar);
        obj.displayProtected();

        System.out.println(obj.defaultVar);
        obj.displayDefault();
    }
}
