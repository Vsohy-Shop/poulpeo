package com.google.android.play.core.assetpacks;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import p037b6.C2893a0;
import p037b6.C2900e;

/* renamed from: com.google.android.play.core.assetpacks.i2 */
final class C6727i2 {

    /* renamed from: h */
    private static final C2900e f8673h = new C2900e("SliceMetadataManager");

    /* renamed from: a */
    private final byte[] f8674a = new byte[8192];

    /* renamed from: b */
    private final C6792z f8675b;

    /* renamed from: c */
    private final String f8676c;

    /* renamed from: d */
    private final int f8677d;

    /* renamed from: e */
    private final long f8678e;

    /* renamed from: f */
    private final String f8679f;

    /* renamed from: g */
    private int f8680g;

    C6727i2(C6792z zVar, String str, int i, long j, String str2) {
        this.f8675b = zVar;
        this.f8676c = str;
        this.f8677d = i;
        this.f8678e = j;
        this.f8679f = str2;
        this.f8680g = -1;
    }

    /* renamed from: n */
    private final File m11396n() {
        File y = this.f8675b.mo39401y(this.f8676c, this.f8677d, this.f8678e, this.f8679f);
        if (!y.exists()) {
            y.mkdirs();
        }
        return y;
    }

    /* renamed from: o */
    private final File m11397o() {
        File n = this.f8675b.mo39391n(this.f8676c, this.f8677d, this.f8678e, this.f8679f);
        n.getParentFile().mkdirs();
        n.createNewFile();
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6723h2 mo39302a() {
        File n = this.f8675b.mo39391n(this.f8676c, this.f8677d, this.f8678e, this.f8679f);
        if (n.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(n);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C6761r0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f8680g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C6723h2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C6761r0("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable th) {
                C2893a0.m2299a(th, th);
            }
        } else {
            throw new C6761r0("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39303b(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_3D);
        properties.put("fileOffset", String.valueOf(mo39310i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f8680g));
        FileOutputStream fileOutputStream = new FileOutputStream(m11397o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo39304c(long j, byte[] bArr, int i, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo39310i(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo39305d(InputStream inputStream, long j) {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo39310i(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f8674a);
                if (read > 0) {
                    randomAccessFile.write(this.f8674a, 0, read);
                }
            } while (read == this.f8674a.length);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo39306e(String str, long j, long j2, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f8680g));
        FileOutputStream fileOutputStream = new FileOutputStream(m11397o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo39307f(byte[] bArr) {
        FileOutputStream fileOutputStream;
        this.f8680g++;
        try {
            fileOutputStream = new FileOutputStream(new File(m11396n(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.f8680g)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            throw new C6761r0("Could not write metadata file.", (Exception) e);
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo39308g(byte[] bArr, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_2D);
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f8680g));
        FileOutputStream fileOutputStream = new FileOutputStream(m11397o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File s = this.f8675b.mo39395s(this.f8676c, this.f8677d, this.f8678e, this.f8679f);
            if (s.exists()) {
                s.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(s);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                C2893a0.m2299a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C2893a0.m2299a(th, th2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo39309h(byte[] bArr, InputStream inputStream) {
        this.f8680g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo39310i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f8674a);
            while (read > 0) {
                fileOutputStream.write(this.f8674a, 0, read);
                read = inputStream.read(this.f8674a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final File mo39310i() {
        return new File(m11396n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f8680g)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo39311j(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f8680g));
        FileOutputStream fileOutputStream = new FileOutputStream(m11397o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo39312k(byte[] bArr, int i) {
        this.f8680g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo39310i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo39313l() {
        File n = this.f8675b.mo39391n(this.f8676c, this.f8677d, this.f8678e, this.f8679f);
        if (!n.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(n);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C6761r0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo39314m() {
        FileInputStream fileInputStream;
        File n = this.f8675b.mo39391n(this.f8676c, this.f8677d, this.f8678e, this.f8679f);
        if (!n.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(n);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null) {
                f8673h.mo28423e("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } else if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            f8673h.mo28423e("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }
}
