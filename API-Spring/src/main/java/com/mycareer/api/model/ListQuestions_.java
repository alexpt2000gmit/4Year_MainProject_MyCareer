package com.mycareer.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * The static metamodel provides a type-safe and easy way to create criteria
 * queries and dynamic entity graphs. This speeds up the initial implementation
 * and makes future refactorings much easier than referencing the attributes via
 * Strings.
 * 
 * 
 * ref.https://www.thoughts-on-java.org/static-metamodel/
 * 
 * @author Alexander Souza
 */
@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ListQuestions.class)
public abstract class ListQuestions_ {

	public static volatile SingularAttribute<ListQuestions, Long> code;
	public static volatile SingularAttribute<ListQuestions, String> type_question;
	public static volatile SingularAttribute<ListQuestions, String> question;

}

