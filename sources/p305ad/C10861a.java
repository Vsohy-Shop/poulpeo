package p305ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11658g;
import p305ad.C10865d;
import p311bd.C10930a;
import p440ud.C13566l;

/* renamed from: ad.a */
/* compiled from: ListViewScreenController */
public abstract class C10861a extends C10865d implements C11658g {

    /* renamed from: d */
    private final boolean f16651d;
    @NonNull

    /* renamed from: e */
    protected final ProxyActionsPool f16652e;

    public C10861a(@Nullable C10864c cVar, @NonNull C10862a aVar) {
        this(cVar, aVar, true);
    }

    @NonNull
    /* renamed from: w2 */
    private C10862a m23151w2() {
        return (C10862a) this.f16656c;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: n2 */
    public C10930a mo45811n2() {
        return m23151w2().f16653d;
    }

    /* renamed from: o2 */
    public final void mo45812o2() {
        mo45813p2();
        if (this.f16651d) {
            mo45811n2().mo45960R2(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public abstract void mo45813p2();

    /* renamed from: q2 */
    public final void mo45814q2() {
        mo45815r2();
        mo45811n2().mo45960R2(false);
        this.f16652e.cancelAndRemoveAllActions();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public abstract void mo45815r2();

    /* renamed from: s2 */
    public final void mo45816s2() {
        mo45817t2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public abstract void mo45817t2();

    /* renamed from: u2 */
    public final void mo45818u2() {
        mo45819v2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public abstract void mo45819v2();

    public C10861a(@Nullable C10864c cVar, @NonNull C10862a aVar, boolean z) {
        super(cVar, aVar);
        this.f16652e = new ProxyActionsPool();
        this.f16651d = z;
        mo45811n2().mo45957O2(this);
        mo45811n2().mo45958P2(aVar.f16654e);
    }

    /* renamed from: ad.a$a */
    /* compiled from: ListViewScreenController */
    public static class C10862a extends C10865d.C10866a {

        /* renamed from: d */
        public final C10930a f16653d;

        /* renamed from: e */
        public final C11654c f16654e;

        public C10862a(@NonNull C13566l lVar, @Nullable LogoutListener logoutListener, C10930a aVar, C11654c cVar) {
            super(lVar, logoutListener);
            this.f16653d = aVar;
            this.f16654e = cVar;
        }

        public C10862a(@NonNull ContextContainer contextContainer, @Nullable LogoutListener logoutListener, C10930a aVar, C11654c cVar) {
            super(contextContainer, logoutListener);
            this.f16653d = aVar;
            this.f16654e = cVar;
        }
    }
}
