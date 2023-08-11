package p301z8;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p436tf.C13528f;

/* renamed from: z8.c */
/* compiled from: NumericEntityEncoder.kt */
public final class C10848c extends C10844a {

    /* renamed from: c */
    public static final C10849a f16636c = new C10849a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C13528f f16637a;

    /* renamed from: b */
    private final boolean f16638b;

    /* renamed from: z8.c$a */
    /* compiled from: NumericEntityEncoder.kt */
    public static final class C10849a {
        private C10849a() {
        }

        public /* synthetic */ C10849a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10848c mo45799a(int i, int i2) {
            return new C10848c(new C13528f(i, i2), true, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C10848c(C13528f fVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, z);
    }

    /* renamed from: d */
    public boolean mo45798d(int i, StringBuilder sb) {
        C12775o.m28639i(sb, "stringBuilder");
        if (this.f16638b != this.f16637a.mo53154t(i)) {
            return false;
        }
        sb.append("&#");
        String num = Integer.toString(i, C13724b.m31415a(10));
        C12775o.m28638h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        sb.append(';');
        return true;
    }

    private C10848c(C13528f fVar, boolean z) {
        this.f16637a = fVar;
        this.f16638b = z;
    }
}
