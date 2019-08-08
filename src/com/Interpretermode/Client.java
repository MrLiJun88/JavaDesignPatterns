package com.Interpretermode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 解释器模式
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        String input = client.getExp();
        HashMap<String,Integer> map = client.getMap(input);
        Calculator calculator = new Calculator(input);
        int result = calculator.run(map);
        System.out.println("表达式 " + input + " 的结果是 " + result);
    }
    /**获得表达式*/
    public String getExp(){
        System.out.println("请输入表达式...");
        return new Scanner(System.in).nextLine();
    }
    /**获得表达式中每个变量对应的数值，以HashMap形式保存*/
    public HashMap<String,Integer> getMap(String input){
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if('+' != ch && '-' != ch){
                if(!map.containsKey(ch)){
                    System.out.println("请输入 " + String.valueOf(ch) + " 的值");
                    String in = new Scanner(System.in).next();
                    map.put(ch + "",Integer.parseInt(in));
                }
            }
        }
        return map;
    }
}
