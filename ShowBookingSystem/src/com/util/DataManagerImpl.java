package com.util;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.bean.Show;
import com.exception.InvalidSeatNumberException;
import com.exception.SeatsNotAvailableException;
import com.exception.UnknownShowException;

//Override and implement all the methods of DataManger Interface in this class
public class DataManagerImpl implements DataManager {

	public List<Show> populateDataFromFile(String fileName) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		List<Show> l1 = new ArrayList<Show>();
		boolean s = true;
		Show sh = null;

		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);

			try {
				while (s) {
					sh = (Show) ois.readObject();
					l1.add(sh);
				}
			} catch (EOFException e) {

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return l1;
	}

	public void bookShow(List<Show> showList, String showName,
			String show_time, int noOfSeats) throws SeatsNotAvailableException,
			UnknownShowException, InvalidSeatNumberException {
		// TODO Auto-generated method stub

		boolean showIsThere = false;
		
		if (noOfSeats <= 0)
			throw new InvalidSeatNumberException();

		for (Show show : showList) {
			if(show.getShowName().equals(showName)){
				showIsThere = true;
			}
		}
		
		if(!showIsThere){
			throw new UnknownShowException();
		}
		
		else {
			for (Show show : showList) {
				if (show.getShowName().equalsIgnoreCase(showName)
						&& show.getShowTime().equalsIgnoreCase(show_time)) {
					if (show.getSeatsAvailable() < noOfSeats)
						throw new SeatsNotAvailableException();
					else
						show.setSeatsAvailable(show.getSeatsAvailable()
								- noOfSeats);
					System.out.println("\n Booking done!! \n Seats remaining :" +show.getSeatsAvailable());
				}
			}
		}

	}
}
