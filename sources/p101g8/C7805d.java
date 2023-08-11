package p101g8;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: g8.d */
/* compiled from: Button */
public class C7805d {
    @NonNull

    /* renamed from: a */
    private final C7828n f10857a;
    @NonNull

    /* renamed from: b */
    private final String f10858b;

    /* renamed from: g8.d$b */
    /* compiled from: Button */
    public static class C7807b {
        @Nullable

        /* renamed from: a */
        private C7828n f10859a;
        @Nullable

        /* renamed from: b */
        private String f10860b;

        /* renamed from: a */
        public C7805d mo41480a() {
            if (!TextUtils.isEmpty(this.f10860b)) {
                C7828n nVar = this.f10859a;
                if (nVar != null) {
                    return new C7805d(nVar, this.f10860b);
                }
                throw new IllegalArgumentException("Button model must have text");
            }
            throw new IllegalArgumentException("Button model must have a color");
        }

        /* renamed from: b */
        public C7807b mo41481b(@Nullable String str) {
            this.f10860b = str;
            return this;
        }

        /* renamed from: c */
        public C7807b mo41482c(@Nullable C7828n nVar) {
            this.f10859a = nVar;
            return this;
        }
    }

    /* renamed from: a */
    public static C7807b m15237a() {
        return new C7807b();
    }

    @NonNull
    /* renamed from: b */
    public String mo41476b() {
        return this.f10858b;
    }

    @NonNull
    /* renamed from: c */
    public C7828n mo41477c() {
        return this.f10857a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7805d)) {
            return false;
        }
        C7805d dVar = (C7805d) obj;
        if (hashCode() == dVar.hashCode() && this.f10857a.equals(dVar.f10857a) && this.f10858b.equals(dVar.f10858b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f10857a.hashCode() + this.f10858b.hashCode();
    }

    private C7805d(@NonNull C7828n nVar, @NonNull String str) {
        this.f10857a = nVar;
        this.f10858b = str;
    }
}
