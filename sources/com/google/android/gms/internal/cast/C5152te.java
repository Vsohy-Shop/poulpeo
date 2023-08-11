package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.te */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5152te implements C4931ge {

    /* renamed from: a */
    private final C4982je f5544a;

    /* renamed from: b */
    private final String f5545b;

    /* renamed from: c */
    private final Object[] f5546c;

    /* renamed from: d */
    private final int f5547d;

    C5152te(C4982je jeVar, String str, Object[] objArr) {
        this.f5544a = jeVar;
        this.f5545b = str;
        this.f5546c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5547d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f5547d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo33016a() {
        return this.f5545b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo33017b() {
        return this.f5546c;
    }

    /* renamed from: x */
    public final int mo32814x() {
        if ((this.f5547d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final C4982je zza() {
        return this.f5544a;
    }

    public final boolean zzb() {
        if ((this.f5547d & 2) == 2) {
            return true;
        }
        return false;
    }
}
