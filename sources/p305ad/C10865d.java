package p305ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.iosadapters.android.content.ContextContainer;
import p440ud.C13566l;

/* renamed from: ad.d */
/* compiled from: UIScreenController */
public abstract class C10865d extends C10863b {
    @NonNull

    /* renamed from: c */
    protected final C10866a f16656c;

    /* renamed from: ad.d$a */
    /* compiled from: UIScreenController */
    public static class C10866a {
        @Nullable

        /* renamed from: a */
        protected C13566l f16657a;
        @NonNull

        /* renamed from: b */
        public final ContextContainer f16658b;
        @Nullable

        /* renamed from: c */
        public final LogoutListener f16659c;

        public C10866a(@NonNull ContextContainer contextContainer) {
            this(contextContainer, (LogoutListener) null);
        }

        @Nullable
        /* renamed from: a */
        public C13566l mo45822a() {
            return this.f16657a;
        }

        public C10866a(@NonNull C13566l lVar, @Nullable LogoutListener logoutListener) {
            this.f16657a = lVar;
            this.f16658b = lVar.mo53219b();
            this.f16659c = logoutListener;
        }

        public C10866a(@NonNull ContextContainer contextContainer, @Nullable LogoutListener logoutListener) {
            this.f16657a = null;
            this.f16658b = contextContainer;
            this.f16659c = logoutListener;
        }
    }

    public C10865d(@Nullable C10864c cVar, @NonNull C10866a aVar) {
        super(cVar);
        this.f16656c = aVar;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: l2 */
    public ContextContainer mo45820l2() {
        return this.f16656c.f16658b;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: m2 */
    public LogoutListener mo45821m2() {
        LogoutListener logoutListener = this.f16656c.f16659c;
        if (logoutListener != null) {
            return logoutListener;
        }
        throw new IllegalStateException("Trying to access a null logout listener. First, define a logout listener in the params of the controller.");
    }
}
