package com.squareup.okhttp.internal.framed;

import java.util.List;
import okio.C13130e;

public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() {
        public boolean onData(int i, C13130e eVar, int i2, boolean z) {
            eVar.skip((long) i2);
            return true;
        }

        public boolean onHeaders(int i, List<Header> list, boolean z) {
            return true;
        }

        public boolean onRequest(int i, List<Header> list) {
            return true;
        }

        public void onReset(int i, ErrorCode errorCode) {
        }
    };

    boolean onData(int i, C13130e eVar, int i2, boolean z);

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
