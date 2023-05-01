package com.IOtask5;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Resturenttask5Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fi=new FileInputStream("Resturent.ser");
		//	ByteArrayInputStream bai=new ByteArrayInputStream(fi);
			ObjectInputStream oi=new ObjectInputStream(fi);
			ArrayList tm=(ArrayList)oi.readObject();
			//TreeMap tm=(TreeMap)oi.readObject();
			
			Object a[]=tm.toArray();
			for(Integer i=0; i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
		/*	Set s=tm.entrySet();
			Resturent r=(Bawarchi)oi.readObject();
			r.rest();
			Iterator i=s.iterator();
			for(;i.hasNext();)
			{
				System.out.println(i.next());
			}
			*/
		}
		catch (Exception tm) {
			// TODO: handle exception
			tm.printStackTrace();
		}

	}

}
