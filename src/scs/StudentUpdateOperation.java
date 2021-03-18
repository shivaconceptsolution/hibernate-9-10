package scs;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import helper.DataHelper;

public class StudentUpdateOperation {

	public static void main(String[] args) {
		DataHelper.connect();
		int rno=1001;
		Student st = (Student) DataHelper.findOperation(Student.class,rno);
		
		st.setSname("manish");
		st.setBranch("CS");
		st.setFees(4500);
		DataHelper.updateOperation(st);
		DataHelper.closeConn();


	}

}
