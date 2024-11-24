package com.quest.oops.interfaces;
public class NewClass implements InterfaceA,InterfaceB{

    @Override
    public void add() {
        InterfaceA.hello();
        return;
    }

    @Override
    public void add1() {
        return;
    }

    @Override
    public void sub() {
        return;
    }
    @Override
    public void print(){
        return;
    }
}
