package scs;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.*;;

public class CriterialExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Criteria crt = s.createCriteria(Student.class);
		Projection p1  = Projections.property("rno");
		Projection p2  = Projections.property("sname");
		crt.setProjection(p1);
		//crt.setProjection(p2);
		
		//Criterion ct = Restrictions.like("sname", "_B%");
		//crt.add(ct);
		List lst = crt.list();
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
			//System.out.println(obj.getRno() + " "+obj.getSname() + ""+obj.getBranch()+ " "+obj.getFees());
		}
		
		s.close();
		sf.close();
		
		
	}

}
