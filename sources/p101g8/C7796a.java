package p101g8;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: g8.a */
/* compiled from: Action */
public class C7796a {
    @Nullable

    /* renamed from: a */
    private final String f10837a;
    @Nullable

    /* renamed from: b */
    private final C7805d f10838b;

    /* renamed from: g8.a$b */
    /* compiled from: Action */
    public static class C7798b {
        @Nullable

        /* renamed from: a */
        private String f10839a;
        @Nullable

        /* renamed from: b */
        private C7805d f10840b;

        /* renamed from: a */
        public C7796a mo41450a() {
            return new C7796a(this.f10839a, this.f10840b);
        }

        /* renamed from: b */
        public C7798b mo41451b(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f10839a = str;
            }
            return this;
        }

        /* renamed from: c */
        public C7798b mo41452c(@Nullable C7805d dVar) {
            this.f10840b = dVar;
            return this;
        }
    }

    /* renamed from: a */
    public static C7798b m15212a() {
        return new C7798b();
    }

    @Nullable
    /* renamed from: b */
    public String mo41446b() {
        return this.f10837a;
    }

    @Nullable
    /* renamed from: c */
    public C7805d mo41447c() {
        return this.f10838b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7796a)) {
            return false;
        }
        C7796a aVar = (C7796a) obj;
        if (hashCode() != aVar.hashCode()) {
            return false;
        }
        String str = this.f10837a;
        if ((str == null && aVar.f10837a != null) || (str != null && !str.equals(aVar.f10837a))) {
            return false;
        }
        C7805d dVar = this.f10838b;
        if ((dVar != null || aVar.f10838b != null) && (dVar == null || !dVar.equals(aVar.f10838b))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f10837a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        C7805d dVar = this.f10838b;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return i + i2;
    }

    private C7796a(@Nullable String str, @Nullable C7805d dVar) {
        this.f10837a = str;
        this.f10838b = dVar;
    }
}
