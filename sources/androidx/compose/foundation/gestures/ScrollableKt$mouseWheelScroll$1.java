package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", mo50610f = "Scrollable.kt", mo50611l = {291}, mo50612m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollableKt$mouseWheelScroll$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
    final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
    private /* synthetic */ Object L$0;
    int label;

    @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$mouseWheelScroll$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,579:1\n86#2,2:580\n33#2,6:582\n88#2:588\n33#2,6:589\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$mouseWheelScroll$1$1\n*L\n294#1:580,2\n294#1:582,6\n294#1:588\n301#1:589,6\n*E\n"})
    @C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", mo50610f = "Scrollable.kt", mo50611l = {293}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1 */
    /* compiled from: Scrollable.kt */
    static final class C04141 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C04141 r0 = new C04141(scrollConfig, state, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
            return ((C04141) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0057 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r10.label
                r2 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r1 = r10.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
                p336ef.C11910n.m25701b(r11)
                r3 = r1
                r1 = r0
                r0 = r10
                goto L_0x0037
            L_0x0016:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001e:
                p336ef.C11910n.m25701b(r11)
                java.lang.Object r11 = r10.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r11
                r1 = r11
                r11 = r10
            L_0x0027:
                r11.L$0 = r1
                r11.label = r2
                java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(r1, r11)
                if (r3 != r0) goto L_0x0032
                return r0
            L_0x0032:
                r9 = r0
                r0 = r11
                r11 = r3
                r3 = r1
                r1 = r9
            L_0x0037:
                androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.p002ui.input.pointer.PointerEvent) r11
                java.util.List r4 = r11.getChanges()
                int r5 = r4.size()
                r6 = 0
                r7 = r6
            L_0x0043:
                if (r7 >= r5) goto L_0x0057
                java.lang.Object r8 = r4.get(r7)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r8
                boolean r8 = r8.isConsumed()
                r8 = r8 ^ r2
                if (r8 != 0) goto L_0x0054
                r4 = r6
                goto L_0x0058
            L_0x0054:
                int r7 = r7 + 1
                goto L_0x0043
            L_0x0057:
                r4 = r2
            L_0x0058:
                if (r4 == 0) goto L_0x009c
                androidx.compose.foundation.gestures.ScrollConfig r4 = r3
                androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r5 = r4
                long r7 = r3.m37085getSizeYbymL2g()
                long r7 = r4.m33129calculateMouseWheelScroll8xgXZGE(r3, r11, r7)
                java.lang.Object r4 = r5.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                float r5 = r4.m33142toFloatk4lQ0M(r7)
                float r5 = r4.reverseIfNeeded(r5)
                androidx.compose.foundation.gestures.ScrollableState r4 = r4.getScrollableState()
                float r4 = r4.dispatchRawDelta(r5)
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L_0x0083
                r4 = r2
                goto L_0x0084
            L_0x0083:
                r4 = r6
            L_0x0084:
                if (r4 != 0) goto L_0x009c
                java.util.List r11 = r11.getChanges()
                int r4 = r11.size()
            L_0x008e:
                if (r6 >= r4) goto L_0x009c
                java.lang.Object r5 = r11.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r5
                r5.consume()
                int r6 = r6 + 1
                goto L_0x008e
            L_0x009c:
                r11 = r0
                r0 = r1
                r1 = r3
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1.C04141.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$mouseWheelScroll$1(ScrollConfig scrollConfig, State<ScrollingLogic> state, C12074d<? super ScrollableKt$mouseWheelScroll$1> dVar) {
        super(2, dVar);
        this.$mouseWheelScrollConfig = scrollConfig;
        this.$scrollingLogicState = state;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ScrollableKt$mouseWheelScroll$1 scrollableKt$mouseWheelScroll$1 = new ScrollableKt$mouseWheelScroll$1(this.$mouseWheelScrollConfig, this.$scrollingLogicState, dVar);
        scrollableKt$mouseWheelScroll$1.L$0 = obj;
        return scrollableKt$mouseWheelScroll$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((ScrollableKt$mouseWheelScroll$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final ScrollConfig scrollConfig = this.$mouseWheelScrollConfig;
            final State<ScrollingLogic> state = this.$scrollingLogicState;
            C04141 r1 = new C04141((C12074d<? super C04141>) null);
            this.label = 1;
            if (((PointerInputScope) this.L$0).awaitPointerEventScope(r1, this) == c) {
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
