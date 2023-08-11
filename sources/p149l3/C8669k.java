package p149l3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l3.k */
/* compiled from: MetadataBackendRegistry */
class C8669k implements C8661e {

    /* renamed from: a */
    private final C8670a f12397a;

    /* renamed from: b */
    private final C8667i f12398b;

    /* renamed from: c */
    private final Map<String, C8672m> f12399c;

    /* renamed from: l3.k$a */
    /* compiled from: MetadataBackendRegistry */
    static class C8670a {

        /* renamed from: a */
        private final Context f12400a;

        /* renamed from: b */
        private Map<String, String> f12401b = null;

        C8670a(Context context) {
            this.f12400a = context;
        }

        /* renamed from: a */
        private Map<String, String> m17433a(Context context) {
            Bundle d = m17435d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String next : d.keySet()) {
                Object obj = d.get(next);
                if ((obj instanceof String) && next.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, next.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m17434c() {
            if (this.f12401b == null) {
                this.f12401b = m17433a(this.f12400a);
            }
            return this.f12401b;
        }

        /* renamed from: d */
        private static Bundle m17435d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: b */
        public C8660d mo42752b(String str) {
            String str2 = m17434c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C8660d) Class.forName(str2).asSubclass(C8660d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e5);
                return null;
            }
        }
    }

    C8669k(Context context, C8667i iVar) {
        this(new C8670a(context), iVar);
    }

    @Nullable
    public synchronized C8672m get(String str) {
        if (this.f12399c.containsKey(str)) {
            return this.f12399c.get(str);
        }
        C8660d b = this.f12397a.mo42752b(str);
        if (b == null) {
            return null;
        }
        C8672m create = b.create(this.f12398b.mo42750a(str));
        this.f12399c.put(str, create);
        return create;
    }

    C8669k(C8670a aVar, C8667i iVar) {
        this.f12399c = new HashMap();
        this.f12397a = aVar;
        this.f12398b = iVar;
    }
}
