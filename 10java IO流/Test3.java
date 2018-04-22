package com.l16.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try { 
			in = new FileInputStream("./jdk.rar");
			out = new FileOutputStream("./jdk1.rar");
			int info = -2;
			byte[] pool = new byte[1024];
			while((info = in.read(pool, 0, 1024))  != -1) {
				out.write(pool, 0, pool.length);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
					in = null;
				}
				if(out != null) {
					out.close();
					out = null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
