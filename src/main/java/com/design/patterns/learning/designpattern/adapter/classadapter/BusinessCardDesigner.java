package com.design.patterns.learning.designpattern.adapter.classadapter;

public class BusinessCardDesigner {

   public String designCard(Customer customer) {
      return new StringBuilder().append(customer.getFullName())
      .append(" ")
      .append(customer.getOccupation())
      .append(" ")
      .append(customer.getAddress()).toString();
   }

}