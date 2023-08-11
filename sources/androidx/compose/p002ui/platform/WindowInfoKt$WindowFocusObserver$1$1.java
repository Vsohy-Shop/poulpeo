package androidx.compose.p002ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", mo50610f = "WindowInfo.kt", mo50611l = {58}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1 */
/* compiled from: WindowInfo.kt */
final class WindowInfoKt$WindowFocusObserver$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ State<Function1<Boolean, C11921v>> $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends Function1<? super Boolean, C11921v>> state, C12074d<? super WindowInfoKt$WindowFocusObserver$1$1> dVar) {
        super(2, dVar);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final WindowInfo windowInfo = this.$windowInfo;
            C10962f snapshotFlow = SnapshotStateKt.snapshotFlow(new C13074a<Boolean>() {
                public final Boolean invoke() {
                    return Boolean.valueOf(windowInfo.isWindowFocused());
                }
            });
            final State<Function1<Boolean, C11921v>> state = this.$callback;
            C11042 r1 = new C10967g<Boolean>() {
                public /* bridge */ /* synthetic */ Object emit(Object obj, C12074d dVar) {
                    return emit(((Boolean) obj).booleanValue(), (C12074d<? super C11921v>) dVar);
                }

                public final Object emit(boolean z, C12074d<? super C11921v> dVar) {
                    state.getValue().invoke(C12735b.m28558a(z));
                    return C11921v.f18618a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(r1, this) == c) {
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
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
