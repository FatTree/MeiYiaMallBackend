package dao;

import entity.OrderList;
import entity.OrderListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    long countByExample(OrderListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    int deleteByExample(OrderListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    int insert(OrderList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    int insertSelective(OrderList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    List<OrderList> selectByExample(OrderListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    OrderList selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrderList record, @Param("example") OrderListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrderList record, @Param("example") OrderListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_LIST
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderList record);
}