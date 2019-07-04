package com.epam.launch;

import java.io.IOException;

import com.epam.Electrics.ElectricsRoomAppliances;
import com.epam.WorkWithElectrics.StateAndSummPower;

public class Runner {
public static void main(String[] args) throws IOException {
	StateAndSummPower Search = new StateAndSummPower();
	Search.StateNow();
	
}
}
