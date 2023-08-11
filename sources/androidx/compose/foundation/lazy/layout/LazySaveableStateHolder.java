package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n76#2:107\n102#2,2:108\n1855#3,2:110\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n68#1:107\n68#1:108,2\n75#1:110,2\n*E\n"})
/* compiled from: LazySaveableStateHolder.kt */
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final Set<Object> previouslyComposedKeys;
    private final MutableState wrappedHolder$delegate;
    private final SaveableStateRegistry wrappedRegistry;

    /* compiled from: LazySaveableStateHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(SaveableStateRegistry saveableStateRegistry) {
            return SaverKt.Saver(LazySaveableStateHolder$Companion$saver$1.INSTANCE, new LazySaveableStateHolder$Companion$saver$2(saveableStateRegistry));
        }
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry) {
        C12775o.m28639i(saveableStateRegistry, "wrappedRegistry");
        this.wrappedRegistry = saveableStateRegistry;
        this.wrappedHolder$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.previouslyComposedKeys = new LinkedHashSet();
    }

    @Composable
    public void SaveableStateProvider(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(obj, "key");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(-697180401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697180401, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            wrappedHolder.SaveableStateProvider(obj, oVar, startRestartGroup, (i & 112) | 520);
            EffectsKt.DisposableEffect(obj, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new LazySaveableStateHolder$SaveableStateProvider$1(this, obj), startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new LazySaveableStateHolder$SaveableStateProvider$2(this, obj, oVar, i));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public boolean canBeSaved(Object obj) {
        C12775o.m28639i(obj, "value");
        return this.wrappedRegistry.canBeSaved(obj);
    }

    public Object consumeRestored(String str) {
        C12775o.m28639i(str, "key");
        return this.wrappedRegistry.consumeRestored(str);
    }

    public final SaveableStateHolder getWrappedHolder() {
        return (SaveableStateHolder) this.wrappedHolder$delegate.getValue();
    }

    public Map<String, List<Object>> performSave() {
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            Iterator<T> it = this.previouslyComposedKeys.iterator();
            while (it.hasNext()) {
                wrappedHolder.removeState(it.next());
            }
        }
        return this.wrappedRegistry.performSave();
    }

    public SaveableStateRegistry.Entry registerProvider(String str, C13074a<? extends Object> aVar) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(aVar, "valueProvider");
        return this.wrappedRegistry.registerProvider(str, aVar);
    }

    public void removeState(Object obj) {
        C12775o.m28639i(obj, "key");
        SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            wrappedHolder.removeState(obj);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void setWrappedHolder(SaveableStateHolder saveableStateHolder) {
        this.wrappedHolder$delegate.setValue(saveableStateHolder);
    }

    public LazySaveableStateHolder(final SaveableStateRegistry saveableStateRegistry, Map<String, ? extends List<? extends Object>> map) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new Function1<Object, Boolean>() {
            public final Boolean invoke(Object obj) {
                C12775o.m28639i(obj, "it");
                SaveableStateRegistry saveableStateRegistry = saveableStateRegistry;
                return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(obj) : true);
            }
        }));
    }
}
