package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import p314bg.C10967g;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: PipHintTracker.kt */
final class PipHintTrackerKt$trackPipAnimationHintView$2<T> implements C10967g {
    final /* synthetic */ Activity $this_trackPipAnimationHintView;

    PipHintTrackerKt$trackPipAnimationHintView$2(Activity activity) {
        this.$this_trackPipAnimationHintView = activity;
    }

    public final Object emit(Rect rect, C12074d<? super C11921v> dVar) {
        Api26Impl.INSTANCE.setPipParamsSourceRectHint(this.$this_trackPipAnimationHintView, rect);
        return C11921v.f18618a;
    }
}
