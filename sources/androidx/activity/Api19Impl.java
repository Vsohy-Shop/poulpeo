package androidx.activity;

import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(19)
/* compiled from: PipHintTracker.kt */
public final class Api19Impl {
    public static final Api19Impl INSTANCE = new Api19Impl();

    private Api19Impl() {
    }

    public final boolean isAttachedToWindow(View view) {
        C12775o.m28639i(view, "view");
        return view.isAttachedToWindow();
    }
}
