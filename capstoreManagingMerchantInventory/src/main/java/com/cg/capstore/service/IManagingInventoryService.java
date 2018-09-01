package com.cg.capstore.service;

import java.util.List;

import com.cg.capstore.bean.ProductBean;

public interface IManagingInventoryService {
	List<ProductBean> displayListOfProducts();
	ProductBean addNewProduct(ProductBean product);
	ProductBean updateProductDetails(ProductBean product);
	String deleteProduct(String productId);
	
	
	ProductBean getProductdetails(String productId);
	
	
	public List<ProductBean> displayAllCategory();
	public String removeExistingCategory(String category);
}
