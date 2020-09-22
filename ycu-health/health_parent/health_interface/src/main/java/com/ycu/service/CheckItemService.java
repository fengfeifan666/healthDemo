package com.ycu.service;

import com.ycu.entity.PageResult;
import com.ycu.pojo.CheckItem;

import java.util.List;

/**
 * 服务接口
 */
public interface CheckItemService {
    public void add(CheckItem checkItem);
    //分页查询方法
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String querySting);

    public void delete(Integer id);

    public void edit(CheckItem checkItem);

    public CheckItem findById(Integer id);

    public List<CheckItem> findAll();
}
