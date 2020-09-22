package com.ycu.service;

import com.ycu.entity.PageResult;
import com.ycu.entity.QueryPageBean;
import com.ycu.pojo.CheckGroup;

public interface CheckGroupService {
    public void add(CheckGroup checkGroup,Integer[] checkitemIds);

    PageResult pageQuery(QueryPageBean queryPageBean);
}
