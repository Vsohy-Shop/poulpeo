package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.core.app.NotificationCompat;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p037b6.C2895b0;
import p037b6.C2900e;
import p037b6.C2903f0;
import p037b6.C2922p;
import p099g6.C7781c;
import p099g6.C7783e;
import p099g6.C7790l;

/* renamed from: com.google.android.play.core.assetpacks.r1 */
final class C6762r1 implements C6697b3 {

    /* renamed from: h */
    private static final C2900e f8795h = new C2900e("FakeAssetPackService");

    /* renamed from: i */
    private static final AtomicInteger f8796i = new AtomicInteger(1);

    /* renamed from: a */
    private final String f8797a;

    /* renamed from: b */
    private final C6768t f8798b;

    /* renamed from: c */
    private final C6777v0 f8799c;

    /* renamed from: d */
    private final Context f8800d;

    /* renamed from: e */
    private final C6701c2 f8801e;

    /* renamed from: f */
    private final C2895b0<Executor> f8802f;

    /* renamed from: g */
    private final Handler f8803g = new Handler(Looper.getMainLooper());

    C6762r1(File file, C6768t tVar, C6777v0 v0Var, Context context, C6701c2 c2Var, C2895b0<Executor> b0Var) {
        this.f8797a = file.getAbsolutePath();
        this.f8798b = tVar;
        this.f8799c = v0Var;
        this.f8800d = context;
        this.f8801e = c2Var;
        this.f8802f = b0Var;
    }

    /* renamed from: d */
    static long m11505d(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: e */
    private static String m11506e(File file) {
        try {
            return C6770t1.m11531a(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    /* renamed from: f */
    private final void m11507f(int i, String str, int i2) {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f8801e.mo39276a());
        bundle.putInt("session_id", i);
        File[] i3 = m11508i(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : i3) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            if (i2 == 3) {
                intent = new Intent().setData(Uri.EMPTY);
            } else {
                intent = null;
            }
            arrayList2.add(intent);
            String a = C2922p.m2381a(file);
            bundle.putParcelableArrayList(C2903f0.m2320b("chunk_intents", str, a), arrayList2);
            bundle.putString(C2903f0.m2320b("uncompressed_hash_sha256", str, a), m11506e(file));
            bundle.putLong(C2903f0.m2320b("uncompressed_size", str, a), file.length());
            arrayList.add(a);
        }
        bundle.putStringArrayList(C2903f0.m2319a("slice_ids", str), arrayList);
        bundle.putLong(C2903f0.m2319a("pack_version", str), (long) this.f8801e.mo39276a());
        bundle.putInt(C2903f0.m2319a(NotificationCompat.CATEGORY_STATUS, str), i2);
        bundle.putInt(C2903f0.m2319a("error_code", str), 0);
        bundle.putLong(C2903f0.m2319a("bytes_downloaded", str), m11505d(i2, j));
        bundle.putLong(C2903f0.m2319a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m11505d(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f8803g.post(new C6758q1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    /* renamed from: i */
    private final File[] m11508i(String str) {
        File file = new File(this.f8797a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C6754p1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File a : listFiles) {
                        if (C2922p.m2381a(a).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: a */
    public final C7781c<List<String>> mo39268a(Map<String, Long> map) {
        f8795h.mo28424f("syncPacks()", new Object[0]);
        return C7783e.m15175b(new ArrayList());
    }

    /* renamed from: b */
    public final C7781c<ParcelFileDescriptor> mo39272b(int i, String str, String str2, int i2) {
        f8795h.mo28424f("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C7790l lVar = new C7790l();
        try {
            for (File file : m11508i(str)) {
                if (C2922p.m2381a(file).equals(str2)) {
                    lVar.mo41436c(ParcelFileDescriptor.open(file, 268435456));
                    return lVar.mo41434a();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f8795h.mo28425g("getChunkFileDescriptor failed", e);
            lVar.mo41435b(new LocalTestingException("Asset Slice file not found.", e));
        } catch (LocalTestingException e2) {
            f8795h.mo28425g("getChunkFileDescriptor failed", e2);
            lVar.mo41435b(e2);
        }
    }

    /* renamed from: c */
    public final void mo39273c(int i, String str, String str2, int i2) {
        f8795h.mo28424f("notifyChunkTransferred", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo39356g(Intent intent) {
        this.f8798b.mo29929a(this.f8800d, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo39357h(int i, String str) {
        try {
            m11507f(i, str, 4);
        } catch (LocalTestingException e) {
            f8795h.mo28425g("notifyModuleCompleted failed", e);
        }
    }

    /* renamed from: u */
    public final void mo39274u(int i) {
        f8795h.mo28424f("notifySessionFailed", new Object[0]);
    }

    /* renamed from: a */
    public final void mo39269a() {
        f8795h.mo28424f("keepAlive", new Object[0]);
    }

    /* renamed from: a */
    public final void mo39270a(int i, String str) {
        f8795h.mo28424f("notifyModuleCompleted", new Object[0]);
        this.f8802f.mo28418a().execute(new C6750o1(this, i, str));
    }

    /* renamed from: a */
    public final void mo39271a(List<String> list) {
        f8795h.mo28424f("cancelDownload(%s)", list);
    }
}
