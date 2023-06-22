package br.com.mbs.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerIsBiggerAge implements RequestHandler<Integer,Boolean> {
    @Override
    public Boolean handleRequest(Integer age, Context context) {
        System.out.println("Lambda function " + this.getClass().getName() + " with param: " + age);
        return age >= 18;
    }
}
