package androidx.compose.foundation;

import android.view.View;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Clickable.android.kt */
final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.$view = view;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(Clickable_androidKt.isInScrollableViewGroup(this.$view));
    }
}
