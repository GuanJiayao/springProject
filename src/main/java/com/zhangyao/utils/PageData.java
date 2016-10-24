package com.zhangyao.utils;

import java.util.List;

/**
 * Created by zhangyao on 21/10/16.
 */
public class PageData {
    private int allCount;
    private int pageSize;
    private int currentPage;
    private List data;

    public PageData(int allCount, int pageSize, int currentPage, List data) {
        this.allCount = allCount;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.data = data;
    }

    public int getAllCount() {
        return allCount;
    }

    public void setAllCount(int allCount) {
        this.allCount = allCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
