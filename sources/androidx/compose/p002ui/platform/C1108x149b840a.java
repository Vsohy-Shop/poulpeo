package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", mo50610f = "WindowRecomposer.android.kt", mo50611l = {392}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
/* compiled from: WindowRecomposer.android.kt */
final class C1108x149b840a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ C1107xff837ba9 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref$ObjectRef<MotionDurationScaleImpl> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1108x149b840a(Ref$ObjectRef<MotionDurationScaleImpl> ref$ObjectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, C1107xff837ba9 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, C12074d<? super C1108x149b840a> dVar) {
        super(2, dVar);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        C1108x149b840a windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new C1108x149b840a(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, dVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r11.L$0
            yf.y1 r0 = (p466yf.C14054y1) r0
            p336ef.C11910n.m25701b(r12)     // Catch:{ all -> 0x0014 }
            goto L_0x006c
        L_0x0014:
            r12 = move-exception
            goto L_0x0086
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001f:
            p336ef.C11910n.m25701b(r12)
            java.lang.Object r12 = r11.L$0
            r4 = r12
            yf.l0 r4 = (p466yf.C13995l0) r4
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.platform.MotionDurationScaleImpl> r12 = r11.$systemDurationScaleSettingConsumer     // Catch:{ all -> 0x0084 }
            T r12 = r12.f20403b     // Catch:{ all -> 0x0084 }
            androidx.compose.ui.platform.MotionDurationScaleImpl r12 = (androidx.compose.p002ui.platform.MotionDurationScaleImpl) r12     // Catch:{ all -> 0x0084 }
            if (r12 == 0) goto L_0x005d
            android.view.View r1 = r11.$this_createLifecycleAwareWindowRecomposer     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "context.applicationContext"
            kotlin.jvm.internal.C12775o.m28638h(r1, r5)     // Catch:{ all -> 0x0084 }
            bg.h0 r1 = androidx.compose.p002ui.platform.WindowRecomposer_androidKt.getAnimationScaleFlowFor(r1)     // Catch:{ all -> 0x0084 }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0084 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0084 }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x0084 }
            r12.setScaleFactor(r5)     // Catch:{ all -> 0x0084 }
            r5 = 0
            r6 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch:{ all -> 0x0084 }
            r7.<init>(r1, r12, r3)     // Catch:{ all -> 0x0084 }
            r8 = 3
            r9 = 0
            yf.y1 r12 = p466yf.C13985j.m32422d(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0084 }
            goto L_0x005e
        L_0x005d:
            r12 = r3
        L_0x005e:
            androidx.compose.runtime.Recomposer r1 = r11.$recomposer     // Catch:{ all -> 0x007f }
            r11.L$0 = r12     // Catch:{ all -> 0x007f }
            r11.label = r2     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r1.runRecomposeAndApplyChanges(r11)     // Catch:{ all -> 0x007f }
            if (r1 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r0 = r12
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            p466yf.C14054y1.C14055a.m32600a(r0, r3, r2, r3)
        L_0x0071:
            androidx.lifecycle.LifecycleOwner r12 = r11.$source
            androidx.lifecycle.Lifecycle r12 = r12.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.$self
            r12.removeObserver(r0)
            ef.v r12 = p336ef.C11921v.f18618a
            return r12
        L_0x007f:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L_0x0086
        L_0x0084:
            r12 = move-exception
            r0 = r3
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            p466yf.C14054y1.C14055a.m32600a(r0, r3, r2, r3)
        L_0x008b:
            androidx.lifecycle.LifecycleOwner r0 = r11.$source
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.$self
            r0.removeObserver(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C1108x149b840a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((C1108x149b840a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
