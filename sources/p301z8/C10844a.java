package p301z8;

import kotlin.jvm.internal.C12775o;
import p290y8.C10716e;

/* renamed from: z8.a */
/* compiled from: CodePointTranslator.kt */
public abstract class C10844a extends C10716e {
    /* renamed from: a */
    public int mo45638a(String str, int i, StringBuilder sb) {
        C12775o.m28639i(str, "input");
        C12775o.m28639i(sb, "stringBuilder");
        return mo45798d(str.charAt(i), sb) ? 1 : 0;
    }

    /* renamed from: d */
    public abstract boolean mo45798d(int i, StringBuilder sb);
}
