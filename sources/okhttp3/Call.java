package okhttp3;

import okio.C13181z0;

/* compiled from: Call.kt */
public interface Call extends Cloneable {

    /* compiled from: Call.kt */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C13181z0 timeout();
}
