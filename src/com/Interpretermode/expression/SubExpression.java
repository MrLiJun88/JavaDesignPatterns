package com.Interpretermode.expression;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {
    /**
     * 构造器
     */
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
