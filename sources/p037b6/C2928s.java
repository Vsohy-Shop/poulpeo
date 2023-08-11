package p037b6;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: b6.s */
public abstract class C2928s implements Closeable {
    /* renamed from: a */
    public abstract long mo28468a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract InputStream mo28469b(long j, long j2);

    /* renamed from: c */
    public synchronized InputStream mo28470c() {
        return mo28469b(0, mo28468a());
    }
}
