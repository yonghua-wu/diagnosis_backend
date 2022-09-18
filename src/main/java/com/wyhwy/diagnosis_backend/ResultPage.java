package com.wyhwy.diagnosis_backend;

import lombok.Data;

import java.util.List;

@Data
public class ResultPage<T> {
    private Integer current;
    private Integer size;
    private Integer total;
    private List<T> list;

    public ResultPage(Integer current, Integer size, Integer total, List<T> list) {
        this.current = current;
        this.size = size;
        this.total = total;
        this.list = list;
    }
}
