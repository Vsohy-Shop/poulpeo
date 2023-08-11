package p364io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.l2 */
/* compiled from: TimeProvider */
public interface C12356l2 {

    /* renamed from: a */
    public static final C12356l2 f19618a = new C12357a();

    /* renamed from: io.grpc.internal.l2$a */
    /* compiled from: TimeProvider */
    class C12357a implements C12356l2 {
        C12357a() {
        }

        /* renamed from: a */
        public long mo49993a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    long mo49993a();
}
