package androidx.compose.p002ui.util;

import android.os.Trace;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.util.AndroidTrace_androidKt */
/* compiled from: AndroidTrace.android.kt */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(String str, C13074a<? extends T> aVar) {
        C12775o.m28639i(str, "sectionName");
        C12775o.m28639i(aVar, "block");
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            Trace.endSection();
            C12773m.m28628a(1);
        }
    }
}
