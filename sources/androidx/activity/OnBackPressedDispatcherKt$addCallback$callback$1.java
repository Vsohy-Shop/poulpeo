package androidx.activity;

import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* compiled from: OnBackPressedDispatcher.kt */
public final class OnBackPressedDispatcherKt$addCallback$callback$1 extends OnBackPressedCallback {
    final /* synthetic */ Function1<OnBackPressedCallback, C11921v> $onBackPressed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OnBackPressedDispatcherKt$addCallback$callback$1(boolean z, Function1<? super OnBackPressedCallback, C11921v> function1) {
        super(z);
        this.$onBackPressed = function1;
    }

    public void handleOnBackPressed() {
        this.$onBackPressed.invoke(this);
    }
}
