package androidx.compose.p002ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.autofill.AndroidAutofill;
import androidx.compose.p002ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.p002ui.autofill.Autofill;
import androidx.compose.p002ui.autofill.AutofillCallback;
import androidx.compose.p002ui.autofill.AutofillTree;
import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.focus.FocusOwner;
import androidx.compose.p002ui.focus.FocusOwnerImpl;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.CanvasHolder;
import androidx.compose.p002ui.graphics.Matrix;
import androidx.compose.p002ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p002ui.hapticfeedback.HapticFeedback;
import androidx.compose.p002ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.p002ui.input.InputMode;
import androidx.compose.p002ui.input.InputModeManager;
import androidx.compose.p002ui.input.InputModeManagerImpl;
import androidx.compose.p002ui.input.key.Key;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import androidx.compose.p002ui.input.key.KeyInputModifierKt;
import androidx.compose.p002ui.input.pointer.MotionEventAdapter;
import androidx.compose.p002ui.input.pointer.PointerIcon;
import androidx.compose.p002ui.input.pointer.PointerIconService;
import androidx.compose.p002ui.input.pointer.PointerInputEvent;
import androidx.compose.p002ui.input.pointer.PointerInputEventData;
import androidx.compose.p002ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.p002ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.p002ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p002ui.input.pointer.PositionCalculator;
import androidx.compose.p002ui.input.pointer.ProcessResult;
import androidx.compose.p002ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.p002ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p002ui.layout.RootMeasurePolicy;
import androidx.compose.p002ui.modifier.ModifierLocalManager;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.LayoutNodeDrawScope;
import androidx.compose.p002ui.node.MeasureAndLayoutDelegate;
import androidx.compose.p002ui.node.OwnedLayer;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.node.OwnerSnapshotObserver;
import androidx.compose.p002ui.node.RootForTest;
import androidx.compose.p002ui.platform.ViewLayer;
import androidx.compose.p002ui.semantics.SemanticsModifierCore;
import androidx.compose.p002ui.semantics.SemanticsOwner;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.p002ui.text.input.AndroidTextInputServicePlugin;
import androidx.compose.p002ui.text.input.PlatformTextInputAdapter;
import androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.p002ui.text.input.TextInputForTests;
import androidx.compose.p002ui.text.input.TextInputService;
import androidx.compose.p002ui.unit.AndroidDensity_androidKt;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 9 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1941:1\n1182#2:1942\n1161#2,2:1943\n76#3:1945\n102#3,2:1946\n76#3:1948\n102#3,2:1949\n76#3:1951\n102#3,2:1952\n523#4:1954\n728#4,2:1955\n460#4,11:1979\n460#4,11:1991\n26#5,5:1957\n26#5,5:1962\n26#5,5:1967\n26#5,5:2006\n47#6,5:1972\n1#7:1977\n163#8:1978\n163#8:1990\n20#9,2:2002\n20#9,2:2004\n533#10,6:2011\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n481#1:1942\n481#1:1943,2\n348#1:1945\n348#1:1946,2\n405#1:1948\n405#1:1949,2\n419#1:1951\n419#1:1952,2\n673#1:1954\n686#1:1955,2\n1115#1:1979,11\n1123#1:1991,11\n803#1:1957,5\n814#1:1962,5\n864#1:1967,5\n1273#1:2006,5\n1041#1:1972,5\n1115#1:1978\n1123#1:1990\n1135#1:2002,2\n1190#1:2004,2\n1357#1:2011,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String FocusTag = "Compose Focus";
    private static final int MaximumLayerCacheSize = 10;
    /* access modifiers changed from: private */
    public static Method getBooleanMethod;
    /* access modifiers changed from: private */
    public static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final InputModeManagerImpl _inputModeManager;
    private final WindowInfoImpl _windowInfo;
    private final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegate;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboardManager clipboardManager;
    private Function1<? super Configuration, C11921v> configurationChangeObserver;
    private int currentFontWeightAdjustment;
    private Density density;
    /* access modifiers changed from: private */
    public PointerIcon desiredPointerIcon;
    private final List<OwnedLayer> dirtyLayers;
    private final MutableVector<C13074a<C11921v>> endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final MutableState layoutDirection$delegate;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1<? super ViewTreeOwners, C11921v> onViewTreeOwnersAvailable;
    private final PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistry;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List<OwnedLayer> postponedDirtyLayers;
    /* access modifiers changed from: private */
    public MotionEvent previousMotionEvent;
    /* access modifiers changed from: private */
    public long relayoutTime;
    private final C13074a<C11921v> resendMotionEventOnLayout;
    /* access modifiers changed from: private */
    public final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final Modifier rotaryInputModifier;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final SemanticsModifierCore semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private final LayoutNodeDrawScope sharedDrawScope = new LayoutNodeDrawScope((CanvasDrawScope) null, 1, (DefaultConstructorMarker) null);
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete = true;
    private final TextInputService textInputService;
    private final TextToolbar textToolbar;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final MutableState viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$Companion */
    /* compiled from: AndroidComposeView.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class access$getSystemPropertiesClass$cp = AndroidComposeView.systemPropertiesClass;
                    if (access$getSystemPropertiesClass$cp != null) {
                        method = access$getSystemPropertiesClass$cp.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                    } else {
                        method = null;
                    }
                    AndroidComposeView.getBooleanMethod = method;
                }
                Method access$getGetBooleanMethod$cp = AndroidComposeView.getBooleanMethod;
                if (access$getGetBooleanMethod$cp != null) {
                    obj = access$getGetBooleanMethod$cp.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$ViewTreeOwners */
    /* compiled from: AndroidComposeView.android.kt */
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner2, SavedStateRegistryOwner savedStateRegistryOwner2) {
            C12775o.m28639i(lifecycleOwner2, "lifecycleOwner");
            C12775o.m28639i(savedStateRegistryOwner2, "savedStateRegistryOwner");
            this.lifecycleOwner = lifecycleOwner2;
            this.savedStateRegistryOwner = savedStateRegistryOwner2;
        }

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        AndroidAutofill androidAutofill;
        int i;
        CalculateMatrixToWindow calculateMatrixToWindow;
        C12775o.m28639i(context, "context");
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m35437getUnspecifiedF1C5BW0();
        this.density = AndroidDensity_androidKt.Density(context);
        SemanticsModifierCore semanticsModifierCore = new SemanticsModifierCore(false, false, AndroidComposeView$semanticsModifier$1.INSTANCE, (Function1) null, 8, (DefaultConstructorMarker) null);
        this.semanticsModifier = semanticsModifierCore;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this));
        this._windowInfo = new WindowInfoImpl();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new AndroidComposeView$keyInputModifier$1(this));
        this.keyInputModifier = onKeyEvent;
        Modifier onRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.rotaryInputModifier = onRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, (DefaultConstructorMarker) null);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(companion2.then(semanticsModifierCore).then(onRotaryScrollEvent).then(getFocusOwner().getModifier()).then(onKeyEvent));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.accessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        if (autofillSupported()) {
            androidAutofill = new AndroidAutofill(this, getAutofillTree());
        } else {
            androidAutofill = null;
        }
        this._autofill = androidAutofill;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(context);
        C12775o.m28638h(viewConfiguration2, "get(context)");
        this.viewConfiguration = new AndroidViewConfiguration(viewConfiguration2);
        this.globalPosition = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        this.viewToWindowMatrix = Matrix.m35898constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);
        this.windowToViewMatrix = Matrix.m35898constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);
        this.lastMatrixRecalculationAnimationTime = -1;
        this.windowPosition = companion.m35436getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this.viewTreeOwners$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.globalLayoutListener = new C1122c(this);
        this.scrollChangedListener = new C1125d(this);
        this.touchModeChangeListener = new C1128e(this);
        this.platformTextInputPluginRegistry = new PlatformTextInputPluginRegistryImpl(new AndroidComposeView$platformTextInputPluginRegistry$1(this));
        this.textInputService = ((AndroidTextInputServicePlugin.Adapter) getPlatformTextInputPluginRegistry().getOrCreateAdapter(AndroidTextInputServicePlugin.INSTANCE).getAdapter()).getService();
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        Configuration configuration = context.getResources().getConfiguration();
        C12775o.m28638h(configuration, "context.resources.configuration");
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        C12775o.m28638h(configuration2, "context.resources.configuration");
        this.layoutDirection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(configuration2), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        if (isInTouchMode()) {
            i = InputMode.Companion.m36422getTouchaOaMEAU();
        } else {
            i = InputMode.Companion.m36421getKeyboardaOaMEAU();
        }
        this._inputModeManager = new InputModeManagerImpl(i, new AndroidComposeView$_inputModeManager$1(this), (DefaultConstructorMarker) null);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new MutableVector<>(new C13074a[16], 0);
        this.resendMotionEventRunnable = new AndroidComposeView$resendMotionEventRunnable$1(this);
        this.sendHoverExitEvent = new C1131f(this);
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            calculateMatrixToWindow = new CalculateMatrixToWindowApi29();
        } else {
            calculateMatrixToWindow = new CalculateMatrixToWindowApi21();
        }
        this.matrixToWindow = calculateMatrixToWindow;
        setWillNotDraw(false);
        setFocusable(true);
        if (i2 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1<ViewRootForTest, C11921v> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        getRoot().attach$ui_release(this);
        if (i2 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        this.pointerIconService = new AndroidComposeView$pointerIconService$1(this);
    }

    private final boolean autofillSupported() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        boolean z;
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    private final C11906l<Integer, Integer> convertMeasureSpec(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return C11915r.m25707a(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return C11915r.m25707a(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return C11915r.m25707a(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (C12775o.m28634d(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            C12775o.m28638h(childAt, "currentView.getChildAt(i)");
            View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, childAt);
            if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                return findViewByAccessibilityIdRootedAtCurrentView;
            }
        }
        return null;
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final void globalLayoutListener$lambda$1(AndroidComposeView androidComposeView) {
        C12775o.m28639i(androidComposeView, "this$0");
        androidComposeView.updatePositionCacheAndDispatch();
    }

    /* renamed from: handleMotionEvent-8iAsVTc  reason: not valid java name */
    private final int m37697handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        boolean z;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z2 = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            this.desiredPointerIcon = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.previousMotionEvent;
            if (motionEvent2 == null || motionEvent2.getToolType(0) != 3) {
                z = false;
            } else {
                z = true;
            }
            if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                if (isDevicePressEvent(motionEvent2)) {
                    this.pointerInputEventProcessor.processCancel();
                } else if (motionEvent2.getActionMasked() != 10 && z) {
                    sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, (Object) null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z2 = false;
            }
            if (!z && z2 && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, (Object) null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
            int r15 = m37698sendMotionEvent8iAsVTc(motionEvent);
            Trace.endSection();
            AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this, this.desiredPointerIcon);
            this.forceUseMatrixCache = false;
            return r15;
        } catch (Throwable th) {
            this.forceUseMatrixCache = false;
            throw th;
        }
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration2, getContext()) * f, f * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration2, getContext()), motionEvent.getEventTime()));
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                invalidateLayers((LayoutNode) content[i]);
                i++;
            } while (i < size);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        int i = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, (Object) null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement((LayoutNode) content[i]);
                i++;
            } while (i < size);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float x = motionEvent.getX();
        if (Float.isInfinite(x) || Float.isNaN(x)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        float y = motionEvent.getY();
        if (Float.isInfinite(y) || Float.isNaN(y)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            return true;
        }
        return false;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f > x || x > ((float) getWidth())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (0.0f > y || y > ((float) getHeight())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        boolean z;
        boolean z2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.previousMotionEvent) == null) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        if (motionEvent.getRawY() == motionEvent2.getRawY()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    private final void recalculateWindowPosition() {
        if (!this.forceUseMatrixCache) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
                this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
                recalculateWindowViewTransforms();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.tmpPositionArray);
                int[] iArr = this.tmpPositionArray;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.tmpPositionArray;
                this.windowPosition = OffsetKt.Offset(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.m37713calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m37739invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (layoutNode != null) {
                while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                    layoutNode = layoutNode.getParent$ui_release();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* access modifiers changed from: private */
    public static final void scrollChangedListener$lambda$2(AndroidComposeView androidComposeView) {
        C12775o.m28639i(androidComposeView, "this$0");
        androidComposeView.updatePositionCacheAndDispatch();
    }

    /* access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$5(AndroidComposeView androidComposeView) {
        C12775o.m28639i(androidComposeView, "this$0");
        boolean z = false;
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        C12775o.m28636f(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z = true;
        }
        if (z) {
            androidComposeView.m37698sendMotionEvent8iAsVTc(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: sendMotionEvent-8iAsVTc  reason: not valid java name */
    private final int m37698sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m37796setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m37232constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (convertToPointerInputEvent$ui_release != null) {
            List<PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
            ListIterator<PointerInputEventData> listIterator = pointers.listIterator(pointers.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    pointerInputEventData = null;
                    break;
                }
                pointerInputEventData = listIterator.previous();
                if (pointerInputEventData.getDown()) {
                    break;
                }
            }
            PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.lastDownPointerPosition = pointerInputEventData2.m37183getPositionF1C5BW0();
            }
            int r0 = this.pointerInputEventProcessor.m37188processBIzXfog(convertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || ProcessResult.m37257getDispatchedToAPointerInputModifierimpl(r0)) {
                return r0;
            }
            this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return r0;
        }
        this.pointerInputEventProcessor.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    /* access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int i3;
        long j2;
        int i4;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = i;
        int actionMasked = motionEvent.getActionMasked();
        int i6 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i6 = motionEvent.getActionIndex();
            }
        } else if (!(i5 == 9 || i5 == 10)) {
            i6 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i6 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = pointerCount - i2;
        if (i7 != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                pointerCoordsArr[i9] = new MotionEvent.PointerCoords();
            }
            for (int i10 = 0; i10 < i7; i10++) {
                if (i6 < 0 || i10 < i6) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                int i11 = i4 + i10;
                motionEvent2.getPointerProperties(i11, pointerPropertiesArr[i10]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i10];
                motionEvent2.getPointerCoords(i11, pointerCoords);
                long r11 = m37702localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = Offset.m35422getXimpl(r11);
                pointerCoords.y = Offset.m35423getYimpl(r11);
            }
            if (z) {
                i3 = 0;
            } else {
                i3 = motionEvent.getButtonState();
            }
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                j2 = j;
            } else {
                j2 = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(j2, j, i, i7, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i3, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            MotionEventAdapter motionEventAdapter2 = this.motionEventAdapter;
            C12775o.m28638h(obtain, NotificationCompat.CATEGORY_EVENT);
            PointerInputEvent convertToPointerInputEvent$ui_release = motionEventAdapter2.convertToPointerInputEvent$ui_release(obtain, this);
            C12775o.m28636f(convertToPointerInputEvent$ui_release);
            this.pointerInputEventProcessor.m37188processBIzXfog(convertToPointerInputEvent$ui_release, this, true);
            obtain.recycle();
        }
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this.viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$3(AndroidComposeView androidComposeView, boolean z) {
        int i;
        C12775o.m28639i(androidComposeView, "this$0");
        InputModeManagerImpl inputModeManagerImpl = androidComposeView._inputModeManager;
        if (z) {
            i = InputMode.Companion.m36422getTouchaOaMEAU();
        } else {
            i = InputMode.Companion.m36421getKeyboardaOaMEAU();
        }
        inputModeManagerImpl.m36427setInputModeiuPiT84(i);
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int r2 = IntOffset.m38578component1impl(j);
        int r0 = IntOffset.m38579component2impl(j);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        int i = iArr[0];
        if (!(r2 == i && r0 == iArr[1])) {
            this.globalPosition = IntOffsetKt.IntOffset(i, iArr[1]);
            if (!(r2 == Integer.MAX_VALUE || r0 == Integer.MAX_VALUE)) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z = true;
            }
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        C12775o.m28639i(androidViewHolder, "view");
        C12775o.m28639i(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        ViewCompat.setImportantForAccessibility(androidViewHolder, 1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder, new AndroidComposeView$addAndroidView$1(layoutNode, this, this));
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        AndroidAutofill androidAutofill;
        C12775o.m28639i(sparseArray, "values");
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
        }
    }

    public final Object boundsUpdatesEventLoop(C12074d<? super C11921v> dVar) {
        Object boundsUpdatesEventLoop = this.accessibilityDelegate.boundsUpdatesEventLoop(dVar);
        if (boundsUpdatesEventLoop == C12150d.m26492c()) {
            return boundsUpdatesEventLoop;
        }
        return C11921v.f18618a;
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U  reason: not valid java name */
    public long m37699calculateLocalPositionMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m35904mapMKHz9U(this.windowToViewMatrix, j);
    }

    /* renamed from: calculatePositionInWindow-MK-Hz9U  reason: not valid java name */
    public long m37700calculatePositionInWindowMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m35904mapMKHz9U(this.viewToWindowMatrix, j);
    }

    public boolean canScrollHorizontally(int i) {
        return this.accessibilityDelegate.m37708canScroll0AR0LA0$ui_release(false, i, this.lastDownPointerPosition);
    }

    public boolean canScrollVertically(int i) {
        return this.accessibilityDelegate.m37708canScroll0AR0LA0$ui_release(true, i, this.lastDownPointerPosition);
    }

    public OwnedLayer createLayer(Function1<? super Canvas, C11921v> function1, C13074a<C11921v> aVar) {
        DrawChildContainer drawChildContainer;
        C12775o.m28639i(function1, "drawBlock");
        C12775o.m28639i(aVar, "invalidateParentLayer");
        OwnedLayer pop = this.layerCache.pop();
        if (pop != null) {
            pop.reuseLayer(function1, aVar);
            return pop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, function1, aVar);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                Context context = getContext();
                C12775o.m28638h(context, "context");
                drawChildContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                C12775o.m28638h(context2, "context");
                drawChildContainer = new ViewLayerContainer(context2);
            }
            this.viewLayersContainer = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.viewLayersContainer;
        C12775o.m28636f(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, function1, aVar);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(android.graphics.Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, (Object) null);
        this.isDrawingContent = true;
        CanvasHolder canvasHolder2 = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
        canvasHolder2.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder2.getAndroidCanvas());
        canvasHolder2.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i = 0; i < size; i++) {
                this.dirtyLayers.get(i).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            C12775o.m28636f(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C12775o.m28639i(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            return handleRotaryEvent(motionEvent);
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return ProcessResult.m37257getDispatchedToAPointerInputModifierimpl(m37697handleMotionEvent8iAsVTc(motionEvent));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C12775o.m28639i(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.isFromSource(InputDeviceCompat.SOURCE_TOUCHSCREEN) && motionEvent.getToolType(0) == 1) {
            return this.accessibilityDelegate.dispatchHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.previousMotionEvent;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                    this.hoverExitReceived = true;
                    post(this.sendHoverExitEvent);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!isPositionChanged(motionEvent)) {
            return false;
        }
        return ProcessResult.m37257getDispatchedToAPointerInputModifierimpl(m37697handleMotionEvent8iAsVTc(motionEvent));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this._windowInfo.m37796setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m37232constructorimpl(keyEvent.getMetaState()));
        return m37705sendKeyEventZmokQxo(androidx.compose.p002ui.input.key.KeyEvent.m37010constructorimpl(keyEvent));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C12775o.m28639i(motionEvent, "motionEvent");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            C12775o.m28636f(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int r4 = m37697handleMotionEvent8iAsVTc(motionEvent);
        if (ProcessResult.m37256getAnyMovementConsumedimpl(r4)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m37257getDispatchedToAPointerInputModifierimpl(r4);
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, android.graphics.Canvas canvas) {
        C12775o.m28639i(androidViewHolder, "view");
        C12775o.m28639i(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void forceMeasureTheSubtree(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            Context context = getContext();
            C12775o.m28638h(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        C12775o.m28636f(androidViewsHandler2);
        return androidViewsHandler2;
    }

    public Autofill getAutofill() {
        return this._autofill;
    }

    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final Function1<Configuration, C11921v> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public Density getDensity() {
        return this.density;
    }

    /* renamed from: getFocusDirection-P8AzH3I  reason: not valid java name */
    public FocusDirection m37701getFocusDirectionP8AzH3I(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        int i;
        C12775o.m28639i(keyEvent, "keyEvent");
        long r0 = KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m36431equalsimpl0(r0, companion.m36954getTabEK5gGoQ())) {
            if (KeyEvent_androidKt.m37032isShiftPressedZmokQxo(keyEvent)) {
                i = FocusDirection.Companion.m35359getPreviousdhqQ8s();
            } else {
                i = FocusDirection.Companion.m35357getNextdhqQ8s();
            }
            return FocusDirection.m35341boximpl(i);
        } else if (Key.m36431equalsimpl0(r0, companion.m36795getDirectionRightEK5gGoQ())) {
            return FocusDirection.m35341boximpl(FocusDirection.Companion.m35360getRightdhqQ8s());
        } else {
            if (Key.m36431equalsimpl0(r0, companion.m36794getDirectionLeftEK5gGoQ())) {
                return FocusDirection.m35341boximpl(FocusDirection.Companion.m35356getLeftdhqQ8s());
            }
            if (Key.m36431equalsimpl0(r0, companion.m36796getDirectionUpEK5gGoQ())) {
                return FocusDirection.m35341boximpl(FocusDirection.Companion.m35361getUpdhqQ8s());
            }
            if (Key.m36431equalsimpl0(r0, companion.m36791getDirectionDownEK5gGoQ())) {
                return FocusDirection.m35341boximpl(FocusDirection.Companion.m35352getDowndhqQ8s());
            }
            boolean z3 = true;
            if (Key.m36431equalsimpl0(r0, companion.m36790getDirectionCenterEK5gGoQ())) {
                z = true;
            } else {
                z = Key.m36431equalsimpl0(r0, companion.m36804getEnterEK5gGoQ());
            }
            if (z) {
                z2 = true;
            } else {
                z2 = Key.m36431equalsimpl0(r0, companion.m36896getNumPadEnterEK5gGoQ());
            }
            if (z2) {
                return FocusDirection.m35341boximpl(FocusDirection.Companion.m35353getEnterdhqQ8s());
            }
            if (!Key.m36431equalsimpl0(r0, companion.m36733getBackEK5gGoQ())) {
                z3 = Key.m36431equalsimpl0(r0, companion.m36807getEscapeEK5gGoQ());
            }
            if (z3) {
                return FocusDirection.m35341boximpl(FocusDirection.Companion.m35354getExitdhqQ8s());
            }
            return null;
        }
    }

    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    public void getFocusedRect(Rect rect) {
        C11921v vVar;
        C12775o.m28639i(rect, "rect");
        androidx.compose.p002ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            rect.left = C13265c.m30134c(focusRect.getLeft());
            rect.top = C13265c.m30134c(focusRect.getTop());
            rect.right = C13265c.m30134c(focusRect.getRight());
            rect.bottom = C13265c.m30134c(focusRect.getBottom());
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    public LayoutNode getRoot() {
        return this.root;
    }

    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    public TextInputForTests getTextInputForTests() {
        PlatformTextInputAdapter focusedAdapter = getPlatformTextInputPluginRegistry().getFocusedAdapter();
        if (focusedAdapter != null) {
            return focusedAdapter.getInputForTests();
        }
        return null;
    }

    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    public boolean isLifecycleInResumedState() {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            state = null;
        } else {
            state = lifecycle.getCurrentState();
        }
        if (state == Lifecycle.State.RESUMED) {
            return true;
        }
        return false;
    }

    /* renamed from: localToScreen-MK-Hz9U  reason: not valid java name */
    public long m37702localToScreenMKHz9U(long j) {
        recalculateWindowPosition();
        long r4 = Matrix.m35904mapMKHz9U(this.viewToWindowMatrix, j);
        return OffsetKt.Offset(Offset.m35422getXimpl(r4) + Offset.m35422getXimpl(this.windowPosition), Offset.m35423getYimpl(r4) + Offset.m35423getYimpl(this.windowPosition));
    }

    public void measureAndLayout(boolean z) {
        C13074a<C11921v> aVar;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                aVar = this.resendMotionEventOnLayout;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            aVar = null;
        }
        if (this.measureAndLayoutDelegate.measureAndLayout(aVar)) {
            requestLayout();
        }
        MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, (Object) null);
        C11921v vVar = C11921v.f18618a;
        Trace.endSection();
    }

    /* renamed from: measureAndLayout-0kLqBqw  reason: not valid java name */
    public void m37703measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        C12775o.m28639i(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m37568measureAndLayout0kLqBqw(layoutNode, j);
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, (Object) null);
            C11921v vVar = C11921v.f18618a;
        } finally {
            Trace.endSection();
        }
    }

    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, (Object) null);
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer ownedLayer, boolean z) {
        C12775o.m28639i(ownedLayer, "layer");
        if (!z) {
            if (!this.isDrawingContent) {
                this.dirtyLayers.remove(ownedLayer);
                List<OwnedLayer> list = this.postponedDirtyLayers;
                if (list != null) {
                    list.remove(ownedLayer);
                }
            }
        } else if (!this.isDrawingContent) {
            this.dirtyLayers.add(ownedLayer);
        } else {
            List list2 = this.postponedDirtyLayers;
            if (list2 == null) {
                list2 = new ArrayList();
                this.postponedDirtyLayers = list2;
            }
            list2.add(ownedLayer);
        }
    }

    public void onAttach(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "node");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        boolean z;
        int i;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(lifecycleOwner2 == null || savedStateRegistryOwner == null || (lifecycleOwner2 == viewTreeOwners.getLifecycleOwner() && savedStateRegistryOwner == viewTreeOwners.getLifecycleOwner()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (lifecycleOwner2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (savedStateRegistryOwner != null) {
                if (!(viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null)) {
                    lifecycle.removeObserver(this);
                }
                lifecycleOwner2.getLifecycle().addObserver(this);
                ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
                setViewTreeOwners(viewTreeOwners2);
                Function1<? super ViewTreeOwners, C11921v> function1 = this.onViewTreeOwnersAvailable;
                if (function1 != null) {
                    function1.invoke(viewTreeOwners2);
                }
                this.onViewTreeOwnersAvailable = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        InputModeManagerImpl inputModeManagerImpl = this._inputModeManager;
        if (isInTouchMode()) {
            i = InputMode.Companion.m36422getTouchaOaMEAU();
        } else {
            i = InputMode.Companion.m36421getKeyboardaOaMEAU();
        }
        inputModeManagerImpl.m36427setInputModeiuPiT84(i);
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        C12775o.m28636f(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    public boolean onCheckIsTextEditor() {
        if (getPlatformTextInputPluginRegistry().getFocusedAdapter() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        C12775o.m28639i(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        C12775o.m28638h(context, "context");
        this.density = AndroidDensity_androidKt.Density(context);
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            Context context2 = getContext();
            C12775o.m28638h(context2, "context");
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(context2));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C12775o.m28639i(editorInfo, "outAttrs");
        PlatformTextInputAdapter focusedAdapter = getPlatformTextInputPluginRegistry().getFocusedAdapter();
        if (focusedAdapter != null) {
            return focusedAdapter.createInputConnection(editorInfo);
        }
        return null;
    }

    public void onDetach(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "node");
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null)) {
            lifecycle.removeObserver(this);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    /* access modifiers changed from: protected */
    public void onDraw(android.graphics.Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
    }

    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i = 0; i < size; i++) {
                C13074a aVar = (C13074a) this.endApplyChangesListeners.getContent()[i];
                this.endApplyChangesListeners.set(i, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d(FocusTag, "Owner FocusChanged(" + z + ')');
        if (z) {
            getFocusOwner().takeFocus();
        } else {
            getFocusOwner().releaseFocus();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onLayoutChange(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "layoutNode");
        this.accessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            C11906l<Integer, Integer> convertMeasureSpec = convertMeasureSpec(i);
            int intValue = convertMeasureSpec.mo49109a().intValue();
            int intValue2 = convertMeasureSpec.mo49110b().intValue();
            C11906l<Integer, Integer> convertMeasureSpec2 = convertMeasureSpec(i2);
            long Constraints = ConstraintsKt.Constraints(intValue, intValue2, convertMeasureSpec2.mo49109a().intValue(), convertMeasureSpec2.mo49110b().intValue());
            Constraints constraints = this.onMeasureConstraints;
            boolean z = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m38400boximpl(Constraints);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    z = Constraints.m38405equalsimpl0(constraints.m38418unboximpl(), Constraints);
                }
                if (!z) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m37569updateRootConstraintsBRTryo0(Constraints);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), BasicMeasure.EXACTLY));
            }
            C11921v vVar = C11921v.f18618a;
        } finally {
            Trace.endSection();
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        AndroidAutofill androidAutofill;
        if (autofillSupported() && viewStructure != null && (androidAutofill = this._autofill) != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    public void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2) {
        C12775o.m28639i(layoutNode, "layoutNode");
        if (z) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z2)) {
                scheduleMeasureAndLayout(layoutNode);
            }
        } else if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, z2)) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    public void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2) {
        C12775o.m28639i(layoutNode, "layoutNode");
        if (z) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z2)) {
                scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, z2)) {
            scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
        }
    }

    public void onResume(LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(lifecycleOwner, "owner");
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.superclassInitComplete) {
            LayoutDirection access$layoutDirectionFromInt = AndroidComposeView_androidKt.layoutDirectionFromInt(i);
            setLayoutDirection(access$layoutDirectionFromInt);
            getFocusOwner().setLayoutDirection(access$layoutDirectionFromInt);
        }
    }

    public void onSemanticsChange() {
        this.accessibilityDelegate.onSemanticsChange$ui_release();
    }

    public void onWindowFocusChanged(boolean z) {
        boolean access$getIsShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (access$getIsShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            setShowLayoutBounds(access$getIsShowingLayoutBounds);
            invalidateDescendants();
        }
    }

    public final boolean recycle$ui_release(OwnedLayer ownedLayer) {
        C12775o.m28639i(ownedLayer, "layer");
        if (this.viewLayersContainer != null) {
            boolean shouldUseDispatchDraw = ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        return true;
    }

    public void registerOnEndApplyChangesListener(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "listener");
        if (!this.endApplyChangesListeners.contains(aVar)) {
            this.endApplyChangesListeners.add(aVar);
        }
    }

    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        C12775o.m28639i(onLayoutCompletedListener, "listener");
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder) {
        C12775o.m28639i(androidViewHolder, "view");
        registerOnEndApplyChangesListener(new AndroidComposeView$removeAndroidView$1(this, androidViewHolder));
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
    }

    /* renamed from: screenToLocal-MK-Hz9U  reason: not valid java name */
    public long m37704screenToLocalMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m35904mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m35422getXimpl(j) - Offset.m35422getXimpl(this.windowPosition), Offset.m35423getYimpl(j) - Offset.m35423getYimpl(this.windowPosition)));
    }

    /* renamed from: sendKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean m37705sendKeyEventZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "keyEvent");
        return getFocusOwner().m35363dispatchKeyEventZmokQxo(keyEvent);
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.configurationChangeObserver = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super ViewTreeOwners, C11921v> function1) {
        C12775o.m28639i(function1, "callback");
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.onViewTreeOwnersAvailable = function1;
        }
    }

    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public PlatformTextInputPluginRegistryImpl getPlatformTextInputPluginRegistry() {
        return this.platformTextInputPluginRegistry;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long r0 = Matrix.m35904mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m35422getXimpl(r0), motionEvent.getRawY() - Offset.m35423getYimpl(r0));
    }
}
