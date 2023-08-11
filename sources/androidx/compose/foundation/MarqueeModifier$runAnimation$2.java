package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10962f;
import p314bg.C10971h;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2", mo50610f = "BasicMarquee.kt", mo50611l = {272}, mo50612m = "invokeSuspend")
/* compiled from: BasicMarquee.kt */
final class MarqueeModifier$runAnimation$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    int label;
    final /* synthetic */ MarqueeModifier this$0;

    @C12739f(mo50609c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2$2", mo50610f = "BasicMarquee.kt", mo50611l = {285, 287, 289, 289}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2$2 */
    /* compiled from: BasicMarquee.kt */
    static final class C03842 extends C12746l implements C13088o<Float, C12074d<? super C11921v>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C03842 r0 = new C03842(marqueeModifier2, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(Float f, C12074d<? super C11921v> dVar) {
            return ((C03842) create(f, dVar)).invokeSuspend(C11921v.f18618a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r9 = r21
                java.lang.Object r10 = p362if.C12150d.m26492c()
                int r0 = r9.label
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                r14 = 0
                if (r0 == 0) goto L_0x0043
                if (r0 == r2) goto L_0x0036
                if (r0 == r1) goto L_0x002e
                if (r0 == r12) goto L_0x0029
                if (r0 == r11) goto L_0x0020
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0020:
                java.lang.Object r0 = r9.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                p336ef.C11910n.m25701b(r22)
                goto L_0x00d5
            L_0x0029:
                p336ef.C11910n.m25701b(r22)
                goto L_0x00bb
            L_0x002e:
                p336ef.C11910n.m25701b(r22)     // Catch:{ all -> 0x0033 }
                goto L_0x00a8
            L_0x0033:
                r0 = move-exception
                goto L_0x00be
            L_0x0036:
                java.lang.Object r0 = r9.L$1
                androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                java.lang.Object r2 = r9.L$0
                java.lang.Float r2 = (java.lang.Float) r2
                p336ef.C11910n.m25701b(r22)
                r3 = r0
                goto L_0x008d
            L_0x0043:
                p336ef.C11910n.m25701b(r22)
                java.lang.Object r0 = r9.L$0
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 != 0) goto L_0x004f
                ef.v r0 = p336ef.C11921v.f18618a
                return r0
            L_0x004f:
                androidx.compose.foundation.MarqueeModifier r3 = r3
                int r15 = r3.iterations
                float r16 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifier r3 = r3
                int r17 = r3.initialDelayMillis
                androidx.compose.foundation.MarqueeModifier r3 = r3
                int r18 = r3.delayMillis
                androidx.compose.foundation.MarqueeModifier r3 = r3
                float r19 = r3.velocity
                androidx.compose.foundation.MarqueeModifier r3 = r3
                androidx.compose.ui.unit.Density r20 = r3.density
                androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m32962createMarqueeAnimationSpecZ4HSEVQ(r15, r16, r17, r18, r19, r20)
                androidx.compose.foundation.MarqueeModifier r4 = r3
                androidx.compose.animation.core.Animatable r4 = r4.offset
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r14)
                r9.L$0 = r0
                r9.L$1 = r3
                r9.label = r2
                java.lang.Object r2 = r4.snapTo(r5, r9)
                if (r2 != r10) goto L_0x008c
                return r10
            L_0x008c:
                r2 = r0
            L_0x008d:
                androidx.compose.foundation.MarqueeModifier r0 = r3     // Catch:{ all -> 0x0033 }
                androidx.compose.animation.core.Animatable r0 = r0.offset     // Catch:{ all -> 0x0033 }
                r4 = 0
                r5 = 0
                r7 = 12
                r8 = 0
                r9.L$0 = r13     // Catch:{ all -> 0x0033 }
                r9.L$1 = r13     // Catch:{ all -> 0x0033 }
                r9.label = r1     // Catch:{ all -> 0x0033 }
                r1 = r0
                r6 = r21
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0033 }
                if (r0 != r10) goto L_0x00a8
                return r10
            L_0x00a8:
                androidx.compose.foundation.MarqueeModifier r0 = r3
                androidx.compose.animation.core.Animatable r0 = r0.offset
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r14)
                r9.label = r12
                java.lang.Object r0 = r0.snapTo(r1, r9)
                if (r0 != r10) goto L_0x00bb
                return r10
            L_0x00bb:
                ef.v r0 = p336ef.C11921v.f18618a
                return r0
            L_0x00be:
                androidx.compose.foundation.MarqueeModifier r1 = r3
                androidx.compose.animation.core.Animatable r1 = r1.offset
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r14)
                r9.L$0 = r0
                r9.L$1 = r13
                r9.label = r11
                java.lang.Object r1 = r1.snapTo(r2, r9)
                if (r1 != r10) goto L_0x00d5
                return r10
            L_0x00d5:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifier$runAnimation$2.C03842.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MarqueeModifier$runAnimation$2(MarqueeModifier marqueeModifier, C12074d<? super MarqueeModifier$runAnimation$2> dVar) {
        super(2, dVar);
        this.this$0 = marqueeModifier;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new MarqueeModifier$runAnimation$2(this.this$0, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final MarqueeModifier marqueeModifier = this.this$0;
            C10962f snapshotFlow = SnapshotStateKt.snapshotFlow(new C13074a<Float>() {
                public final Float invoke() {
                    if (marqueeModifier.getContentWidth() <= marqueeModifier.getContainerWidth()) {
                        return null;
                    }
                    if (!MarqueeAnimationMode.m33012equalsimpl0(marqueeModifier.m33020getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m33019getWhileFocusedZbEOnfQ()) || marqueeModifier.getHasFocus()) {
                        return Float.valueOf((float) (marqueeModifier.getContentWidth() + marqueeModifier.getSpacingPx()));
                    }
                    return null;
                }
            });
            final MarqueeModifier marqueeModifier2 = this.this$0;
            C03842 r1 = new C03842((C12074d<? super C03842>) null);
            this.label = 1;
            if (C10971h.m23599f(snapshotFlow, r1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((MarqueeModifier$runAnimation$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
