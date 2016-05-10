package com.anancds.Annotation;

public enum Gender {
    MAN{
        public String getName(){return "��";}
    },
    WOMEN{
        public String getName(){return "Ů";}
    }; //�ǵ��С�;��
    public abstract String getName();
}
