package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.vo.DishVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DishMapper {

    /**
     * 根据分类id查询菜品数量
     * @param categoryId
     * @return
     */
    @Select("select count(id) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);

    void insert(Dish dish);

    Page<DishVO> pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 根据主键查询菜品
     *
     * @param id
     * @return
     */
    @Select("select * from dish where id = #{id}")
    Dish getById(Long id);

    /**
     * 根据主键删除菜品数据
     *
     * @param id
     */
    @Delete("delete from dish where id = #{id}")
    void deleteById(Long id);
}
