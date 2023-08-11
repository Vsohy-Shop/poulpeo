package p183o7;

import java.lang.annotation.Annotation;
import p183o7.C9004d;

/* renamed from: o7.a */
/* compiled from: AtProtobuf */
public final class C9000a {

    /* renamed from: a */
    private int f13096a;

    /* renamed from: b */
    private C9004d.C9005a f13097b = C9004d.C9005a.DEFAULT;

    /* renamed from: o7.a$a */
    /* compiled from: AtProtobuf */
    private static final class C9001a implements C9004d {

        /* renamed from: a */
        private final int f13098a;

        /* renamed from: b */
        private final C9004d.C9005a f13099b;

        C9001a(int i, C9004d.C9005a aVar) {
            this.f13098a = i;
            this.f13099b = aVar;
        }

        public Class<? extends Annotation> annotationType() {
            return C9004d.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9004d)) {
                return false;
            }
            C9004d dVar = (C9004d) obj;
            if (this.f13098a != dVar.tag() || !this.f13099b.equals(dVar.intEncoding())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (14552422 ^ this.f13098a) + (this.f13099b.hashCode() ^ 2041407134);
        }

        public C9004d.C9005a intEncoding() {
            return this.f13099b;
        }

        public int tag() {
            return this.f13098a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f13098a + "intEncoding=" + this.f13099b + ')';
        }
    }

    /* renamed from: b */
    public static C9000a m18250b() {
        return new C9000a();
    }

    /* renamed from: a */
    public C9004d mo43175a() {
        return new C9001a(this.f13096a, this.f13097b);
    }

    /* renamed from: c */
    public C9000a mo43176c(int i) {
        this.f13096a = i;
        return this;
    }
}
