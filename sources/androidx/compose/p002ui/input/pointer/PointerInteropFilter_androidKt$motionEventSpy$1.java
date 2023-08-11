package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", mo50610f = "PointerInteropFilter.android.kt", mo50611l = {343}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1 */
/* compiled from: PointerInteropFilter.android.kt */
final class PointerInteropFilter_androidKt$motionEventSpy$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Function1<MotionEvent, C11921v> $watcher;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", mo50610f = "PointerInteropFilter.android.kt", mo50611l = {345}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1 */
    /* compiled from: PointerInteropFilter.android.kt */
    static final class C10381 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C10381 r0 = new C10381(function1, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
            return ((C10381) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r1 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
                p336ef.C11910n.m25701b(r7)
                r3 = r1
                r1 = r0
                r0 = r6
                goto L_0x0039
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                p336ef.C11910n.m25701b(r7)
                java.lang.Object r7 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r7
                r1 = r7
                r7 = r6
            L_0x0027:
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r3 = r1.awaitPointerEvent(r3, r7)
                if (r3 != r0) goto L_0x0034
                return r0
            L_0x0034:
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L_0x0039:
                androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.p002ui.input.pointer.PointerEvent) r7
                android.view.MotionEvent r7 = r7.getMotionEvent$ui_release()
                if (r7 == 0) goto L_0x0046
                kotlin.jvm.functions.Function1<android.view.MotionEvent, ef.v> r4 = r3
                r4.invoke(r7)
            L_0x0046:
                r7 = r0
                r0 = r1
                r1 = r3
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.C10381.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerInteropFilter_androidKt$motionEventSpy$1(Function1<? super MotionEvent, C11921v> function1, C12074d<? super PointerInteropFilter_androidKt$motionEventSpy$1> dVar) {
        super(2, dVar);
        this.$watcher = function1;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        PointerInteropFilter_androidKt$motionEventSpy$1 pointerInteropFilter_androidKt$motionEventSpy$1 = new PointerInteropFilter_androidKt$motionEventSpy$1(this.$watcher, dVar);
        pointerInteropFilter_androidKt$motionEventSpy$1.L$0 = obj;
        return pointerInteropFilter_androidKt$motionEventSpy$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((PointerInteropFilter_androidKt$motionEventSpy$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
            final Function1<MotionEvent, C11921v> function1 = this.$watcher;
            C10381 r1 = new C10381((C12074d<? super C10381>) null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(r1, this) == c) {
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
