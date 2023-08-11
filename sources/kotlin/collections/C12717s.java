package kotlin.collections;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import p448vf.C13650g;

/* renamed from: kotlin.collections.s */
/* compiled from: BrittleContainsOptimization.kt */
public final class C12717s {
    /* renamed from: a */
    public static final <T> Collection<T> m28431a(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        if (C12719t.f20382b) {
            return C13662o.m31292y(gVar);
        }
        return C13662o.m31293z(gVar);
    }

    /* renamed from: b */
    public static final <T> Collection<T> m28432b(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        if (C12719t.f20382b) {
            return C12710p.m28404f0(tArr);
        }
        return C12708o.m28336c(tArr);
    }

    /* renamed from: c */
    public static final <T> Collection<T> m28433c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C12775o.m28639i(iterable, "<this>");
        C12775o.m28639i(iterable2, APIParams.SOURCE);
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
                return (Collection) iterable;
            }
            Collection<T> collection = (Collection) iterable;
            if (m28434d(collection)) {
                return C12686e0.m28247z0(iterable);
            }
            return collection;
        } else if (C12719t.f20382b) {
            return C12686e0.m28247z0(iterable);
        } else {
            return C12686e0.m28205B0(iterable);
        }
    }

    /* renamed from: d */
    private static final <T> boolean m28434d(Collection<? extends T> collection) {
        if (!C12719t.f20382b || collection.size() <= 2 || !(collection instanceof ArrayList)) {
            return false;
        }
        return true;
    }
}
