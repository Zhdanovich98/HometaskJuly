package com.epam.Electrics;

import java.util.ArrayList;
import java.io.*;

public class ElectricsRoomAppliances implements StructureForElectricsClass {

    //collection for storing data from a roomElectrics.txt
public ArrayList<String> ElectricsRoomList;
{
	reedAndAddInList();
}
	//	method of reading data from roomElectrics.txt and adding data to ElectricsRoomList
	@Override	
    public void reedAndAddInList()  {
		try (BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/roomElectrics.txt")))) {
			ElectricsRoomList = new ArrayList<String>();
			int index = 0;
			while(true) {
			String DataFromTxt = reader.readLine();
			if(DataFromTxt == null)  { break;}
			ElectricsRoomList.add(DataFromTxt);
		    index++;
		}
		}
        catch(IOException ex) {
		 ex.printStackTrace();
	 } 
	 }

}

	
