package com.sww.testpriorityconcurrent.model;

import java.util.ArrayList;

public class ResourceModel {

    /*请求优先级队列*/
    private ArrayList<String> list;
    /*请求的总超时时长 单位：毫秒*/
    private int totalTime = 5000;
    /*请求的最大并发数 */
    private int concurrentNum = 3;

    public ResourceModel(ArrayList<String> list, int totalTime, int concurrentNum) {
        this.list = list;
        this.totalTime = totalTime;
        this.concurrentNum = concurrentNum;
    }

    public ArrayList<String> getList() {
        if (list == null) list = new ArrayList<>();
        return list;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getConcurrentNum() {
        return concurrentNum;
    }
}
