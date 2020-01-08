package com.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.util.Commons;
import com.pojo.Itemimage;
import com.service.IitemImageService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/*import com.coms.Commons;
 import com.rental_me.pojo.Itemimage;
 import com.service.IitemImageService;
 import com.sun.jersey.api.client.Client;
 import com.sun.jersey.api.client.WebResource;*/

@Controller
@RequestMapping("")
public class ItemImageController {


	@Autowired
	private IitemImageService IitemImage;

	@RequestMapping("insert")
	public String insertItem(Model m) {
		Itemimage item = new Itemimage();
		m.addAttribute("items", item);
		return "insertItem";
	}

	/*-----------------------------�������ͼƬ--------------------------*/
	@RequestMapping("insertIitem")
	public String insertIitem(Itemimage item) {
		item.setIid(2);
		return "redirect:/ItemImageController/selectAll.do";
	}

	// ͼƬ�ϴ���ǰ������request����˻��ԣ�

	@RequestMapping("uploadPicAjax")
	@ResponseBody
	public Object uploadPic(HttpServletRequest request, String fileName) {
		Map<String, String> resp_map = new HashMap<>();
		System.out.println("111122344");
		MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
		CommonsMultipartFile cm = (CommonsMultipartFile) mh.getFile(fileName);
		byte[] fbytes = cm.getBytes();

		String newFileName = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		newFileName = sdf.format(new Date());

		Random r = new Random();

		for (int i = 0; i < 3; i++) {
			newFileName = newFileName + r.nextInt(10);
		}

		String originalFilename = cm.getOriginalFilename();
		String suffix = originalFilename.substring(originalFilename
				.lastIndexOf("."));

		Client client = Client.create();
		// ���ļ�������Զ�̷�����
		WebResource resource = client.resource(Commons.SERVER_URI + "/upload/"
				+ newFileName + suffix);
		// �ϴ�
		resource.put(String.class, fbytes);

		/*
		 * ajax�ص�������Ҫ��д��дʲô������ 1��ͼƬ��Ҫ���ԣ���ҪͼƬ����·��
		 * 2�����ݿⱣ��ͼƬ�����·��.
		 */
		String fullPath = Commons.SERVER_URI + "/upload/" + newFileName
				+ suffix;

		String relativePath = "/upload/" + newFileName + suffix;

		HttpSession session = request.getSession();
		Set<String> userImageSet = (Set<String>) session.getAttribute("userImageSet");
		if (userImageSet == null) {
			userImageSet = new TreeSet<String>();
		}
		userImageSet.add(relativePath);
		session.setAttribute("userImageSet", userImageSet);
		resp_map.put("fullPath", fullPath);
		resp_map.put("relativePath", relativePath);
		return resp_map;

	}
}
