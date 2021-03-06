package dao;

import entity.ProductCategory;
import entity.ProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    long countByExample(ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    int deleteByExample(ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    int insert(ProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    int insertSelective(ProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    List<ProductCategory> selectByExample(ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    ProductCategory selectByPrimaryKey(String categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProductCategory record, @Param("example") ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProductCategory record, @Param("example") ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_CATEGORY
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProductCategory record);
}