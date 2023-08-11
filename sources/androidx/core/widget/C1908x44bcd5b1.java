package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import p404of.C13090q;

/* renamed from: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1 */
/* compiled from: TextView.kt */
public final class C1908x44bcd5b1 implements TextWatcher {
    final /* synthetic */ C13090q $beforeTextChanged;

    public C1908x44bcd5b1(C13090q qVar) {
        this.$beforeTextChanged = qVar;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
