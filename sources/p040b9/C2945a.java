package p040b9;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.poulpeo.PLPApplication;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.AbstractProxy;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsHome;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p360id.C12136d;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13946e;
import p466yf.C13970h;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@StabilityInferred(parameters = 0)
/* renamed from: b9.a */
/* compiled from: PLPApplicationViewModel.kt */
public final class C2945a extends ViewModel {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final PLPApplication f1353a;

    @C12739f(mo50609c = "com.poulpeo.PLPApplicationViewModel$proceedToGetUserAndClearCache$2", mo50610f = "PLPApplicationViewModel.kt", mo50611l = {32}, mo50612m = "invokeSuspend")
    /* renamed from: b9.a$a */
    /* compiled from: PLPApplicationViewModel.kt */
    static final class C2946a extends C12746l implements C13088o<C13995l0, C12074d<? super Boolean>, Object> {

        /* renamed from: h */
        int f1354h;

        /* renamed from: i */
        private /* synthetic */ Object f1355i;

        /* renamed from: j */
        final /* synthetic */ C2945a f1356j;

        /* renamed from: k */
        final /* synthetic */ ContextContainer f1357k;

        /* renamed from: l */
        final /* synthetic */ IListener<PLPUser> f1358l;

        @C12739f(mo50609c = "com.poulpeo.PLPApplicationViewModel$proceedToGetUserAndClearCache$2$1", mo50610f = "PLPApplicationViewModel.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: b9.a$a$a */
        /* compiled from: PLPApplicationViewModel.kt */
        static final class C2947a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: h */
            int f1359h;

            /* renamed from: i */
            final /* synthetic */ C2945a f1360i;

            /* renamed from: j */
            final /* synthetic */ ContextContainer f1361j;

            /* renamed from: k */
            final /* synthetic */ IListener<PLPUser> f1362k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2947a(C2945a aVar, ContextContainer contextContainer, IListener<PLPUser> iListener, C12074d<? super C2947a> dVar) {
                super(2, dVar);
                this.f1360i = aVar;
                this.f1361j = contextContainer;
                this.f1362k = iListener;
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C2947a(this.f1360i, this.f1361j, this.f1362k, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C12150d.m26492c();
                if (this.f1359h == 0) {
                    C11910n.m25701b(obj);
                    this.f1360i.m2442e(this.f1361j, this.f1362k);
                    return C11921v.f18618a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C2947a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }
        }

        @C12739f(mo50609c = "com.poulpeo.PLPApplicationViewModel$proceedToGetUserAndClearCache$2$2", mo50610f = "PLPApplicationViewModel.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: b9.a$a$b */
        /* compiled from: PLPApplicationViewModel.kt */
        static final class C2948b extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: h */
            int f1363h;

            /* renamed from: i */
            final /* synthetic */ C2945a f1364i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2948b(C2945a aVar, C12074d<? super C2948b> dVar) {
                super(2, dVar);
                this.f1364i = aVar;
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C2948b(this.f1364i, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C12150d.m26492c();
                if (this.f1363h == 0) {
                    C11910n.m25701b(obj);
                    C2945a aVar = this.f1364i;
                    aVar.m2441d(aVar.f1353a);
                    return C11921v.f18618a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C2948b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2946a(C2945a aVar, ContextContainer contextContainer, IListener<PLPUser> iListener, C12074d<? super C2946a> dVar) {
            super(2, dVar);
            this.f1356j = aVar;
            this.f1357k = contextContainer;
            this.f1358l = iListener;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C2946a aVar = new C2946a(this.f1356j, this.f1357k, this.f1358l, dVar);
            aVar.f1355i = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f1354h;
            boolean z = false;
            if (i == 0) {
                C11910n.m25701b(obj);
                C13995l0 l0Var = (C13995l0) this.f1355i;
                C14054y1[] y1VarArr = {C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C2947a(this.f1356j, this.f1357k, this.f1358l, (C12074d<? super C2947a>) null), 3, (Object) null), C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C2948b(this.f1356j, (C12074d<? super C2948b>) null), 3, (Object) null)};
                this.f1354h = 1;
                if (C13946e.m32249a(C12726w.m28527n(y1VarArr), this) == c) {
                    return c;
                }
            } else if (i == 1) {
                try {
                    C11910n.m25701b(obj);
                } catch (Throwable unused) {
                    z = true;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C12735b.m28558a(z);
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super Boolean> dVar) {
            return ((C2946a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    public C2945a(PLPApplication pLPApplication) {
        C12775o.m28639i(pLPApplication, "plpApplication");
        this.f1353a = pLPApplication;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m2441d(Context context) {
        C12136d.m26461c(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m2442e(ContextContainer contextContainer, IListener<PLPUser> iListener) {
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_GET_DETAILS;
        AbstractProxy proxy = iProxyMethodType.getProxy();
        C12775o.m28637g(proxy, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.proxy.PLPDefaultProxy");
        ((PLPDefaultProxy) proxy).setUserUpdateListener(iListener);
        AbstractProxy proxy2 = ProxyMethodsHome.APP_HOME.getProxy();
        C12775o.m28637g(proxy2, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.proxy.PLPDefaultProxy");
        ((PLPDefaultProxy) proxy2).setUserUpdateListener(iListener);
        new ProxyBundleInput(contextContainer, iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null).executeProxyAction((IProxyListener) null);
    }

    /* renamed from: f */
    public final Object mo28494f(ContextContainer contextContainer, IListener<PLPUser> iListener, C12074d<? super Boolean> dVar) {
        return C13970h.m32378g(C13933b1.m32211b(), new C2946a(this, contextContainer, iListener, (C12074d<? super C2946a>) null), dVar);
    }
}
