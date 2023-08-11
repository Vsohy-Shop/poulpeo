package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import p314bg.C10971h;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: PipHintTracker.kt */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(Activity activity, View view, C12074d<? super C11921v> dVar) {
        Object collect = C10971h.m23597d(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, (C12074d<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1>) null)).collect(new PipHintTrackerKt$trackPipAnimationHintView$2(activity), dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
