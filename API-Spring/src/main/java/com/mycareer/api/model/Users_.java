package com.mycareer.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SingularAttribute<Users, String> userPassword;
	public static volatile ListAttribute<Users, Permissions> permission;
	public static volatile SingularAttribute<Users, Long> userID;
	public static volatile SingularAttribute<Users, String> userName;
	public static volatile SingularAttribute<Users, String> userEmail;

}

