package com.rmn.apiclient.core.reflection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p446vd.C13633n;

public class ReflectionUtils {
    @NonNull
    public static Set<Field> getAllFields(@NonNull Object obj) {
        return getAllFields(obj.getClass());
    }

    @Nullable
    private static Object getDefaultValue(@NonNull Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return 0;
        }
        return 0;
    }

    @Nullable
    public static Field getField(@NonNull Object obj, @NonNull String str) {
        for (Field next : getAllFields(obj)) {
            if (str.equals(next.getName())) {
                return next;
            }
        }
        return null;
    }

    @Nullable
    public static <T> T getValue(@NonNull Object obj, @NonNull String str, @NonNull Class<T> cls) {
        Field field = getField(obj, str, cls);
        if (field == null) {
            return null;
        }
        return getValue(obj, field);
    }

    public static boolean isFieldDeclaredByCompiler(@NonNull Field field) {
        return field.getName().contains("$");
    }

    public static boolean isFieldStatic(@NonNull Field field) {
        return Modifier.isStatic(field.getModifiers());
    }

    @Nullable
    public static <T> T[] newArrayInstance(Class<T> cls, int i) {
        try {
            return (Object[]) Array.newInstance(cls, i);
        } catch (Exception e) {
            C13633n.m31165u(ReflectionUtils.class, e);
            return null;
        }
    }

    @Nullable
    public static <T> T newInstance(@NonNull Class<?> cls) {
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i = 0;
        while (true) {
            T t = null;
            Class<ReflectionUtils> cls2 = ReflectionUtils.class;
            if (i < length) {
                Constructor constructor = declaredConstructors[i];
                boolean isAccessible = constructor.isAccessible();
                constructor.setAccessible(true);
                try {
                    t = newInstanceWithDefaultParams(constructor);
                } catch (Exception e) {
                    C13633n.m31147c(cls2, e);
                }
                constructor.setAccessible(isAccessible);
                if (t != null) {
                    return t;
                }
                i++;
            } else {
                C13633n.m31163s(cls2, "The class doesn't have a constructor that accept default params.");
                return null;
            }
        }
    }

    @NonNull
    private static Object newInstanceWithDefaultParams(@NonNull Constructor<?> constructor) {
        Class[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            objArr[i] = getDefaultValue(parameterTypes[i]);
        }
        return constructor.newInstance(objArr);
    }

    public static <T> boolean setValue(@Nullable T t, @NonNull Object obj, @NonNull String str, @NonNull Class<T> cls) {
        Field field = getField(obj, str, cls);
        if (field == null) {
            return false;
        }
        return setValue(t, obj, field);
    }

    @NonNull
    private static Set<Field> getAllFields(@NonNull Class<?> cls) {
        HashSet hashSet = new HashSet();
        Class<? super Object> cls2 = cls;
        while (cls2 != null && cls2 != Object.class) {
            hashSet.addAll(Arrays.asList(cls2.getDeclaredFields()));
            cls2 = cls2.getSuperclass();
        }
        return hashSet;
    }

    @Nullable
    public static <T> Field getField(@NonNull Object obj, @NonNull String str, @NonNull Class<T> cls) {
        Field field = getField(obj, str);
        if (field != null && field.getType().isAssignableFrom(cls)) {
            return field;
        }
        return null;
    }

    @Nullable
    public static <T> T getValue(@NonNull Object obj, @NonNull Field field) {
        T t = null;
        if (isFieldDeclaredByCompiler(field) || isFieldStatic(field)) {
            return null;
        }
        boolean isAccessible = field.isAccessible();
        field.setAccessible(true);
        try {
            t = field.get(obj);
        } catch (Exception e) {
            C13633n.m31165u(ReflectionUtils.class, e);
        }
        field.setAccessible(isAccessible);
        return t;
    }

    public static <T> boolean setValue(@Nullable T t, @NonNull Object obj, @NonNull Field field) {
        boolean z = false;
        if (isFieldDeclaredByCompiler(field) || isFieldStatic(field)) {
            return false;
        }
        boolean isAccessible = field.isAccessible();
        field.setAccessible(true);
        try {
            field.set(obj, t);
            z = true;
        } catch (Exception e) {
            C13633n.m31165u(ReflectionUtils.class, e);
        }
        field.setAccessible(isAccessible);
        return z;
    }
}
