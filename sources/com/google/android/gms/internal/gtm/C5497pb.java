package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import p286y4.C10678l;

/* renamed from: com.google.android.gms.internal.gtm.pb */
public final class C5497pb {

    /* renamed from: a */
    private final Context f6236a;

    /* renamed from: b */
    private final C5588vb f6237b;

    /* renamed from: c */
    private final ExecutorService f6238c;

    public C5497pb(Context context) {
        this(context, C5593w1.m8623a().mo33575c(C5635z1.f6756a), new C5527rb(context));
    }

    /* renamed from: d */
    private static byte[] m8357d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C10678l.m22694b(inputStream, byteArrayOutputStream);
            try {
                inputStream.close();
            } catch (IOException unused) {
                C5426l3.m8134d("Error closing stream for reading resource from disk");
                return null;
            }
        } catch (IOException unused2) {
            C5426l3.m8134d("Failed to read the resource from disk");
            try {
                inputStream.close();
            } catch (IOException unused3) {
                C5426l3.m8134d("Error closing stream for reading resource from disk");
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException unused4) {
                C5426l3.m8134d("Error closing stream for reading resource from disk");
                return null;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: i */
    private final File m8358i(String str) {
        return new File(this.f6236a.getDir("google_tagmanager", 0), m8359j(str));
    }

    /* renamed from: j */
    private static String m8359j(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            return "resource_".concat(valueOf);
        }
        return new String("resource_");
    }

    /* renamed from: a */
    public final void mo33453a(String str, C5313db dbVar) {
        this.f6238c.execute(new C5542sb(this, str, dbVar));
    }

    /* renamed from: b */
    public final void mo33454b(String str, String str2, C5313db dbVar) {
        this.f6238c.execute(new C5558tb(this, str, str2, dbVar));
    }

    /* renamed from: c */
    public final void mo33455c(String str, byte[] bArr) {
        this.f6238c.execute(new C5573ub(this, str, bArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo33456e(String str, C5313db dbVar) {
        String str2;
        C5426l3.m8133c("Starting to load a saved resource file from Disk.");
        try {
            dbVar.mo33174c(m8357d(new FileInputStream(m8358i(str))));
        } catch (FileNotFoundException unused) {
            String valueOf = String.valueOf(m8359j(str));
            if (valueOf.length() != 0) {
                str2 = "Saved resource not found: ".concat(valueOf);
            } else {
                str2 = new String("Saved resource not found: ");
            }
            C5426l3.m8135e(str2);
            dbVar.mo33173b(0, 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo33457f(String str, String str2, C5313db dbVar) {
        C5426l3.m8133c("Starting to load a default asset file from Disk.");
        if (str2 == null) {
            C5426l3.m8133c("Default asset file is not specified. Not proceeding with the loading");
            dbVar.mo33173b(0, 2);
            return;
        }
        try {
            InputStream a = this.f6237b.mo33498a(str2);
            if (a != null) {
                dbVar.mo33174c(m8357d(a));
            } else {
                dbVar.mo33173b(0, 2);
            }
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + str2.length());
            sb.append("Default asset file not found. ");
            sb.append(str);
            sb.append(". Filename: ");
            sb.append(str2);
            C5426l3.m8135e(sb.toString());
            dbVar.mo33173b(0, 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo33458g(String str, byte[] bArr) {
        File i = m8358i(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(i);
            try {
                fileOutputStream.write(bArr);
                try {
                    fileOutputStream.close();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24);
                    sb.append("Resource ");
                    sb.append(str);
                    sb.append(" saved on Disk.");
                    C5426l3.m8133c(sb.toString());
                } catch (IOException unused) {
                    C5426l3.m8135e("Error closing stream for writing resource to disk");
                }
            } catch (IOException unused2) {
                C5426l3.m8135e("Error writing resource to disk. Removing resource from disk");
                i.delete();
                try {
                    fileOutputStream.close();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24);
                    sb2.append("Resource ");
                    sb2.append(str);
                    sb2.append(" saved on Disk.");
                    C5426l3.m8133c(sb2.toString());
                } catch (IOException unused3) {
                    C5426l3.m8135e("Error closing stream for writing resource to disk");
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 24);
                    sb3.append("Resource ");
                    sb3.append(str);
                    sb3.append(" saved on Disk.");
                    C5426l3.m8133c(sb3.toString());
                } catch (IOException unused4) {
                    C5426l3.m8135e("Error closing stream for writing resource to disk");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            C5426l3.m8135e("Error opening resource file for writing");
        }
    }

    /* renamed from: h */
    public final long mo33459h(String str) {
        File i = m8358i(str);
        if (i.exists()) {
            return i.lastModified();
        }
        return 0;
    }

    private C5497pb(Context context, ExecutorService executorService, C5588vb vbVar) {
        this.f6236a = context;
        this.f6238c = executorService;
        this.f6237b = vbVar;
    }
}
