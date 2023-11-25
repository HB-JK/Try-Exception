/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tryexceptionkelompok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Edwin Theonardi
 */
public class CheckFileMultipleCatch {
    public void bacaFile() {
		      BufferedReader baca;
		try {
			baca = new BufferedReader(new FileReader("save.txt"));
			String read;
			while((read = baca.readLine())!=null) {
				String temp[] = read.split("#");
                                System.out.println("Isi File: " + temp[0] + temp[1]);
			}
			baca.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
