package p109h4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import p231t4.C9705n;

/* renamed from: h4.h */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C7935h {

    /* renamed from: a */
    private final long f11111a;

    /* renamed from: b */
    private final int f11112b;

    /* renamed from: c */
    private final boolean f11113c;
    @Nullable

    /* renamed from: d */
    private final JSONObject f11114d;

    /* renamed from: h4.h$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public static class C7936a {

        /* renamed from: a */
        private long f11115a;

        /* renamed from: b */
        private int f11116b = 0;

        /* renamed from: c */
        private boolean f11117c;
        @Nullable

        /* renamed from: d */
        private JSONObject f11118d;

        @NonNull
        /* renamed from: a */
        public C7935h mo41725a() {
            return new C7935h(this.f11115a, this.f11116b, this.f11117c, this.f11118d, (C7969v0) null);
        }

        @NonNull
        /* renamed from: b */
        public C7936a mo41726b(@Nullable JSONObject jSONObject) {
            this.f11118d = jSONObject;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C7936a mo41727c(long j) {
            this.f11115a = j;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C7936a mo41728d(int i) {
            this.f11116b = i;
            return this;
        }
    }

    /* synthetic */ C7935h(long j, int i, boolean z, JSONObject jSONObject, C7969v0 v0Var) {
        this.f11111a = j;
        this.f11112b = i;
        this.f11113c = z;
        this.f11114d = jSONObject;
    }

    @Nullable
    /* renamed from: a */
    public JSONObject mo41719a() {
        return this.f11114d;
    }

    /* renamed from: b */
    public long mo41720b() {
        return this.f11111a;
    }

    /* renamed from: c */
    public int mo41721c() {
        return this.f11112b;
    }

    /* renamed from: d */
    public boolean mo41722d() {
        return this.f11113c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7935h)) {
            return false;
        }
        C7935h hVar = (C7935h) obj;
        if (this.f11111a == hVar.f11111a && this.f11112b == hVar.f11112b && this.f11113c == hVar.f11113c && C9705n.m20259b(this.f11114d, hVar.f11114d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(Long.valueOf(this.f11111a), Integer.valueOf(this.f11112b), Boolean.valueOf(this.f11113c), this.f11114d);
    }
}
