package com.rmn.api.p322v2.main.general;

/* renamed from: com.rmn.api.v2.main.general.RequestCounter */
public final class RequestCounter {
    private int counter;

    public RequestCounter(int i) {
        this.counter = i;
    }

    public synchronized boolean decrementCounter() {
        boolean z;
        z = true;
        int i = this.counter - 1;
        this.counter = i;
        if (i > 0) {
            z = false;
        }
        return z;
    }

    public synchronized boolean isFinished() {
        boolean z;
        if (this.counter <= 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
