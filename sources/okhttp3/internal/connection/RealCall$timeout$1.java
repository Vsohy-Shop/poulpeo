package okhttp3.internal.connection;

import okio.C13110a;

/* compiled from: RealCall.kt */
public final class RealCall$timeout$1 extends C13110a {
    final /* synthetic */ RealCall this$0;

    RealCall$timeout$1(RealCall realCall) {
        this.this$0 = realCall;
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
        this.this$0.cancel();
    }
}
