package com.java.lessons.l1.iface;

import com.java.lessons.l1.iface.lib.Book;
import com.java.lessons.l1.iface.lib.GenericItem;
import com.java.lessons.l1.iface.lib.Magazine;
import com.java.lessons.l1.iface.lib.NewsPaper;
import com.java.lessons.l1.iface.lib.constants;

/*1. definuj interface(rozhrani) IReadable s public metodou readText()
  2. vytvor tridy, ktere implementuji rozhrani IReadable:
     Newspaper (metoda readText vypíše "Text of newspaper")
     Magazine (metoda readText vypíše "Text of magazine")
     Book (metoda readText vypíše "Text of book")
  3. Vytvoř nové objekty, které jsou přechozích typů, zavolej na nich tyto metody.*/

/*Ucel rozsireni prikladu je rozlisit implementace pro ruzne typy polozek
  ktere se zpracovavaji temer stejne, pouze dle typu se zpracovavaji jina struktura atributu
  vedenych u polozek (napr. kniha nema periodicitu, newspaper nema autora.
  INTERFACE - zavazny list implementaci pro zpracovani polozek
              s vyctem signatur
  IMPLEMENTACE - pro kazdy typ pouzita trida s upravenou implementaci ktera
                 pracuje se specifickymi atributy daneho typu            
  */

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Java started...\n");
    
	 // Constructors
		Book bookObj           = new Book();
		Magazine magazineObj   = new Magazine();
		NewsPaper newsPaperObj = new NewsPaper();

		bookObj.readText(     constants.JSON_BOOK_ITEM     );
		magazineObj.readText( constants.JSON_MAGAZINE_ITEM );
		newsPaperObj.readText(constants.JSON_NEWSPAPER_ITEM);
		
		GenericItem gItem = new GenericItem();
		gItem.readText(constants.JSON_BOOK_ITEM ); 
		
		
	}

}



/*JSONObject json = (JSONObject)new JSONParser().parse("{\"name\":\"MyNode\", \"width\":200, \"height\":100}");
System.out.println("name=" + json.get("name"));
System.out.println("width=" + json.get("width"));*/
