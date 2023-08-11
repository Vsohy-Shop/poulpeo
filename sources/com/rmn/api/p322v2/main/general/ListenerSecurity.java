package com.rmn.api.p322v2.main.general;

/* renamed from: com.rmn.api.v2.main.general.ListenerSecurity */
public final class ListenerSecurity {
    private boolean isListenerNotified = false;

    public synchronized void setListenerNotified() {
        if (!this.isListenerNotified) {
            this.isListenerNotified = true;
        } else {
            throw new IllegalStateException("The listener was notified twice");
        }
    }
}
