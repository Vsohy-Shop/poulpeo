package p277x6;

import androidx.annotation.NonNull;
import java.util.Arrays;
import p277x6.C10450a0;

/* renamed from: x6.f */
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
final class C10508f extends C10450a0.C10456d.C10458b {

    /* renamed from: a */
    private final String f15898a;

    /* renamed from: b */
    private final byte[] f15899b;

    /* renamed from: x6.f$b */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
    static final class C10510b extends C10450a0.C10456d.C10458b.C10459a {

        /* renamed from: a */
        private String f15900a;

        /* renamed from: b */
        private byte[] f15901b;

        C10510b() {
        }

        /* renamed from: a */
        public C10450a0.C10456d.C10458b mo45186a() {
            String str = "";
            if (this.f15900a == null) {
                str = str + " filename";
            }
            if (this.f15901b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C10508f(this.f15900a, this.f15901b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C10450a0.C10456d.C10458b.C10459a mo45187b(byte[] bArr) {
            if (bArr != null) {
                this.f15901b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        /* renamed from: c */
        public C10450a0.C10456d.C10458b.C10459a mo45188c(String str) {
            if (str != null) {
                this.f15900a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @NonNull
    /* renamed from: b */
    public byte[] mo45184b() {
        return this.f15899b;
    }

    @NonNull
    /* renamed from: c */
    public String mo45185c() {
        return this.f15898a;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10450a0.C10456d.C10458b)) {
            return false;
        }
        C10450a0.C10456d.C10458b bVar = (C10450a0.C10456d.C10458b) obj;
        if (this.f15898a.equals(bVar.mo45185c())) {
            byte[] bArr2 = this.f15899b;
            if (bVar instanceof C10508f) {
                bArr = ((C10508f) bVar).f15899b;
            } else {
                bArr = bVar.mo45184b();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f15898a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15899b);
    }

    public String toString() {
        return "File{filename=" + this.f15898a + ", contents=" + Arrays.toString(this.f15899b) + "}";
    }

    private C10508f(String str, byte[] bArr) {
        this.f15898a = str;
        this.f15899b = bArr;
    }
}
