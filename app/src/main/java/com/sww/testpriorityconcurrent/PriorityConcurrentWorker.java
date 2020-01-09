package com.sww.testpriorityconcurrent;

import com.sww.testpriorityconcurrent.model.ResourceModel;
import com.sww.testpriorityconcurrent.service.BaseService;
import com.sww.testpriorityconcurrent.service.ChinaService;
import com.sww.testpriorityconcurrent.service.UsaService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 带有优先级的并发请求
 */
public class PriorityConcurrentWorker {

    private static final int STATUS_INITIAL = 0;
    private static final int STATUS_RUNNING = 1;
    private static final int STATUS_FINISHED = 2;
    /** 当前执行状态 */
    private AtomicInteger status;

    private ResourceModel resourceModel;
    private final LinkedList<BaseService> mReadyQueue;
    private final Map<BaseService,Integer> mRunningMap;



    public PriorityConcurrentWorker(ResourceModel resourceModel) {
        this.status = new AtomicInteger(STATUS_INITIAL);
        this.resourceModel = resourceModel;
        this.mReadyQueue = new LinkedList<>();
        this.mRunningMap = new ConcurrentHashMap<>(3);
    }

    public void loadThirdAdData() {
        /* 超时计时开始 */
        postTimeoutRunnable();
        List<BaseService> services = new ArrayList<>();
        for (String serviceName : resourceModel.getList()) {
            if (serviceName.equalsIgnoreCase("china")){
                services.add(new ChinaService(serviceName));
            } else  if (serviceName.equalsIgnoreCase("usa")){
                services.add(new UsaService(serviceName));
            } else  if (serviceName.equalsIgnoreCase("haha")){

            }
        }
        /* 发起请求首轮请求 */
        scheduleNext();
    }

    private void scheduleNext() {

    }

    public void cancel() {

    }

    public void postTimeoutRunnable() {

    }

    public void onSuccess() {

    }

    public void onFail() {

    }

}
