package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.u1 */
final class C6774u1 {

    /* renamed from: a */
    private byte[] f8875a = new byte[4096];

    /* renamed from: b */
    private int f8876b;

    /* renamed from: c */
    private long f8877c;

    /* renamed from: d */
    private long f8878d;

    /* renamed from: e */
    private int f8879e;

    /* renamed from: f */
    private int f8880f;

    /* renamed from: g */
    private int f8881g;

    /* renamed from: h */
    private boolean f8882h;
    @Nullable

    /* renamed from: i */
    private String f8883i;

    public C6774u1() {
        mo39372e();
    }

    /* renamed from: a */
    private final int m11541a(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f8876b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f8875a, this.f8876b, min);
        int i5 = this.f8876b + min;
        this.f8876b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    /* renamed from: b */
    public final int mo39369b(byte[] bArr, int i, int i2) {
        int a = m11541a(30, bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        if (this.f8877c == -1) {
            long e = C6770t1.m11535e(this.f8875a, 0);
            this.f8877c = e;
            if (e == 67324752) {
                this.f8882h = false;
                this.f8878d = C6770t1.m11535e(this.f8875a, 18);
                this.f8881g = C6770t1.m11537g(this.f8875a, 8);
                this.f8879e = C6770t1.m11537g(this.f8875a, 26);
                int g = this.f8879e + 30 + C6770t1.m11537g(this.f8875a, 28);
                this.f8880f = g;
                int length = this.f8875a.length;
                if (length < g) {
                    do {
                        length += length;
                    } while (length < g);
                    this.f8875a = Arrays.copyOf(this.f8875a, length);
                }
            } else {
                this.f8882h = true;
            }
        }
        int a2 = m11541a(this.f8880f, bArr, i + a, i2 - a);
        if (a2 == -1) {
            return -1;
        }
        int i3 = a + a2;
        if (!this.f8882h && this.f8883i == null) {
            this.f8883i = new String(this.f8875a, 30, this.f8879e);
        }
        return i3;
    }

    /* renamed from: c */
    public final C6751o2 mo39370c() {
        int i = this.f8876b;
        int i2 = this.f8880f;
        if (i < i2) {
            return C6751o2.m11490a(this.f8883i, this.f8878d, this.f8881g, true, Arrays.copyOf(this.f8875a, i), this.f8882h);
        }
        C6751o2 a = C6751o2.m11490a(this.f8883i, this.f8878d, this.f8881g, false, Arrays.copyOf(this.f8875a, i2), this.f8882h);
        mo39372e();
        return a;
    }

    /* renamed from: d */
    public final int mo39371d() {
        return this.f8880f;
    }

    /* renamed from: e */
    public final void mo39372e() {
        this.f8876b = 0;
        this.f8879e = -1;
        this.f8877c = -1;
        this.f8882h = false;
        this.f8880f = 30;
        this.f8878d = -1;
        this.f8881g = -1;
        this.f8883i = null;
    }
}
