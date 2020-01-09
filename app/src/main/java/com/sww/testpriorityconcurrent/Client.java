package com.sww.testpriorityconcurrent;

import com.sww.testpriorityconcurrent.callback.ClientCallback;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

    private PriorityConcurrentWorker priorityConcurrentWorker;

    /**
     * 并发请求
     */
    public void loadThirdAdData(ArrayList<String> list, ClientCallback callback) {
        if (list == null || list.size() == 0 || callback == null) return;
        priorityConcurrentWorker = new PriorityConcurrentWorker(list);
        priorityConcurrentWorker.loadThirdAdData();
    }

    /**
     * 取消
     */
    public void cancel() {
        if (priorityConcurrentWorker != null) priorityConcurrentWorker.cancel();
    }

}
