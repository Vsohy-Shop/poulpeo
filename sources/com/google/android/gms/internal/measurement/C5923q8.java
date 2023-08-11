package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C5792i8;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.q8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
abstract class C5923q8<T extends C5792i8> {

    /* renamed from: a */
    private static final Logger f7304a = Logger.getLogger(C5707d8.class.getName());

    /* renamed from: b */
    private static final String f7305b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C5923q8() {
    }

    /* renamed from: b */
    static <T extends C5792i8> T m9799b(Class<T> cls) {
        String str;
        String str2;
        Class<C5923q8> cls2 = C5923q8.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C5792i8.class)) {
            str = f7305b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C5792i8) cls.cast(((C5923q8) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo34291a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C5923q8) it.next()).mo34291a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f7304a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    if (simpleName.length() != 0) {
                        str2 = "Unable to load ".concat(simpleName);
                    } else {
                        str2 = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C5792i8) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C5792i8) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo34291a();
}
