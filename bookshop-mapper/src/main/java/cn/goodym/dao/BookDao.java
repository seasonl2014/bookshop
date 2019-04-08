package cn.goodym.dao;

import cn.goodym.pojo.Book;

import java.util.List;

/**
 * Created by Administrator on 2019/4/8.
 */

public interface BookDao {

    /**
     * 	通过名称搜索
     * @param name
     * @param page
     * @param size
     * @return
     */
    List<Book> getList(String name, int page, int size);

    /**
     * 	获取名称总数
     * @param  name
     * @return
     */
    long getTotal(String name);

    /**
     * 	通过分类搜索
     * @param category
     * @param page
     * @param size
     * @return
     */
    List<Book> getCategoryList(int category, int page, int size);

    /**
     * 	获取分类总数
     * @param category 1推荐/2新书/3特价
     * @return
     */
    long getCategoryTotal(int category);

    /**
     * 	获取特卖列表
     * @param type 1推荐/2新书/3特价
     * @param page
     * @param size
     * @return
     */
    List<Book> getSpecialList(int type, int page, int size);

    /**
     * 	获取特卖总数
     * @param type 1推荐/2新书/3特价
     * @return
     */
    long getSpecialTotal(int type);

    /**
     * 获取列表
     * @param page
     * @param rows
     * @return 无记录返回空集合
     */
    List<Book> getList(int status, int page, int rows);

    /**
     * 总数
     * @return
     */
    long getTotal(int status);

}
