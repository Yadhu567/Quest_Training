package com.quest.modifierexample;

public class AcessModifierExample {
    public String publicVar = "public variable";

    protected String protectedVar = "protected variable";

    String defaultVar = "default variable";

    public void displayPublic() {
        System.out.println("public method.");
    }

    protected void displayProtected() {
        System.out.println("protected method.");
    }

    void displayDefault() {
        System.out.println("default method.");
    }

    private void displayPrivate() {
        System.out.println("private method.");
    }

    public void accessPrivateMethod() {
        String privateVar = "private variable";
        System.out.println(privateVar);
    }
}
