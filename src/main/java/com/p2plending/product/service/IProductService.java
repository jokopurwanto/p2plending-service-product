package com.p2plending.product.service;

import com.p2plending.product.dto.ProductCreateDto;
import com.p2plending.product.model.ProductModel;

import java.util.List;
import java.util.Map;

public interface IProductService {
    public ProductModel createProduct(ProductCreateDto productCreateDto);
    public Map<String, Object> updateProduct(ProductCreateDto productCreateDto);
    public Map<String, Object> deleteProduct(Integer id);
    public ProductModel getProduct(Integer id);
    public List<ProductModel> getAllCProduct();



}
