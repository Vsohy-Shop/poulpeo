package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n145#2,2:143\n25#2:145\n147#2,2:152\n1114#3,6:146\n1855#4,2:154\n1#5:156\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n76#1:143,2\n77#1:145\n76#1:152,2\n77#1:146,6\n102#1:154,2\n*E\n"})
/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(SaveableStateHolderImpl$Companion$Saver$1.INSTANCE, SaveableStateHolderImpl$Companion$Saver$2.INSTANCE);
    private SaveableStateRegistry parentSaveableStateRegistry;
    /* access modifiers changed from: private */
    public final Map<Object, RegistryHolder> registryHolders;
    /* access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> savedStates;

    /* compiled from: SaveableStateHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    public final class RegistryHolder {
        private final Object key;
        private final SaveableStateRegistry registry;
        private boolean shouldSave = true;
        final /* synthetic */ SaveableStateHolderImpl this$0;

        public RegistryHolder(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            C12775o.m28639i(obj, "key");
            this.this$0 = saveableStateHolderImpl;
            this.key = obj;
            this.registry = SaveableStateRegistryKt.SaveableStateRegistry((Map) saveableStateHolderImpl.savedStates.get(obj), new SaveableStateHolderImpl$RegistryHolder$registry$1(saveableStateHolderImpl));
        }

        public final Object getKey() {
            return this.key;
        }

        public final SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void saveTo(Map<Object, Map<String, List<Object>>> map) {
            C12775o.m28639i(map, "map");
            if (this.shouldSave) {
                Map<String, List<Object>> performSave = this.registry.performSave();
                if (performSave.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, performSave);
                }
            }
        }

        public final void setShouldSave(boolean z) {
            this.shouldSave = z;
        }
    }

    public SaveableStateHolderImpl() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> u = C12716r0.m28430u(this.savedStates);
        for (RegistryHolder saveTo : this.registryHolders.values()) {
            saveTo.saveTo(u);
        }
        if (u.isEmpty()) {
            return null;
        }
        return u;
    }

    @Composable
    public void SaveableStateProvider(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        boolean z;
        C12775o.m28639i(obj, "key");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1198538093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1198538093, i, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        startRestartGroup.startReplaceableGroup(444418301);
        startRestartGroup.startReusableGroup(ComposerKt.reuseKey, obj);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            SaveableStateRegistry parentSaveableStateRegistry2 = getParentSaveableStateRegistry();
            if (parentSaveableStateRegistry2 != null) {
                z = parentSaveableStateRegistry2.canBeSaved(obj);
            } else {
                z = true;
            }
            if (z) {
                rememberedValue = new RegistryHolder(this, obj);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        startRestartGroup.endReplaceableGroup();
        RegistryHolder registryHolder = (RegistryHolder) rememberedValue;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry())}, oVar, startRestartGroup, (i & 112) | 8);
        EffectsKt.DisposableEffect((Object) C11921v.f18618a, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new SaveableStateHolderImpl$SaveableStateProvider$1$1(this, obj, registryHolder), startRestartGroup, 6);
        startRestartGroup.endReusableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SaveableStateHolderImpl$SaveableStateProvider$2(this, obj, oVar, i));
        }
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public void removeState(Object obj) {
        C12775o.m28639i(obj, "key");
        RegistryHolder registryHolder = this.registryHolders.get(obj);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.savedStates.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        C12775o.m28639i(map, "savedStates");
        this.savedStates = map;
        this.registryHolders = new LinkedHashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
