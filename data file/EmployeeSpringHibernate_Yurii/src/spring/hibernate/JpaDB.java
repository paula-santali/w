package spring.hibernate;

public interface JpaDB {
String []getAnySingleQuery(String strQuery);
String []getAnyMultipleQuery(String strQuery);
}
