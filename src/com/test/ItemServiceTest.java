package com.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Item;
import com.pojo.Itemimage;
import com.service.IitemImageService;
import com.service.IitemService;

public class ItemServiceTest {

	ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
    IitemService is = (IitemService) context.getBean("itemServiceImpl");

 @Test
 public void testfillOwnUserByUid(){
	 
	 Item item = new Item();
	 item.setUid(1);
	 is.fillOwnUserByUid(item);
	 System.out.println(item.getOwnUser());
		 
 }
 
 
 
 @Test
 public void fillFirstImageById(){
	 
	 Item item = new Item();
	 item.setId(3);
	 is.fillFirstImageById(item);
	 System.out.println(item.getFirstImage());
		 
 }
 
 
 @Test
 public void fillItemimagesById(){
	 
	 Item item = new Item();
	 item.setId(3);
	 is.fillItemimagesById(item);
	List<Itemimage> itemimages = item.getItemimages();
	for (Itemimage itemimage : itemimages) {
		System.out.println(itemimage);
	}
		 
 }
 
 
 @Test
 public void ListAllByDESC(){
	 
       List<Item> listAllItem = is.listAllItemDESC();
for (Item item : listAllItem) {
	System.out.println(item);
}
		 
 }
 
 
 @Test
 public void ListAllByStateDESC(){
	 
       List<Item> listAllItem = is.listAllItemByStateDESC(1);
   for (Item item : listAllItem) {
	System.out.println(item);
   }
		 
 }
 
 
 @Test
 public void getItemByCid(){
	 
       List<Item> listAllItem = is.listAllItemByStateAndCid(1,3);
   for (Item item : listAllItem) {
	    System.out.println(item);
   }
		 
 }
 
 
 
 @Test
 public void getItemInsert(){
	 
	 Item item = new Item();
	 item.setCid(1);
	 item.setUid(1);
	 item.setTitle("414645");
	 
	 item.setContact("1");
	
	 item.setCounttype("1");
	 item.setBasepayment(1);
	 item.setCreatedate(new Date());
	 
	 item.setMaxtime(10);
	 item.setMintime(120);
	 item.setOvertimemoney(1000);
	 item.setDeposit(10);
	 item.setRenewable(10);
	 item.setRentalstate(1);
	 
	 //System.out.println(is.insert(item));
	 
	 
	 System.out.println(item.getId());
		 
 }
 
	
}
