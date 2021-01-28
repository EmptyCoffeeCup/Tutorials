package academy.learnprogramming;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//        int a = 10;
//        int b = 3;
//        int c = 88;
//
//        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
//        mapa.put("a", 10);
//        mapa.put("b", 3);
//        mapa.put("c", 88);
//
//        System.out.println(mapa);
//        System.out.println(mapa.get("c"));

        HashMap<String, String> login = new HashMap<String, String >();
        login.put("BillyBob111", "FluffyPonies4");
        login.put("ImSooooCool", "32Granger23");
        login.put("RonaldoLima", "Everest777");

        System.out.println(login.containsValue("32Granger23"));
    }
}
