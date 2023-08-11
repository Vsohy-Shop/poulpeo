package p139k3;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p119i3.C8111d;
import p139k3.C8530d;

/* renamed from: k3.o */
/* compiled from: TransportContext */
public abstract class C8549o {

    /* renamed from: k3.o$a */
    /* compiled from: TransportContext */
    public static abstract class C8550a {
        /* renamed from: a */
        public abstract C8549o mo42585a();

        /* renamed from: b */
        public abstract C8550a mo42586b(String str);

        /* renamed from: c */
        public abstract C8550a mo42587c(@Nullable byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: d */
        public abstract C8550a mo42588d(C8111d dVar);
    }

    /* renamed from: a */
    public static C8550a m17165a() {
        return new C8530d.C8532b().mo42588d(C8111d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo42580b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo42581c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract C8111d mo42582d();

    /* renamed from: e */
    public boolean mo42612e() {
        if (mo42581c() != null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: f */
    public C8549o mo42613f(C8111d dVar) {
        return m17165a().mo42586b(mo42580b()).mo42588d(dVar).mo42587c(mo42581c()).mo42585a();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = mo42580b();
        objArr[1] = mo42582d();
        if (mo42581c() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(mo42581c(), 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
