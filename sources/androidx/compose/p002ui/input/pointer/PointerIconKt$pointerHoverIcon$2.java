package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,101:1\n76#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n*L\n80#1:102\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2 */
/* compiled from: PointerIcon.kt */
final class PointerIconKt$pointerHoverIcon$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ PointerIcon $icon;
    final /* synthetic */ boolean $overrideDescendants;

    @C12739f(mo50609c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", mo50610f = "PointerIcon.kt", mo50611l = {85}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1 */
    /* compiled from: PointerIcon.kt */
    static final class C10351 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C10351 r0 = new C10351(z, pointerIconService, pointerIcon2, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
            return ((C10351) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final boolean z = z;
                final PointerIconService pointerIconService = pointerIconService;
                final PointerIcon pointerIcon = pointerIcon2;
                C10361 r1 = new C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object>((C12074d<? super C10361>) null) {
                    private /* synthetic */ Object L$0;
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        C10361 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        PointerIconKt$pointerHoverIcon$2(PointerIcon pointerIcon, boolean z) {
                            super(3);
                            this.$icon = pointerIcon;
                            this.$overrideDescendants = z;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @Composable
                        public final Modifier invoke(Modifier modifier, Composer composer, int i) {
                            Modifier modifier2;
                            C12775o.m28639i(modifier, "$this$composed");
                            composer.startReplaceableGroup(811087536);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(811087536, i, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:78)");
                            }
                            final PointerIconService pointerIconService = (PointerIconService) composer.consume(CompositionLocalsKt.getLocalPointerIconService());
                            if (pointerIconService == null) {
                                modifier2 = Modifier.Companion;
                            } else {
                                PointerIcon pointerIcon = this.$icon;
                                Boolean valueOf = Boolean.valueOf(this.$overrideDescendants);
                                final boolean z = this.$overrideDescendants;
                                final PointerIcon pointerIcon2 = this.$icon;
                                modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier, pointerIcon, valueOf, new C10351((C12074d<? super C10351>) null));
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceableGroup();
                            return modifier2;
                        }
                    }
