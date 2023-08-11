package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1 */
/* compiled from: TextView.kt */
public final class C1907xbb2cb19c implements TextWatcher {
    final /* synthetic */ Function1 $afterTextChanged;

    public C1907xbb2cb19c(Function1 function1) {
        this.$afterTextChanged = function1;
    }

    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
