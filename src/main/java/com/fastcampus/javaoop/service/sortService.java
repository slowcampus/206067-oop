package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.Sort;

import java.util.List;

public class sortService {

    private Sort<String> sort;

    public sortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {

        return sort.sort(list);
    }
}
