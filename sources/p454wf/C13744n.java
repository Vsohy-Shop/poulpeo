package p454wf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: wf.n */
/* compiled from: Appendable.kt */
class C13744n {
    /* renamed from: a */
    public static <T> void m31506a(Appendable appendable, T t, Function1<? super T, ? extends CharSequence> function1) {
        boolean z;
        C12775o.m28639i(appendable, "<this>");
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
