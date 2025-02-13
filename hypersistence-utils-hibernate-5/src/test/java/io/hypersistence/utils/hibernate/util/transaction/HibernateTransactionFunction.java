package io.hypersistence.utils.hibernate.util.transaction;

import org.hibernate.Session;

/**
 * @author Vlad Mihalcea
 */
public abstract class HibernateTransactionFunction<T> {

    public abstract T apply(Session t);

    public void beforeTransactionCompletion() {

    }

    public void afterTransactionCompletion() {

    }
}
