package androidx.core.p004os;

import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* renamed from: androidx.core.os.TraceKt */
/* compiled from: Trace.kt */
public final class TraceKt {
    public static final <T> T trace(String str, C13074a<? extends T> aVar) {
        C12775o.m28639i(str, "sectionName");
        C12775o.m28639i(aVar, "block");
        TraceCompat.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            TraceCompat.endSection();
            C12773m.m28628a(1);
        }
    }
}
