package com.trafigura.tcs;
import java.util.List;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class ImplAccount {
	public static void main(String[] args) {
		
	//	BeanFactory fac = new XmlBeanFactory(new FileSystemResource("beans.xml"));
	//	ApplicationContext fac = new FileSystemXmlApplicationContext("E:\\JSP\\beans.xml");
		ApplicationContext fac = new ClassPathXmlApplicationContext("beans.xml");
		
/*		Account a = (Account)fac.getBean("accObj");
		a.withdraw();
		
		Transaction t = (Transaction)fac.getBean("tran");
		t.transact();*/
		
		Report rep = (Report)fac.getBean("rpt");
		List<Customer> cust = rep.getCustomerList();
		System.out.println(cust);
		
	}

}
