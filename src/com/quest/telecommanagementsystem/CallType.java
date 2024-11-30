package com.quest.telecommanagementsystem;

public enum CallType {
    Local{
        @Override
        public double generateRate(){
            return 2.0;
        }
    },
    ISD{
        @Override
        public double generateRate(){
            return 2.0;
        }
    },
    STD{
        @Override
        public double generateRate(){
            return 2.0;
        }
    };

    public abstract double generateRate();

}
