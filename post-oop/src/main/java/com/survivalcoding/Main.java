package com.survivalcoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket();
        String name = "";

        pocket.put(1);
        pocket.put("33");
        pocket.put(true);

        Pocket<String> pocket1 = new Pocket<>();
        pocket1.put("333");

        String value = pocket1.get();

//        int number = (int) pocket.get();

        AuthState state = AuthState.AUTHENTICATED;

        if (state == AuthState.AUTHENTICATING) {

        }

    }
}