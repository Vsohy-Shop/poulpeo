package p255v6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p277x6.C10450a0;

/* renamed from: v6.v */
/* compiled from: FileBackedNativeSessionFile */
class C10025v implements C10029z {
    @NonNull

    /* renamed from: a */
    private final File f15092a;
    @NonNull

    /* renamed from: b */
    private final String f15093b;
    @NonNull

    /* renamed from: c */
    private final String f15094c;

    C10025v(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.f15093b = str;
        this.f15094c = str2;
        this.f15092a = file;
    }

    @Nullable
    /* renamed from: d */
    private byte[] m21025d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream b = mo44521b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (b == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (b != null) {
                            b.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = b.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            b.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (b != null) {
                    b.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    @NonNull
    /* renamed from: a */
    public String mo44520a() {
        return this.f15094c;
    }

    @Nullable
    /* renamed from: b */
    public InputStream mo44521b() {
        if (this.f15092a.exists() && this.f15092a.isFile()) {
            try {
                return new FileInputStream(this.f15092a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public C10450a0.C10456d.C10458b mo44522c() {
        byte[] d = m21025d();
        if (d != null) {
            return C10450a0.C10456d.C10458b.m21962a().mo45187b(d).mo45188c(this.f15093b).mo45186a();
        }
        return null;
    }
}
