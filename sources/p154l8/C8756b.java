package p154l8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p154l8.C8764f;

/* renamed from: l8.b */
/* compiled from: AutoValue_TokenResult */
final class C8756b extends C8764f {

    /* renamed from: a */
    private final String f12607a;

    /* renamed from: b */
    private final long f12608b;

    /* renamed from: c */
    private final C8764f.C8766b f12609c;

    /* renamed from: l8.b$b */
    /* compiled from: AutoValue_TokenResult */
    static final class C8758b extends C8764f.C8765a {

        /* renamed from: a */
        private String f12610a;

        /* renamed from: b */
        private Long f12611b;

        /* renamed from: c */
        private C8764f.C8766b f12612c;

        C8758b() {
        }

        /* renamed from: a */
        public C8764f mo42914a() {
            String str = "";
            if (this.f12611b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8756b(this.f12610a, this.f12611b.longValue(), this.f12612c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C8764f.C8765a mo42915b(C8764f.C8766b bVar) {
            this.f12612c = bVar;
            return this;
        }

        /* renamed from: c */
        public C8764f.C8765a mo42916c(String str) {
            this.f12610a = str;
            return this;
        }

        /* renamed from: d */
        public C8764f.C8765a mo42917d(long j) {
            this.f12611b = Long.valueOf(j);
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public C8764f.C8766b mo42908b() {
        return this.f12609c;
    }

    @Nullable
    /* renamed from: c */
    public String mo42909c() {
        return this.f12607a;
    }

    @NonNull
    /* renamed from: d */
    public long mo42910d() {
        return this.f12608b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8764f)) {
            return false;
        }
        C8764f fVar = (C8764f) obj;
        String str = this.f12607a;
        if (str != null ? str.equals(fVar.mo42909c()) : fVar.mo42909c() == null) {
            if (this.f12608b == fVar.mo42910d()) {
                C8764f.C8766b bVar = this.f12609c;
                if (bVar == null) {
                    if (fVar.mo42908b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.mo42908b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f12607a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f12608b;
        int i3 = (((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C8764f.C8766b bVar = this.f12609c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.f12607a + ", tokenExpirationTimestamp=" + this.f12608b + ", responseCode=" + this.f12609c + "}";
    }

    private C8756b(@Nullable String str, long j, @Nullable C8764f.C8766b bVar) {
        this.f12607a = str;
        this.f12608b = j;
        this.f12609c = bVar;
    }
}
