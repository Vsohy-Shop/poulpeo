package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import kotlin.jvm.internal.C12775o;

/* compiled from: ActualAndroid.android.kt */
public final class Trace {
    public static final Trace INSTANCE = new Trace();

    private Trace() {
    }

    public final Object beginSection(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        android.os.Trace.beginSection(str);
        return null;
    }

    public final void endSection(Object obj) {
        android.os.Trace.endSection();
    }
}
