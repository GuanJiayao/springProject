package com.zhangyao.utils;

/**
 * Created by zhangyao on 21/10/16.
 */
public class SearchOption {

    private int pageSize = 10;
    private int currentPage = 0;
    private String condition = " 1=1 ";
    private String orderBy = "id";
    private String orderKey = "DESC";
    private String field = "*";
    private int offSet = pageSize * currentPage;

    public SearchOption() {
    }

    public SearchOption(int pageSize, int currentPage, String condition, String orderBy, String orderKey) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.condition = condition;
        this.orderBy = orderBy;
        this.orderKey = orderKey;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        this.offSet = pageSize * currentPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        this.offSet = pageSize * currentPage;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }

    public String getField() {
        return field;
    }

    public void setField(String[] fields) {
        if (fields.length != 0) {
            this.field = fields[0];
            for (int i = 1; i < fields.length; i++) {
                this.field += " , " + fields[i];
            }
        }

        System.out.println(this.field);

    }
}
