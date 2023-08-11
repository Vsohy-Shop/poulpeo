package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.p004os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10971h;
import p314bg.C10972h0;
import p314bg.C10979j0;
import p314bg.C11025u;
import p336ef.C11915r;

@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* compiled from: SavedStateHandle.kt */
public final class SavedStateHandle {
    /* access modifiers changed from: private */
    public static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    /* access modifiers changed from: private */
    public final Map<String, C11025u<Object>> flows;
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    /* access modifiers changed from: private */
    public final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;

    /* compiled from: SavedStateHandle.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            boolean z;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(SavedStateHandle.KEYS);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = parcelableArrayList.get(i);
                        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                    }
                    return new SavedStateHandle(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new SavedStateHandle();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    C12775o.m28638h(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new SavedStateHandle(hashMap);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                C12775o.m28636f(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> map) {
        C12775o.m28639i(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C2344g(this);
        linkedHashMap.putAll(map);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        MutableLiveData<T> mutableLiveData;
        SavingStateLiveData savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(str);
        if (savingStateLiveData2 instanceof MutableLiveData) {
            mutableLiveData = savingStateLiveData2;
        } else {
            mutableLiveData = null;
        }
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData = new SavingStateLiveData(this, str, this.regular.get(str));
        } else if (z) {
            this.regular.put(str, t);
            savingStateLiveData = new SavingStateLiveData(this, str, t);
        } else {
            savingStateLiveData = new SavingStateLiveData(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData);
        return savingStateLiveData;
    }

    /* access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle savedStateHandle) {
        C12775o.m28639i(savedStateHandle, "this$0");
        for (Map.Entry entry : C12716r0.m28427r(savedStateHandle.savedStateProviders).entrySet()) {
            savedStateHandle.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> keySet = savedStateHandle.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(savedStateHandle.regular.get(next));
        }
        return BundleKt.bundleOf(C11915r.m25707a(KEYS, arrayList), C11915r.m25707a(VALUES, arrayList2));
    }

    @MainThread
    public final void clearSavedStateProvider(String str) {
        C12775o.m28639i(str, "key");
        this.savedStateProviders.remove(str);
    }

    @MainThread
    public final boolean contains(String str) {
        C12775o.m28639i(str, "key");
        return this.regular.containsKey(str);
    }

    @MainThread
    public final <T> T get(String str) {
        C12775o.m28639i(str, "key");
        try {
            return this.regular.get(str);
        } catch (ClassCastException unused) {
            remove(str);
            return null;
        }
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String str) {
        C12775o.m28639i(str, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(str, false, (Object) null);
        C12775o.m28637g(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @MainThread
    public final <T> C10972h0<T> getStateFlow(String str, T t) {
        C12775o.m28639i(str, "key");
        Map<String, C11025u<Object>> map = this.flows;
        C11025u<Object> uVar = map.get(str);
        if (uVar == null) {
            if (!this.regular.containsKey(str)) {
                this.regular.put(str, t);
            }
            uVar = C10979j0.m23633a(this.regular.get(str));
            this.flows.put(str, uVar);
            map.put(str, uVar);
        }
        C10972h0<T> a = C10971h.m23594a(uVar);
        C12775o.m28637g(a, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return a;
    }

    @MainThread
    public final Set<String> keys() {
        return C12733z0.m28557j(C12733z0.m28557j(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    @MainThread
    public final <T> T remove(String str) {
        C12775o.m28639i(str, "key");
        T remove = this.regular.remove(str);
        SavingStateLiveData remove2 = this.liveDatas.remove(str);
        if (remove2 != null) {
            remove2.detach();
        }
        this.flows.remove(str);
        return remove;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(String str, T t) {
        MutableLiveData mutableLiveData;
        C12775o.m28639i(str, "key");
        if (Companion.validateValue(t)) {
            SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(str);
            if (savingStateLiveData instanceof MutableLiveData) {
                mutableLiveData = savingStateLiveData;
            } else {
                mutableLiveData = null;
            }
            if (mutableLiveData != null) {
                mutableLiveData.setValue(t);
            } else {
                this.regular.put(str, t);
            }
            C11025u uVar = this.flows.get(str);
            if (uVar != null) {
                uVar.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        C12775o.m28636f(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @MainThread
    public final void setSavedStateProvider(String str, SavedStateRegistry.SavedStateProvider savedStateProvider2) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(savedStateProvider2, "provider");
        this.savedStateProviders.put(str, savedStateProvider2);
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String str, T t) {
        C12775o.m28639i(str, "key");
        return getLiveDataInternal(str, true, t);
    }

    /* compiled from: SavedStateHandle.kt */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t) {
            super(t);
            C12775o.m28639i(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        public void setValue(T t) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t);
                C11025u uVar = (C11025u) savedStateHandle.flows.get(this.key);
                if (uVar != null) {
                    uVar.setValue(t);
                }
            }
            super.setValue(t);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            C12775o.m28639i(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C2344g(this);
    }
}
