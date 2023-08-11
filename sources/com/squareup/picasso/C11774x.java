package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import okio.C13130e;
import okio.C13133f;
import p452wd.C13697d;

/* renamed from: com.squareup.picasso.x */
/* compiled from: Utils */
final class C11774x {

    /* renamed from: a */
    static final StringBuilder f18408a = new StringBuilder();

    /* renamed from: b */
    private static final C13133f f18409b = C13133f.m29652e("RIFF");

    /* renamed from: c */
    private static final C13133f f18410c = C13133f.m29652e("WEBP");

    /* renamed from: com.squareup.picasso.x$a */
    /* compiled from: Utils */
    static class C11775a extends Handler {
        C11775a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    /* renamed from: com.squareup.picasso.x$b */
    /* compiled from: Utils */
    private static class C11776b extends Thread {
        C11776b(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.squareup.picasso.x$c */
    /* compiled from: Utils */
    static class C11777c implements ThreadFactory {
        C11777c() {
        }

        public Thread newThread(Runnable runnable) {
            return new C11776b(runnable);
        }
    }

    /* renamed from: a */
    static long m25295a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: b */
    static int m25296b(Context context) {
        boolean z;
        int i;
        ActivityManager activityManager = (ActivityManager) m25308n(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = activityManager.getLargeMemoryClass();
        } else {
            i = activityManager.getMemoryClass();
        }
        return (int) ((((long) i) * 1048576) / 7);
    }

    /* renamed from: c */
    static void m25297c() {
        if (!m25311q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: d */
    static <T> T m25298d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    static File m25299e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    static String m25300f(C11764s sVar) {
        StringBuilder sb = f18408a;
        String g = m25301g(sVar, sb);
        sb.setLength(0);
        return g;
    }

    /* renamed from: g */
    static String m25301g(C11764s sVar, StringBuilder sb) {
        String str = sVar.f18341f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(sVar.f18341f);
        } else {
            Uri uri = sVar.f18339d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(sVar.f18340e);
            }
        }
        sb.append(10);
        if (sVar.f18349n != 0.0f) {
            sb.append("rotation:");
            sb.append(sVar.f18349n);
            if (sVar.f18352q) {
                sb.append('@');
                sb.append(sVar.f18350o);
                sb.append('x');
                sb.append(sVar.f18351p);
            }
            sb.append(10);
        }
        if (sVar.mo48763c()) {
            sb.append("resize:");
            sb.append(sVar.f18343h);
            sb.append('x');
            sb.append(sVar.f18344i);
            sb.append(10);
        }
        if (sVar.f18345j) {
            sb.append("centerCrop:");
            sb.append(sVar.f18346k);
            sb.append(10);
        } else if (sVar.f18347l) {
            sb.append("centerInside");
            sb.append(10);
        }
        List<C13697d> list = sVar.f18342g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(sVar.f18342g.get(i).key());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    static void m25302h(Looper looper) {
        C11775a aVar = new C11775a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    /* renamed from: i */
    static int m25303i(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: j */
    static String m25304j(C11723c cVar) {
        return m25305k(cVar, "");
    }

    /* renamed from: k */
    static String m25305k(C11723c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C11720a h = cVar.mo48666h();
        if (h != null) {
            sb.append(h.f18186b.mo48764d());
        }
        List<C11720a> i = cVar.mo48667i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || h != null) {
                    sb.append(", ");
                }
                sb.append(i.get(i2).f18186b.mo48764d());
            }
        }
        return sb.toString();
    }

    /* renamed from: l */
    static int m25306l(Resources resources, C11764s sVar) {
        Uri uri;
        int i = sVar.f18340e;
        if (i != 0 || (uri = sVar.f18339d) == null) {
            return i;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = sVar.f18339d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + sVar.f18339d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + sVar.f18339d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + sVar.f18339d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + sVar.f18339d);
        }
    }

    /* renamed from: m */
    static Resources m25307m(Context context, C11764s sVar) {
        Uri uri;
        if (sVar.f18340e != 0 || (uri = sVar.f18339d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + sVar.f18339d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + sVar.f18339d);
        }
    }

    /* renamed from: n */
    static <T> T m25308n(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: o */
    static boolean m25309o(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    static boolean m25310p(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: q */
    static boolean m25311q() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    static boolean m25312r(C13130e eVar) {
        if (!eVar.mo52489H(0, f18409b) || !eVar.mo52489H(8, f18410c)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    static void m25313s(String str, String str2, String str3) {
        m25314t(str, str2, str3, "");
    }

    /* renamed from: t */
    static void m25314t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }
}
