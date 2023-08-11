package p044c1;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: c1.d */
/* compiled from: GifHeaderParser */
public class C3869d {

    /* renamed from: a */
    private final byte[] f2919a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f2920b;

    /* renamed from: c */
    private C3868c f2921c;

    /* renamed from: d */
    private int f2922d = 0;

    /* renamed from: b */
    private boolean m4294b() {
        if (this.f2921c.f2907b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private int m4295d() {
        try {
            return this.f2920b.get() & 255;
        } catch (Exception unused) {
            this.f2921c.f2907b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m4296e() {
        boolean z;
        this.f2921c.f2909d.f2895a = m4305n();
        this.f2921c.f2909d.f2896b = m4305n();
        this.f2921c.f2909d.f2897c = m4305n();
        this.f2921c.f2909d.f2898d = m4305n();
        int d = m4295d();
        boolean z2 = false;
        if ((d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C3867b bVar = this.f2921c.f2909d;
        if ((d & 64) != 0) {
            z2 = true;
        }
        bVar.f2899e = z2;
        if (z) {
            bVar.f2905k = m4298g(pow);
        } else {
            bVar.f2905k = null;
        }
        this.f2921c.f2909d.f2904j = this.f2920b.position();
        m4308r();
        if (!m4294b()) {
            C3868c cVar = this.f2921c;
            cVar.f2908c++;
            cVar.f2910e.add(cVar.f2909d);
        }
    }

    /* renamed from: f */
    private void m4297f() {
        int d = m4295d();
        this.f2922d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f2922d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f2920b.get(this.f2919a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f2922d, e);
                    }
                    this.f2921c.f2907b = 1;
                    return;
                }
            }
        }
    }

    @Nullable
    /* renamed from: g */
    private int[] m4298g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f2920b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f2921c.f2907b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m4299h() {
        m4300i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m4300i(int i) {
        boolean z = false;
        while (!z && !m4294b() && this.f2921c.f2908c <= i) {
            int d = m4295d();
            if (d == 33) {
                int d2 = m4295d();
                if (d2 == 1) {
                    m4307q();
                } else if (d2 == 249) {
                    this.f2921c.f2909d = new C3867b();
                    m4301j();
                } else if (d2 == 254) {
                    m4307q();
                } else if (d2 != 255) {
                    m4307q();
                } else {
                    m4297f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f2919a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m4304m();
                    } else {
                        m4307q();
                    }
                }
            } else if (d == 44) {
                C3868c cVar = this.f2921c;
                if (cVar.f2909d == null) {
                    cVar.f2909d = new C3867b();
                }
                m4296e();
            } else if (d != 59) {
                this.f2921c.f2907b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m4301j() {
        m4295d();
        int d = m4295d();
        C3867b bVar = this.f2921c.f2909d;
        int i = (d & 28) >> 2;
        bVar.f2901g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f2901g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        bVar.f2900f = z;
        int n = m4305n();
        if (n < 2) {
            n = 10;
        }
        C3867b bVar2 = this.f2921c.f2909d;
        bVar2.f2903i = n * 10;
        bVar2.f2902h = m4295d();
        m4295d();
    }

    /* renamed from: k */
    private void m4302k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m4295d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f2921c.f2907b = 1;
            return;
        }
        m4303l();
        if (this.f2921c.f2913h && !m4294b()) {
            C3868c cVar = this.f2921c;
            cVar.f2906a = m4298g(cVar.f2914i);
            C3868c cVar2 = this.f2921c;
            cVar2.f2917l = cVar2.f2906a[cVar2.f2915j];
        }
    }

    /* renamed from: l */
    private void m4303l() {
        boolean z;
        this.f2921c.f2911f = m4305n();
        this.f2921c.f2912g = m4305n();
        int d = m4295d();
        C3868c cVar = this.f2921c;
        if ((d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        cVar.f2913h = z;
        cVar.f2914i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f2921c.f2915j = m4295d();
        this.f2921c.f2916k = m4295d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4304m() {
        /*
            r3 = this;
        L_0x0000:
            r3.m4297f()
            byte[] r0 = r3.f2919a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            c1.c r2 = r3.f2921c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f2918m = r0
        L_0x001b:
            int r0 = r3.f2922d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.m4294b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p044c1.C3869d.m4304m():void");
    }

    /* renamed from: n */
    private int m4305n() {
        return this.f2920b.getShort();
    }

    /* renamed from: o */
    private void m4306o() {
        this.f2920b = null;
        Arrays.fill(this.f2919a, (byte) 0);
        this.f2921c = new C3868c();
        this.f2922d = 0;
    }

    /* renamed from: q */
    private void m4307q() {
        int d;
        do {
            d = m4295d();
            this.f2920b.position(Math.min(this.f2920b.position() + d, this.f2920b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    private void m4308r() {
        m4295d();
        m4307q();
    }

    /* renamed from: a */
    public void mo29909a() {
        this.f2920b = null;
        this.f2921c = null;
    }

    @NonNull
    /* renamed from: c */
    public C3868c mo29910c() {
        if (this.f2920b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m4294b()) {
            return this.f2921c;
        } else {
            m4302k();
            if (!m4294b()) {
                m4299h();
                C3868c cVar = this.f2921c;
                if (cVar.f2908c < 0) {
                    cVar.f2907b = 1;
                }
            }
            return this.f2921c;
        }
    }

    /* renamed from: p */
    public C3869d mo29911p(@NonNull ByteBuffer byteBuffer) {
        m4306o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f2920b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f2920b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
