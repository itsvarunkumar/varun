package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Phonenumber;
import beans.User;

public class Client {
	
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session s=sf.openSession();
	    Transaction T=s.beginTransaction();
	    
	    User u1=new User();
	    u1.setId(221);
	    u1.setFname("varun");
	    u1.setLname("Kumar");
	    u1.setAddress("Muz");
	    
	    Phonenumber p1=new Phonenumber();
	    p1.setNumberType("residense");
	    p1.setPhone(9507929180l);
	    p1.setProvider("idea");
	    
	    Phonenumber p2=new Phonenumber();
	    p2.setNumberType("office");
	    p2.setPhone(9325671526l);
	    p2.setProvider("jio");
	    
	    Set<Phonenumber>set=null;
	    set=new HashSet();
	    set.add(p1);
	    set.add(p2);
	    u1.setPhones(set);
	    s.save(u1);
	    
	    T.commit();
	    s.close();
	    sf.close();
	    } }
	
