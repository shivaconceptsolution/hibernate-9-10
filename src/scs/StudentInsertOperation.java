package scs;

import org.hibernate.*;
import org.hibernate.cfg.*;

import helper.DataHelper;

public class StudentInsertOperation {

	public static void main(String[] args) {
		
		DataHelper.connect();
		Student obj = new Student();
		obj.setRno(1006);
		obj.setSname("GHASFFGF");
		obj.setBranch("CS");
		obj.setFees(2000);
		DataHelper.insertOperation(obj);
		DataHelper.closeConn();
		
		

	}

}
