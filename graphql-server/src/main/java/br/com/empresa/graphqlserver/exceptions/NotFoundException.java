package br.com.empresa.graphqlserver.exceptions;

import graphql.GraphQLError;

public class NotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 9173520341094985403L;

	public NotFoundException(String mensagem) {
	  throw new GraphQLException(mensagem);
	}
	
	
}
