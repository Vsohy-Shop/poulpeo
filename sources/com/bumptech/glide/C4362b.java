package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C4407j;
import com.bumptech.glide.load.resource.bitmap.C4438a;
import com.bumptech.glide.load.resource.bitmap.C4440b;
import com.bumptech.glide.load.resource.bitmap.C4441b0;
import com.bumptech.glide.load.resource.bitmap.C4450c;
import com.bumptech.glide.load.resource.bitmap.C4453f;
import com.bumptech.glide.load.resource.bitmap.C4455h;
import com.bumptech.glide.load.resource.bitmap.C4467m;
import com.bumptech.glide.load.resource.bitmap.C4473p;
import com.bumptech.glide.load.resource.bitmap.C4478s;
import com.bumptech.glide.load.resource.bitmap.C4480u;
import com.bumptech.glide.load.resource.bitmap.C4483w;
import com.bumptech.glide.load.resource.bitmap.C4484x;
import com.bumptech.glide.load.resource.bitmap.C4488z;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p044c1.C3865a;
import p058d1.C7224i;
import p070e1.C7435k;
import p070e1.C7438m;
import p106h1.C7883b;
import p106h1.C7885d;
import p117i1.C8077h;
import p137k1.C8434a;
import p137k1.C8438b;
import p137k1.C8445c;
import p137k1.C8446d;
import p137k1.C8449e;
import p137k1.C8454f;
import p137k1.C8462g;
import p137k1.C8469k;
import p137k1.C8488s;
import p137k1.C8493t;
import p137k1.C8494u;
import p137k1.C8498v;
import p137k1.C8501w;
import p137k1.C8506x;
import p147l1.C8636a;
import p147l1.C8638b;
import p147l1.C8640c;
import p147l1.C8642d;
import p147l1.C8644e;
import p147l1.C8651h;
import p167n1.C8876a;
import p177o1.C8950d;
import p177o1.C8951e;
import p187p1.C9046a;
import p197q1.C9098a;
import p197q1.C9102c;
import p197q1.C9104d;
import p197q1.C9111h;
import p197q1.C9113j;
import p207r1.C9360a;
import p207r1.C9361b;
import p207r1.C9362c;
import p207r1.C9363d;
import p217s1.C9429d;
import p217s1.C9439l;
import p228t1.C9593b;
import p228t1.C9595d;
import p250v1.C9919e;
import p250v1.C9920f;
import p261w1.C10102b;
import p261w1.C10104d;
import p294z1.C10791j;
import p294z1.C10792k;

/* renamed from: com.bumptech.glide.b */
/* compiled from: Glide */
public class C4362b implements ComponentCallbacks2 {

    /* renamed from: m */
    private static volatile C4362b f3662m;

    /* renamed from: n */
    private static volatile boolean f3663n;

    /* renamed from: b */
    private final C4407j f3664b;

    /* renamed from: c */
    private final C7885d f3665c;

    /* renamed from: d */
    private final C8077h f3666d;

    /* renamed from: e */
    private final C4366d f3667e;

    /* renamed from: f */
    private final Registry f3668f;

    /* renamed from: g */
    private final C7883b f3669g;

    /* renamed from: h */
    private final C9439l f3670h;

    /* renamed from: i */
    private final C9429d f3671i;

    /* renamed from: j */
    private final List<C4371h> f3672j = new ArrayList();

    /* renamed from: k */
    private final C4363a f3673k;

    /* renamed from: l */
    private C4367e f3674l = C4367e.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    /* compiled from: Glide */
    public interface C4363a {
        @NonNull
        C9920f build();
    }

    C4362b(@NonNull Context context, @NonNull C4407j jVar, @NonNull C8077h hVar, @NonNull C7885d dVar, @NonNull C7883b bVar, @NonNull C9439l lVar, @NonNull C9429d dVar2, int i, @NonNull C4363a aVar, @NonNull Map<Class<?>, C4374i<?, ?>> map, @NonNull List<C9919e<Object>> list, boolean z, boolean z2) {
        C7224i iVar;
        C7224i iVar2;
        Registry registry;
        Context context2 = context;
        C7885d dVar3 = dVar;
        C7883b bVar2 = bVar;
        this.f3664b = jVar;
        this.f3665c = dVar3;
        this.f3669g = bVar2;
        this.f3666d = hVar;
        this.f3670h = lVar;
        this.f3671i = dVar2;
        this.f3673k = aVar;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.f3668f = registry2;
        registry2.mo31171o(new DefaultImageHeaderParser());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            registry2.mo31171o(new C4473p());
        }
        List<ImageHeaderParser> g = registry2.mo31163g();
        C9098a aVar2 = new C9098a(context2, g, dVar3, bVar2);
        C7224i<ParcelFileDescriptor, Bitmap> h = C4441b0.m5349h(dVar);
        C4467m mVar = new C4467m(registry2.mo31163g(), resources.getDisplayMetrics(), dVar3, bVar2);
        if (!z2 || i2 < 28) {
            iVar = new C4453f(mVar);
            iVar2 = new C4484x(mVar, bVar2);
        } else {
            iVar2 = new C4478s();
            iVar = new C4455h();
        }
        C8950d dVar4 = new C8950d(context2);
        C8488s.C8491c cVar = new C8488s.C8491c(resources);
        C8488s.C8492d dVar5 = new C8488s.C8492d(resources);
        C8488s.C8490b bVar3 = new C8488s.C8490b(resources);
        int i3 = i2;
        C8488s.C8489a aVar3 = new C8488s.C8489a(resources);
        C4450c cVar2 = new C4450c(bVar2);
        C8488s.C8489a aVar4 = aVar3;
        C9360a aVar5 = new C9360a();
        C9363d dVar6 = new C9363d();
        ContentResolver contentResolver = context.getContentResolver();
        C8488s.C8492d dVar7 = dVar5;
        Class<ByteBuffer> cls = ByteBuffer.class;
        C8488s.C8490b bVar4 = bVar3;
        C8488s.C8491c cVar3 = cVar;
        Class<InputStream> cls2 = InputStream.class;
        C8950d dVar8 = dVar4;
        Class<Bitmap> cls3 = Bitmap.class;
        registry2.mo31158a(cls, new C8445c()).mo31158a(cls2, new C8493t(bVar2)).mo31162e("Bitmap", cls, cls3, iVar).mo31162e("Bitmap", cls2, cls3, iVar2);
        Class<ParcelFileDescriptor> cls4 = ParcelFileDescriptor.class;
        if (C7438m.m14548c()) {
            registry2.mo31162e("Bitmap", cls4, cls3, new C4480u(mVar));
        }
        Registry registry3 = registry2;
        Class<AssetFileDescriptor> cls5 = AssetFileDescriptor.class;
        Class<AssetFileDescriptor> cls6 = cls5;
        Class<BitmapDrawable> cls7 = BitmapDrawable.class;
        Registry b = registry2.mo31162e("Bitmap", cls4, cls3, h).mo31162e("Bitmap", cls5, cls3, C4441b0.m5344c(dVar)).mo31161d(cls3, cls3, C8498v.C8499a.m17031a()).mo31162e("Bitmap", cls3, cls3, new C4488z()).mo31159b(cls3, cVar2).mo31162e("BitmapDrawable", cls, cls7, new C4438a(resources, iVar)).mo31162e("BitmapDrawable", cls2, cls7, new C4438a(resources, iVar2)).mo31162e("BitmapDrawable", cls4, cls7, new C4438a(resources, h)).mo31159b(cls7, new C4440b(dVar3, cVar2));
        Class<ParcelFileDescriptor> cls8 = cls4;
        C7883b bVar5 = bVar;
        Class<C9102c> cls9 = C9102c.class;
        Class<C3865a> cls10 = C3865a.class;
        Registry e = b.mo31162e("Gif", cls2, cls9, new C9113j(g, aVar2, bVar5)).mo31162e("Gif", cls, cls9, aVar2).mo31159b(cls9, new C9104d()).mo31161d(cls10, cls10, C8498v.C8499a.m17031a()).mo31162e("Bitmap", cls10, cls3, new C9111h(dVar3));
        Class<Uri> cls11 = Uri.class;
        Class<Drawable> cls12 = Drawable.class;
        C8950d dVar9 = dVar8;
        Class<File> cls13 = File.class;
        e.mo31160c(cls11, cls12, dVar9).mo31160c(cls11, cls3, new C4483w(dVar9, dVar3)).mo31172p(new C8876a.C8877a()).mo31161d(cls13, cls, new C8446d.C8448b()).mo31161d(cls13, cls2, new C8454f.C8460e()).mo31160c(cls13, cls13, new C9046a()).mo31161d(cls13, cls8, new C8454f.C8456b()).mo31161d(cls13, cls13, C8498v.C8499a.m17031a()).mo31172p(new C7435k.C7436a(bVar5));
        if (C7438m.m14548c()) {
            registry = registry3;
            registry.mo31172p(new C7438m.C7439a());
        } else {
            registry = registry3;
        }
        Class cls14 = Integer.TYPE;
        C8488s.C8491c cVar4 = cVar3;
        C8488s.C8490b bVar6 = bVar4;
        Class<C9102c> cls15 = cls9;
        Class<Integer> cls16 = Integer.class;
        Registry d = registry.mo31161d(cls14, cls2, cVar4).mo31161d(cls14, cls8, bVar6).mo31161d(cls16, cls2, cVar4).mo31161d(cls16, cls8, bVar6);
        C8488s.C8492d dVar10 = dVar7;
        C8488s.C8489a aVar6 = aVar4;
        Class<AssetFileDescriptor> cls17 = cls6;
        Class<String> cls18 = String.class;
        Context context3 = context;
        d.mo31161d(cls16, cls11, dVar10).mo31161d(cls14, cls17, aVar6).mo31161d(cls16, cls17, aVar6).mo31161d(cls14, cls11, dVar10).mo31161d(cls18, cls2, new C8449e.C8452c()).mo31161d(cls11, cls2, new C8449e.C8452c()).mo31161d(cls18, cls2, new C8494u.C8497c()).mo31161d(cls18, cls8, new C8494u.C8496b()).mo31161d(cls18, cls17, new C8494u.C8495a()).mo31161d(cls11, cls2, new C8638b.C8639a()).mo31161d(cls11, cls2, new C8434a.C8437c(context.getAssets())).mo31161d(cls11, cls8, new C8434a.C8436b(context.getAssets())).mo31161d(cls11, cls2, new C8640c.C8641a(context3)).mo31161d(cls11, cls2, new C8642d.C8643a(context3));
        if (i3 >= 29) {
            registry.mo31161d(cls11, cls2, new C8644e.C8647c(context3));
            registry.mo31161d(cls11, cls8, new C8644e.C8646b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        Class<C8462g> cls19 = C8462g.class;
        Class<byte[]> cls20 = byte[].class;
        Registry q = registry.mo31161d(cls11, cls2, new C8501w.C8505d(contentResolver2)).mo31161d(cls11, cls8, new C8501w.C8503b(contentResolver2)).mo31161d(cls11, cls17, new C8501w.C8502a(contentResolver2)).mo31161d(cls11, cls2, new C8506x.C8507a()).mo31161d(URL.class, cls2, new C8651h.C8652a()).mo31161d(cls11, cls13, new C8469k.C8470a(context3)).mo31161d(cls19, cls2, new C8636a.C8637a()).mo31161d(cls20, cls, new C8438b.C8439a()).mo31161d(cls20, cls2, new C8438b.C8443d()).mo31161d(cls11, cls11, C8498v.C8499a.m17031a()).mo31161d(cls12, cls12, C8498v.C8499a.m17031a()).mo31160c(cls12, cls12, new C8951e()).mo31173q(cls3, cls7, new C9361b(resources));
        C9360a aVar7 = aVar5;
        C9363d dVar11 = dVar6;
        q.mo31173q(cls3, cls20, aVar7).mo31173q(cls12, cls20, new C9362c(dVar, aVar7, dVar11)).mo31173q(cls15, cls20, dVar11);
        C7224i<ByteBuffer, Bitmap> d2 = C4441b0.m5345d(dVar);
        registry.mo31160c(cls, cls3, d2);
        registry.mo31160c(cls, cls7, new C4438a(resources, d2));
        this.f3667e = new C4366d(context, bVar, registry, new C10102b(), aVar, map, list, jVar, z, i);
    }

    @GuardedBy("Glide.class")
    /* renamed from: a */
    private static void m5040a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f3663n) {
            f3663n = true;
            m5044m(context, generatedAppGlideModule);
            f3663n = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @NonNull
    /* renamed from: c */
    public static C4362b m5041c(@NonNull Context context) {
        if (f3662m == null) {
            GeneratedAppGlideModule d = m5042d(context.getApplicationContext());
            synchronized (C4362b.class) {
                if (f3662m == null) {
                    m5040a(context, d);
                }
            }
        }
        return f3662m;
    }

    @Nullable
    /* renamed from: d */
    private static GeneratedAppGlideModule m5042d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e) {
            m5046q(e);
        } catch (IllegalAccessException e2) {
            m5046q(e2);
        } catch (NoSuchMethodException e3) {
            m5046q(e3);
        } catch (InvocationTargetException e4) {
            m5046q(e4);
        }
        return null;
    }

    @NonNull
    /* renamed from: l */
    private static C9439l m5043l(@Nullable Context context) {
        C10791j.m22949e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m5041c(context).mo31182k();
    }

    @GuardedBy("Glide.class")
    /* renamed from: m */
    private static void m5044m(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        m5045n(context, new C4364c(), generatedAppGlideModule);
    }

    @GuardedBy("Glide.class")
    /* renamed from: n */
    private static void m5045n(@NonNull Context context, @NonNull C4364c cVar, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        C9439l.C9441b bVar;
        Context applicationContext = context.getApplicationContext();
        List<C9593b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo44057c()) {
            emptyList = new C9595d(applicationContext).mo44061a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo31156d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo31156d();
            Iterator<C9593b> it = emptyList.iterator();
            while (it.hasNext()) {
                C9593b next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C9593b bVar2 : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + bVar2.getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVar = generatedAppGlideModule.mo31157e();
        } else {
            bVar = null;
        }
        cVar.mo31192b(bVar);
        for (C9593b a : emptyList) {
            a.mo44058a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo44056b(applicationContext, cVar);
        }
        C4362b a2 = cVar.mo31191a(applicationContext);
        for (C9593b next2 : emptyList) {
            try {
                next2.mo44059b(applicationContext, a2, a2.f3668f);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo44060a(applicationContext, a2, a2.f3668f);
        }
        applicationContext.registerComponentCallbacks(a2);
        f3662m = a2;
    }

    /* renamed from: q */
    private static void m5046q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* renamed from: t */
    public static C4371h m5047t(@NonNull Context context) {
        return m5043l(context).mo43867e(context);
    }

    /* renamed from: b */
    public void mo31175b() {
        C10792k.m22950a();
        this.f3666d.mo41909b();
        this.f3665c.mo41601b();
        this.f3669g.mo41593b();
    }

    @NonNull
    /* renamed from: e */
    public C7883b mo31176e() {
        return this.f3669g;
    }

    @NonNull
    /* renamed from: f */
    public C7885d mo31177f() {
        return this.f3665c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C9429d mo31178g() {
        return this.f3671i;
    }

    @NonNull
    /* renamed from: h */
    public Context mo31179h() {
        return this.f3667e.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public C4366d mo31180i() {
        return this.f3667e;
    }

    @NonNull
    /* renamed from: j */
    public Registry mo31181j() {
        return this.f3668f;
    }

    @NonNull
    /* renamed from: k */
    public C9439l mo31182k() {
        return this.f3670h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo31183o(C4371h hVar) {
        synchronized (this.f3672j) {
            if (!this.f3672j.contains(hVar)) {
                this.f3672j.add(hVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onLowMemory() {
        mo31175b();
    }

    public void onTrimMemory(int i) {
        mo31188r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo31187p(@NonNull C10104d<?> dVar) {
        synchronized (this.f3672j) {
            for (C4371h y : this.f3672j) {
                if (y.mo31232y(dVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo31188r(int i) {
        C10792k.m22950a();
        for (C4371h onTrimMemory : this.f3672j) {
            onTrimMemory.onTrimMemory(i);
        }
        this.f3666d.mo41901a(i);
        this.f3665c.mo41600a(i);
        this.f3669g.mo41592a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo31189s(C4371h hVar) {
        synchronized (this.f3672j) {
            if (this.f3672j.contains(hVar)) {
                this.f3672j.remove(hVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }
}
