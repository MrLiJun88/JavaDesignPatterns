package com.Interpretermode;

import com.Interpretermode.expression.AddExpression;
import com.Interpretermode.expression.Expression;
import com.Interpretermode.expression.SubExpression;
import com.Interpretermode.expression.VarExpression;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    Expression expression;
    /**构造器*/
    public Calculator(String exp){
        /**定义栈*/
        Stack<Expression> stack = new Stack<>();
        /**将字符串转换成字符数组*/
        char[] chars = exp.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if('+' == ch){
                left = stack.pop();
                right = new VarExpression(String.valueOf(chars[++i]));
                stack.push(new AddExpression(left,right));
            }
            else if('-' == ch){
                left = stack.pop();
                right = new VarExpression(String.valueOf(chars[++i]));
                stack.push(new SubExpression(left,right));
            }
            else {
                stack.push(new VarExpression(String.valueOf(ch)));
            }
        }
        this.expression = stack.pop();
    }
    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
