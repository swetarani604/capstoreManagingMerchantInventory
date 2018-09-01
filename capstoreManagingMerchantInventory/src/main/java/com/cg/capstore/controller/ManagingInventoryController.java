package com.cg.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capstore.bean.ProductBean;
import com.cg.capstore.service.IManagingInventoryService;




@RestController
public class ManagingInventoryController {
	
	@Autowired
	IManagingInventoryService managingInventoryService;
	
	@RequestMapping("/Hi")
	public String displayHello() {
		return "Hello from spring";
	}
	
	
	@RequestMapping(value = "/displayAllProducts",method=RequestMethod.POST)
	List<ProductBean> displayAllProducts() {
		
		return managingInventoryService.displayListOfProducts();
		
	}
	
	@RequestMapping(value = "/addNewProduct", method = RequestMethod.POST)
	ProductBean addNewProduct(@RequestBody ProductBean product) {
		return managingInventoryService.addNewProduct(product);
	}
	
	@RequestMapping(value = "/updateProductDetails",method=RequestMethod.PUT)
	public ProductBean updateProductDetails(@RequestBody ProductBean product) {
		
		return managingInventoryService.updateProductDetails(product);
	}
	
	@RequestMapping(value = "/deleteProduct",method=RequestMethod.DELETE)
	public String deleteProduct(String productId) {
		
		return managingInventoryService.deleteProduct(productId);
	}
	
	
	
	@RequestMapping(value = "/getProductdetails",method=RequestMethod.POST)
	public ProductBean getProductdetails(String productId) {
		
		return managingInventoryService.getProductdetails(productId);
	}
	
	@RequestMapping(value = "/removeExistingCategory",method=RequestMethod.DELETE)
	public String removeExistingCategory(String category) {
		
		return managingInventoryService.removeExistingCategory(category);
	}
	
	@RequestMapping(value="/displayAllCategory", method=RequestMethod.POST)
	public List<ProductBean> displayAllCategory(String category) {
		return managingInventoryService.displayAllCategory();
	}
	
}