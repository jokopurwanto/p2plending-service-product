package com.p2plending.product.controller;

import com.p2plending.product.dto.ProductCreateDto;
import com.p2plending.product.dto.ProductUpdateDto;
import com.p2plending.product.service.imple.ProductService;
import com.p2plending.product.handler.RespHandler;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ProductController {

    @Autowired
    ProductService borrowerService;



    @PostMapping("/product")
    public ResponseEntity<Object> createProductDetails(@RequestBody @Valid ProductCreateDto productCreateDto){
        return RespHandler.responseBuilder("sukses, data telah berhasil di-simpan",HttpStatus.OK, borrowerService.createProduct(productCreateDto));
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<?> updateProductDetails(@RequestBody @Valid ProductUpdateDto productUpdateDto, @PathVariable Integer id){
        return RespHandler.responseBuilder("sukses, data catalog telah berhasil di-update",HttpStatus.OK, borrowerService.updateProduct(productUpdateDto, id));
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Object> getProductDetails(@PathVariable Integer id){
        return RespHandler.responseBuilder("sukses, berikut detail data product",HttpStatus.OK, borrowerService.getProduct(id));
    }

    @GetMapping("/product")
    public ResponseEntity<Object> listProductDetails(){
        return RespHandler.responseBuilder("sukses, berikut list semua data product",HttpStatus.OK, borrowerService.getAllCProduct());
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Object> deleteProductDetails(@PathVariable Integer id) {
        return RespHandler.responseBuilder("sukses, data telah berhasil di-delete",HttpStatus.OK, borrowerService.deleteProduct(id));
    }

}
