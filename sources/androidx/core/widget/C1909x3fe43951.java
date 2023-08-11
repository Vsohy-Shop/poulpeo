package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import p404of.C13090q;

/* renamed from: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1 */
/* compiled from: TextView.kt */
public final class C1909x3fe43951 implements TextWatcher {
    final /* synthetic */ C13090q $onTextChanged;

    public C1909x3fe43951(C13090q qVar) {
        this.$onTextChanged = qVar;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
