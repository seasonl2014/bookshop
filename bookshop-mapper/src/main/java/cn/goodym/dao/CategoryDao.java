package cn.goodym.dao;

import cn.goodym.pojo.Category;

import java.util.List;

/**
 * Created by Administrator on 2019/4/8.
 */
public interface CategoryDao {

    /**
     * 获取列表
     * @return
     */
    List<Category> getList();

    /**
     * 获取列表
     * @param rows
     * @param page
     * @return 无记录返回空集合
     */
    List<Category> getList(int page, int rows);

    /**
     * 总数
     * @return
     */
    long getTotal();
}
