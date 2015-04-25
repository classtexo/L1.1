package com.java.lessons.l1.iface.lib;

/*1. definuj interface(rozhrani) IReadable s public metodou readText()
2. vytvor tridy, ktere implementuji rozhrani IReadable:
   Newspaper (metoda readText vypíše "Text of newspaper")
   Magazine (metoda readText vypíše "Text of magazine")
   Book (metoda readText vypíše "Text of book")
3. Vytvoř nové objekty, které jsou přechozích typů, zavolej na nich tyto metody.*/


public interface IfaceReadable {
  public void readText(String jsonItem);

//void readText(String jsonItem);    
  
/*  Doprkynka, k cemu je to dobre, to je fakt jen abych vydefinoval co si mam vsechno naprogramovat?
    Vylozene mi unika ucel proc si tady pisu na co nemam zapomet.	*/	  
  
}
