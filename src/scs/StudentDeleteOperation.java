package scs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import helper.DataHelper;

public class StudentDeleteOperation {

	public static void main(String[] args) {
		DataHelper.connect();
		int rno=1001;
		Student st = (Student) DataHelper.findOperation(Student.class,rno);
		DataHelper.deleteOperation(st);
		DataHelper.closeConn();

	}

}
