package p172n6;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p113h8.C8030b;
import p192p6.C9063a;

/* renamed from: n6.b */
/* compiled from: FirebaseABTesting */
public class C8930b {

    /* renamed from: a */
    private final C8030b<C9063a> f12961a;

    /* renamed from: b */
    private final String f12962b;
    @Nullable

    /* renamed from: c */
    private Integer f12963c = null;

    public C8930b(Context context, C8030b<C9063a> bVar, String str) {
        this.f12961a = bVar;
        this.f12962b = str;
    }

    /* renamed from: a */
    private void m18070a(C9063a.C9066c cVar) {
        this.f12961a.get().mo30046b(cVar);
    }

    /* renamed from: b */
    private void m18071b(List<C8929a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(m18073d());
        int g = m18076g();
        for (C8929a next : list) {
            while (arrayDeque.size() >= g) {
                m18077i(((C9063a.C9066c) arrayDeque.pollFirst()).f13185b);
            }
            C9063a.C9066c d = next.mo43068d(this.f12962b);
            m18070a(d);
            arrayDeque.offer(d);
        }
    }

    /* renamed from: c */
    private static List<C8929a> m18072c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> a : list) {
            arrayList.add(C8929a.m18063a(a));
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: d */
    private List<C9063a.C9066c> m18073d() {
        return this.f12961a.get().mo30050e(this.f12962b, "");
    }

    /* renamed from: e */
    private ArrayList<C8929a> m18074e(List<C8929a> list, Set<String> set) {
        ArrayList<C8929a> arrayList = new ArrayList<>();
        for (C8929a next : list) {
            if (!set.contains(next.mo43066b())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private ArrayList<C9063a.C9066c> m18075f(List<C9063a.C9066c> list, Set<String> set) {
        ArrayList<C9063a.C9066c> arrayList = new ArrayList<>();
        for (C9063a.C9066c next : list) {
            if (!set.contains(next.f13185b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: g */
    private int m18076g() {
        if (this.f12963c == null) {
            this.f12963c = Integer.valueOf(this.f12961a.get().mo30049d(this.f12962b));
        }
        return this.f12963c.intValue();
    }

    /* renamed from: i */
    private void m18077i(String str) {
        this.f12961a.get().clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    /* renamed from: j */
    private void m18078j(Collection<C9063a.C9066c> collection) {
        for (C9063a.C9066c cVar : collection) {
            m18077i(cVar.f13185b);
        }
    }

    /* renamed from: l */
    private void m18079l(List<C8929a> list) {
        if (list.isEmpty()) {
            mo43070h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (C8929a b : list) {
            hashSet.add(b.mo43066b());
        }
        List<C9063a.C9066c> d = m18073d();
        HashSet hashSet2 = new HashSet();
        for (C9063a.C9066c cVar : d) {
            hashSet2.add(cVar.f13185b);
        }
        m18078j(m18075f(d, hashSet));
        m18071b(m18074e(list, hashSet2));
    }

    /* renamed from: n */
    private void m18080n() {
        if (this.f12961a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @WorkerThread
    /* renamed from: h */
    public void mo43070h() {
        m18080n();
        m18078j(m18073d());
    }

    @WorkerThread
    /* renamed from: k */
    public void mo43071k(List<Map<String, String>> list) {
        m18080n();
        if (list != null) {
            m18079l(m18072c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    @WorkerThread
    /* renamed from: m */
    public void mo43072m(C8929a aVar) {
        m18080n();
        C8929a.m18064f(aVar);
        ArrayList arrayList = new ArrayList();
        Map<String, String> e = aVar.mo43069e();
        e.remove("triggerEvent");
        arrayList.add(C8929a.m18063a(e));
        m18071b(arrayList);
    }
}
