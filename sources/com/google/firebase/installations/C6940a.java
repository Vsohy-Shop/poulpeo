package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.C6949f;

/* renamed from: com.google.firebase.installations.a */
/* compiled from: AutoValue_InstallationTokenResult */
final class C6940a extends C6949f {

    /* renamed from: a */
    private final String f9195a;

    /* renamed from: b */
    private final long f9196b;

    /* renamed from: c */
    private final long f9197c;

    /* renamed from: com.google.firebase.installations.a$b */
    /* compiled from: AutoValue_InstallationTokenResult */
    static final class C6942b extends C6949f.C6950a {

        /* renamed from: a */
        private String f9198a;

        /* renamed from: b */
        private Long f9199b;

        /* renamed from: c */
        private Long f9200c;

        C6942b() {
        }

        /* renamed from: a */
        public C6949f mo39827a() {
            String str = "";
            if (this.f9198a == null) {
                str = str + " token";
            }
            if (this.f9199b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f9200c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6940a(this.f9198a, this.f9199b.longValue(), this.f9200c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6949f.C6950a mo39828b(String str) {
            if (str != null) {
                this.f9198a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: c */
        public C6949f.C6950a mo39829c(long j) {
            this.f9200c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C6949f.C6950a mo39830d(long j) {
            this.f9199b = Long.valueOf(j);
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public String mo39821b() {
        return this.f9195a;
    }

    @NonNull
    /* renamed from: c */
    public long mo39822c() {
        return this.f9197c;
    }

    @NonNull
    /* renamed from: d */
    public long mo39823d() {
        return this.f9196b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6949f)) {
            return false;
        }
        C6949f fVar = (C6949f) obj;
        if (this.f9195a.equals(fVar.mo39821b()) && this.f9196b == fVar.mo39823d() && this.f9197c == fVar.mo39822c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f9196b;
        long j2 = this.f9197c;
        return ((((this.f9195a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f9195a + ", tokenExpirationTimestamp=" + this.f9196b + ", tokenCreationTimestamp=" + this.f9197c + "}";
    }

    private C6940a(String str, long j, long j2) {
        this.f9195a = str;
        this.f9196b = j;
        this.f9197c = j2;
    }
}
