package androidx.core.view;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(16)
/* compiled from: View.kt */
final class Api16Impl {
    public static final Api16Impl INSTANCE = new Api16Impl();

    private Api16Impl() {
    }

    @DoNotInline
    public static final void postOnAnimationDelayed(View view, Runnable runnable, long j) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(runnable, "action");
        view.postOnAnimationDelayed(runnable, j);
    }
}
