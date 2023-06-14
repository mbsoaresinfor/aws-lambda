package br.com.mbs.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.lambda.runtime.events.models.s3.S3EventNotification;

public class HandlerEventS3 implements
        RequestHandler<S3Event,String> {


    @Override
    public String handleRequest(S3Event s3Event, Context context) {

        System.out.println("Lambda function " + this.getClass().getName() + " executada");
        for(S3EventNotification.S3EventNotificationRecord record : s3Event.getRecords()) {
            String BucketName = record.getS3().getBucket().getName();
            String FileName = record.getS3().getObject().getKey();
            System.out.println("Bucket Name " + BucketName);
            System.out.println("File Name " + FileName);
        }
        return "sucesso";
    }
}
