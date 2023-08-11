package p215s;

import androidx.annotation.C0127Px;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* renamed from: s.c */
/* compiled from: Dimension.kt */
public abstract class C9406c {

    @SourceDebugExtension({"SMAP\nDimension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dimension.kt\ncoil/size/Dimension$Pixels\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
    /* renamed from: s.c$a */
    /* compiled from: Dimension.kt */
    public static final class C9407a extends C9406c {

        /* renamed from: a */
        public final int f13981a;

        public C9407a(@C0127Px int i) {
            super((DefaultConstructorMarker) null);
            boolean z;
            this.f13981a = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9407a) || this.f13981a != ((C9407a) obj).f13981a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f13981a;
        }

        public String toString() {
            return String.valueOf(this.f13981a);
        }
    }

    /* renamed from: s.c$b */
    /* compiled from: Dimension.kt */
    public static final class C9408b extends C9406c {

        /* renamed from: a */
        public static final C9408b f13982a = new C9408b();

        private C9408b() {
            super((DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    private C9406c() {
    }

    public /* synthetic */ C9406c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
