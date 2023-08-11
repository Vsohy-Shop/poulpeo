package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* compiled from: Lifecycling.kt */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final int REFLECTIVE_CALLBACK = 1;
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            C12775o.m28638h(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (GeneratedAdapter) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        String str;
        boolean z;
        boolean z2;
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR != null) {
                str = packageR.getName();
            } else {
                str = "";
            }
            C12775o.m28638h(str, "fullPackage");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C12775o.m28638h(canonicalName, HintConstants.AUTOFILL_HINT_NAME);
                canonicalName = canonicalName.substring(str.length() + 1);
                C12775o.m28638h(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            C12775o.m28638h(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(canonicalName);
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                adapterName = str + '.' + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            C12775o.m28637g(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String getAdapterName(String str) {
        C12775o.m28639i(str, "className");
        return C13754v.m31521A(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        if (cls == null || !LifecycleObserver.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object obj) {
        C12775o.m28639i(obj, "object");
        boolean z = obj instanceof LifecycleEventObserver;
        boolean z2 = obj instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (LifecycleEventObserver) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (LifecycleEventObserver) null);
        }
        if (z) {
            return (LifecycleEventObserver) obj;
        }
        Class<?> cls = obj.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
        C12775o.m28636f(list);
        List list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter((Constructor) list2.get(0), obj));
        }
        int size = list2.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i = 0; i < size; i++) {
            generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter((Constructor) list2.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> generatedConstructor = generatedConstructor(cls);
        if (generatedConstructor != null) {
            classToAdapters.put(cls, C12723v.m28509d(generatedConstructor));
            return 2;
        } else if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (isLifecycleParent(superclass)) {
                C12775o.m28638h(superclass, "superclass");
                if (getObserverConstructorType(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
                C12775o.m28636f(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class[] interfaces = cls.getInterfaces();
            C12775o.m28638h(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (isLifecycleParent(cls2)) {
                    C12775o.m28638h(cls2, "intrface");
                    if (getObserverConstructorType(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(cls2);
                    C12775o.m28636f(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            classToAdapters.put(cls, arrayList);
            return 2;
        }
    }
}
