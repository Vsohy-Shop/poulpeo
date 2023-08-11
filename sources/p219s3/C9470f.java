package p219s3;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p119i3.C8111d;
import p219s3.C9465c;
import p252v3.C9927a;

/* renamed from: s3.f */
/* compiled from: SchedulerConfig */
public abstract class C9470f {

    /* renamed from: s3.f$a */
    /* compiled from: SchedulerConfig */
    public static class C9471a {

        /* renamed from: a */
        private C9927a f14089a;

        /* renamed from: b */
        private Map<C8111d, C9472b> f14090b = new HashMap();

        /* renamed from: a */
        public C9471a mo43925a(C8111d dVar, C9472b bVar) {
            this.f14090b.put(dVar, bVar);
            return this;
        }

        /* renamed from: b */
        public C9470f mo43926b() {
            if (this.f14089a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f14090b.keySet().size() >= C8111d.values().length) {
                Map<C8111d, C9472b> map = this.f14090b;
                this.f14090b = new HashMap();
                return C9470f.m19605d(this.f14089a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        /* renamed from: c */
        public C9471a mo43927c(C9927a aVar) {
            this.f14089a = aVar;
            return this;
        }
    }

    /* renamed from: s3.f$b */
    /* compiled from: SchedulerConfig */
    public static abstract class C9472b {

        /* renamed from: s3.f$b$a */
        /* compiled from: SchedulerConfig */
        public static abstract class C9473a {
            /* renamed from: a */
            public abstract C9472b mo43915a();

            /* renamed from: b */
            public abstract C9473a mo43916b(long j);

            /* renamed from: c */
            public abstract C9473a mo43917c(Set<C9474c> set);

            /* renamed from: d */
            public abstract C9473a mo43918d(long j);
        }

        /* renamed from: a */
        public static C9473a m19616a() {
            return new C9465c.C9467b().mo43917c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo43909b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<C9474c> mo43910c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo43911d();
    }

    /* renamed from: s3.f$c */
    /* compiled from: SchedulerConfig */
    public enum C9474c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m19603a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j2 * ((long) i2)))));
    }

    /* renamed from: b */
    public static C9471a m19604b() {
        return new C9471a();
    }

    /* renamed from: d */
    static C9470f m19605d(C9927a aVar, Map<C8111d, C9472b> map) {
        return new C9464b(aVar, map);
    }

    /* renamed from: f */
    public static C9470f m19606f(C9927a aVar) {
        return m19604b().mo43925a(C8111d.DEFAULT, C9472b.m19616a().mo43916b(30000).mo43918d(86400000).mo43915a()).mo43925a(C8111d.HIGHEST, C9472b.m19616a().mo43916b(1000).mo43918d(86400000).mo43915a()).mo43925a(C8111d.VERY_LOW, C9472b.m19616a().mo43916b(86400000).mo43918d(86400000).mo43917c(m19607i(C9474c.NETWORK_UNMETERED, C9474c.DEVICE_IDLE)).mo43915a()).mo43927c(aVar).mo43926b();
    }

    /* renamed from: i */
    private static <T> Set<T> m19607i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @RequiresApi(api = 21)
    /* renamed from: j */
    private void m19608j(JobInfo.Builder builder, Set<C9474c> set) {
        if (set.contains(C9474c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C9474c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C9474c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: c */
    public JobInfo.Builder mo43923c(JobInfo.Builder builder, C8111d dVar, long j, int i) {
        builder.setMinimumLatency(mo43924g(dVar, j, i));
        m19608j(builder, mo43906h().get(dVar).mo43910c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C9927a mo43904e();

    /* renamed from: g */
    public long mo43924g(C8111d dVar, long j, int i) {
        long a = j - mo43904e().mo44504a();
        C9472b bVar = mo43906h().get(dVar);
        return Math.min(Math.max(m19603a(i, bVar.mo43909b()), a), bVar.mo43911d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<C8111d, C9472b> mo43906h();
}
