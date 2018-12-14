package com.liaoin.frame.commons.response;

import java.util.List;

/**
 * 分页封装类
 *
 * @author 张权立
 * @date 2018/11/7 10:50
 */
public class PageBean<T> {
    private long total;
    private List<T> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
