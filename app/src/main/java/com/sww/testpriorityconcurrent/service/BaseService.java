package com.sww.testpriorityconcurrent.service;

public abstract class BaseService {

    private String serviceName;

    public BaseService(String serviceName) {
        this.serviceName = serviceName;
    }

    public abstract void onSuccess();

    public abstract void onFail();

}
