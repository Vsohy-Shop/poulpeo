package p192p6;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: p6.a */
/* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
public interface C9063a {

    /* renamed from: p6.a$a */
    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    public interface C9064a {
        /* renamed from: a */
        void mo30053a(@NonNull Set<String> set);
    }

    /* renamed from: p6.a$b */
    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    public interface C9065b {
        /* renamed from: a */
        void mo29975a(int i, @Nullable Bundle bundle);
    }

    /* renamed from: p6.a$c */
    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    public static class C9066c {
        @NonNull

        /* renamed from: a */
        public String f13184a;
        @NonNull

        /* renamed from: b */
        public String f13185b;
        @Nullable

        /* renamed from: c */
        public Object f13186c;
        @Nullable

        /* renamed from: d */
        public String f13187d;

        /* renamed from: e */
        public long f13188e;
        @Nullable

        /* renamed from: f */
        public String f13189f;
        @Nullable

        /* renamed from: g */
        public Bundle f13190g;
        @Nullable

        /* renamed from: h */
        public String f13191h;
        @Nullable

        /* renamed from: i */
        public Bundle f13192i;

        /* renamed from: j */
        public long f13193j;
        @Nullable

        /* renamed from: k */
        public String f13194k;
        @Nullable

        /* renamed from: l */
        public Bundle f13195l;

        /* renamed from: m */
        public long f13196m;

        /* renamed from: n */
        public boolean f13197n;

        /* renamed from: o */
        public long f13198o;
    }

    @WorkerThread
    @NonNull
    /* renamed from: a */
    Map<String, Object> mo30045a(boolean z);

    /* renamed from: b */
    void mo30046b(@NonNull C9066c cVar);

    /* renamed from: c */
    void mo30047c(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle);

    @WorkerThread
    /* renamed from: d */
    int mo30049d(@Size(min = 1) @NonNull String str);

    @WorkerThread
    @NonNull
    /* renamed from: e */
    List<C9066c> mo30050e(@NonNull String str, @Size(max = 23, min = 1) @Nullable String str2);

    @Nullable
    /* renamed from: f */
    C9064a mo30051f(@NonNull String str, @NonNull C9065b bVar);

    /* renamed from: g */
    void mo30052g(@NonNull String str, @NonNull String str2, @NonNull Object obj);
}
