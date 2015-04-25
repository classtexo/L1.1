package com.java.lessons.l1.iface.lib;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GenericItem implements IfaceReadable{
	public void readText(String jsonItem) {
		System.out.println("Inner print : " + this.getClass().getName());
		
		try {
			JSONObject json = (JSONObject)new JSONParser().parse(jsonItem);
			Object itemObj= null; // <<< David - je to OK?
			
			switch (json.get("itemType").toString()) {

              case "b":  itemObj = new Book();
                         ((Book) itemObj).readText(jsonItem);
                         break;
              case "m":  itemObj = new Magazine();
                         ((Magazine) itemObj).readText(jsonItem);
                         break;
              case "n":  itemObj = new NewsPaper();
                         ((NewsPaper) itemObj).readText(jsonItem);
                         break;
              default:   System.out.println("Neznamy typ polozky!");
                         break;
             }
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("JSON Parser error! Typ nenalezen!");
		} finally {System.out.println("\n");}
		
	}
}

