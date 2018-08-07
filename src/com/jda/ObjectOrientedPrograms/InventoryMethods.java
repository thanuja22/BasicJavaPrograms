package com.jda.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.jda.utility.Inventory;
import com.jda.utility.Utility;

public class InventoryMethods {
	public static void toFile(HashMap<String, ArrayList<Inventory>> map) {
		JSONObject obj = new JSONObject();
		int k = 0;
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next().toString();
			ArrayList<Inventory> i = map.get(key);
			JSONArray jarray = new JSONArray();
			int j = 0;
			while (j < i.size()) {
				Inventory inven = new Inventory(obj);
				inven.setname(i.get(j).getname());
				inven.setweight(i.get(j).getweight());
				inven.setpriceperkg(i.get(j).getpriceperkg());
				jarray.add(inven);
				j++;
			}
			obj.put(key, jarray);
			k++;
		}

		try (FileWriter file = new FileWriter("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\ObjectOrientedPrograms\\Input1.JSON")) {

			obj.writeJSONString(file);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void printToFile(String filePath, Object object) {
	    try (PrintWriter out = new PrintWriter(filePath)) {
	      out.println(object);
	    } catch (FileNotFoundException e) {
	      System.out.println("Writing invalid");
	    }
	  }
	  
	
	public static void printJSONinaFile(HashMap<String, ArrayList<Inventory>> inventoryMap) {
		StringBuilder jsonstring = createJSONString(inventoryMap);
		String filePath = "C:\\\\Users\\\\1022281\\\\git\\\\BasicJavaPrograms\\\\src\\\\com\\jda\\ObjectOrientedPrograms\\Input1.JSON";
		printToFile(filePath, inventoryMap);
		try {
			PrintWriter output = new PrintWriter(new File("filePath"));
			output.print(jsonstring);
			output.flush();
			output.close();
		} catch (Exception e) {
			System.out.println("invalid");
		}
		

	}

	/**
	 * removes item from the JSONfile
	 * 
	 * @param inventoryMap
	 * @param inventory
	 * @param item
	 */
	public static void removeitem(HashMap<String, ArrayList<Inventory>> inventoryMap, String inventory, String item) {
		Iterator<String> iterator = inventoryMap.keySet().iterator();  
		
		System.out.println("atul" + inventoryMap.keySet());
		int check = 0;
		while (iterator.hasNext()) {
			
			if (((String) iterator.next()).compareTo(inventory) == 0) {
				for (int i = 0; i < inventoryMap.get(inventory).size(); i++) {
					if ((inventoryMap.get(inventory).get(i).getname()).compareTo(item) == 0) {

						inventoryMap.get(inventory).remove(i);
						check = 1;
					}
				}

			}

		}
		if (check == 0)
			System.out.println("Not found inventory with the given name");
		else {
			printJSONinaFile(inventoryMap);
			System.out.println("update JSON file");
		}
	}

	/**
	 * adds new item to a particular inventory
	 * 
	 * @param inventoryMap
	 * @param inventory
	 */
	public static void additem(HashMap<String, ArrayList<Inventory>> inventoryMap) {
		Utility utility = new Utility();
		System.out.println("enter the inventory  name");
		String inventory = utility.inputString();
		System.out.println("please enter the new product name");
		String name = utility.inputString();
		System.out.println("please enter the weight of the inventory");
		long weight = utility.inputInt();
		System.out.println("please enter the priceperkg");
		long priceperkg = utility.inputInt();
		Inventory obj = new Inventory(name, weight, priceperkg);
		if (inventoryMap.get(inventory) == null) {
			System.out.println("No such inventory found ,So added a new inventory");
			ArrayList<Inventory> items = new ArrayList<>();
			System.out.println(items);
			inventoryMap.put(inventory, items);
		}
		inventoryMap.get(inventory).add(obj);
		printJSONinaFile(inventoryMap);
		System.out.println("updated JSON file");
	}

	
	public static ArrayList<Inventory> readJsonArray(JSONObject inventory, String itemname) {
		ArrayList<Inventory> items = new ArrayList<>();
		for (Object anInventory : (JSONArray) inventory.get(itemname)) {
			items.add(new Inventory((JSONObject) anInventory));		
		}
		return items;
	}

	public static StringBuilder createJSONString(HashMap<String, ArrayList<Inventory>> inventoryMap) {
		StringBuilder jsonstring = new StringBuilder();
		jsonstring.append("{");
		Iterator<String> iterator = inventoryMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			jsonstring.append("\"").append(key).append("\":")
					.append(Utility.createJsonfromArray(inventoryMap.get(key)));
			if (iterator.hasNext())
				jsonstring.append(",");
			
		}
		jsonstring.append("}");
		System.out.println(jsonstring);
		return jsonstring;
		
	}

	public static void printValue(HashMap<String, ArrayList<Inventory>> inventoryMap) {

		for (String key : inventoryMap.keySet()) {
			System.out.println(key + " is worth " + calculateValueOf(inventoryMap.get(key)));
		}
	}

	
	public static long calculateValueOf(ArrayList<Inventory> types) {
		long value = 0;
		for (int i = 0; i < types.size(); i++) {
			value += types.get(i).value();

		}
		return value;

	}
}
