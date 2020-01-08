package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Itemimage;
import com.service.IitemImageService;

public class ItemImageTest {

ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    IitemImageService is = (IitemImageService) context.getBean("itemImageServiceImpl");
	
	 @Test
	public void testAddImage(){
		Itemimage img = new Itemimage();
		img.setId(3);
		img.setIid(3);
		img.setPic("/user/pic.png");	
		System.out.println(is.insert(img));		
	}
	@Test
	 public void testSelectByIid(){
		 
		 System.out.println(is.get(3));
	 }
	 
	@Test
	 public void testUpdateImg(){
		Itemimage img = new Itemimage();
		img.setId(3);
	
		img.setPic("/admin/pic.png");	
		 System.out.println(is.update(img));
		 
	 }
	 
	@Test
	public void testListAllImg(){
		
		List<Itemimage> listAllItemImg = is.listAllItemImg(3);
		for (Itemimage itemimage : listAllItemImg) {
			System.out.println(itemimage);
		}
	}
	
	
}
