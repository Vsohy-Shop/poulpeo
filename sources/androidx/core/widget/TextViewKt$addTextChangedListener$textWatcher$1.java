package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p404of.C13090q;

/* compiled from: TextView.kt */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Function1<Editable, C11921v> $afterTextChanged;
    final /* synthetic */ C13090q<CharSequence, Integer, Integer, Integer, C11921v> $beforeTextChanged;
    final /* synthetic */ C13090q<CharSequence, Integer, Integer, Integer, C11921v> $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(Function1<? super Editable, C11921v> function1, C13090q<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11921v> qVar, C13090q<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11921v> qVar2) {
        this.$afterTextChanged = function1;
        this.$beforeTextChanged = qVar;
        this.$onTextChanged = qVar2;
    }

    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
