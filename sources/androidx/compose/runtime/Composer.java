package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;
import p336ef.C11921v;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: Composer.kt */
public interface Composer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Composer.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Composer$Companion$Empty$1();

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(CompositionTracer compositionTracer) {
            C12775o.m28639i(compositionTracer, "tracer");
            ComposerKt.compositionTracer = compositionTracer;
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V v, C13088o<? super T, ? super V, C11921v> oVar);

    @InternalComposeApi
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(Object obj);

    @ComposeCompilerApi
    boolean changed(boolean z) {
        return changed(z);
    }

    @ComposeCompilerApi
    boolean changedInstance(Object obj) {
        return changed(obj);
    }

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(C13074a<? extends T> aVar);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i);

    Applier<?> getApplier();

    C12079g getApplyCoroutineContext();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    @InternalComposeApi
    void insertMovableContentReferences(List<C11906l<MovableContentStateReference, MovableContentStateReference>> list);

    @ComposeCompilerApi
    Object joinKey(Object obj, Object obj2);

    @InternalComposeApi
    void recordSideEffect(C13074a<C11921v> aVar);

    @InternalComposeApi
    void recordUsed(RecomposeScope recomposeScope);

    @ComposeCompilerApi
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i, String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i, Object obj);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProviders(ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceableGroup(int i);

    @ComposeCompilerApi
    Composer startRestartGroup(int i);

    @ComposeCompilerApi
    void startReusableGroup(int i, Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object obj);

    @ComposeCompilerApi
    void useNode();

    @ComposeCompilerApi
    boolean changed(char c) {
        return changed(c);
    }

    @ComposeCompilerApi
    boolean changed(byte b) {
        return changed(b);
    }

    @ComposeCompilerApi
    boolean changed(short s) {
        return changed(s);
    }

    @ComposeCompilerApi
    boolean changed(int i) {
        return changed(i);
    }

    @ComposeCompilerApi
    boolean changed(float f) {
        return changed(f);
    }

    @ComposeCompilerApi
    boolean changed(long j) {
        return changed(j);
    }

    @ComposeCompilerApi
    boolean changed(double d) {
        return changed(d);
    }

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }
}
