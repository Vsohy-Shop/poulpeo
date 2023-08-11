package androidx.core.view;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: View.kt */
public final class ViewKt$doOnLayout$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ Function1 $action$inlined;

    public ViewKt$doOnLayout$$inlined$doOnNextLayout$1(Function1 function1) {
        this.$action$inlined = function1;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C12775o.m28639i(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.$action$inlined.invoke(view);
    }
}
