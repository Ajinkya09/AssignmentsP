package com.psl;

import java.util.List;

import com.bean.Show;
import com.exception.InvalidSeatNumberException;
import com.exception.SeatsNotAvailableException;
import com.exception.UnknownShowException;
import com.util.DataManagerImpl;

public class Client {
	
	public static void main(String[] args) {
		
		// Call all the functionalities from here to test your code.
		
		DataManagerImpl obj = new DataManagerImpl();
		
		List<Show> list = obj.populateDataFromFile("ShowDetails.ser");

		for (Show show : list) {
			System.out.println(show);
		}
		
		try {
			obj.bookShow(list, "All The Best", "6:30 PM", 30);
		} catch (SeatsNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownShowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidSeatNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
