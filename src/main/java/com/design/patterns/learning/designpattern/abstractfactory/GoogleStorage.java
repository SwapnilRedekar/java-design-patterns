package com.design.patterns.learning.designpattern.abstractfactory;

public class GoogleStorage implements Storage {

   public GoogleStorage(int capacityInMib) {
     System.out.println("Allocated " + capacityInMib + " on Google cloud.");
   }

   @Override
   public String getId() {
       return "gcpscs1";
   }

   @Override
   public String toString() {
       return "Google Storage";
   }
}
