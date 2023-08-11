package p409pc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.iosadapters.android.content.ContextContainer;
import p446vd.C13633n;
import p446vd.C13636q;

/* renamed from: pc.e */
/* compiled from: AdjustTracker */
public class C13202e {
    @NonNull

    /* renamed from: b */
    public static final C13202e f21008b = new C13202e();
    @Nullable

    /* renamed from: a */
    public String f21009a;

    /* renamed from: pc.e$a */
    /* compiled from: AdjustTracker */
    public static class C13203a {
        @NonNull

        /* renamed from: a */
        public final String f21010a;
        @NonNull

        /* renamed from: b */
        public final C13197a f21011b;

        public C13203a(@NonNull String str) {
            this.f21010a = str;
            this.f21011b = new C13197a(str);
        }

        @NonNull
        /* renamed from: a */
        public C13203a mo52848a(@NonNull String str, @NonNull String str2) {
            this.f21011b.mo52825a(str, str2);
            this.f21011b.mo52826b(str, str2);
            return this;
        }

        @NonNull
        /* renamed from: b */
        public C13203a mo52849b() {
            this.f21011b.mo52825a("userId", C13202e.f21008b.f21009a);
            return this;
        }

        /* renamed from: c */
        public void mo52850c(@NonNull ContextContainer contextContainer) {
            C13202e.f21008b.mo52847b(contextContainer, this);
        }
    }

    private C13202e() {
    }

    /* renamed from: a */
    private void m29970a(@NonNull ContextContainer contextContainer, @NonNull String str) {
        C13636q b = C13636q.m31181b(contextContainer);
        b.mo53299j("trackedAdjustEvent_" + str, true);
    }

    /* renamed from: c */
    private boolean m29971c(@NonNull ContextContainer contextContainer, @NonNull String str) {
        C13636q b = C13636q.m31181b(contextContainer);
        return b.mo53294e("trackedAdjustEvent_" + str, false);
    }

    /* renamed from: b */
    public void mo52847b(@NonNull ContextContainer contextContainer, @NonNull C13203a aVar) {
        if (m29971c(contextContainer, aVar.f21010a)) {
            C13633n.m31148d("Adjust event not tracked because tracked once before : " + aVar.f21010a);
            return;
        }
        m29970a(contextContainer, aVar.f21010a);
        C13197a.m29950d(aVar.f21011b);
        C13633n.m31148d("Adjust event tracked once : " + aVar.f21010a);
    }
}
