package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p231t4.C9713p;
import p254v5.C9942c;
import p254v5.C9951l;

/* renamed from: com.google.android.gms.internal.gtm.o4 */
public final class C5472o4 {

    /* renamed from: p */
    private static final Pattern f6192p = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);

    /* renamed from: q */
    private static volatile C5472o4 f6193q;

    /* renamed from: r */
    private static C5475c f6194r = new C5490p4();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f6195a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9951l f6196b;

    /* renamed from: c */
    private final C9942c f6197c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5398j5 f6198d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ExecutorService f6199e;

    /* renamed from: f */
    private final ScheduledExecutorService f6200f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5549t3 f6201g;

    /* renamed from: h */
    private final C5473a f6202h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f6203i = new Object();

    /* renamed from: j */
    private String f6204j;

    /* renamed from: k */
    private String f6205k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f6206l = 1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Queue<Runnable> f6207m = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile boolean f6208n = false;

    /* renamed from: o */
    private volatile boolean f6209o = false;

    /* renamed from: com.google.android.gms.internal.gtm.o4$a */
    public static class C5473a {

        /* renamed from: a */
        private final Context f6210a;

        public C5473a(Context context) {
            this.f6210a = context;
        }

        /* renamed from: a */
        public final String[] mo33423a(String str) {
            return this.f6210a.getAssets().list(str);
        }

        /* renamed from: b */
        public final String[] mo33424b() {
            return this.f6210a.getAssets().list("");
        }
    }

    /* renamed from: com.google.android.gms.internal.gtm.o4$b */
    class C5474b extends C5335f3 {
        private C5474b() {
        }

        /* renamed from: Y */
        public final void mo33185Y(boolean z, String str) {
            C5472o4.this.f6199e.execute(new C5262a5(this, z, str));
        }

        /* synthetic */ C5474b(C5472o4 o4Var, C5490p4 p4Var) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.gtm.o4$c */
    public interface C5475c {
        /* renamed from: a */
        C5472o4 mo33425a(Context context, C9951l lVar, C9942c cVar);
    }

    C5472o4(Context context, C9951l lVar, C9942c cVar, C5398j5 j5Var, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, C5549t3 t3Var, C5473a aVar) {
        C9713p.m20275j(context);
        C9713p.m20275j(lVar);
        this.f6195a = context;
        this.f6196b = lVar;
        this.f6197c = cVar;
        this.f6198d = j5Var;
        this.f6199e = executorService;
        this.f6200f = scheduledExecutorService;
        this.f6201g = t3Var;
        this.f6202h = aVar;
    }

    /* renamed from: d */
    public static C5472o4 m8292d(Context context, C9951l lVar, C9942c cVar) {
        C9713p.m20275j(context);
        C9713p.m20275j(context);
        C5472o4 o4Var = f6193q;
        if (o4Var == null) {
            synchronized (C5472o4.class) {
                o4Var = f6193q;
                if (o4Var == null) {
                    C5472o4 a = f6194r.mo33425a(context, lVar, cVar);
                    f6193q = a;
                    o4Var = a;
                }
            }
        }
        return o4Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final Pair<String, String> m8295j(String[] strArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C5426l3.m8133c("Looking up container asset.");
        String str6 = this.f6204j;
        if (str6 != null && (str5 = this.f6205k) != null) {
            return Pair.create(str6, str5);
        }
        try {
            String[] a = this.f6202h.mo33423a("containers");
            boolean z = false;
            for (int i = 0; i < a.length; i++) {
                Pattern pattern = f6192p;
                Matcher matcher = pattern.matcher(a[i]);
                if (!matcher.matches()) {
                    C5426l3.m8134d(String.format("Ignoring container asset %s (does not match %s)", new Object[]{a[i], pattern.pattern()}));
                } else if (!z) {
                    this.f6204j = matcher.group(1);
                    String str7 = File.separator;
                    String str8 = a[i];
                    StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 10 + String.valueOf(str8).length());
                    sb.append("containers");
                    sb.append(str7);
                    sb.append(str8);
                    this.f6205k = sb.toString();
                    String valueOf = String.valueOf(this.f6204j);
                    if (valueOf.length() != 0) {
                        str4 = "Asset found for container ".concat(valueOf);
                    } else {
                        str4 = new String("Asset found for container ");
                    }
                    C5426l3.m8133c(str4);
                    z = true;
                } else {
                    String valueOf2 = String.valueOf(a[i]);
                    if (valueOf2.length() != 0) {
                        str3 = "Extra container asset found, will not be loaded: ".concat(valueOf2);
                    } else {
                        str3 = new String("Extra container asset found, will not be loaded: ");
                    }
                    C5426l3.m8134d(str3);
                }
            }
            if (!z) {
                C5426l3.m8134d("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
                try {
                    String[] b = this.f6202h.mo33424b();
                    for (int i2 = 0; i2 < b.length; i2++) {
                        Matcher matcher2 = f6192p.matcher(b[i2]);
                        if (matcher2.matches()) {
                            if (!z) {
                                String group = matcher2.group(1);
                                this.f6204j = group;
                                this.f6205k = b[i2];
                                String valueOf3 = String.valueOf(group);
                                if (valueOf3.length() != 0) {
                                    str2 = "Asset found for container ".concat(valueOf3);
                                } else {
                                    str2 = new String("Asset found for container ");
                                }
                                C5426l3.m8133c(str2);
                                C5426l3.m8134d("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                                z = true;
                            } else {
                                String valueOf4 = String.valueOf(b[i2]);
                                if (valueOf4.length() != 0) {
                                    str = "Extra container asset found, will not be loaded: ".concat(valueOf4);
                                } else {
                                    str = new String("Extra container asset found, will not be loaded: ");
                                }
                                C5426l3.m8134d(str);
                            }
                        }
                    }
                } catch (IOException e) {
                    C5426l3.m8132b("Failed to enumerate assets.", e);
                    return Pair.create((Object) null, (Object) null);
                }
            }
            return Pair.create(this.f6204j, this.f6205k);
        } catch (IOException e2) {
            C5426l3.m8132b(String.format("Failed to enumerate assets in folder %s", new Object[]{"containers"}), e2);
            return Pair.create((Object) null, (Object) null);
        }
    }

    /* renamed from: l */
    private static boolean m8297l(Context context, String str) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), str), 0);
            if (serviceInfo == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo33420f() {
        String str;
        C5426l3.m8133c("Initializing Tag Manager.");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f6203i) {
            if (!this.f6208n) {
                try {
                    if (!m8297l(this.f6195a, "com.google.android.gms.tagmanager.TagManagerService")) {
                        C5426l3.m8134d("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                        this.f6208n = true;
                        return;
                    }
                    Pair<String, String> j = m8295j((String[]) null);
                    String str2 = (String) j.first;
                    String str3 = (String) j.second;
                    if (str2 == null || str3 == null) {
                        C5426l3.m8134d("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                    } else {
                        if (str2.length() != 0) {
                            str = "Loading container ".concat(str2);
                        } else {
                            str = new String("Loading container ");
                        }
                        C5426l3.m8136f(str);
                        this.f6199e.execute(new C5566u4(this, str2, str3, (String) null));
                        this.f6200f.schedule(new C5581v4(this), 5000, TimeUnit.MILLISECONDS);
                        if (!this.f6209o) {
                            C5426l3.m8136f("Installing Tag Manager event handler.");
                            this.f6209o = true;
                            this.f6196b.mo35444E2(new C5505q4(this));
                            try {
                                this.f6196b.mo35446t1(new C5535s4(this));
                            } catch (RemoteException e) {
                                C5503q2.m8409b("Error communicating with measurement proxy: ", e, this.f6195a);
                            }
                            this.f6195a.registerComponentCallbacks(new C5610x4(this));
                            C5426l3.m8136f("Tag Manager event handler installed.");
                        }
                    }
                    this.f6208n = true;
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("Tag Manager initilization took ");
                    sb.append(currentTimeMillis2);
                    sb.append("ms");
                    C5426l3.m8136f(sb.toString());
                } catch (RemoteException e2) {
                    C5503q2.m8409b("Error communicating with measurement proxy: ", e2, this.f6195a);
                } catch (Throwable th) {
                    this.f6208n = true;
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo33421h(Uri uri) {
        this.f6199e.execute(new C5638z4(this, uri));
    }

    @WorkerThread
    /* renamed from: i */
    public final void mo33422i(String[] strArr) {
        String str;
        C5426l3.m8133c("Initializing Tag Manager.");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f6203i) {
            if (!this.f6208n) {
                try {
                    if (!m8297l(this.f6195a, "com.google.android.gms.tagmanager.TagManagerService")) {
                        C5426l3.m8134d("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                        this.f6208n = true;
                        return;
                    }
                    Pair<String, String> j = m8295j((String[]) null);
                    String str2 = (String) j.first;
                    String str3 = (String) j.second;
                    if (str2 == null || str3 == null) {
                        C5426l3.m8134d("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                    } else {
                        if (str2.length() != 0) {
                            str = "Loading container ".concat(str2);
                        } else {
                            str = new String("Loading container ");
                        }
                        C5426l3.m8136f(str);
                        this.f6199e.execute(new C5566u4(this, str2, str3, (String) null));
                        this.f6200f.schedule(new C5581v4(this), 5000, TimeUnit.MILLISECONDS);
                        if (!this.f6209o) {
                            C5426l3.m8136f("Installing Tag Manager event handler.");
                            this.f6209o = true;
                            this.f6196b.mo35444E2(new C5505q4(this));
                            try {
                                this.f6196b.mo35446t1(new C5535s4(this));
                            } catch (RemoteException e) {
                                C5503q2.m8409b("Error communicating with measurement proxy: ", e, this.f6195a);
                            }
                            this.f6195a.registerComponentCallbacks(new C5610x4(this));
                            C5426l3.m8136f("Tag Manager event handler installed.");
                        }
                    }
                    this.f6208n = true;
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("Tag Manager initilization took ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append("ms");
                    C5426l3.m8136f(sb.toString());
                } catch (RemoteException e2) {
                    C5503q2.m8409b("Error communicating with measurement proxy: ", e2, this.f6195a);
                } catch (Throwable th) {
                    this.f6208n = true;
                    throw th;
                }
            }
        }
    }
}
