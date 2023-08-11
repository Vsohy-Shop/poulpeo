package com.rmn.api.p322v2.main.debug;

import com.rmn.api.p322v2.main.oauth.BundleRequest;

/* renamed from: com.rmn.api.v2.main.debug.DebugRequestManager */
public class DebugRequestManager {
    public static boolean ENABLED = false;
    public static boolean RETRY_WITH_NETWORK_IF_NULL_RESPONSE = false;
    private static volatile DebugRequestManager instance;
    private AbstractDebugRequestMapper requestMapper;
    private long responseDelay = 0;

    private DebugRequestManager() {
    }

    public static final DebugRequestManager getInstance() {
        if (instance == null) {
            synchronized (DebugRequestManager.class) {
                if (instance == null) {
                    instance = new DebugRequestManager();
                }
            }
        }
        return instance;
    }

    public String getFakeResponse(BundleRequest bundleRequest) {
        AbstractDebugRequestMapper abstractDebugRequestMapper = this.requestMapper;
        if (abstractDebugRequestMapper != null) {
            long j = this.responseDelay;
            if (j > 0) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                }
            }
            return abstractDebugRequestMapper.getFakeResponse(bundleRequest);
        }
        throw new IllegalStateException("DebugRequestManager must have a IDebugRequestMapper");
    }

    public void setRequestMapper(AbstractDebugRequestMapper abstractDebugRequestMapper) {
        if (abstractDebugRequestMapper != null) {
            this.requestMapper = abstractDebugRequestMapper;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setResponseDelay(long j) {
        if (j >= 0) {
            this.responseDelay = j;
            return;
        }
        throw new IllegalArgumentException();
    }
}
