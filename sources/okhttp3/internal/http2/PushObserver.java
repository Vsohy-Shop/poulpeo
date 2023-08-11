package okhttp3.internal.http2;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import okio.C13130e;

/* compiled from: PushObserver.kt */
public interface PushObserver {
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: PushObserver.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: PushObserver.kt */
        private static final class PushObserverCancel implements PushObserver {
            public boolean onData(int i, C13130e eVar, int i2, boolean z) {
                C12775o.m28639i(eVar, APIParams.SOURCE);
                eVar.skip((long) i2);
                return true;
            }

            public boolean onHeaders(int i, List<Header> list, boolean z) {
                C12775o.m28639i(list, "responseHeaders");
                return true;
            }

            public boolean onRequest(int i, List<Header> list) {
                C12775o.m28639i(list, "requestHeaders");
                return true;
            }

            public void onReset(int i, ErrorCode errorCode) {
                C12775o.m28639i(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i, C13130e eVar, int i2, boolean z);

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
