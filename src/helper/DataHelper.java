package helper;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jpa.criteria.compile.CriteriaInterpretation;

import java.util.*;
public class DataHelper {
static Configuration cfg; 	
static SessionFactory sf;
static Session s ;
static Transaction tx;
public static void connect()
{
	cfg= new Configuration();
	cfg.configure("hiber.cfg.xml");
	sf= cfg.buildSessionFactory();
	s= sf.openSession();
}

public static void insertOperation(Object o)
{
	tx = s.beginTransaction();
	s.save(o);
	tx.commit();
}
public static void updateOperation(Object o)
{
	tx = s.beginTransaction();
	s.save(o);
	tx.commit();
}
public static void deleteOperation(Object o)
{
	tx = s.beginTransaction();
	s.delete(o);
	tx.commit();
}

public static Object  findOperation(Class c,int id)
{
  return s.load(c,id);	
  
}

public static List selectOperation(String query)
{
	Query q = s.createQuery(query);
	List lst =  q.list();
	return lst;
}
public static List selectOperation1(Class c)
{
	Criteria q = s.createCriteria(c);
	Criterion cq= Restrictions.gt("fees",10000);
	q.add(cq);
	List lst =  q.list();
	return lst;
}
public static void closeConn()
{
	sf.close();
	
}
}
