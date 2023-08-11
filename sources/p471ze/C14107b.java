package p471ze;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p384le.C12854e;

/* renamed from: ze.b */
/* compiled from: ArrayListSupplier */
public enum C14107b implements Callable<List<Object>>, C12854e<Object, List<Object>> {
    INSTANCE;

    /* renamed from: b */
    public static <T> Callable<List<T>> m32746b() {
        return INSTANCE;
    }

    /* renamed from: a */
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    /* renamed from: c */
    public List<Object> call() {
        return new ArrayList();
    }
}
