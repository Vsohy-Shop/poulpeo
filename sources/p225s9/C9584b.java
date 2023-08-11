package p225s9;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.utils_common.IListener;
import java.util.List;
import p258v9.C10058c;
import p269w9.C10153a;
import p305ad.C10863b;
import p305ad.C10864c;
import p440ud.C13567m;

/* renamed from: s9.b */
/* compiled from: BaseSectionController */
public abstract class C9584b extends C10863b {

    /* renamed from: c */
    protected final int f14269c = Constants.MINIMAL_ERROR_STATUS_CODE;

    /* renamed from: d */
    protected final int f14270d = 500;
    @NonNull

    /* renamed from: e */
    protected final C9586b f14271e;

    /* renamed from: f */
    protected int f14272f;

    /* renamed from: g */
    protected int f14273g = 2;

    /* renamed from: s9.b$a */
    /* compiled from: BaseSectionController */
    public static class C9585a {
        @NonNull

        /* renamed from: a */
        public final BasePageSection f14274a;
        @Nullable

        /* renamed from: b */
        public final C10058c f14275b;

        public C9585a(@NonNull BasePageSection basePageSection, @Nullable C10058c cVar) {
            this.f14274a = basePageSection;
            this.f14275b = cVar;
        }
    }

    /* renamed from: s9.b$b */
    /* compiled from: BaseSectionController */
    public static class C9586b {
        @Nullable

        /* renamed from: a */
        public final CallManager f14276a;
        @Nullable

        /* renamed from: b */
        public final C13567m f14277b;

        protected C9586b(@Nullable CallManager callManager, @Nullable C13567m mVar) {
            this.f14276a = callManager;
            this.f14277b = mVar;
        }
    }

    public C9584b(@Nullable C10864c cVar, @NonNull C9586b bVar) {
        super(cVar);
        this.f14271e = bVar;
        mo44055u2();
    }

    /* renamed from: M */
    private void m19895M(@NonNull List<IModel> list) {
        this.f14273g = 1000;
        m19897m2().mo28504M(list);
    }

    @NonNull
    /* renamed from: m2 */
    private C10153a m19897m2() {
        return (C10153a) this.f16655b;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void m19898r2(C9585a aVar, List list) {
        if (list != null && !list.isEmpty()) {
            C10058c cVar = aVar.f14275b;
            if (cVar != null) {
                cVar.mo44639a(m19897m2().mo28507x1(), list);
            }
            m19895M(list);
        }
    }

    /* renamed from: n2 */
    public abstract void mo28500n2(@NonNull C9585a aVar, @NonNull IListener<List<IModel>> iListener);

    /* renamed from: o2 */
    public final void mo44052o2(@NonNull C9585a aVar) {
        C10058c cVar = aVar.f14275b;
        if (cVar != null && !cVar.f15207b.contains(toString())) {
            mo44055u2();
            aVar.f14275b.f15207b.add(toString());
        }
        C10058c cVar2 = aVar.f14275b;
        if (cVar2 != null) {
            List<IModel> b = cVar2.mo44640b(m19897m2().mo28507x1());
            if (mo28501q2() && !b.isEmpty()) {
                m19895M(b);
                return;
            }
        }
        if (mo28502s2()) {
            m19897m2().mo28505j1();
        } else {
            mo28500n2(aVar, new C9583a(this, aVar));
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: p2 */
    public CallManager mo44053p2() {
        return this.f14271e.f14276a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public boolean mo28501q2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public boolean mo28502s2() {
        if (this.f14273g <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t2 */
    public void mo44054t2(int i, boolean z) {
        int i2 = this.f14273g;
        if (i2 > 0) {
            if (i >= 400 && i < 500) {
                this.f14273g = 0;
            } else if (i >= 500) {
                this.f14273g = i2 - 1;
            } else if (z) {
                this.f14273g = 0;
            }
        }
        m19897m2().mo28505j1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u2 */
    public void mo44055u2() {
        this.f14273g = 2;
        C13567m mVar = this.f14271e.f14277b;
        if (mVar != null) {
            mVar.mo53221j();
        }
    }
}
