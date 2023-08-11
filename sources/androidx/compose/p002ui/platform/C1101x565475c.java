package androidx.compose.p002ui.platform;

import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 */
/* compiled from: ViewCompositionStrategy.android.kt */
final class C1101x565475c extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Ref$ObjectRef<C13074a<C11921v>> $disposer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1101x565475c(Ref$ObjectRef<C13074a<C11921v>> ref$ObjectRef) {
        super(0);
        this.$disposer = ref$ObjectRef;
    }

    public final void invoke() {
        ((C13074a) this.$disposer.f20403b).invoke();
    }
}
