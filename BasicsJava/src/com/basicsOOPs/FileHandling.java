package com.basicsOOPs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		 File file = new File("C:\\Users\\shaik noorjhan\\OneDrive\\Documents\\newfile.txt");
		//System.out.println(f.mkdir()); creating new file
		//System.out.println(f.createNewFile());
//		 System.out.println(f.canExecute());
//		 System.out.println(f.canRead());
//		 System.out.println(f.canWrite());
//		 File file = new File("C:\\Users\\shaik noorjhan\\OneDrive\\Documents\\newfile1.txt");
//		 System.out.println(f.renameTo(file));
//		 System.out.println(f.getAbsolutePath());
		 //second program
//		 FileWriter file= new FileWriter("C:\\Users\\shaik noorjhan\\OneDrive\\Documents\\newfile.txt");
//		 file.write("hlo bts ");
//		 System.out.println("executed");
//		 file.close();
		 
//		 try (FileWriter fileWriter = new FileWriter(file)) {
//	            if (file.exists() && file.canWrite()) {
//	                fileWriter.write('n');
//	                fileWriter.flush();
//	                System.out.println("Character written successfully.");
//	            } else {
//	                System.out.println("File does not exist or is not writable.");
//	            }
//	        } catch (IOException e) {
//	            // Handle possible IOException
//	            System.out.println("An error occurred while writing to the file.");
//	            e.printStackTrace();
//	        }
		 
//		 FileInputStream f= new FileInputStream(file);
//		 if(file.canRead())
//		 {
//			 int n = f.read();
//			 while(n!=-1)
//			 {
//				 System.out.println((char)n);
//				 n=f.read();
//			 }
//		 }
//		 f.close();
		 
//		 FileReader r= new FileReader(file);
//		 char[] ch= new char[(int)file.length()];
//		 if(file.canRead())
//		 {
//			 r.read(ch);
//			 for(char ch1:ch)
//			 {
//				 System.out.println(ch);
//			 }
//		 }
//		 r.close();
		 
		 
//		 FileReader r= new FileReader(file);
//		 BufferedReader br= new BufferedReader(r);
//		 String s=br.readLine();
//		 while(s!=null)
//		 {
//			 System.out.println(s);
//			 s=br.readLine();
//		 }
//		 br.close();
		 
		 FileWriter f= new FileWriter(file);
		 BufferedWriter bf= new BufferedWriter(f);
		 bf.write('o');
		 bf.write("orjahan");
		 bf.close();
	}

}