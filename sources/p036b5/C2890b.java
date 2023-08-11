package p036b5;

import android.os.IBinder;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import p036b5.C2888a;
import p231t4.C9713p;

/* renamed from: b5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C2890b<T> extends C2888a.C2889a {

    /* renamed from: a */
    private final T f1297a;

    private C2890b(T t) {
        this.f1297a = t;
    }

    @NonNull
    /* renamed from: J */
    public static <T> T m2296J(@NonNull C2888a aVar) {
        if (aVar instanceof C2890b) {
            return ((C2890b) aVar).f1297a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C9713p.m20275j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @NonNull
    /* renamed from: b3 */
    public static <T> C2888a m2297b3(@NonNull T t) {
        return new C2890b(t);
    }
}
