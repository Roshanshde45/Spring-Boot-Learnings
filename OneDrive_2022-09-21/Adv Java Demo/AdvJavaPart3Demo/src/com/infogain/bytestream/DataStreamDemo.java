/**
 * 
 */
package com.infogain.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Saurabh1.Mishra 
 */
public class DataStreamDemo {

	public static void main(String[] args) {
		int[] cityId = { 1, 2, 3 };
		String[] cityName = { "Delhi City", "Mumbai City", "kolkatta" };
		int[] cityPopulation = { 500000, 250000, 350000 };
		float[] cityTemp = { 15.50f, 10.4f, 13.3f };
		try {
			// creates the file object
			FileOutputStream fos = new FileOutputStream("./cities.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			for (int i = 0; i <= 2; i++) {
				dos.writeInt(cityId[i]);
				dos.writeUTF(cityName[i]);
				dos.writeInt(cityPopulation[i]);
				dos.writeFloat(cityTemp[i]);
			}
			dos.flush();// clear the buffer
			dos.close();// close the file object

	FileInputStream fis = new FileInputStream("./cities.txt");
	DataInputStream dis = new DataInputStream(fis);
			for (int i = 0; i <= 2; i++) {
				int cityId1 = dis.readInt();
				System.out.println("City Id: " + cityId1);
				String city_Name = dis.readUTF();
				System.out.println("City Name: " + city_Name);
				int city_Population = dis.readInt();
				System.out.println("City Population: " + city_Population);
				float cityTemperature = dis.readFloat();
				System.out.println("City Temperature: " + cityTemperature);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
