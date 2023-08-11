package p371jg;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13173v0;

@SourceDebugExtension({"SMAP\n-SegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -SegmentedByteString.kt\nokio/internal/_SegmentedByteStringKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n60#1,12:247\n82#1,14:259\n82#1,14:273\n82#1,14:287\n82#1,14:301\n60#1,12:315\n1#2:246\n*S KotlinDebug\n*F\n+ 1 -SegmentedByteString.kt\nokio/internal/_SegmentedByteStringKt\n*L\n144#1:247,12\n155#1:259,14\n177#1:273,14\n197#1:287,14\n214#1:301,14\n234#1:315,12\n*E\n"})
/* renamed from: jg.j */
/* compiled from: -SegmentedByteString.kt */
public final class C12640j {
    /* renamed from: a */
    public static final int m28098a(int[] iArr, int i, int i2, int i3) {
        C12775o.m28639i(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m28099b(C13173v0 v0Var, int i) {
        C12775o.m28639i(v0Var, "<this>");
        int a = m28098a(v0Var.mo52723P(), i + 1, 0, v0Var.mo52724Q().length);
        if (a >= 0) {
            return a;
        }
        return ~a;
    }
}
