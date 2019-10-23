package com.bhu.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhu.shoppingbackend.dao.CategoryDAO;
import com.bhu.shoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","HOME");
		
		//passsing the list of category
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","About US");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","Contact US");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	
	/*
	 * Method to load all products and products by category
	 * */
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts() {
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title","All Products");
		
		//passsing the list of category
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		
		ModelAndView mv= new ModelAndView("page");
		
		//CategoryDAO to fetch a Single Category
		Category category=null;
		
		category=categoryDAO.get(id);
			
		mv.addObject("title",category.getName());
		
		//passsing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		//passsing the list of category
		mv.addObject("category",category);
				
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
}
