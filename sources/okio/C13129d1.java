package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12775o;
import p454wf.C13726d;

/* renamed from: okio.d1 */
/* compiled from: -JvmPlatform.kt */
public final class C13129d1 {
    /* renamed from: a */
    public static final byte[] m29611a(String str) {
        C12775o.m28639i(str, "<this>");
        byte[] bytes = str.getBytes(C13726d.f22152b);
        C12775o.m28638h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final ReentrantLock m29612b() {
        return new ReentrantLock();
    }

    /* renamed from: c */
    public static final String m29613c(byte[] bArr) {
        C12775o.m28639i(bArr, "<this>");
        return new String(bArr, C13726d.f22152b);
    }
}
