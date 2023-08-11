package p202q6;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p113h8.C8030b;

/* renamed from: q6.g */
/* compiled from: ComponentDiscovery */
public final class C9289g<T> {

    /* renamed from: a */
    private final T f13641a;

    /* renamed from: b */
    private final C9292c<T> f13642b;

    /* renamed from: q6.g$b */
    /* compiled from: ComponentDiscovery */
    private static class C9291b implements C9292c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f13643a;

        /* renamed from: b */
        private Bundle m19098b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f13643a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f13643a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo43578a(Context context) {
            Bundle b = m19098b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String next : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList.add(next.substring(31));
                }
            }
            return arrayList;
        }

        private C9291b(Class<? extends Service> cls) {
            this.f13643a = cls;
        }
    }

    @VisibleForTesting
    /* renamed from: q6.g$c */
    /* compiled from: ComponentDiscovery */
    interface C9292c<T> {
        /* renamed from: a */
        List<String> mo43578a(T t);
    }

    @VisibleForTesting
    C9289g(T t, C9292c<T> cVar) {
        this.f13641a = t;
        this.f13642b = cVar;
    }

    /* renamed from: c */
    public static C9289g<Context> m19094c(Context context, Class<? extends Service> cls) {
        return new C9289g<>(context, new C9291b(cls));
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: d */
    public static C9294i m19095d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (C9294i.class.isAssignableFrom(cls)) {
                return (C9294i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    /* renamed from: b */
    public List<C8030b<C9294i>> mo43577b() {
        ArrayList arrayList = new ArrayList();
        for (String fVar : this.f13642b.mo43578a(this.f13641a)) {
            arrayList.add(new C9288f(fVar));
        }
        return arrayList;
    }
}
