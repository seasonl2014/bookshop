package cn.goodym.dao;

import cn.goodym.pojo.Admin;

import java.util.List;

/**
 * Created by Administrator on 2019/4/7.
 */
public interface AdminDao {

    /**
     * 通过用户名查找
     * @param username
     * @return
     */
    Admin getByUsername(String username);

    /**
     * 通过用户名和密码查找
     * @param username
     * @param password
     * @return 无记录返回null
     */
    Admin getByUsernameAndPassword(String username, String password);

    /**
     * 获取列表
     * @param page
     * @param rows
     * @return 无记录返回空集合
     */
    List<Admin> getList(int page, int rows);

    /**
     * 总数
     * @return
     */
    long getTotal();
}
