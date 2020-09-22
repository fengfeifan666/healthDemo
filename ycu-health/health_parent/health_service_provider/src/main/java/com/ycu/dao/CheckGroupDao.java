package com.ycu.dao;

import com.github.pagehelper.Page;
import com.ycu.pojo.CheckGroup;

import java.util.Map;

public interface CheckGroupDao {
    public void add(CheckGroup checkGroup);
    void setCheckGroupAndCheckItem(Map map);

    Page<CheckGroup> findByCondition(String queryString);
}
