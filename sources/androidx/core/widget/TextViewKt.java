package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13090q;

/* compiled from: TextView.kt */
public final class TextViewKt {
    public static final TextWatcher addTextChangedListener(TextView textView, C13090q<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11921v> qVar, C13090q<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11921v> qVar2, Function1<? super Editable, C11921v> function1) {
        C12775o.m28639i(textView, "<this>");
        C12775o.m28639i(qVar, "beforeTextChanged");
        C12775o.m28639i(qVar2, "onTextChanged");
        C12775o.m28639i(function1, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, qVar, qVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, C13090q qVar, C13090q qVar2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qVar = TextViewKt$addTextChangedListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            qVar2 = TextViewKt$addTextChangedListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            function1 = TextViewKt$addTextChangedListener$3.INSTANCE;
        }
        C12775o.m28639i(textView, "<this>");
        C12775o.m28639i(qVar, "beforeTextChanged");
        C12775o.m28639i(qVar2, "onTextChanged");
        C12775o.m28639i(function1, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(function1, qVar, qVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, Function1<? super Editable, C11921v> function1) {
        C12775o.m28639i(textView, "<this>");
        C12775o.m28639i(function1, "action");
        C1907xbb2cb19c textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1 = new C1907xbb2cb19c(function1);
        textView.addTextChangedListener(textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1);
        return textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, C13090q<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(textView, "<this>");
        C12775o.m28639i(qVar, "action");
        C1908x44bcd5b1 textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1 = new C1908x44bcd5b1(qVar);
        textView.addTextChangedListener(textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1);
        return textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, C13090q<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C11921v> qVar) {
        C12775o.m28639i(textView, "<this>");
        C12775o.m28639i(qVar, "action");
        C1909x3fe43951 textViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1 = new C1909x3fe43951(qVar);
        textView.addTextChangedListener(textViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1);
        return textViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1;
    }
}
