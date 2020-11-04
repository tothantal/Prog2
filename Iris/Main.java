package hu.unideb.prog2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	/**
	 * <Fajta neve>:
	 * 		Adatpontok száma: <adatpontok száma>
	 * 		Átlag:
	 * 				Petal Width: <petal width átlag>
	 * 				Septal Width: <petal width átlag>
	 * 				Petal Height: <petal width átlag>
	 * 				Septal Height: <petal width átlag>
	 * [...]
	 * 
	 * Kimeneti fájl opcionális
	 * 
	 * Medián
	 * 
	 */
	
    public static void main(String[] args) {

    	Iris[] Irises = new Iris[150];
    	
    	int count = 0;
    	
        String csvFile = "iris.data";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] iris = line.split(cvsSplitBy);
        
                Irises[count] = new Iris(iris[0], iris[1], iris[2], iris[3], iris[4]);
                count++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
       
        for (int i = 0; i < 150; i++) {
        	System.out.println(Irises[i]);
        }
        
    }
}
