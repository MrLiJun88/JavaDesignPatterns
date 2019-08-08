package com.Interpretermode.expression;

import java.util.HashMap;

public class SymbolExpression implements Expression {
    Expression left;
    Expression right;
    /**构造器*/
    public SymbolExpression(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }
    /**因为Symbol是由子类来实现的，所以它本身是空实现*/
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
