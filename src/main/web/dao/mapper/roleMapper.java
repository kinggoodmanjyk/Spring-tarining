package dao.mapper;

import dao.model.role;
import dao.model.roleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface roleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    long countByExample(roleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    int deleteByExample(roleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    int insert(role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    int insertSelective(role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    List<role> selectByExample(roleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") role record, @Param("example") roleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Mon Apr 23 16:56:45 CST 2018
     */
    int updateByExample(@Param("record") role record, @Param("example") roleExample example);
}