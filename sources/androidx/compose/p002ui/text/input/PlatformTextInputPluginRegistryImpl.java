package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.InternalTextApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,335:1\n1#2:336\n36#3:337\n25#3:348\n1057#4,6:338\n1057#4,3:349\n1060#4,3:355\n473#5,4:344\n477#5,2:352\n481#5:358\n473#6:354\n766#7:359\n857#7,2:360\n33#8,6:362\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n*L\n167#1:337\n172#1:348\n167#1:338,6\n172#1:349,3\n172#1:355,3\n172#1:344,4\n172#1:352,2\n172#1:358\n172#1:354\n241#1:359\n241#1:360,2\n242#1:362,6\n*E\n"})
@InternalTextApi
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl */
/* compiled from: PlatformTextInputAdapter.kt */
public final class PlatformTextInputPluginRegistryImpl implements PlatformTextInputPluginRegistry {
    public static final int $stable = 0;
    private final SnapshotStateMap<PlatformTextInputPlugin<?>, AdapterWithRefCount<?>> adaptersByPlugin = SnapshotStateKt.mutableStateMapOf();
    /* access modifiers changed from: private */
    public boolean adaptersMayNeedDisposal;
    private final C13088o<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter> factory;
    /* access modifiers changed from: private */
    public PlatformTextInputPlugin<?> focusedPlugin;

    @StabilityInferred(parameters = 0)
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
    @InternalTextApi
    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$AdapterHandle */
    /* compiled from: PlatformTextInputAdapter.kt */
    public static final class AdapterHandle<T extends PlatformTextInputAdapter> {
        public static final int $stable = 8;
        private final T adapter;
        private boolean disposed;
        private final C13074a<Boolean> onDispose;

        public AdapterHandle(T t, C13074a<Boolean> aVar) {
            C12775o.m28639i(t, "adapter");
            C12775o.m28639i(aVar, "onDispose");
            this.adapter = t;
            this.onDispose = aVar;
        }

        public final boolean dispose() {
            if (!this.disposed) {
                this.disposed = true;
                return this.onDispose.invoke().booleanValue();
            }
            throw new IllegalStateException("AdapterHandle already disposed".toString());
        }

        public final T getAdapter() {
            return this.adapter;
        }
    }

    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$AdapterInput */
    /* compiled from: PlatformTextInputAdapter.kt */
    private final class AdapterInput implements PlatformTextInput {
        private final PlatformTextInputPlugin<?> plugin;
        final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

        public AdapterInput(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, PlatformTextInputPlugin<?> platformTextInputPlugin) {
            C12775o.m28639i(platformTextInputPlugin, "plugin");
            this.this$0 = platformTextInputPluginRegistryImpl;
            this.plugin = platformTextInputPlugin;
        }

        public void releaseInputFocus() {
            if (C12775o.m28634d(this.this$0.focusedPlugin, this.plugin)) {
                this.this$0.focusedPlugin = null;
            }
        }

        public void requestInputFocus() {
            this.this$0.focusedPlugin = this.plugin;
        }
    }

    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,335:1\n76#2:336\n102#2,2:337\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n*L\n291#1:336\n291#1:337,2\n*E\n"})
    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$AdapterWithRefCount */
    /* compiled from: PlatformTextInputAdapter.kt */
    private final class AdapterWithRefCount<T extends PlatformTextInputAdapter> {
        private final T adapter;
        private final MutableState refCount$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);
        final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

        public AdapterWithRefCount(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, T t) {
            C12775o.m28639i(t, "adapter");
            this.this$0 = platformTextInputPluginRegistryImpl;
            this.adapter = t;
        }

        private final int getRefCount() {
            return ((Number) this.refCount$delegate.getValue()).intValue();
        }

        private final void setRefCount(int i) {
            this.refCount$delegate.setValue(Integer.valueOf(i));
        }

        public final boolean decrementRefCount() {
            boolean z;
            setRefCount(getRefCount() - 1);
            if (getRefCount() >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + getRefCount() + ')').toString());
            } else if (getRefCount() != 0) {
                return false;
            } else {
                this.this$0.adaptersMayNeedDisposal = true;
                return true;
            }
        }

        public final T getAdapter() {
            return this.adapter;
        }

        public final void incrementRefCount() {
            setRefCount(getRefCount() + 1);
        }

        public final boolean isRefCountZero() {
            if (getRefCount() == 0) {
                return true;
            }
            return false;
        }
    }

    public PlatformTextInputPluginRegistryImpl(C13088o<? super PlatformTextInputPlugin<?>, ? super PlatformTextInput, ? extends PlatformTextInputAdapter> oVar) {
        C12775o.m28639i(oVar, "factory");
        this.factory = oVar;
    }

    /* access modifiers changed from: private */
    public final void disposeTombstonedAdapters() {
        if (this.adaptersMayNeedDisposal) {
            this.adaptersMayNeedDisposal = false;
            Set<Map.Entry<PlatformTextInputPlugin<?>, AdapterWithRefCount<?>>> entrySet = this.adaptersByPlugin.entrySet();
            ArrayList arrayList = new ArrayList();
            for (T next : entrySet) {
                if (((AdapterWithRefCount) ((Map.Entry) next).getValue()).isRefCountZero()) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i);
                PlatformTextInputPlugin platformTextInputPlugin = (PlatformTextInputPlugin) entry.getKey();
                AdapterWithRefCount adapterWithRefCount = (AdapterWithRefCount) entry.getValue();
                if (C12775o.m28634d(this.focusedPlugin, platformTextInputPlugin)) {
                    this.focusedPlugin = null;
                }
                this.adaptersByPlugin.remove(platformTextInputPlugin);
                PlatformTextInputAdapter_androidKt.dispose(adapterWithRefCount.getAdapter());
            }
        }
    }

    private final <T extends PlatformTextInputAdapter> AdapterWithRefCount<T> instantiateAdapter(PlatformTextInputPlugin<T> platformTextInputPlugin) {
        PlatformTextInputAdapter invoke = this.factory.invoke(platformTextInputPlugin, new AdapterInput(this, platformTextInputPlugin));
        C12775o.m28637g(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        AdapterWithRefCount<T> adapterWithRefCount = new AdapterWithRefCount<>(this, invoke);
        this.adaptersByPlugin.put(platformTextInputPlugin, adapterWithRefCount);
        return adapterWithRefCount;
    }

    public final PlatformTextInputAdapter getFocusedAdapter() {
        AdapterWithRefCount adapterWithRefCount = this.adaptersByPlugin.get(this.focusedPlugin);
        if (adapterWithRefCount != null) {
            return adapterWithRefCount.getAdapter();
        }
        return null;
    }

    @InternalTextApi
    public final <T extends PlatformTextInputAdapter> AdapterHandle<T> getOrCreateAdapter(PlatformTextInputPlugin<T> platformTextInputPlugin) {
        C12775o.m28639i(platformTextInputPlugin, "plugin");
        AdapterWithRefCount<T> adapterWithRefCount = this.adaptersByPlugin.get(platformTextInputPlugin);
        if (adapterWithRefCount == null) {
            adapterWithRefCount = instantiateAdapter(platformTextInputPlugin);
        }
        adapterWithRefCount.incrementRefCount();
        return new AdapterHandle<>(adapterWithRefCount.getAdapter(), new PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1(adapterWithRefCount));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.compose.ui.text.input.PlatformTextInputPlugin<T>, androidx.compose.ui.text.input.PlatformTextInputPlugin, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends androidx.compose.p002ui.text.input.PlatformTextInputAdapter> T rememberAdapter(androidx.compose.p002ui.text.input.PlatformTextInputPlugin<T> r4, androidx.compose.runtime.Composer r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = "plugin"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            r0 = -845039128(0xffffffffcda1b9e8, float:-3.39164416E8)
            r5.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter (PlatformTextInputAdapter.kt:161)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r2)
        L_0x0017:
            r6 = 1157296644(0x44faf204, float:2007.563)
            r5.startReplaceableGroup(r6)
            boolean r6 = r5.changed((java.lang.Object) r4)
            java.lang.Object r0 = r5.rememberedValue()
            if (r6 != 0) goto L_0x002f
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x0036
        L_0x002f:
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$AdapterHandle r0 = r3.getOrCreateAdapter(r4)
            r5.updateRememberedValue(r0)
        L_0x0036:
            r5.endReplaceableGroup()
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$AdapterHandle r0 = (androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistryImpl.AdapterHandle) r0
            r4 = 773894976(0x2e20b340, float:3.6538994E-11)
            r5.startReplaceableGroup(r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.startReplaceableGroup(r4)
            java.lang.Object r4 = r5.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r4 != r6) goto L_0x0062
            hf.h r4 = p355hf.C12085h.f18916b
            yf.l0 r4 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r4, r5)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r6 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r6.<init>(r4)
            r5.updateRememberedValue(r6)
            r4 = r6
        L_0x0062:
            r5.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r4 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r4
            yf.l0 r4 = r4.getCoroutineScope()
            r5.endReplaceableGroup()
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1 r6 = new androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1
            r6.<init>(r0, r4, r3)
            r4 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r6, (androidx.compose.runtime.Composer) r5, (int) r4)
            androidx.compose.ui.text.input.PlatformTextInputAdapter r4 = r0.getAdapter()
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x0085
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0085:
            r5.endReplaceableGroup()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter(androidx.compose.ui.text.input.PlatformTextInputPlugin, androidx.compose.runtime.Composer, int):androidx.compose.ui.text.input.PlatformTextInputAdapter");
    }
}
