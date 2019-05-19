package com.itheima.ssm.mapper;

import com.itheima.ssm.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    List<Product> queryProductList() throws Exception;

    void saveProduct(Product product) throws Exception;

    Product queryProductById(Long id) throws Exception;

    void updateProduct(Product product) throws Exception;

    void deleteProducts(Long[] ids) throws Exception;

    Long queryProductCount() throws Exception;

    // @Param注解将形参参数放入map中，map的key即为注解中的value值
    // Mybatis的parameterType接收参数的时候固定为map
    List<Product> queryProductListPage(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize) throws Exception;
}
