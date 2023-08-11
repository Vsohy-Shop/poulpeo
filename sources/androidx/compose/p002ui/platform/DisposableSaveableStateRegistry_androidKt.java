package androidx.compose.p002ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p002ui.C0954R;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11895c;

@SourceDebugExtension({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
public final class DisposableSaveableStateRegistry_androidKt {
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(savedStateRegistryOwner, "owner");
        ViewParent parent = view.getParent();
        C12775o.m28637g(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(C0954R.C0956id.compose_view_saveable_id_tag);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(str, savedStateRegistryOwner);
    }

    /* access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            Object value = snapshotMutableState.getValue();
            if (value == null) {
                return true;
            }
            return canBeSavedToBundle(value);
        } else if ((obj instanceof C11895c) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> isInstance : AcceptableClasses) {
                if (isInstance.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        C12775o.m28638h(keySet, "this.keySet()");
        for (String str : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            C12775o.m28637g(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            C12775o.m28638h(str, "key");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(String str, SavedStateRegistryOwner savedStateRegistryOwner) {
        boolean z;
        C12775o.m28639i(str, "id");
        C12775o.m28639i(savedStateRegistryOwner, "savedStateRegistryOwner");
        String str2 = SaveableStateRegistry.class.getSimpleName() + ':' + str;
        SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str2);
        SaveableStateRegistry SaveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(consumeRestoredStateForKey != null ? toMap(consumeRestoredStateForKey) : null, C1094xcceb09c3.INSTANCE);
        try {
            savedStateRegistry.registerSavedStateProvider(str2, new C1093x869765d0(SaveableStateRegistry));
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new DisposableSaveableStateRegistry(SaveableStateRegistry, new C1092xec1ea390(z, savedStateRegistry, str2));
    }
}
