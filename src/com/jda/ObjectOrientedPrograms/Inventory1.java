package com.jda.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.Inventory;
import com.jda.utility.Utility;

public class Inventory1 {

	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
		
			Utility utility = new Utility();
			JSONParser parser = new JSONParser();
		

			JSONObject inventoryobj = (JSONObject) parser.parse(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Input1.JSON"));
			String[] inventories = { "rice", "pulses", "wheat" };
			HashMap<String, ArrayList<Inventory>> MapofInventory = new HashMap<String, ArrayList<Inventory>>();
			for (String inventory : inventories) {
				 MapofInventory.put(inventory, InventoryMethods.readJsonArray(inventoryobj, inventory));
				
			}
			System.out.println(MapofInventory);
			
			int choice;
			do {
				System.out.println("please enter the operation you want to perform,To add product(1),To remove product(2), To print value of a inventory(3)");
				System.out.println("");
				choice = utility.inputInt();
				switch (choice) {
				case 1: {
					InventoryMethods.additem(MapofInventory);
					break;
				}
				case 2: {
					System.out.println("please enter the inventory name in which you want to remove  product");
					String inventorytodelete = utility.inputString();
					System.out.println("please enter the product name");
					String delete = utility.inputString();

					InventoryMethods.removeitem(MapofInventory, inventorytodelete, delete);
					break;

				}
				case 3: {
					InventoryMethods.printValue(MapofInventory);
					break;
				}
				case 4: {
					InventoryMethods.printJSONinaFile(MapofInventory);
					//InventoryMehtods.toFile(MapofInventory);
					
					break;
					
				}
				
				}
			} while (choice != 0);

		}
	}
