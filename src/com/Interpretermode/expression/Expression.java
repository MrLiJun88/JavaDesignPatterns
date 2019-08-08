package com.Interpretermode.expression;

import java.util.HashMap;

/**
 * 表达式接口，通过键值对，可以获得各个变量的值，解释变量与它对应的数值的关系
 * a -> 10
 * b -> 20
 */
public interface Expression {
    int interpreter(HashMap<String,Integer> var);
}
