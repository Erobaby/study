package me.freeking.study.spring;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.List;

public class StudySpel {
    public static void main(String[] args) {
        ExpressionParser parse = new SpelExpressionParser();
        Expression expression = parse.parseExpression("{1,3,5,7}");
        List<Integer> value = expression.getValue(List.class);
        System.out.println("========start========");
        System.out.println(value);
        System.out.println("========end========");
        go();
    }

    public static void go() {
        final Account account = new Account();

        //解析器
        ExpressionParser parser
                = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext(account);

        Friend friend = new Friend();
        friend.setName("wenbing");
        account.setFriend(friend);
        String friendName = parser.parseExpression("friend?.name").getValue(context, String
                .class);
        System.out.println("friendName:" + friendName);

        //设置为 null
        account.setFriend(null);
        friendName = parser.parseExpression("friend?.name").getValue(context, String
                .class);
        //打印出 null
        if (friendName == null) {
            System.out.println("friendName is null");
        } else {
            System.out.println("friendName:" + friendName);
        }

//        String name = "ss";
//        String result = parser.parseExpression("name?:'freeking'").getValue(context, String
//                .class);
//        System.out.println("result:" + result);
        double result = (double) parser.parseExpression("T(Math).abs(-2.5)").getValue();
        System.out.println("result:" + result);

    }
}
