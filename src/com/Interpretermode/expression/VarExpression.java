package com.Interpretermode.expression;

import java.util.HashMap;

/**
 * 变量解析器，通过变量获取它对应的数值
 */
public class VarExpression implements Expression {
    private String key;
    /**构造器*/
    public VarExpression(String key){
        this.key = key;
    }
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
