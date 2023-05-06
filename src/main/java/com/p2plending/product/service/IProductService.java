package com.p2plending.product.service;

import com.p2plending.product.dto.ProductCreateDto;
import com.p2plending.product.dto.ProductUpdateDto;
import com.p2plending.product.model.ProductModel;

import java.util.List;
import java.util.Map;

public interface IProductService {
    public ProductModel createProduct(ProductCreateDto productCreateDto);
    public ProductModel updateProduct(ProductUpdateDto productUpdateDto, Integer id);
    public Map<String, Object> deleteProduct(Integer id);
    public ProductModel getProduct(Integer id);
    public List<ProductModel> getAllCProduct();



}
