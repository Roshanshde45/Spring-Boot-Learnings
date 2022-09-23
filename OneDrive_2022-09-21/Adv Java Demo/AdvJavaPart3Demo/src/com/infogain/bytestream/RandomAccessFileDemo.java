package com.infogain.bytestream;

import java.io.RandomAccessFile;
/**
 * @author Saurabh1.Mishra 
 */
public class RandomAccessFileDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile("d:random.text", "rw");
			// Writing to the file
			file.writeUTF("Ravic");
			file.writeInt(101);
			file.writeDouble(45789.99);

			file.seek(0); // Go to the begning  and reading from the file
			long p=file.getFilePointer();
			
            System.out.println(p);  
			System.out.println("Name " + file.readUTF());
			System.out.println("Id " + file.readInt());
			System.out.println("Salry " + file.readDouble());
			file.close();
		} catch (Exception e) {
		}

	}

}
