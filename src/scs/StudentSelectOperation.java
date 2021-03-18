package scs;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import helper.DataHelper;

import java.util.List;

public class StudentSelectOperation {

	public static void main(String[] args) {
	
		DataHelper.connect();
		List lst = DataHelper.selectOperation1(Student.class);
		Iterator it= lst.iterator();
		while(it.hasNext())
		{
			Student stu = (Student) it.next();
			System.out.println(stu.getRno() + " "+stu.getSname() + " "+stu.getBranch() + " "+ stu.getFees());
		}
		
		DataHelper.closeConn();

	}

}
