package com.survivalcoding;

public class Main {
    public static void main(String[] args) {
        Cleric cleric = new Cleric("아서스", 40, 5);
        Cleric cleric2 = new Cleric("아서스", 35);
        Cleric cleric3 = new Cleric("아서스");

        System.out.println("name=" + cleric.name + ", HP=" + cleric.HP + ", MP=" + cleric.MP);
        System.out.println("name=" + cleric2.name + ", HP=" + cleric2.HP + ", MP=" + cleric2.MP);
        System.out.println("name=" + cleric3.name + ", HP=" + cleric3.HP + ", MP=" + cleric3.MP);

        System.out.println("selfAid before: HP=" + cleric.HP + ", MP=" + cleric.MP);
        cleric.selfAid();
        System.out.println("selfAid after: HP=" + cleric.HP + ", MP=" + cleric.MP);

        int recoveredMP = cleric.pray(3);
        System.out.println("pray recovered MP=" + recoveredMP);
        System.out.println("pray after: HP=" + cleric.HP + ", MP=" + cleric.MP);
    }
}
