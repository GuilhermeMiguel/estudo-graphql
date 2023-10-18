package br.com.empresa.graphqlserver.exceptions;

import java.util.List;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class GraphQLException extends RuntimeException implements GraphQLError {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3407098082481170381L;
	private final String mensagem;

    public GraphQLException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

	@Override
	public ErrorType getErrorType() {
		return null;
	}
    
}