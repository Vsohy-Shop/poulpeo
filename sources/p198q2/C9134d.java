package p198q2;

import android.content.Intent;
import com.facebook.C4546i;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.d */
/* compiled from: CallbackManagerImpl.kt */
public final class C9134d implements C4546i {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Map<Integer, C9135a> f13315b = new HashMap();

    /* renamed from: c */
    public static final C9136b f13316c = new C9136b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Map<Integer, C9135a> f13317a = new HashMap();

    /* renamed from: q2.d$a */
    /* compiled from: CallbackManagerImpl.kt */
    public interface C9135a {
        /* renamed from: a */
        boolean mo23460a(int i, Intent intent);
    }

    /* renamed from: q2.d$b */
    /* compiled from: CallbackManagerImpl.kt */
    public static final class C9136b {
        private C9136b() {
        }

        public /* synthetic */ C9136b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final synchronized C9135a m18595b(int i) {
            return (C9135a) C9134d.f13315b.get(Integer.valueOf(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m18596d(int i, int i2, Intent intent) {
            C9135a b = m18595b(i);
            if (b != null) {
                return b.mo23460a(i2, intent);
            }
            return false;
        }

        /* renamed from: c */
        public final synchronized void mo43394c(int i, C9135a aVar) {
            C12775o.m28639i(aVar, "callback");
            if (!C9134d.f13315b.containsKey(Integer.valueOf(i))) {
                C9134d.f13315b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    /* renamed from: q2.d$c */
    /* compiled from: CallbackManagerImpl.kt */
    public enum C9137c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11);
        

        /* renamed from: b */
        private final int f13331b;

        private C9137c(int i) {
            this.f13331b = i;
        }

        /* renamed from: a */
        public final int mo43395a() {
            return FacebookSdk.getCallbackRequestCodeOffset() + this.f13331b;
        }
    }

    /* renamed from: d */
    public static final synchronized void m18590d(int i, C9135a aVar) {
        synchronized (C9134d.class) {
            f13316c.mo43394c(i, aVar);
        }
    }

    /* renamed from: a */
    public boolean mo31586a(int i, int i2, Intent intent) {
        C9135a aVar = this.f13317a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.mo23460a(i2, intent);
        }
        return f13316c.m18596d(i, i2, intent);
    }

    /* renamed from: c */
    public final void mo43393c(int i, C9135a aVar) {
        C12775o.m28639i(aVar, "callback");
        this.f13317a.put(Integer.valueOf(i), aVar);
    }
}
