package spring.hibernate;

public interface JpaDB {
public  String [] getAnySingleQuery(String jpaStr);
public  String [] getAnyMultipleQuery(String jpaStr);
}
