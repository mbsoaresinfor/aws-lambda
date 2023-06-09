package br.com.mbs.lambda;

import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerSomar 
		implements
			RequestHandler<List<Float>,Float>{

	public Float handleRequest(List<Float> input, Context context) {

		return input
				.stream()
				.reduce(0f,(subtotal, element) -> subtotal + element);
	}

}
