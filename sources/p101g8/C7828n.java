package p101g8;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: g8.n */
/* compiled from: Text */
public class C7828n {
    @Nullable

    /* renamed from: a */
    private final String f10902a;
    @NonNull

    /* renamed from: b */
    private final String f10903b;

    /* renamed from: g8.n$b */
    /* compiled from: Text */
    public static class C7830b {
        @Nullable

        /* renamed from: a */
        private String f10904a;
        @Nullable

        /* renamed from: b */
        private String f10905b;

        /* renamed from: a */
        public C7828n mo41533a() {
            if (!TextUtils.isEmpty(this.f10905b)) {
                return new C7828n(this.f10904a, this.f10905b);
            }
            throw new IllegalArgumentException("Text model must have a color");
        }

        /* renamed from: b */
        public C7830b mo41534b(@Nullable String str) {
            this.f10905b = str;
            return this;
        }

        /* renamed from: c */
        public C7830b mo41535c(@Nullable String str) {
            this.f10904a = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C7830b m15308a() {
        return new C7830b();
    }

    @NonNull
    /* renamed from: b */
    public String mo41529b() {
        return this.f10903b;
    }

    @Nullable
    /* renamed from: c */
    public String mo41530c() {
        return this.f10902a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7828n)) {
            return false;
        }
        C7828n nVar = (C7828n) obj;
        if (hashCode() != nVar.hashCode()) {
            return false;
        }
        String str = this.f10902a;
        if ((str != null || nVar.f10902a == null) && ((str == null || str.equals(nVar.f10902a)) && this.f10903b.equals(nVar.f10903b))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f10902a;
        if (str != null) {
            return str.hashCode() + this.f10903b.hashCode();
        }
        return this.f10903b.hashCode();
    }

    private C7828n(@Nullable String str, @NonNull String str2) {
        this.f10902a = str;
        this.f10903b = str2;
    }
}
