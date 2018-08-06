package com.jda.ObjectOrientedPrograms;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.StockPortifolio;

public class StockReport {
	public static void main(String args[]) throws IOException, ParseException {

		JSONParser parser = new JSONParser();

		JSONObject stockobj = (JSONObject) parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Input3.JSON"));
		String[] stocks = { "facebook", "alphabet"};
		HashMap<String, ArrayList<StockPortifolio>> StockMap = new HashMap<String, ArrayList<StockPortifolio>>();
		for (String stock : stocks) {
			StockMap.put(stock, StockMethods.readJsonArray(stockobj, stock));
		}
		StockMethods.printValue(StockMap);

	}


}
