package p301z8;

import kotlin.jvm.internal.C12775o;

/* renamed from: z8.d */
/* compiled from: UnicodeUnpairedSurrogateRemover.kt */
public final class C10850d extends C10844a {
    /* renamed from: d */
    public boolean mo45798d(int i, StringBuilder sb) {
        C12775o.m28639i(sb, "stringBuilder");
        if (i < 55296 || i > 57343) {
            return false;
        }
        return true;
    }
}
