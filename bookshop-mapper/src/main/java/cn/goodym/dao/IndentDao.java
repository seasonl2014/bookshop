package cn.goodym.dao;

import cn.goodym.pojo.Indent;
import cn.goodym.pojo.Items;

import java.util.List;

/**
 * Created by Administrator on 2019/4/8.
 */
public interface IndentDao {

    /**
     * 分页获取订单列表
     * @param page
     * @param rows
     */
    List<Indent> getList(int status, int page, int rows);

    /**
     * 获取总数
     * @return
     */
    long getTotal(int status);

    /**
     * 订单项列表
     * @param indentid
     * @param page
     * @param rows
     * @return
     */
    List<Items> getItemList(int indentid, int page, int rows);

    /**
     * 订单项总数
     * @return
     */
    long getItemTotal(int indentid);

    /**
     * 按用户名查找
     * @param userid
     * @return
     */
    List<Indent> getListByUserid(int userid);
}
