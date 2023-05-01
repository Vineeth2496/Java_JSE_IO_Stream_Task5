package com.IOtask5;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.TreeMap;
public class ResturentsExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Resturent r=new Bawarchi();
		//r.rest();
		Resturent r1=new Paradise();
		//r1.rest();
		
		ArrayList tm=new ArrayList();
		tm.add(r);
		tm.add(r1);
			FileOutputStream fo=new FileOutputStream("Resturent.ser");
		//	ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(tm);
		}
		catch (Exception tm) {
			// TODO: handle exception
			tm.printStackTrace();
		}
	}

}
