package com.tc.condition;

import com.tc.annotation.ConditionalOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnClassCondition implements Condition {


    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {

       /* try {
            Class.forName("redis.clients.jedis.Jedis");
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }*/
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionalOnClass.class.getName());
        String[] names = (String[]) map.get("name");
        for (String name : names) {
            try {
                Class.forName(name);
                return true;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
