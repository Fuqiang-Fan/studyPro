package com.studyPro.springboot.base;

import java.util.List;

/**
 * @author 范富强
 * @description
 * @date 2018/1/10 10:25
 */
public class Page<T> {
    private List<T> rows;
    private int count;
    private int pageSize;
    private int pageNum;

    public Page() {
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
