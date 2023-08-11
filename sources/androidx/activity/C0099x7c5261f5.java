package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C12775o;
import p308ag.C10912p;

/* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 */
/* compiled from: PipHintTracker.kt */
public final class C0099x7c5261f5 implements View.OnAttachStateChangeListener {
    final /* synthetic */ C10912p<Rect> $$this$callbackFlow;
    final /* synthetic */ View.OnLayoutChangeListener $layoutChangeListener;
    final /* synthetic */ ViewTreeObserver.OnScrollChangedListener $scrollChangeListener;
    final /* synthetic */ View $view;

    C0099x7c5261f5(C10912p<? super Rect> pVar, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.$$this$callbackFlow = pVar;
        this.$view = view;
        this.$scrollChangeListener = onScrollChangedListener;
        this.$layoutChangeListener = onLayoutChangeListener;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "v");
        this.$$this$callbackFlow.mo45894m(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view));
        this.$view.getViewTreeObserver().addOnScrollChangedListener(this.$scrollChangeListener);
        this.$view.addOnLayoutChangeListener(this.$layoutChangeListener);
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "v");
        view.getViewTreeObserver().removeOnScrollChangedListener(this.$scrollChangeListener);
        view.removeOnLayoutChangeListener(this.$layoutChangeListener);
    }
}
