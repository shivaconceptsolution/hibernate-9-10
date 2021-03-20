package scs;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		//Transaction tx = s.beginTransaction();
	//	Query q = s.createQuery("from Student s");
	//	Query q = s.createQuery("from Student s where s.rno=:a and s.sname=:b");
	//	q.setString("a","1002");
	//	q.setString("b","xyz");
	//	Query q = s.createQuery("select s.rno,s.sname,s.branch from Student s");
		//Query q = s.createQuery("select s.rno,s.sname,s.branch from Student s where s.rno=?");
		Query q = s.createQuery("update Student s set s.sname='test',s.branch='test',s.fees=1200 where s.rno=1003");
	//	q.setParameter(0,"d");
		//q.setParameter(1,"e");
		//q.setParameter(2,45000);
		//q.setParameter(3,1003);
		
		int res = q.executeUpdate();
		if(res!=0)
		{
			System.out.println("Data updated successfully");
		}
		else
		{
			System.out.println("Data not updated successfully");
		}
		//tx.commit();
		/*List lst= q.list();
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			Object arr[] =(Object[]) it.next();
			System.out.println(arr[0] + "," + arr[1] + ","+ arr[2]);
			//Student st = (Student)it.next();
			//System.out.println(st.getRno() +"" +st.getSname() +" "+st.getBranch() + " "+st.getFees());
		}*/
		s.close();

	}

}
