package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ForEachOneBit.kt */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i, C13088o<? super Integer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "body");
        int i2 = 0;
        while (i != 0) {
            int lowestOneBit = Integer.lowestOneBit(i);
            oVar.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i2));
            i2++;
            i ^= lowestOneBit;
        }
    }
}
