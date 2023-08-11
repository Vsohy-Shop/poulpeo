package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import p308ag.C10908n;
import p308ag.C10912p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", mo50610f = "PipHintTracker.kt", mo50611l = {87}, mo50612m = "invokeSuspend")
/* compiled from: PipHintTracker.kt */
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends C12746l implements C13088o<C10912p<? super Rect>, C12074d<? super C11921v>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, C12074d<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> dVar) {
        super(2, dVar);
        this.$view = view;
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C10912p pVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            C12775o.m28638h(view, "v");
            pVar.mo45894m(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view));
        }
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(C10912p pVar, View view) {
        pVar.mo45894m(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view));
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, dVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    public final Object invoke(C10912p<? super Rect> pVar, C12074d<? super C11921v> dVar) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(pVar, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            C10912p pVar = (C10912p) this.L$0;
            final C0118l lVar = new C0118l(pVar);
            final C0119m mVar = new C0119m(pVar, this.$view);
            final C0099x7c5261f5 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 = new C0099x7c5261f5(pVar, this.$view, mVar, lVar);
            if (Api19Impl.INSTANCE.isAttachedToWindow(this.$view)) {
                pVar.mo45894m(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view));
                this.$view.getViewTreeObserver().addOnScrollChangedListener(mVar);
                this.$view.addOnLayoutChangeListener(lVar);
            }
            this.$view.addOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
            final View view = this.$view;
            C00981 r5 = new C13074a<C11921v>() {
                public final void invoke() {
                    view.getViewTreeObserver().removeOnScrollChangedListener(mVar);
                    view.removeOnLayoutChangeListener(lVar);
                    view.removeOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
                }
            };
            this.label = 1;
            if (C10908n.m23457a(pVar, r5, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
