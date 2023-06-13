package br.com.mbs.lambda;

import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerSomar 
		implements
			RequestHandler<String,String>{

	public String handleRequest(String input, Context context) {

		System.out.println("Executando " + this.getClass().getName() + " param " + input);
		return "Enviado parametro "+ input;
	}

}
