package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: bo.app.e */
public final class C3103e implements SharedPreferences {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f1641a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f1642b;

    /* renamed from: c */
    private SharedPreferences f1643c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C14054y1 f1644d = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3104a(this, (C12074d<? super C3104a>) null), 3, (Object) null);

    @C12739f(mo50609c = "com.braze.storage.AsyncPrefs$storageInitJob$1", mo50610f = "AsyncPrefs.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.e$a */
    static final class C3104a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f1645b;

        /* renamed from: c */
        final /* synthetic */ C3103e f1646c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3104a(C3103e eVar, C12074d<? super C3104a> dVar) {
            super(2, dVar);
            this.f1646c = eVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3104a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C3104a(this.f1646c, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f1645b == 0) {
                C11910n.m25701b(obj);
                this.f1646c.f1641a.getSharedPreferences(this.f1646c.f1642b, 0);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C12739f(mo50609c = "com.braze.storage.AsyncPrefs$waitUntilReady$1", mo50610f = "AsyncPrefs.kt", mo50611l = {83}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.e$b */
    static final class C3105b extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f1647b;

        /* renamed from: c */
        final /* synthetic */ C3103e f1648c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3105b(C3103e eVar, C12074d<? super C3105b> dVar) {
            super(2, dVar);
            this.f1648c = eVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3105b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C3105b(this.f1648c, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f1647b;
            if (i == 0) {
                C11910n.m25701b(obj);
                C14054y1 c2 = this.f1648c.f1644d;
                this.f1647b = 1;
                if (c2.mo53703G(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }
    }

    public C3103e(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f1641a = context;
        this.f1642b = str;
    }

    public boolean contains(String str) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.contains(str);
    }

    public SharedPreferences.Editor edit() {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C12775o.m28638h(edit, "prefs.edit()");
        return edit;
    }

    public Map<String, ?> getAll() {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        C12775o.m28638h(all, "prefs.all");
        return all;
    }

    public boolean getBoolean(String str, boolean z) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, z);
    }

    public float getFloat(String str, float f) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getFloat(str, f);
    }

    public int getInt(String str, int i) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(str, i);
    }

    public long getLong(String str, long j) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getLong(str, j);
    }

    public String getString(String str, String str2) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getString(str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        return sharedPreferences.getStringSet(str, set);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        m2826a();
        SharedPreferences sharedPreferences = this.f1643c;
        if (sharedPreferences == null) {
            C12775o.m28656z("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: a */
    private final void m2826a() {
        if (!this.f1644d.mo53716j0()) {
            Object unused = C13976i.m32394b((C12079g) null, new C3105b(this, (C12074d<? super C3105b>) null), 1, (Object) null);
        }
        SharedPreferences sharedPreferences = this.f1641a.getSharedPreferences(this.f1642b, 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f1643c = sharedPreferences;
    }
}
