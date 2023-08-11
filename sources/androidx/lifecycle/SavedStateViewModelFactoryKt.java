package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C12775o;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* compiled from: SavedStateViewModelFactory.kt */
public final class SavedStateViewModelFactoryKt {
    /* access modifiers changed from: private */
    public static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE;
    /* access modifiers changed from: private */
    public static final List<Class<?>> VIEWMODEL_SIGNATURE;

    static {
        Class<SavedStateHandle> cls = SavedStateHandle.class;
        ANDROID_VIEWMODEL_SIGNATURE = C12726w.m28527n(Application.class, cls);
        VIEWMODEL_SIGNATURE = C12723v.m28509d(cls);
    }

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> cls, List<? extends Class<?>> list) {
        C12775o.m28639i(cls, "modelClass");
        C12775o.m28639i(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        C12775o.m28638h(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor<T> constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            C12775o.m28638h(parameterTypes, "constructor.parameterTypes");
            List g0 = C12710p.m28405g0(parameterTypes);
            if (C12775o.m28634d(list, g0)) {
                C12775o.m28637g(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != g0.size() || !g0.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        C12775o.m28639i(cls, "modelClass");
        C12775o.m28639i(constructor, "constructor");
        C12775o.m28639i(objArr, "params");
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
