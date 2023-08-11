package p255v6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p277x6.C10450a0;

/* renamed from: v6.e */
/* compiled from: BytesBackedNativeSessionFile */
class C9968e implements C10029z {
    @Nullable

    /* renamed from: a */
    private final byte[] f14949a;
    @NonNull

    /* renamed from: b */
    private final String f14950b;
    @NonNull

    /* renamed from: c */
    private final String f14951c;

    C9968e(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr) {
        this.f14950b = str;
        this.f14951c = str2;
        this.f14949a = bArr;
    }

    @Nullable
    /* renamed from: d */
    private byte[] m20798d() {
        GZIPOutputStream gZIPOutputStream;
        if (m20799e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f14949a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: e */
    private boolean m20799e() {
        byte[] bArr = this.f14949a;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: a */
    public String mo44520a() {
        return this.f14951c;
    }

    @Nullable
    /* renamed from: b */
    public InputStream mo44521b() {
        if (m20799e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f14949a);
    }

    @Nullable
    /* renamed from: c */
    public C10450a0.C10456d.C10458b mo44522c() {
        byte[] d = m20798d();
        if (d == null) {
            return null;
        }
        return C10450a0.C10456d.C10458b.m21962a().mo45187b(d).mo45188c(this.f14950b).mo45186a();
    }
}
