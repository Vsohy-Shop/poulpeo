package androidx.compose.p002ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.TempListUtilsKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.HitTestResult;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import androidx.compose.p002ui.node.SemanticsModifierNodeKt;
import androidx.compose.p002ui.platform.AccessibilityIterators;
import androidx.compose.p002ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.p002ui.semantics.AccessibilityAction;
import androidx.compose.p002ui.semantics.CustomAccessibilityAction;
import androidx.compose.p002ui.semantics.LiveRegionMode;
import androidx.compose.p002ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p002ui.semantics.Role;
import androidx.compose.p002ui.semantics.ScrollAxisRange;
import androidx.compose.p002ui.semantics.SemanticsActions;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;
import androidx.compose.p002ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p002ui.semantics.SemanticsNode;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import androidx.compose.p002ui.semantics.SemanticsProperties;
import androidx.compose.p002ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p308ag.C10894d;
import p308ag.C10898g;
import p336ef.C11906l;
import p336ef.C11921v;
import p404of.C13089p;
import p436tf.C13522b;

@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,3169:1\n1747#2,3:3170\n33#3,4:3173\n33#3,6:3177\n38#3:3183\n33#3,6:3184\n33#3,6:3190\n33#3,6:3196\n69#3,6:3202\n69#3,6:3208\n33#3,6:3215\n33#3,6:3223\n33#3,6:3229\n33#3,6:3235\n33#3,6:3241\n33#3,6:3247\n1#4:3214\n37#5,2:3221\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n451#1:3170,3\n616#1:3173,4\n619#1:3177,6\n616#1:3183\n662#1:3184,6\n752#1:3190,6\n1200#1:3196,6\n1211#1:3202,6\n1218#1:3208,6\n1748#1:3215,6\n2432#1:3223,6\n2436#1:3229,6\n2595#1:3235,6\n2613#1:3241,6\n656#1:3247,6\n1813#1:3221,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    private static final int[] AccessibilityActionsResourceIds = {C0954R.C0956id.accessibility_custom_action_0, C0954R.C0956id.accessibility_custom_action_1, C0954R.C0956id.accessibility_custom_action_2, C0954R.C0956id.accessibility_custom_action_3, C0954R.C0956id.accessibility_custom_action_4, C0954R.C0956id.accessibility_custom_action_5, C0954R.C0956id.accessibility_custom_action_6, C0954R.C0956id.accessibility_custom_action_7, C0954R.C0956id.accessibility_custom_action_8, C0954R.C0956id.accessibility_custom_action_9, C0954R.C0956id.accessibility_custom_action_10, C0954R.C0956id.accessibility_custom_action_11, C0954R.C0956id.accessibility_custom_action_12, C0954R.C0956id.accessibility_custom_action_13, C0954R.C0956id.accessibility_custom_action_14, C0954R.C0956id.accessibility_custom_action_15, C0954R.C0956id.accessibility_custom_action_16, C0954R.C0956id.accessibility_custom_action_17, C0954R.C0956id.accessibility_custom_action_18, C0954R.C0956id.accessibility_custom_action_19, C0954R.C0956id.accessibility_custom_action_20, C0954R.C0956id.accessibility_custom_action_21, C0954R.C0956id.accessibility_custom_action_22, C0954R.C0956id.accessibility_custom_action_23, C0954R.C0956id.accessibility_custom_action_24, C0954R.C0956id.accessibility_custom_action_25, C0954R.C0956id.accessibility_custom_action_26, C0954R.C0956id.accessibility_custom_action_27, C0954R.C0956id.accessibility_custom_action_28, C0954R.C0956id.accessibility_custom_action_29, C0954R.C0956id.accessibility_custom_action_30, C0954R.C0956id.accessibility_custom_action_31};
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;
    private final String EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final C10894d<C11921v> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    /* access modifiers changed from: private */
    public final Handler handler;
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private HashMap<Integer, Integer> idToAfterMap;
    private HashMap<Integer, Integer> idToBeforeMap;
    private SparseArrayCompat<Map<CharSequence, Integer>> labelToActionId;
    private AccessibilityNodeProviderCompat nodeProvider;
    private ArraySet<Integer> paneDisplayed;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final List<ScrollObservationScope> scrollObservationScopes;
    /* access modifiers changed from: private */
    public final Runnable semanticsChangeChecker;
    private final Function1<ScrollObservationScope, C11921v> sendScrollEventIfNeededLambda;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final AndroidComposeView view;

    @RequiresApi(24)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$Api24Impl */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            C12775o.m28639i(accessibilityNodeInfoCompat, "info");
            C12775o.m28639i(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908349, accessibilityAction.getLabel()));
            }
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$Api28Impl */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @DoNotInline
        public static final void setScrollEventDelta(AccessibilityEvent accessibilityEvent, int i, int i2) {
            C12775o.m28639i(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$Api29Impl */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @DoNotInline
        public static final void addPageActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            C12775o.m28639i(accessibilityNodeInfoCompat, "info");
            C12775o.m28639i(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908360, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908361, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$Companion */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            C12775o.m28639i(accessibilityNodeInfo, "info");
            C12775o.m28639i(str, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfo, str, bundle);
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i, i2, bundle);
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            C12775o.m28639i(semanticsNode, "node");
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3169:1\n33#2,6:3170\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n380#1:3170,6\n*E\n"})
    @VisibleForTesting
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class SemanticsNodeCopy {
        private final Set<Integer> children = new LinkedHashSet();
        private final SemanticsNode semanticsNode;
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(SemanticsNode semanticsNode2, Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
            C12775o.m28639i(semanticsNode2, "semanticsNode");
            C12775o.m28639i(map, "currentSemanticsNodes");
            this.semanticsNode = semanticsNode2;
            this.unmergedConfig = semanticsNode2.getUnmergedConfig$ui_release();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode3 = replacedChildren$ui_release.get(i);
                if (map.containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode3.getId()));
                }
            }
        }

        public final Set<Integer> getChildren() {
            return this.children;
        }

        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$WhenMappings */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.p002ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p002ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.WhenMappings.<clinit>():void");
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        C12775o.m28639i(androidComposeView, "view");
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        C12775o.m28637g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager2;
        this.enabledStateListener = new C1137h(this);
        this.touchExplorationStateListener = new C1140i(this);
        this.enabledServices = accessibilityManager2.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new MyNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.actionIdToLabel = new SparseArrayCompat<>();
        this.labelToActionId = new SparseArrayCompat<>();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>();
        this.boundsUpdateChannel = C10898g.m23419b(-1, (C10886a) null, (Function1) null, 6, (Object) null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = C12716r0.m28416g();
        this.paneDisplayed = new ArraySet<>();
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), C12716r0.m28416g());
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

            {
                this.this$0 = r1;
            }

            public void onViewAttachedToWindow(View view) {
                C12775o.m28639i(view, "view");
                this.this$0.getAccessibilityManager$ui_release().addAccessibilityStateChangeListener(this.this$0.getEnabledStateListener$ui_release());
                this.this$0.getAccessibilityManager$ui_release().addTouchExplorationStateChangeListener(this.this$0.getTouchExplorationStateListener$ui_release());
            }

            public void onViewDetachedFromWindow(View view) {
                C12775o.m28639i(view, "view");
                this.this$0.handler.removeCallbacks(this.this$0.semanticsChangeChecker);
                this.this$0.getAccessibilityManager$ui_release().removeAccessibilityStateChangeListener(this.this$0.getEnabledStateListener$ui_release());
                this.this$0.getAccessibilityManager$ui_release().removeTouchExplorationStateChangeListener(this.this$0.getTouchExplorationStateListener$ui_release());
            }
        });
        this.semanticsChangeChecker = new C1143j(this);
        this.scrollObservationScopes = new ArrayList();
        this.sendScrollEventIfNeededLambda = new C1078x168b1034(this);
    }

    /* access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        String str2;
        int i2;
        Boolean bool;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
            String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
            if (C12775o.m28634d(str, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL)) {
                Integer num = this.idToBeforeMap.get(Integer.valueOf(i));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (C12775o.m28634d(str, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL)) {
                Integer num2 = this.idToAfterMap.get(Integer.valueOf(i));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                if (!unmergedConfig$ui_release.contains(semanticsActions.getGetTextLayoutResult()) || bundle == null || !C12775o.m28634d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
                    SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                    if (unmergedConfig$ui_release2.contains(semanticsProperties.getTestTag()) && bundle != null && C12775o.m28634d(str, ExtraDataTestTagKey) && (str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getTestTag())) != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                        return;
                    }
                    return;
                }
                int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i4 > 0 && i3 >= 0) {
                    if (iterableTextForAccessibility != null) {
                        i2 = iterableTextForAccessibility.length();
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i3 < i2) {
                        ArrayList arrayList = new ArrayList();
                        Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getGetTextLayoutResult())).getAction();
                        if (function1 != null) {
                            bool = (Boolean) function1.invoke(arrayList);
                        } else {
                            bool = null;
                        }
                        if (C12775o.m28634d(bool, Boolean.TRUE)) {
                            TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                            ArrayList arrayList2 = new ArrayList();
                            for (int i5 = 0; i5 < i4; i5++) {
                                int i6 = i3 + i5;
                                if (i6 >= textLayoutResult.getLayoutInput().getText().length()) {
                                    arrayList2.add((Object) null);
                                } else {
                                    arrayList2.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i6)));
                                }
                            }
                            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e(LogTag, "Invalid arguments for accessibility character locations");
            }
        }
    }

    private final void checkForSemanticsChanges() {
        sendSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendSemanticsPropertyChangeEvents$ui_release(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    private final boolean clearAccessibilityFocus(int i) {
        if (!isAccessibilityFocused(i)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 65536, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [android.view.ViewParent] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.accessibility.AccessibilityNodeInfo createNodeInfo(int r11) {
        /*
            r10 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r10.view
            androidx.compose.ui.platform.AndroidComposeView$ViewTreeOwners r0 = r0.getViewTreeOwners()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.LifecycleOwner r0 = r0.getLifecycleOwner()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r2) goto L_0x0020
            return r1
        L_0x0020:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain()
            java.lang.String r2 = "obtain()"
            kotlin.jvm.internal.C12775o.m28638h(r0, r2)
            java.util.Map r2 = r10.getCurrentSemanticsNodes()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r2.get(r3)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds) r2
            if (r2 != 0) goto L_0x003a
            return r1
        L_0x003a:
            androidx.compose.ui.semantics.SemanticsNode r3 = r2.getSemanticsNode()
            r4 = -1
            if (r11 != r4) goto L_0x0052
            androidx.compose.ui.platform.AndroidComposeView r4 = r10.view
            android.view.ViewParent r4 = androidx.core.view.ViewCompat.getParentForAccessibility(r4)
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x004e
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L_0x004e:
            r0.setParent(r1)
            goto L_0x007a
        L_0x0052:
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.getParent()
            if (r1 == 0) goto L_0x00df
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.getParent()
            kotlin.jvm.internal.C12775o.m28636f(r1)
            int r1 = r1.getId()
            androidx.compose.ui.platform.AndroidComposeView r5 = r10.view
            androidx.compose.ui.semantics.SemanticsOwner r5 = r5.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r5 = r5.getUnmergedRootSemanticsNode()
            int r5 = r5.getId()
            if (r1 != r5) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r4 = r1
        L_0x0075:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.view
            r0.setParent(r1, r4)
        L_0x007a:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.view
            r0.setSource(r1, r11)
            android.graphics.Rect r1 = r2.getAdjustedBounds()
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.view
            int r4 = r1.left
            float r4 = (float) r4
            int r5 = r1.top
            float r5 = (float) r5
            long r4 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r4, r5)
            long r4 = r2.m37702localToScreenMKHz9U(r4)
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.view
            int r6 = r1.right
            float r6 = (float) r6
            int r1 = r1.bottom
            float r1 = (float) r1
            long r6 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r6, r1)
            long r1 = r2.m37702localToScreenMKHz9U(r6)
            android.graphics.Rect r6 = new android.graphics.Rect
            float r7 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r4)
            double r7 = (double) r7
            double r7 = java.lang.Math.floor(r7)
            float r7 = (float) r7
            int r7 = (int) r7
            float r4 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r1)
            double r8 = (double) r5
            double r8 = java.lang.Math.ceil(r8)
            float r5 = (float) r8
            int r5 = (int) r5
            float r1 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            r6.<init>(r7, r4, r5, r1)
            r0.setBoundsInScreen(r6)
            r10.populateAccessibilityNodeInfoProperties(r11, r0, r3)
            android.view.accessibility.AccessibilityNodeInfo r11 = r0.unwrap()
            return r11
        L_0x00df:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "semanticsNode "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " has null parent"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.createNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i, 8192);
        if (num != null) {
            createEvent$ui_release.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent$ui_release.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent$ui_release.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent$ui_release.getText().add(charSequence);
        }
        return createEvent$ui_release;
    }

    /* access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        List<AccessibilityServiceInfo> list;
        C12775o.m28639i(androidComposeViewAccessibilityDelegateCompat, "this$0");
        if (z) {
            list = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            list = C12726w.m28524k();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = list;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) {
            return this.accessibilityCursorPosition;
        }
        return TextRange.m37970getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m37979unboximpl());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) {
            return this.accessibilityCursorPosition;
        }
        return TextRange.m37975getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m37979unboximpl());
    }

    private final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            setTraversalValues();
        }
        return this.currentSemanticsNodes;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            return TempListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getContentDescription()), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode)) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) C12686e0.m28223b0(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i) {
        boolean z;
        Boolean bool;
        if (semanticsNode == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (i == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator.Companion companion = AccessibilityIterators.CharacterTextSegmentIterator.Companion;
            Locale locale = this.view.getContext().getResources().getConfiguration().locale;
            C12775o.m28638h(locale, "view.context.resources.configuration.locale");
            AccessibilityIterators.CharacterTextSegmentIterator instance = companion.getInstance(locale);
            instance.initialize(iterableTextForAccessibility);
            return instance;
        } else if (i != 2) {
            if (i != 4) {
                if (i == 8) {
                    AccessibilityIterators.ParagraphTextSegmentIterator instance2 = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                    instance2.initialize(iterableTextForAccessibility);
                    return instance2;
                } else if (i != 16) {
                    return null;
                }
            }
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
            SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
            if (!unmergedConfig$ui_release.contains(semanticsActions.getGetTextLayoutResult())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getGetTextLayoutResult())).getAction();
            if (function1 != null) {
                bool = (Boolean) function1.invoke(arrayList);
            } else {
                bool = null;
            }
            if (!C12775o.m28634d(bool, Boolean.TRUE)) {
                return null;
            }
            TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
            if (i == 4) {
                AccessibilityIterators.LineTextSegmentIterator instance3 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                instance3.initialize(iterableTextForAccessibility, textLayoutResult);
                return instance3;
            }
            AccessibilityIterators.PageTextSegmentIterator instance4 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
            instance4.initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
            return instance4;
        } else {
            AccessibilityIterators.WordTextSegmentIterator.Companion companion2 = AccessibilityIterators.WordTextSegmentIterator.Companion;
            Locale locale2 = this.view.getContext().getResources().getConfiguration().locale;
            C12775o.m28638h(locale2, "view.context.resources.configuration.locale");
            AccessibilityIterators.WordTextSegmentIterator instance5 = companion2.getInstance(locale2);
            instance5.initialize(iterableTextForAccessibility);
            return instance5;
        }
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isAccessibilityFocused(int i) {
        if (this.focusedVirtualViewId == i) {
            return true;
        }
        return false;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText())) {
            return false;
        }
        return true;
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled())) {
            return true;
        }
        return false;
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo45894m(C11921v.f18618a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v14, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performActionHelper(int r13, int r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.util.Map r0 = r12.getCurrentSemanticsNodes()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r0 = (androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds) r0
            r1 = 0
            if (r0 == 0) goto L_0x05fc
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.getSemanticsNode()
            if (r0 != 0) goto L_0x0019
            goto L_0x05fc
        L_0x0019:
            r2 = 64
            if (r14 == r2) goto L_0x05f7
            r2 = 128(0x80, float:1.794E-43)
            if (r14 == r2) goto L_0x05f2
            r2 = 256(0x100, float:3.59E-43)
            r3 = 1
            if (r14 == r2) goto L_0x05db
            r4 = 512(0x200, float:7.175E-43)
            if (r14 == r4) goto L_0x05db
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r14 == r2) goto L_0x05b6
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r14 == r2) goto L_0x058a
            boolean r2 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(r0)
            if (r2 != 0) goto L_0x0039
            return r1
        L_0x0039:
            if (r14 == r3) goto L_0x0565
            r2 = 2
            r4 = 0
            if (r14 == r2) goto L_0x0544
            switch(r14) {
                case 16: goto L_0x0511;
                case 32: goto L_0x04ec;
                case 4096: goto L_0x0356;
                case 8192: goto L_0x0356;
                case 32768: goto L_0x0331;
                case 65536: goto L_0x030c;
                case 262144: goto L_0x02e7;
                case 524288: goto L_0x02c2;
                case 1048576: goto L_0x029d;
                case 2097152: goto L_0x0261;
                case 16908342: goto L_0x0164;
                case 16908349: goto L_0x012c;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r14) {
                case 16908344: goto L_0x0356;
                case 16908345: goto L_0x0356;
                case 16908346: goto L_0x0356;
                case 16908347: goto L_0x0356;
                default: goto L_0x0045;
            }
        L_0x0045:
            switch(r14) {
                case 16908358: goto L_0x0107;
                case 16908359: goto L_0x00e2;
                case 16908360: goto L_0x00bd;
                case 16908361: goto L_0x0098;
                default: goto L_0x0048;
            }
        L_0x0048:
            androidx.collection.SparseArrayCompat<androidx.collection.SparseArrayCompat<java.lang.CharSequence>> r15 = r12.actionIdToLabel
            java.lang.Object r13 = r15.get(r13)
            androidx.collection.SparseArrayCompat r13 = (androidx.collection.SparseArrayCompat) r13
            if (r13 == 0) goto L_0x0097
            java.lang.Object r13 = r13.get(r14)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            if (r13 != 0) goto L_0x005b
            goto L_0x0097
        L_0x005b:
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r15 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.getCustomActions()
            java.lang.Object r14 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r15)
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L_0x006e
            return r1
        L_0x006e:
            int r15 = r14.size()
            r0 = r1
        L_0x0073:
            if (r0 >= r15) goto L_0x0097
            java.lang.Object r2 = r14.get(r0)
            androidx.compose.ui.semantics.CustomAccessibilityAction r2 = (androidx.compose.p002ui.semantics.CustomAccessibilityAction) r2
            java.lang.String r3 = r2.getLabel()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r3, r13)
            if (r3 == 0) goto L_0x0094
            of.a r13 = r2.getAction()
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L_0x0094:
            int r0 = r0 + 1
            goto L_0x0073
        L_0x0097:
            return r1
        L_0x0098:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPageRight()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x00bc
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x00bc
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x00bc:
            return r1
        L_0x00bd:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPageLeft()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x00e1
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x00e1
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x00e1:
            return r1
        L_0x00e2:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPageDown()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0106
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x0106
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0106:
            return r1
        L_0x0107:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPageUp()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x012b
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x012b
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x012b:
            return r1
        L_0x012c:
            if (r15 == 0) goto L_0x0163
            java.lang.String r13 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r14 = r15.containsKey(r13)
            if (r14 != 0) goto L_0x0137
            goto L_0x0163
        L_0x0137:
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r0 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getSetProgress()
            java.lang.Object r14 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r0)
            androidx.compose.ui.semantics.AccessibilityAction r14 = (androidx.compose.p002ui.semantics.AccessibilityAction) r14
            if (r14 == 0) goto L_0x0163
            ef.c r14 = r14.getAction()
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            if (r14 == 0) goto L_0x0163
            float r13 = r15.getFloat(r13)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r14.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0163:
            return r1
        L_0x0164:
            androidx.compose.ui.semantics.SemanticsNode r13 = r0.getParent()
            if (r13 == 0) goto L_0x017d
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r13.getConfig()
            if (r14 == 0) goto L_0x017d
            androidx.compose.ui.semantics.SemanticsActions r15 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.getScrollBy()
            java.lang.Object r14 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r15)
            androidx.compose.ui.semantics.AccessibilityAction r14 = (androidx.compose.p002ui.semantics.AccessibilityAction) r14
            goto L_0x017e
        L_0x017d:
            r14 = r4
        L_0x017e:
            if (r13 == 0) goto L_0x019c
            if (r14 == 0) goto L_0x0183
            goto L_0x019c
        L_0x0183:
            androidx.compose.ui.semantics.SemanticsNode r13 = r13.getParent()
            if (r13 == 0) goto L_0x017d
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r13.getConfig()
            if (r14 == 0) goto L_0x017d
            androidx.compose.ui.semantics.SemanticsActions r15 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.getScrollBy()
            java.lang.Object r14 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r15)
            androidx.compose.ui.semantics.AccessibilityAction r14 = (androidx.compose.p002ui.semantics.AccessibilityAction) r14
            goto L_0x017e
        L_0x019c:
            if (r13 != 0) goto L_0x019f
            return r1
        L_0x019f:
            androidx.compose.ui.layout.LayoutInfo r15 = r13.getLayoutInfo()
            androidx.compose.ui.layout.LayoutCoordinates r15 = r15.getCoordinates()
            androidx.compose.ui.geometry.Rect r15 = androidx.compose.p002ui.layout.LayoutCoordinatesKt.boundsInParent(r15)
            androidx.compose.ui.layout.LayoutInfo r2 = r13.getLayoutInfo()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.getCoordinates()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.getParentLayoutCoordinates()
            if (r2 == 0) goto L_0x01be
            long r4 = androidx.compose.p002ui.layout.LayoutCoordinatesKt.positionInRoot(r2)
            goto L_0x01c4
        L_0x01be:
            androidx.compose.ui.geometry.Offset$Companion r2 = androidx.compose.p002ui.geometry.Offset.Companion
            long r4 = r2.m35438getZeroF1C5BW0()
        L_0x01c4:
            androidx.compose.ui.geometry.Rect r15 = r15.m35459translatek4lQ0M(r4)
            long r4 = r0.m37822getPositionInRootF1C5BW0()
            long r6 = r0.m37824getSizeYbymL2g()
            long r6 = androidx.compose.p002ui.unit.IntSizeKt.m38638toSizeozmzZPI(r6)
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.p002ui.geometry.RectKt.m35462Recttz77jQw(r4, r6)
            androidx.compose.ui.semantics.SemanticsConfiguration r4 = r13.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r6 = r5.getHorizontalScrollAxisRange()
            java.lang.Object r4 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r4, r6)
            androidx.compose.ui.semantics.ScrollAxisRange r4 = (androidx.compose.p002ui.semantics.ScrollAxisRange) r4
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r13.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.getVerticalScrollAxisRange()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r5)
            androidx.compose.ui.semantics.ScrollAxisRange r13 = (androidx.compose.p002ui.semantics.ScrollAxisRange) r13
            float r5 = r2.getLeft()
            float r6 = r15.getLeft()
            float r5 = r5 - r6
            float r6 = r2.getRight()
            float r7 = r15.getRight()
            float r6 = r6 - r7
            float r5 = performActionHelper$scrollDelta(r5, r6)
            if (r4 == 0) goto L_0x0216
            boolean r4 = r4.getReverseScrolling()
            if (r4 != r3) goto L_0x0216
            r4 = r3
            goto L_0x0217
        L_0x0216:
            r4 = r1
        L_0x0217:
            if (r4 == 0) goto L_0x021a
            float r5 = -r5
        L_0x021a:
            boolean r0 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(r0)
            if (r0 == 0) goto L_0x0221
            float r5 = -r5
        L_0x0221:
            float r0 = r2.getTop()
            float r4 = r15.getTop()
            float r0 = r0 - r4
            float r2 = r2.getBottom()
            float r15 = r15.getBottom()
            float r2 = r2 - r15
            float r15 = performActionHelper$scrollDelta(r0, r2)
            if (r13 == 0) goto L_0x0240
            boolean r13 = r13.getReverseScrolling()
            if (r13 != r3) goto L_0x0240
            goto L_0x0241
        L_0x0240:
            r3 = r1
        L_0x0241:
            if (r3 == 0) goto L_0x0244
            float r15 = -r15
        L_0x0244:
            if (r14 == 0) goto L_0x0260
            ef.c r13 = r14.getAction()
            of.o r13 = (p404of.C13088o) r13
            if (r13 == 0) goto L_0x0260
            java.lang.Float r14 = java.lang.Float.valueOf(r5)
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0260:
            return r1
        L_0x0261:
            if (r15 == 0) goto L_0x0269
            java.lang.String r13 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r4 = r15.getString(r13)
        L_0x0269:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getSetText()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x029c
            ef.c r13 = r13.getAction()
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            if (r13 == 0) goto L_0x029c
            androidx.compose.ui.text.AnnotatedString r14 = new androidx.compose.ui.text.AnnotatedString
            if (r4 != 0) goto L_0x0289
            java.lang.String r4 = ""
        L_0x0289:
            r6 = r4
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = r13.invoke(r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x029c:
            return r1
        L_0x029d:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getDismiss()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x02c1
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x02c1
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x02c1:
            return r1
        L_0x02c2:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getCollapse()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x02e6
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x02e6
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x02e6:
            return r1
        L_0x02e7:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getExpand()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x030b
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x030b
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x030b:
            return r1
        L_0x030c:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getCutText()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0330
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x0330
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0330:
            return r1
        L_0x0331:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getPasteText()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0355
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x0355
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0355:
            return r1
        L_0x0356:
            r13 = 4096(0x1000, float:5.74E-42)
            if (r14 != r13) goto L_0x035c
            r13 = r3
            goto L_0x035d
        L_0x035c:
            r13 = r1
        L_0x035d:
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r14 != r15) goto L_0x0363
            r15 = r3
            goto L_0x0364
        L_0x0363:
            r15 = r1
        L_0x0364:
            r2 = 16908345(0x1020039, float:2.387739E-38)
            if (r14 != r2) goto L_0x036b
            r2 = r3
            goto L_0x036c
        L_0x036b:
            r2 = r1
        L_0x036c:
            r4 = 16908347(0x102003b, float:2.3877394E-38)
            if (r14 != r4) goto L_0x0373
            r4 = r3
            goto L_0x0374
        L_0x0373:
            r4 = r1
        L_0x0374:
            r5 = 16908344(0x1020038, float:2.3877386E-38)
            if (r14 != r5) goto L_0x037b
            r5 = r3
            goto L_0x037c
        L_0x037b:
            r5 = r1
        L_0x037c:
            r6 = 16908346(0x102003a, float:2.3877392E-38)
            if (r14 != r6) goto L_0x0383
            r14 = r3
            goto L_0x0384
        L_0x0383:
            r14 = r1
        L_0x0384:
            if (r2 != 0) goto L_0x038f
            if (r4 != 0) goto L_0x038f
            if (r13 != 0) goto L_0x038f
            if (r15 == 0) goto L_0x038d
            goto L_0x038f
        L_0x038d:
            r6 = r1
            goto L_0x0390
        L_0x038f:
            r6 = r3
        L_0x0390:
            if (r5 != 0) goto L_0x039b
            if (r14 != 0) goto L_0x039b
            if (r13 != 0) goto L_0x039b
            if (r15 == 0) goto L_0x0399
            goto L_0x039b
        L_0x0399:
            r14 = r1
            goto L_0x039c
        L_0x039b:
            r14 = r3
        L_0x039c:
            if (r13 != 0) goto L_0x03a0
            if (r15 == 0) goto L_0x0435
        L_0x03a0:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getProgressBarRangeInfo()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r7)
            androidx.compose.ui.semantics.ProgressBarRangeInfo r13 = (androidx.compose.p002ui.semantics.ProgressBarRangeInfo) r13
            androidx.compose.ui.semantics.SemanticsConfiguration r7 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r8 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r8 = r8.getSetProgress()
            java.lang.Object r7 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r7, r8)
            androidx.compose.ui.semantics.AccessibilityAction r7 = (androidx.compose.p002ui.semantics.AccessibilityAction) r7
            if (r13 == 0) goto L_0x0435
            if (r7 == 0) goto L_0x0435
            tf.b r14 = r13.getRange()
            java.lang.Comparable r14 = r14.getEndInclusive()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            tf.b r0 = r13.getRange()
            java.lang.Comparable r0 = r0.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r14 = p436tf.C13537l.m30876c(r14, r0)
            tf.b r0 = r13.getRange()
            java.lang.Comparable r0 = r0.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            tf.b r2 = r13.getRange()
            java.lang.Comparable r2 = r2.getEndInclusive()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r0 = p436tf.C13537l.m30881h(r0, r2)
            int r2 = r13.getSteps()
            if (r2 <= 0) goto L_0x0411
            float r14 = r14 - r0
            int r0 = r13.getSteps()
            int r0 = r0 + r3
            goto L_0x0414
        L_0x0411:
            float r14 = r14 - r0
            r0 = 20
        L_0x0414:
            float r0 = (float) r0
            float r14 = r14 / r0
            if (r15 == 0) goto L_0x0419
            float r14 = -r14
        L_0x0419:
            ef.c r15 = r7.getAction()
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            if (r15 == 0) goto L_0x0434
            float r13 = r13.getCurrent()
            float r13 = r13 + r14
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r15.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0434:
            return r1
        L_0x0435:
            androidx.compose.ui.layout.LayoutInfo r13 = r0.getLayoutInfo()
            androidx.compose.ui.layout.LayoutCoordinates r13 = r13.getCoordinates()
            androidx.compose.ui.geometry.Rect r13 = androidx.compose.p002ui.layout.LayoutCoordinatesKt.boundsInParent(r13)
            long r7 = r13.m35455getSizeNHjbRc()
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r3 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.getScrollBy()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r3)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 != 0) goto L_0x0458
            return r1
        L_0x0458:
            androidx.compose.ui.semantics.SemanticsConfiguration r3 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r9 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r10 = r9.getHorizontalScrollAxisRange()
            java.lang.Object r3 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r10)
            androidx.compose.ui.semantics.ScrollAxisRange r3 = (androidx.compose.p002ui.semantics.ScrollAxisRange) r3
            r10 = 0
            if (r3 == 0) goto L_0x04a9
            if (r6 == 0) goto L_0x04a9
            float r6 = androidx.compose.p002ui.geometry.Size.m35491getWidthimpl(r7)
            if (r2 != 0) goto L_0x0475
            if (r15 == 0) goto L_0x0476
        L_0x0475:
            float r6 = -r6
        L_0x0476:
            boolean r11 = r3.getReverseScrolling()
            if (r11 == 0) goto L_0x047d
            float r6 = -r6
        L_0x047d:
            boolean r11 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(r0)
            if (r11 == 0) goto L_0x0488
            if (r2 != 0) goto L_0x0487
            if (r4 == 0) goto L_0x0488
        L_0x0487:
            float r6 = -r6
        L_0x0488:
            boolean r2 = performActionHelper$canScroll(r3, r6)
            if (r2 == 0) goto L_0x04a9
            ef.c r13 = r13.getAction()
            of.o r13 = (p404of.C13088o) r13
            if (r13 == 0) goto L_0x04a8
            java.lang.Float r14 = java.lang.Float.valueOf(r6)
            java.lang.Float r15 = java.lang.Float.valueOf(r10)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x04a8:
            return r1
        L_0x04a9:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r9.getVerticalScrollAxisRange()
            java.lang.Object r0 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r0, r2)
            androidx.compose.ui.semantics.ScrollAxisRange r0 = (androidx.compose.p002ui.semantics.ScrollAxisRange) r0
            if (r0 == 0) goto L_0x04eb
            if (r14 == 0) goto L_0x04eb
            float r14 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r7)
            if (r5 != 0) goto L_0x04c3
            if (r15 == 0) goto L_0x04c4
        L_0x04c3:
            float r14 = -r14
        L_0x04c4:
            boolean r15 = r0.getReverseScrolling()
            if (r15 == 0) goto L_0x04cb
            float r14 = -r14
        L_0x04cb:
            boolean r15 = performActionHelper$canScroll(r0, r14)
            if (r15 == 0) goto L_0x04eb
            ef.c r13 = r13.getAction()
            of.o r13 = (p404of.C13088o) r13
            if (r13 == 0) goto L_0x04eb
            java.lang.Float r15 = java.lang.Float.valueOf(r10)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Object r13 = r13.invoke(r15, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x04eb:
            return r1
        L_0x04ec:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getOnLongClick()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0510
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x0510
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0510:
            return r1
        L_0x0511:
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r15 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.getOnClick()
            java.lang.Object r14 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r14, r15)
            androidx.compose.ui.semantics.AccessibilityAction r14 = (androidx.compose.p002ui.semantics.AccessibilityAction) r14
            if (r14 == 0) goto L_0x0532
            ef.c r14 = r14.getAction()
            of.a r14 = (p404of.C13074a) r14
            if (r14 == 0) goto L_0x0532
            java.lang.Object r14 = r14.invoke()
            r4 = r14
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L_0x0532:
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r12
            r6 = r13
            sendEventForVirtualView$default(r5, r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x0543
            boolean r1 = r4.booleanValue()
        L_0x0543:
            return r1
        L_0x0544:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r14 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getFocused()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.C12775o.m28634d(r13, r14)
            if (r13 == 0) goto L_0x0564
            androidx.compose.ui.platform.AndroidComposeView r13 = r12.view
            androidx.compose.ui.focus.FocusOwner r13 = r13.getFocusOwner()
            androidx.compose.p002ui.focus.FocusManager.clearFocus$default(r13, r1, r3, r4)
            r1 = r3
        L_0x0564:
            return r1
        L_0x0565:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getRequestFocus()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x0589
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x0589
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0589:
            return r1
        L_0x058a:
            r13 = -1
            if (r15 == 0) goto L_0x0594
            java.lang.String r14 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r14 = r15.getInt(r14, r13)
            goto L_0x0595
        L_0x0594:
            r14 = r13
        L_0x0595:
            if (r15 == 0) goto L_0x059d
            java.lang.String r2 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r13 = r15.getInt(r2, r13)
        L_0x059d:
            boolean r13 = r12.setAccessibilitySelection(r0, r14, r13, r1)
            if (r13 == 0) goto L_0x05b5
            int r14 = r0.getId()
            int r1 = r12.semanticsNodeIdToAccessibilityVirtualNodeId(r14)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r12
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
        L_0x05b5:
            return r13
        L_0x05b6:
            androidx.compose.ui.semantics.SemanticsConfiguration r13 = r0.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsActions r14 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.getCopyText()
            java.lang.Object r13 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r13, r14)
            androidx.compose.ui.semantics.AccessibilityAction r13 = (androidx.compose.p002ui.semantics.AccessibilityAction) r13
            if (r13 == 0) goto L_0x05da
            ef.c r13 = r13.getAction()
            of.a r13 = (p404of.C13074a) r13
            if (r13 == 0) goto L_0x05da
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x05da:
            return r1
        L_0x05db:
            if (r15 == 0) goto L_0x05f1
            java.lang.String r13 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r13 = r15.getInt(r13)
            java.lang.String r4 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r15 = r15.getBoolean(r4)
            if (r14 != r2) goto L_0x05ec
            r1 = r3
        L_0x05ec:
            boolean r13 = r12.traverseAtGranularity(r0, r13, r1, r15)
            return r13
        L_0x05f1:
            return r1
        L_0x05f2:
            boolean r13 = r12.clearAccessibilityFocus(r13)
            return r13
        L_0x05f7:
            boolean r13 = r12.requestAccessibilityFocus(r13)
            return r13
        L_0x05fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        if ((f >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) && (f <= 0.0f || scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue())) {
            return false;
        }
        return true;
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        boolean z;
        if (Math.signum(f) == Math.signum(f2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0.0f;
        }
        if (Math.abs(f) < Math.abs(f2)) {
            return f;
        }
        return f2;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if ((scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) && (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || !scrollAxisRange.getReverseScrolling())) {
            return false;
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if ((scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) && (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || !scrollAxisRange.getReverseScrolling())) {
            return false;
        }
        return true;
    }

    private final boolean registerScrollingId(int i, List<ScrollObservationScope> list) {
        boolean z;
        ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list, i);
        if (findById != null) {
            z = false;
        } else {
            findById = new ScrollObservationScope(i, this.scrollObservationScopes, (Float) null, (Float) null, (ScrollAxisRange) null, (ScrollAxisRange) null);
            z = true;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    private final boolean requestAccessibilityFocus(int i) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i)) {
            return false;
        }
        int i2 = this.focusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i2, 65536, (Integer) null, (List) null, 12, (Object) null);
        }
        this.focusedVirtualViewId = i;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 32768, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean z) {
        Comparator b = C12019b.m26105b(C1073xc1aab54.INSTANCE, C1074xc1aab55.INSTANCE, C1075xc1aab56.INSTANCE, C1076xc1aab57.INSTANCE);
        if (z) {
            b = C12019b.m26105b(C1069x4da50560.INSTANCE, C1070x4da50561.INSTANCE, C1071x4da50562.INSTANCE, C1072x4da50563.INSTANCE);
        }
        return new C1066xaf6f85ce(new C1065xaf6f85cd(b, LayoutNode.Companion.getZComparator$ui_release()));
    }

    /* access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$38(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        C12775o.m28639i(androidComposeViewAccessibilityDelegateCompat, "this$0");
        Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, (Object) null);
        androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
    }

    /* access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        return this.view.getParent().requestSendAccessibilityEvent(this.view, accessibilityEvent);
    }

    private final boolean sendEventForVirtualView(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i, i2);
        if (num != null) {
            createEvent$ui_release.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        return sendEvent(createEvent$ui_release);
    }

    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        createEvent$ui_release.setContentChangeTypes(i2);
        if (str != null) {
            createEvent$ui_release.getText().add(str);
        }
        sendEvent(createEvent$ui_release);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent2 = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent2 != null) {
            if (i == pendingTextTraversedEvent2.getNode().getId()) {
                if (SystemClock.uptimeMillis() - pendingTextTraversedEvent2.getTraverseTime() <= 1000) {
                    AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent2.getNode().getId()), 131072);
                    createEvent$ui_release.setFromIndex(pendingTextTraversedEvent2.getFromIndex());
                    createEvent$ui_release.setToIndex(pendingTextTraversedEvent2.getToIndex());
                    createEvent$ui_release.setAction(pendingTextTraversedEvent2.getAction());
                    createEvent$ui_release.setMovementGranularity(pendingTextTraversedEvent2.getGranularity());
                    createEvent$ui_release.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent2.getNode()));
                    sendEvent(createEvent$ui_release);
                }
            } else {
                return;
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* access modifiers changed from: private */
    public final void sendScrollEventIfNeeded(ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.sendScrollEventIfNeededLambda, new C1077x595e4e0d(scrollObservationScope, this));
        }
    }

    private final void sendSemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        for (Integer intValue : semanticsNodeCopy.getChildren()) {
            if (!linkedHashSet.contains(Integer.valueOf(intValue.intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                C12775o.m28636f(semanticsNodeCopy2);
                sendSemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, ArraySet<Integer> arraySet) {
        LayoutNode access$findClosestParentNode;
        SemanticsModifierNode outerSemantics;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            SemanticsModifierNode outerSemantics2 = SemanticsNodeKt.getOuterSemantics(layoutNode);
            if (outerSemantics2 == null) {
                LayoutNode access$findClosestParentNode2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, C1080xdb31af5f.INSTANCE);
                if (access$findClosestParentNode2 != null) {
                    outerSemantics2 = SemanticsNodeKt.getOuterSemantics(access$findClosestParentNode2);
                } else {
                    outerSemantics2 = null;
                }
                if (outerSemantics2 == null) {
                    return;
                }
            }
            if (!(SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics2).isMergingSemanticsOfDescendants() || (access$findClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, C1079x7245ac5.INSTANCE)) == null || (outerSemantics = SemanticsNodeKt.getOuterSemantics(access$findClosestParentNode)) == null)) {
                outerSemantics2 = outerSemantics;
            }
            int semanticsId = DelegatableNodeKt.requireLayoutNode(outerSemantics2).getSemanticsId();
            if (arraySet.add(Integer.valueOf(semanticsId))) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, (List) null, 8, (Object) null);
            }
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        Integer num;
        Integer num2;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        boolean z2 = false;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            C13089p pVar = (C13089p) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getSetSelection())).getAction();
            if (pVar != null) {
                return ((Boolean) pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        } else if ((i == i2 && i2 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        } else {
            if (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) {
                i = -1;
            }
            this.accessibilityCursorPosition = i;
            if (iterableTextForAccessibility.length() > 0) {
                z2 = true;
            }
            int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId());
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.accessibilityCursorPosition);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.accessibilityCursorPosition);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(iterableTextForAccessibility.length());
            }
            sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId, num, num2, num3, iterableTextForAccessibility));
            sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
            return true;
        }
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getError()));
        }
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SpannableString spannableString;
        AnnotatedString annotatedString;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
        SpannableString spannableString2 = null;
        if (textForTextField != null) {
            spannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) trimToSize(spannableString, ParcelSafeTextLength);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (!(list == null || (annotatedString = (AnnotatedString) C12686e0.m28223b0(list)) == null)) {
            spannableString2 = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver);
        }
        SpannableString spannableString4 = (SpannableString) trimToSize(spannableString2, ParcelSafeTextLength);
        if (spannableString3 == null) {
            spannableString3 = spannableString4;
        }
        accessibilityNodeInfoCompat.setText(spannableString3);
    }

    private final void setTraversalValues() {
        SemanticsNode semanticsNode;
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        if (semanticsNodeWithAdjustedBounds != null) {
            semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        } else {
            semanticsNode = null;
        }
        C12775o.m28636f(semanticsNode);
        List<SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode), C12686e0.m28207D0(semanticsNode.getChildren()));
        int m = C12726w.m28526m(subtreeSortedByGeometryGrouping);
        int i = 1;
        if (1 <= m) {
            while (true) {
                int id = subtreeSortedByGeometryGrouping.get(i - 1).getId();
                int id2 = subtreeSortedByGeometryGrouping.get(i).getId();
                this.idToBeforeMap.put(Integer.valueOf(id), Integer.valueOf(id2));
                this.idToAfterMap.put(Integer.valueOf(id2), Integer.valueOf(id));
                if (i != m) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean z, List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map) {
        ArrayList arrayList = new ArrayList();
        int m = C12726w.m28526m(list);
        if (m >= 0) {
            int i = 0;
            while (true) {
                SemanticsNode semanticsNode = list.get(i);
                if (i == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList, semanticsNode)) {
                    arrayList.add(new C11906l(semanticsNode.getBoundsInWindow(), C12726w.m28530q(semanticsNode)));
                }
                if (i == m) {
                    break;
                }
                i++;
            }
        }
        C12664a0.m28170A(arrayList, C12019b.m26105b(C1081xa214d57f.INSTANCE, C1082xa214d580.INSTANCE));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11906l lVar = (C11906l) arrayList.get(i2);
            C12664a0.m28170A((List) lVar.mo49112d(), semanticComparator(z));
            List list2 = (List) lVar.mo49112d();
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) list2.get(i3);
                List list3 = map.get(Integer.valueOf(semanticsNode2.getId()));
                if (list3 == null) {
                    list3 = C12726w.m28530q(semanticsNode2);
                }
                arrayList2.addAll(list3);
            }
        }
        return arrayList2;
    }

    static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, List list, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z, list, map);
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(List<C11906l<Rect, List<SemanticsNode>>> list, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        OpenEndRange<Float> rangeUntil = AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(top, bottom);
        int m = C12726w.m28526m(list);
        if (m >= 0) {
            int i = 0;
            while (true) {
                Rect rect = (Rect) list.get(i).mo49111c();
                if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.overlaps(AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(rect.getTop(), rect.getBottom()), rangeUntil)) {
                    if (i == m) {
                        break;
                    }
                    i++;
                } else {
                    list.set(i, new C11906l(rect.intersect(new Rect(0.0f, top, Float.POSITIVE_INFINITY, bottom)), list.get(i).mo49112d()));
                    ((List) list.get(i).mo49112d()).add(semanticsNode);
                    return true;
                }
            }
        }
        return false;
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z, List<SemanticsNode> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(arrayList, linkedHashMap, this, z, list.get(i));
        }
        return sortByGeometryGroupings(z, arrayList, linkedHashMap);
    }

    private static final void subtreeSortedByGeometryGrouping$depthFirstSearch(List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, SemanticsNode semanticsNode) {
        list.add(semanticsNode);
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.getSemanticsNodeIsStructurallySignificant(semanticsNode)) {
            map.put(Integer.valueOf(semanticsNode.getId()), androidComposeViewAccessibilityDelegateCompat.subtreeSortedByGeometryGrouping(z, C12686e0.m28207D0(semanticsNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(list, map, androidComposeViewAccessibilityDelegateCompat, z, children.get(i));
        }
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, Rect rect) {
        Rect rect2;
        if (semanticsNode == null) {
            return null;
        }
        Rect r6 = rect.m35459translatek4lQ0M(semanticsNode.m37822getPositionInRootF1C5BW0());
        Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        if (r6.overlaps(boundsInRoot)) {
            rect2 = r6.intersect(boundsInRoot);
        } else {
            rect2 = null;
        }
        if (rect2 == null) {
            return null;
        }
        long r0 = this.view.m37702localToScreenMKHz9U(OffsetKt.Offset(rect2.getLeft(), rect2.getTop()));
        long r5 = this.view.m37702localToScreenMKHz9U(OffsetKt.Offset(rect2.getRight(), rect2.getBottom()));
        return new RectF(Offset.m35422getXimpl(r0), Offset.m35423getYimpl(r0), Offset.m35422getXimpl(r5), Offset.m35423getYimpl(r5));
    }

    /* access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        C12775o.m28639i(androidComposeViewAccessibilityDelegateCompat, "this$0");
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        boolean z3;
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || (iteratorForGranularity = getIteratorForGranularity(semanticsNode, i)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
        if (accessibilitySelectionEnd == -1) {
            if (z) {
                accessibilitySelectionEnd = 0;
            } else {
                accessibilitySelectionEnd = iterableTextForAccessibility.length();
            }
        }
        if (z) {
            iArr = iteratorForGranularity.following(accessibilitySelectionEnd);
        } else {
            iArr = iteratorForGranularity.preceding(accessibilitySelectionEnd);
        }
        if (iArr == null) {
            return false;
        }
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (!z2 || !isAccessibilitySelectionExtendable(semanticsNode)) {
            if (z) {
                i5 = i7;
            } else {
                i5 = i6;
            }
            i2 = i3;
        } else {
            i3 = getAccessibilitySelectionStart(semanticsNode);
            if (i3 == -1) {
                if (z) {
                    i3 = i6;
                } else {
                    i3 = i7;
                }
            }
            if (z) {
                i2 = i7;
            } else {
                i2 = i6;
            }
        }
        if (z) {
            i4 = 256;
        } else {
            i4 = 512;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, i4, i, i6, i7, SystemClock.uptimeMillis());
        SemanticsNode semanticsNode2 = semanticsNode;
        setAccessibilitySelection(semanticsNode, i3, i2, true);
        return true;
    }

    private final <T extends CharSequence> T trimToSize(T t, @IntRange(from = 1) int i) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(t == null || t.length() == 0)) {
                z2 = false;
            }
            if (z2 || t.length() <= i) {
                return t;
            }
            int i2 = i - 1;
            if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
                i = i2;
            }
            T subSequence = t.subSequence(0, i);
            C12775o.m28637g(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return subSequence;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 != i) {
            this.hoveredVirtualViewId = i;
            sendEventForVirtualView$default(this, i, 128, (Integer) null, (List) null, 12, (Object) null);
            sendEventForVirtualView$default(this, i2, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateSemanticsNodesCopyAndPanes() {
        /*
            r6 = this;
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            androidx.collection.ArraySet<java.lang.Integer> r1 = r6.paneDisplayed
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.Map r3 = r6.getCurrentSemanticsNodes()
            java.lang.Object r3 = r3.get(r2)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds) r3
            r4 = 0
            if (r3 == 0) goto L_0x0029
            androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
            goto L_0x002a
        L_0x0029:
            r3 = r4
        L_0x002a:
            if (r3 == 0) goto L_0x0032
            boolean r3 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(r3)
            if (r3 != 0) goto L_0x000b
        L_0x0032:
            r0.add(r2)
            java.lang.String r3 = "id"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
            int r3 = r2.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy> r5 = r6.previousSemanticsNodes
            java.lang.Object r2 = r5.get(r2)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy r2 = (androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy) r2
            if (r2 == 0) goto L_0x005b
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getUnmergedConfig()
            if (r2 == 0) goto L_0x005b
            androidx.compose.ui.semantics.SemanticsProperties r4 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r4.getPaneTitle()
            java.lang.Object r2 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r4)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        L_0x005b:
            r2 = 32
            r6.sendPaneChangeEvents(r3, r2, r4)
            goto L_0x000b
        L_0x0061:
            androidx.collection.ArraySet<java.lang.Integer> r1 = r6.paneDisplayed
            r1.removeAll(r0)
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy> r0 = r6.previousSemanticsNodes
            r0.clear()
            java.util.Map r0 = r6.getCurrentSemanticsNodes()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0077:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e5
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds) r2
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getSemanticsNode()
            boolean r2 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(r2)
            if (r2 == 0) goto L_0x00c8
            androidx.collection.ArraySet<java.lang.Integer> r2 = r6.paneDisplayed
            java.lang.Object r3 = r1.getKey()
            boolean r2 = r2.add(r3)
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r1.getValue()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds) r3
            androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r4 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r4.getPaneTitle()
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 16
            r6.sendPaneChangeEvents(r2, r4, r3)
        L_0x00c8:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy> r2 = r6.previousSemanticsNodes
            java.lang.Object r3 = r1.getKey()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy r4 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r1 = (androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds) r1
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.getSemanticsNode()
            java.util.Map r5 = r6.getCurrentSemanticsNodes()
            r4.<init>(r1, r5)
            r2.put(r3, r4)
            goto L_0x0077
        L_0x00e5:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.view
            androidx.compose.ui.semantics.SemanticsOwner r1 = r1.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.getUnmergedRootSemanticsNode()
            java.util.Map r2 = r6.getCurrentSemanticsNodes()
            r0.<init>(r1, r2)
            r6.previousSemanticsRoot = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.updateSemanticsNodesCopyAndPanes():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ all -> 0x0051 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object boundsUpdatesEventLoop(p355hf.C12074d<? super p336ef.C11921v> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.p002ui.platform.C1067x3d3eeeed
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (androidx.compose.p002ui.platform.C1067x3d3eeeed) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r2 = r0.L$2
            ag.f r2 = (p308ag.C10897f) r2
            java.lang.Object r5 = r0.L$1
            androidx.collection.ArraySet r5 = (androidx.collection.ArraySet) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            p336ef.C11910n.m25701b(r11)     // Catch:{ all -> 0x0051 }
        L_0x0037:
            r11 = r5
            goto L_0x0063
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0041:
            java.lang.Object r2 = r0.L$2
            ag.f r2 = (p308ag.C10897f) r2
            java.lang.Object r5 = r0.L$1
            androidx.collection.ArraySet r5 = (androidx.collection.ArraySet) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            p336ef.C11910n.m25701b(r11)     // Catch:{ all -> 0x0051 }
            goto L_0x0075
        L_0x0051:
            r11 = move-exception
            goto L_0x00d0
        L_0x0054:
            p336ef.C11910n.m25701b(r11)
            androidx.collection.ArraySet r11 = new androidx.collection.ArraySet     // Catch:{ all -> 0x00ce }
            r11.<init>()     // Catch:{ all -> 0x00ce }
            ag.d<ef.v> r2 = r10.boundsUpdateChannel     // Catch:{ all -> 0x00ce }
            ag.f r2 = r2.iterator()     // Catch:{ all -> 0x00ce }
            r6 = r10
        L_0x0063:
            r0.L$0 = r6     // Catch:{ all -> 0x0051 }
            r0.L$1 = r11     // Catch:{ all -> 0x0051 }
            r0.L$2 = r2     // Catch:{ all -> 0x0051 }
            r0.label = r4     // Catch:{ all -> 0x0051 }
            java.lang.Object r5 = r2.mo45899a(r0)     // Catch:{ all -> 0x0051 }
            if (r5 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r9 = r5
            r5 = r11
            r11 = r9
        L_0x0075:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0051 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x00c6
            r2.next()     // Catch:{ all -> 0x0051 }
            boolean r11 = r6.isEnabled$ui_release()     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x00b0
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r11 = r6.subtreeChangedLayoutNodes     // Catch:{ all -> 0x0051 }
            int r11 = r11.size()     // Catch:{ all -> 0x0051 }
            r7 = 0
        L_0x008d:
            if (r7 >= r11) goto L_0x00a0
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r8 = r6.subtreeChangedLayoutNodes     // Catch:{ all -> 0x0051 }
            java.lang.Object r8 = r8.valueAt(r7)     // Catch:{ all -> 0x0051 }
            kotlin.jvm.internal.C12775o.m28636f(r8)     // Catch:{ all -> 0x0051 }
            androidx.compose.ui.node.LayoutNode r8 = (androidx.compose.p002ui.node.LayoutNode) r8     // Catch:{ all -> 0x0051 }
            r6.sendSubtreeChangeAccessibilityEvents(r8, r5)     // Catch:{ all -> 0x0051 }
            int r7 = r7 + 1
            goto L_0x008d
        L_0x00a0:
            r5.clear()     // Catch:{ all -> 0x0051 }
            boolean r11 = r6.checkingForSemanticsChanges     // Catch:{ all -> 0x0051 }
            if (r11 != 0) goto L_0x00b0
            r6.checkingForSemanticsChanges = r4     // Catch:{ all -> 0x0051 }
            android.os.Handler r11 = r6.handler     // Catch:{ all -> 0x0051 }
            java.lang.Runnable r7 = r6.semanticsChangeChecker     // Catch:{ all -> 0x0051 }
            r11.post(r7)     // Catch:{ all -> 0x0051 }
        L_0x00b0:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r11 = r6.subtreeChangedLayoutNodes     // Catch:{ all -> 0x0051 }
            r11.clear()     // Catch:{ all -> 0x0051 }
            r0.L$0 = r6     // Catch:{ all -> 0x0051 }
            r0.L$1 = r5     // Catch:{ all -> 0x0051 }
            r0.L$2 = r2     // Catch:{ all -> 0x0051 }
            r0.label = r3     // Catch:{ all -> 0x0051 }
            r7 = 100
            java.lang.Object r11 = p466yf.C14041v0.m32563a(r7, r0)     // Catch:{ all -> 0x0051 }
            if (r11 != r1) goto L_0x0037
            return r1
        L_0x00c6:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r11 = r6.subtreeChangedLayoutNodes
            r11.clear()
            ef.v r11 = p336ef.C11921v.f18618a
            return r11
        L_0x00ce:
            r11 = move-exception
            r6 = r10
        L_0x00d0:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r0 = r6.subtreeChangedLayoutNodes
            r0.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop(hf.d):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui_release  reason: not valid java name */
    public final boolean m37708canScroll0AR0LA0$ui_release(boolean z, int i, long j) {
        return m37709canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes().values(), z, i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5 A[SYNTHETIC] */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    /* renamed from: canScroll-moWRBKg$ui_release  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m37709canScrollmoWRBKg$ui_release(java.util.Collection<androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.p002ui.geometry.Offset.Companion
            long r0 = r0.m35437getUnspecifiedF1C5BW0()
            boolean r0 = androidx.compose.p002ui.geometry.Offset.m35419equalsimpl0(r9, r0)
            r1 = 0
            if (r0 != 0) goto L_0x00bd
            boolean r0 = androidx.compose.p002ui.geometry.Offset.m35425isValidimpl(r9)
            if (r0 != 0) goto L_0x001a
            goto L_0x00bd
        L_0x001a:
            r0 = 1
            if (r7 != r0) goto L_0x0024
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getVerticalScrollAxisRange()
            goto L_0x002c
        L_0x0024:
            if (r7 != 0) goto L_0x00b7
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getHorizontalScrollAxisRange()
        L_0x002c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0039
            goto L_0x00b6
        L_0x0039:
            java.util.Iterator r6 = r6.iterator()
        L_0x003d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds) r2
            android.graphics.Rect r3 = r2.getAdjustedBounds()
            androidx.compose.ui.geometry.Rect r3 = androidx.compose.p002ui.graphics.RectHelper_androidKt.toComposeRect(r3)
            boolean r3 = r3.m35448containsk4lQ0M(r9)
            if (r3 != 0) goto L_0x0059
        L_0x0057:
            r2 = r1
            goto L_0x00b3
        L_0x0059:
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getSemanticsNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getConfig()
            java.lang.Object r2 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r7)
            androidx.compose.ui.semantics.ScrollAxisRange r2 = (androidx.compose.p002ui.semantics.ScrollAxisRange) r2
            if (r2 != 0) goto L_0x006a
            goto L_0x0057
        L_0x006a:
            boolean r3 = r2.getReverseScrolling()
            if (r3 == 0) goto L_0x0072
            int r3 = -r8
            goto L_0x0073
        L_0x0072:
            r3 = r8
        L_0x0073:
            if (r8 != 0) goto L_0x007c
            boolean r4 = r2.getReverseScrolling()
            if (r4 == 0) goto L_0x007c
            r3 = -1
        L_0x007c:
            if (r3 >= 0) goto L_0x0092
            of.a r2 = r2.getValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0057
            goto L_0x00b2
        L_0x0092:
            of.a r3 = r2.getValue()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            of.a r2 = r2.getMaxValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0057
        L_0x00b2:
            r2 = r0
        L_0x00b3:
            if (r2 == 0) goto L_0x003d
            r1 = r0
        L_0x00b6:
            return r1
        L_0x00b7:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m37709canScrollmoWRBKg$ui_release(java.util.Collection, boolean, int, long):boolean");
    }

    @VisibleForTesting
    public final AccessibilityEvent createEvent$ui_release(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C12775o.m28638h(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds != null) {
            obtain.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode()));
        }
        return obtain;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C12775o.m28639i(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
            if (hitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        } else if (action != 10) {
            return false;
        } else {
            if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
                return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final AccessibilityManager getAccessibilityManager$ui_release() {
        return this.accessibilityManager;
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view2) {
        C12775o.m28639i(view2, "host");
        return this.nodeProvider;
    }

    public final AccessibilityManager.AccessibilityStateChangeListener getEnabledStateListener$ui_release() {
        return this.enabledStateListener;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    public final Map<Integer, SemanticsNodeCopy> getPreviousSemanticsNodes$ui_release() {
        return this.previousSemanticsNodes;
    }

    public final AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateListener$ui_release() {
        return this.touchExplorationStateListener;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float f, float f2) {
        LayoutNode requireLayoutNode;
        SemanticsModifierNode semanticsModifierNode = null;
        Owner.measureAndLayout$default(this.view, false, 1, (Object) null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m37498hitTestSemanticsM_7yMNQ$ui_release$default(this.view.getRoot(), OffsetKt.Offset(f, f2), hitTestResult, false, false, 12, (Object) null);
        SemanticsModifierNode semanticsModifierNode2 = (SemanticsModifierNode) C12686e0.m28232k0(hitTestResult);
        if (!(semanticsModifierNode2 == null || (requireLayoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode2)) == null)) {
            semanticsModifierNode = SemanticsNodeKt.getOuterSemantics(requireLayoutNode);
        }
        if (semanticsModifierNode != null && AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(new SemanticsNode(semanticsModifierNode, false, (LayoutNode) null, 4, (DefaultConstructorMarker) null))) {
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(requireLayoutNode2) == null) {
                return semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode2.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        if (this.accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.enabledServices;
            C12775o.m28638h(list, "enabledServices");
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release() && !this.checkingForSemanticsChanges) {
            this.checkingForSemanticsChanges = true;
            this.handler.post(this.semanticsChangeChecker);
        }
    }

    @VisibleForTesting
    public final void populateAccessibilityNodeInfoProperties(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        Map map;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        float f;
        int i2;
        boolean z;
        String str;
        String str2;
        int i3 = i;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        SemanticsNode semanticsNode2 = semanticsNode;
        C12775o.m28639i(accessibilityNodeInfoCompat2, "info");
        C12775o.m28639i(semanticsNode2, "semanticsNode");
        boolean z2 = !semanticsNode.isFake$ui_release() && semanticsNode.getReplacedChildren$ui_release().isEmpty() && AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), C1068x54deba10.INSTANCE) == null;
        accessibilityNodeInfoCompat2.setClassName(ClassName);
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null) {
            int r10 = role.m37813unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.Companion;
                if (Role.m37810equalsimpl0(role.m37813unboximpl(), companion.m37820getTabo7Vup1c())) {
                    accessibilityNodeInfoCompat2.setRoleDescription(this.view.getContext().getResources().getString(C0954R.string.tab));
                } else {
                    if (Role.m37810equalsimpl0(role.m37813unboximpl(), companion.m37819getSwitcho7Vup1c())) {
                        accessibilityNodeInfoCompat2.setRoleDescription(this.view.getContext().getResources().getString(C0954R.string.switch_role));
                    } else {
                        if (Role.m37810equalsimpl0(r10, companion.m37814getButtono7Vup1c())) {
                            str2 = "android.widget.Button";
                        } else if (Role.m37810equalsimpl0(r10, companion.m37815getCheckboxo7Vup1c())) {
                            str2 = "android.widget.CheckBox";
                        } else if (Role.m37810equalsimpl0(r10, companion.m37818getRadioButtono7Vup1c())) {
                            str2 = "android.widget.RadioButton";
                        } else if (Role.m37810equalsimpl0(r10, companion.m37817getImageo7Vup1c())) {
                            str2 = "android.widget.ImageView";
                        } else {
                            str2 = Role.m37810equalsimpl0(r10, companion.m37816getDropdownListo7Vup1c()) ? "android.widget.Spinner" : null;
                        }
                        if (!Role.m37810equalsimpl0(role.m37813unboximpl(), companion.m37817getImageo7Vup1c()) || z2 || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                            accessibilityNodeInfoCompat2.setClassName(str2);
                        }
                    }
                }
            }
            C11921v vVar = C11921v.f18618a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode)) {
            accessibilityNodeInfoCompat2.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(semanticsProperties.getText())) {
            accessibilityNodeInfoCompat2.setClassName(TextClassName);
        }
        accessibilityNodeInfoCompat2.setPackageName(this.view.getContext().getPackageName());
        accessibilityNodeInfoCompat2.setImportantForAccessibility(true);
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release.get(i4);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode3.getLayoutNode$ui_release());
                if (androidViewHolder != null) {
                    accessibilityNodeInfoCompat2.addChild(androidViewHolder);
                } else {
                    accessibilityNodeInfoCompat2.addChild(this.view, semanticsNode3.getId());
                }
            }
        }
        if (this.focusedVirtualViewId == i3) {
            accessibilityNodeInfoCompat2.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            accessibilityNodeInfoCompat2.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode2, accessibilityNodeInfoCompat2);
        setContentInvalid(semanticsNode2, accessibilityNodeInfoCompat2);
        SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        accessibilityNodeInfoCompat2.setStateDescription((CharSequence) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release2, semanticsProperties2.getStateDescription()));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getToggleableState());
        int i5 = 2;
        if (toggleableState != null) {
            accessibilityNodeInfoCompat2.setCheckable(true);
            int i6 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i6 == 1) {
                accessibilityNodeInfoCompat2.setChecked(true);
                if ((role == null ? false : Role.m37810equalsimpl0(role.m37813unboximpl(), Role.Companion.m37819getSwitcho7Vup1c())) && accessibilityNodeInfoCompat.getStateDescription() == null) {
                    accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(C0954R.string.f258on));
                }
            } else if (i6 == 2) {
                accessibilityNodeInfoCompat2.setChecked(false);
                if ((role == null ? false : Role.m37810equalsimpl0(role.m37813unboximpl(), Role.Companion.m37819getSwitcho7Vup1c())) && accessibilityNodeInfoCompat.getStateDescription() == null) {
                    accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(C0954R.string.off));
                }
            } else if (i6 == 3 && accessibilityNodeInfoCompat.getStateDescription() == null) {
                accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(C0954R.string.indeterminate));
            }
            C11921v vVar2 = C11921v.f18618a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m37810equalsimpl0(role.m37813unboximpl(), Role.Companion.m37820getTabo7Vup1c())) {
                accessibilityNodeInfoCompat2.setSelected(booleanValue);
            } else {
                accessibilityNodeInfoCompat2.setCheckable(true);
                accessibilityNodeInfoCompat2.setChecked(booleanValue);
                if (accessibilityNodeInfoCompat.getStateDescription() == null) {
                    if (booleanValue) {
                        str = this.view.getContext().getResources().getString(C0954R.string.selected);
                    } else {
                        str = this.view.getContext().getResources().getString(C0954R.string.not_selected);
                    }
                    accessibilityNodeInfoCompat2.setStateDescription(str);
                }
            }
            C11921v vVar3 = C11921v.f18618a;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getContentDescription());
            accessibilityNodeInfoCompat2.setContentDescription(list != null ? (String) C12686e0.m28223b0(list) : null);
        }
        String str3 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getTestTag());
        if (str3 != null) {
            SemanticsNode semanticsNode4 = semanticsNode2;
            while (true) {
                if (semanticsNode4 == null) {
                    z = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig$ui_release3 = semanticsNode4.getUnmergedConfig$ui_release();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui_release3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    z = ((Boolean) semanticsNode4.getUnmergedConfig$ui_release().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                semanticsNode4 = semanticsNode4.getParent();
            }
            if (z) {
                accessibilityNodeInfoCompat2.setViewIdResourceName(str3);
            }
        }
        SemanticsConfiguration unmergedConfig$ui_release4 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((C11921v) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release4, semanticsProperties3.getHeading())) != null) {
            accessibilityNodeInfoCompat2.setHeading(true);
            C11921v vVar4 = C11921v.f18618a;
        }
        accessibilityNodeInfoCompat2.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode));
        accessibilityNodeInfoCompat2.setEditable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode));
        accessibilityNodeInfoCompat2.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode));
        accessibilityNodeInfoCompat2.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getFocused()));
        if (accessibilityNodeInfoCompat.isFocusable()) {
            accessibilityNodeInfoCompat2.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties3.getFocused())).booleanValue());
            if (accessibilityNodeInfoCompat.isFocused()) {
                accessibilityNodeInfoCompat2.addAction(2);
            } else {
                accessibilityNodeInfoCompat2.addAction(1);
            }
        }
        accessibilityNodeInfoCompat2.setVisibleToUser(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(semanticsNode));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int r7 = liveRegionMode.m37804unboximpl();
            LiveRegionMode.Companion companion2 = LiveRegionMode.Companion;
            if (LiveRegionMode.m37801equalsimpl0(r7, companion2.m37806getPolite0phEisY()) || !LiveRegionMode.m37801equalsimpl0(r7, companion2.m37805getAssertive0phEisY())) {
                i5 = 1;
            }
            accessibilityNodeInfoCompat2.setLiveRegion(i5);
            C11921v vVar5 = C11921v.f18618a;
        }
        accessibilityNodeInfoCompat2.setClickable(false);
        SemanticsConfiguration unmergedConfig$ui_release5 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release5, semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean d = C12775o.m28634d(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getSelected()), Boolean.TRUE);
            accessibilityNodeInfoCompat2.setClickable(!d);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) && !d) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            C11921v vVar6 = C11921v.f18618a;
        }
        accessibilityNodeInfoCompat2.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfoCompat2.setLongClickable(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            C11921v vVar7 = C11921v.f18618a;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            C11921v vVar8 = C11921v.f18618a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                C11921v vVar9 = C11921v.f18618a;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCutText());
            if (accessibilityAction5 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction5.getLabel()));
                C11921v vVar10 = C11921v.f18618a;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPasteText());
            if (accessibilityAction6 != null) {
                if (accessibilityNodeInfoCompat.isFocused() && this.view.getClipboardManager().hasText()) {
                    accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction6.getLabel()));
                }
                C11921v vVar11 = C11921v.f18618a;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode2);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            accessibilityNodeInfoCompat2.setTextSelection(getAccessibilitySelectionStart(semanticsNode2), getAccessibilitySelectionEnd(semanticsNode2));
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetSelection());
            accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction7 != null ? accessibilityAction7.getLabel() : null));
            accessibilityNodeInfoCompat2.addAction(256);
            accessibilityNodeInfoCompat2.addAction(512);
            accessibilityNodeInfoCompat2.setMovementGranularities(11);
            Collection collection = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getContentDescription());
            if ((collection == null || collection.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode)) {
                accessibilityNodeInfoCompat2.setMovementGranularities(accessibilityNodeInfoCompat.getMovementGranularities() | 4 | 16);
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence text = accessibilityNodeInfoCompat.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            if (!arrayList.isEmpty()) {
                AccessibilityNodeInfoVerificationHelperMethods accessibilityNodeInfoVerificationHelperMethods = AccessibilityNodeInfoVerificationHelperMethods.INSTANCE;
                AccessibilityNodeInfo unwrap = accessibilityNodeInfoCompat.unwrap();
                C12775o.m28638h(unwrap, "info.unwrap()");
                accessibilityNodeInfoVerificationHelperMethods.setAvailableExtraData(unwrap, arrayList);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                accessibilityNodeInfoCompat2.setClassName("android.widget.SeekBar");
            } else {
                accessibilityNodeInfoCompat2.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfoCompat2.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
                if (accessibilityNodeInfoCompat.getStateDescription() == null) {
                    C13522b<Float> range = progressBarRangeInfo.getRange();
                    if (range.getEndInclusive().floatValue() - range.getStart().floatValue() == 0.0f) {
                        f = 0.0f;
                    } else {
                        f = (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue());
                    }
                    float l = C13537l.m30885l(f, 0.0f, 1.0f);
                    if (l == 0.0f) {
                        i2 = 0;
                    } else {
                        i2 = 100;
                        if (!(l == 1.0f)) {
                            i2 = C13537l.m30886m(C13265c.m30134c(l * ((float) 100)), 1, 99);
                        }
                    }
                    accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(C0954R.string.template_percent, new Object[]{Integer.valueOf(i2)}));
                }
            } else if (accessibilityNodeInfoCompat.getStateDescription() == null) {
                accessibilityNodeInfoCompat2.setStateDescription(this.view.getContext().getResources().getString(C0954R.string.in_progress));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < C13537l.m30876c(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                }
                if (progressBarRangeInfo.getCurrent() > C13537l.m30881h(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                }
            }
        }
        Api24Impl.addSetProgressAction(accessibilityNodeInfoCompat, semanticsNode);
        CollectionInfoKt.setCollectionInfo(semanticsNode2, accessibilityNodeInfoCompat2);
        CollectionInfoKt.setCollectionItemInfo(semanticsNode2, accessibilityNodeInfoCompat2);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getScrollBy());
        if (!(scrollAxisRange == null || accessibilityAction8 == null)) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat2.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat2.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode)) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    accessibilityNodeInfoCompat2.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode)) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    accessibilityNodeInfoCompat2.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getVerticalScrollAxisRange());
        if (!(scrollAxisRange2 == null || accessibilityAction8 == null)) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat2.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat2.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat2.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (i7 >= 29) {
            Api29Impl.addPageActions(accessibilityNodeInfoCompat, semanticsNode);
        }
        accessibilityNodeInfoCompat2.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getPaneTitle()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getExpand());
            if (accessibilityAction9 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction9.getLabel()));
                C11921v vVar12 = C11921v.f18618a;
            }
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCollapse());
            if (accessibilityAction10 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction10.getLabel()));
                C11921v vVar13 = C11921v.f18618a;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getDismiss());
            if (accessibilityAction11 != null) {
                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction11.getLabel()));
                C11921v vVar14 = C11921v.f18618a;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getCustomActions());
                int size2 = list2.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 < iArr.length) {
                    SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.labelToActionId.containsKey(i3)) {
                        Map map2 = this.labelToActionId.get(i3);
                        List h0 = C12710p.m28406h0(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i8);
                            C12775o.m28636f(map2);
                            if (map2.containsKey(customAccessibilityAction.getLabel())) {
                                Integer num = (Integer) map2.get(customAccessibilityAction.getLabel());
                                C12775o.m28636f(num);
                                map = map2;
                                sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                                linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                                h0.remove(num);
                                accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                            } else {
                                map = map2;
                                arrayList2.add(customAccessibilityAction);
                            }
                            i8++;
                            SemanticsNode semanticsNode5 = semanticsNode;
                            map2 = map;
                        }
                        int size4 = arrayList2.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i9);
                            int intValue = ((Number) h0.get(i9)).intValue();
                            sparseArrayCompat.put(intValue, customAccessibilityAction2.getLabel());
                            linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(intValue));
                            accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction2.getLabel()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i10 = 0; i10 < size5; i10++) {
                            CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i10);
                            int i11 = AccessibilityActionsResourceIds[i10];
                            sparseArrayCompat.put(i11, customAccessibilityAction3.getLabel());
                            linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i11));
                            accessibilityNodeInfoCompat2.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, customAccessibilityAction3.getLabel()));
                        }
                    }
                    this.actionIdToLabel.put(i3, sparseArrayCompat);
                    this.labelToActionId.put(i3, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        accessibilityNodeInfoCompat2.setScreenReaderFocusable(semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || (z2 && (accessibilityNodeInfoCompat.getContentDescription() != null || accessibilityNodeInfoCompat.getText() != null || accessibilityNodeInfoCompat.getHintText() != null || accessibilityNodeInfoCompat.getStateDescription() != null || accessibilityNodeInfoCompat.isCheckable())));
        if (this.idToBeforeMap.get(Integer.valueOf(i)) != null) {
            Integer num2 = this.idToBeforeMap.get(Integer.valueOf(i));
            if (num2 != null) {
                accessibilityNodeInfoCompat2.setTraversalBefore(this.view, num2.intValue());
                C11921v vVar15 = C11921v.f18618a;
            }
            AccessibilityNodeInfo unwrap2 = accessibilityNodeInfoCompat.unwrap();
            C12775o.m28638h(unwrap2, "info.unwrap()");
            addExtraDataToAccessibilityNodeInfoHelper(i3, unwrap2, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL, (Bundle) null);
        }
        if (this.idToAfterMap.get(Integer.valueOf(i)) != null) {
            Integer num3 = this.idToAfterMap.get(Integer.valueOf(i));
            if (num3 != null) {
                accessibilityNodeInfoCompat2.setTraversalAfter(this.view, num3.intValue());
                C11921v vVar16 = C11921v.f18618a;
            }
            AccessibilityNodeInfo unwrap3 = accessibilityNodeInfoCompat.unwrap();
            C12775o.m28638h(unwrap3, "info.unwrap()");
            addExtraDataToAccessibilityNodeInfoHelper(i3, unwrap3, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL, (Bundle) null);
        }
    }

    /* JADX WARNING: type inference failed for: r1v30, types: [androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendSemanticsPropertyChangeEvents$ui_release(java.util.Map<java.lang.Integer, androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds> r28) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            java.lang.String r0 = "newSemanticsNodes"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List<androidx.compose.ui.platform.ScrollObservationScope> r0 = r7.scrollObservationScopes
            java.util.Collection r0 = (java.util.Collection) r0
            r9.<init>(r0)
            java.util.List<androidx.compose.ui.platform.ScrollObservationScope> r0 = r7.scrollObservationScopes
            r0.clear()
            java.util.Set r0 = r28.keySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x001f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0552
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy> r0 = r7.previousSemanticsNodes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.get(r1)
            r12 = r0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy r12 = (androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy) r12
            if (r12 != 0) goto L_0x003f
            goto L_0x001f
        L_0x003f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r8.get(r0)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r0 = (androidx.compose.p002ui.platform.SemanticsNodeWithAdjustedBounds) r0
            if (r0 == 0) goto L_0x0051
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.getSemanticsNode()
            r14 = r0
            goto L_0x0052
        L_0x0051:
            r14 = 0
        L_0x0052:
            kotlin.jvm.internal.C12775o.m28636f(r14)
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r14.getUnmergedConfig$ui_release()
            java.util.Iterator r15 = r0.iterator()
            r16 = 0
            r17 = r16
        L_0x0061:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0533
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getHorizontalScrollAxisRange()
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r1 != 0) goto L_0x008f
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getVerticalScrollAxisRange()
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r1 == 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r1 = r16
            goto L_0x0093
        L_0x008f:
            boolean r1 = r7.registerScrollingId(r11, r9)
        L_0x0093:
            if (r1 != 0) goto L_0x00af
            java.lang.Object r1 = r0.getValue()
            androidx.compose.ui.semantics.SemanticsConfiguration r3 = r12.getUnmergedConfig()
            java.lang.Object r4 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = (androidx.compose.p002ui.semantics.SemanticsPropertyKey) r4
            java.lang.Object r3 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r4)
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r1 == 0) goto L_0x00af
            goto L_0x0502
        L_0x00af:
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = (androidx.compose.p002ui.semantics.SemanticsPropertyKey) r1
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getPaneTitle()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            r4 = 8
            if (r3 == 0) goto L_0x00d7
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.C12775o.m28637g(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r12.hasPaneTitle()
            if (r1 == 0) goto L_0x0502
            r7.sendPaneChangeEvents(r11, r4, r0)
            goto L_0x0502
        L_0x00d7:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getStateDescription()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r3 == 0) goto L_0x00e3
            r3 = 1
            goto L_0x00eb
        L_0x00e3:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getToggleableState()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
        L_0x00eb:
            r6 = 64
            if (r3 == 0) goto L_0x010f
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x010f:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getProgressBarRangeInfo()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r3 == 0) goto L_0x0139
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x0139:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getSelected()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            r13 = 4
            if (r3 == 0) goto L_0x022e
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r14.getConfig()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.getRole()
            java.lang.Object r0 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r0, r1)
            androidx.compose.ui.semantics.Role r0 = (androidx.compose.p002ui.semantics.Role) r0
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.p002ui.semantics.Role.Companion
            int r1 = r1.m37820getTabo7Vup1c()
            if (r0 != 0) goto L_0x015d
            r0 = r16
            goto L_0x0165
        L_0x015d:
            int r0 = r0.m37813unboximpl()
            boolean r0 = androidx.compose.p002ui.semantics.Role.m37810equalsimpl0(r0, r1)
        L_0x0165:
            if (r0 == 0) goto L_0x020e
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r14.getConfig()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.getSelected()
            java.lang.Object r0 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r1)
            if (r0 == 0) goto L_0x01f9
            int r0 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            android.view.accessibility.AccessibilityEvent r0 = r7.createEvent$ui_release(r0, r13)
            androidx.compose.ui.semantics.SemanticsNode r1 = new androidx.compose.ui.semantics.SemanticsNode
            androidx.compose.ui.node.SemanticsModifierNode r19 = r14.getOuterSemanticsNode$ui_release()
            r20 = 1
            r21 = 0
            r22 = 4
            r23 = 0
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            androidx.compose.ui.semantics.SemanticsConfiguration r3 = r1.getConfig()
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r2.getContentDescription()
            java.lang.Object r3 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r4)
            r18 = r3
            java.util.List r18 = (java.util.List) r18
            if (r18 == 0) goto L_0x01bd
            java.lang.String r19 = ","
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 62
            r26 = 0
            java.lang.String r3 = androidx.compose.p002ui.TempListUtilsKt.fastJoinToString$default(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01be
        L_0x01bd:
            r3 = 0
        L_0x01be:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r1.getConfig()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.getText()
            java.lang.Object r1 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r1, r2)
            r18 = r1
            java.util.List r18 = (java.util.List) r18
            if (r18 == 0) goto L_0x01e5
            java.lang.String r19 = ","
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 62
            r26 = 0
            java.lang.String r1 = androidx.compose.p002ui.TempListUtilsKt.fastJoinToString$default(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01e6
        L_0x01e5:
            r1 = 0
        L_0x01e6:
            if (r3 == 0) goto L_0x01eb
            r0.setContentDescription(r3)
        L_0x01eb:
            if (r1 == 0) goto L_0x01f4
            java.util.List r2 = r0.getText()
            r2.add(r1)
        L_0x01f4:
            r7.sendEvent(r0)
            goto L_0x0502
        L_0x01f9:
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x020e:
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x022e:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getContentDescription()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r3 == 0) goto L_0x0252
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            kotlin.jvm.internal.C12775o.m28637g(r0, r3)
            java.util.List r0 = (java.util.List) r0
            r3 = 2048(0x800, float:2.87E-42)
            r7.sendEventForVirtualView(r1, r3, r2, r0)
            goto L_0x0502
        L_0x0252:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getEditableText()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            r6 = 100000(0x186a0, float:1.4013E-40)
            java.lang.String r13 = ""
            if (r3 == 0) goto L_0x0389
            boolean r0 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(r14)
            if (r0 == 0) goto L_0x0373
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r12.getUnmergedConfig()
            androidx.compose.ui.text.AnnotatedString r0 = r7.getTextForTextField(r0)
            if (r0 == 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r0 = r13
        L_0x0273:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r14.getUnmergedConfig$ui_release()
            androidx.compose.ui.text.AnnotatedString r1 = r7.getTextForTextField(r1)
            if (r1 == 0) goto L_0x027e
            r13 = r1
        L_0x027e:
            java.lang.CharSequence r6 = r7.trimToSize(r13, r6)
            int r1 = r0.length()
            int r2 = r13.length()
            int r3 = p436tf.C13537l.m30882i(r1, r2)
            r4 = r16
        L_0x0290:
            if (r4 >= r3) goto L_0x02a2
            char r5 = r0.charAt(r4)
            char r8 = r13.charAt(r4)
            if (r5 == r8) goto L_0x029d
            goto L_0x02a2
        L_0x029d:
            int r4 = r4 + 1
            r8 = r28
            goto L_0x0290
        L_0x02a2:
            r5 = r16
        L_0x02a4:
            int r8 = r3 - r4
            if (r5 >= r8) goto L_0x02c1
            int r8 = r1 + -1
            int r8 = r8 - r5
            char r8 = r0.charAt(r8)
            int r19 = r2 + -1
            r20 = r3
            int r3 = r19 - r5
            char r3 = r13.charAt(r3)
            if (r8 == r3) goto L_0x02bc
            goto L_0x02c1
        L_0x02bc:
            int r5 = r5 + 1
            r3 = r20
            goto L_0x02a4
        L_0x02c1:
            int r1 = r1 - r5
            int r1 = r1 - r4
            int r3 = r2 - r5
            int r3 = r3 - r4
            androidx.compose.ui.semantics.SemanticsNode r5 = r12.getSemanticsNode()
            boolean r5 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(r5)
            if (r5 == 0) goto L_0x02e2
            androidx.compose.ui.semantics.SemanticsNode r5 = r12.getSemanticsNode()
            boolean r5 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(r5)
            if (r5 != 0) goto L_0x02e2
            boolean r5 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(r14)
            if (r5 == 0) goto L_0x02e2
            r8 = 1
            goto L_0x02e4
        L_0x02e2:
            r8 = r16
        L_0x02e4:
            androidx.compose.ui.semantics.SemanticsNode r5 = r12.getSemanticsNode()
            boolean r5 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(r5)
            if (r5 == 0) goto L_0x0301
            androidx.compose.ui.semantics.SemanticsNode r5 = r12.getSemanticsNode()
            boolean r5 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(r5)
            if (r5 == 0) goto L_0x0301
            boolean r5 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(r14)
            if (r5 != 0) goto L_0x0301
            r18 = 1
            goto L_0x0303
        L_0x0301:
            r18 = r16
        L_0x0303:
            if (r8 != 0) goto L_0x0326
            if (r18 == 0) goto L_0x0308
            goto L_0x0326
        L_0x0308:
            int r2 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            r5 = 16
            android.view.accessibility.AccessibilityEvent r2 = r7.createEvent$ui_release(r2, r5)
            r2.setFromIndex(r4)
            r2.setRemovedCount(r1)
            r2.setAddedCount(r3)
            r2.setBeforeText(r0)
            java.util.List r0 = r2.getText()
            r0.add(r6)
            goto L_0x0340
        L_0x0326:
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r0 = r27
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            android.view.accessibility.AccessibilityEvent r2 = r0.createTextSelectionChangedEvent(r1, r2, r3, r4, r5)
        L_0x0340:
            java.lang.String r0 = "android.widget.EditText"
            r2.setClassName(r0)
            r7.sendEvent(r2)
            if (r8 != 0) goto L_0x034c
            if (r18 == 0) goto L_0x0502
        L_0x034c:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r14.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsProperties r1 = androidx.compose.p002ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.getTextSelectionRange()
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.ui.text.TextRange r0 = (androidx.compose.p002ui.text.TextRange) r0
            long r0 = r0.m37979unboximpl()
            int r3 = androidx.compose.p002ui.text.TextRange.m37975getStartimpl(r0)
            r2.setFromIndex(r3)
            int r0 = androidx.compose.p002ui.text.TextRange.m37970getEndimpl(r0)
            r2.setToIndex(r0)
            r7.sendEvent(r2)
            goto L_0x0502
        L_0x0373:
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            r2 = 2048(0x800, float:2.87E-42)
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x0389:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getTextSelectionRange()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r3 == 0) goto L_0x03ee
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r14.getUnmergedConfig$ui_release()
            androidx.compose.ui.text.AnnotatedString r0 = r7.getTextForTextField(r0)
            if (r0 == 0) goto L_0x03a5
            java.lang.String r0 = r0.getText()
            if (r0 != 0) goto L_0x03a4
            goto L_0x03a5
        L_0x03a4:
            r13 = r0
        L_0x03a5:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r14.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.getTextSelectionRange()
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.ui.text.TextRange r0 = (androidx.compose.p002ui.text.TextRange) r0
            long r0 = r0.m37979unboximpl()
            int r2 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            int r3 = androidx.compose.p002ui.text.TextRange.m37975getStartimpl(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = androidx.compose.p002ui.text.TextRange.m37970getEndimpl(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = r13.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r6 = r7.trimToSize(r13, r6)
            r0 = r27
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            android.view.accessibility.AccessibilityEvent r0 = r0.createTextSelectionChangedEvent(r1, r2, r3, r4, r5)
            r7.sendEvent(r0)
            int r0 = r14.getId()
            r7.sendPendingTextTraversedAtGranularityEvent(r0)
            goto L_0x0502
        L_0x03ee:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getHorizontalScrollAxisRange()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r3 == 0) goto L_0x03fa
            r3 = 1
            goto L_0x0402
        L_0x03fa:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getVerticalScrollAxisRange()
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
        L_0x0402:
            if (r3 == 0) goto L_0x043b
            androidx.compose.ui.node.LayoutNode r0 = r14.getLayoutNode$ui_release()
            r7.notifySubtreeAccessibilityStateChangedIfNeeded(r0)
            java.util.List<androidx.compose.ui.platform.ScrollObservationScope> r0 = r7.scrollObservationScopes
            androidx.compose.ui.platform.ScrollObservationScope r0 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(r0, r11)
            kotlin.jvm.internal.C12775o.m28636f(r0)
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r14.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getHorizontalScrollAxisRange()
            java.lang.Object r1 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r1, r3)
            androidx.compose.ui.semantics.ScrollAxisRange r1 = (androidx.compose.p002ui.semantics.ScrollAxisRange) r1
            r0.setHorizontalScrollAxisRange(r1)
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r14.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.getVerticalScrollAxisRange()
            java.lang.Object r1 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r1, r2)
            androidx.compose.ui.semantics.ScrollAxisRange r1 = (androidx.compose.p002ui.semantics.ScrollAxisRange) r1
            r0.setVerticalScrollAxisRange(r1)
            r7.sendScrollEventIfNeeded(r0)
            goto L_0x0502
        L_0x043b:
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.getFocused()
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r1, r2)
            if (r2 == 0) goto L_0x047e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.C12775o.m28637g(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0465
            int r0 = r14.getId()
            int r0 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r0)
            android.view.accessibility.AccessibilityEvent r0 = r7.createEvent$ui_release(r0, r4)
            r7.sendEvent(r0)
        L_0x0465:
            int r0 = r14.getId()
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r0)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x047e:
            androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.p002ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.getCustomActions()
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            if (r1 == 0) goto L_0x0506
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r14.getUnmergedConfig$ui_release()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.getCustomActions()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r12.getUnmergedConfig()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.getCustomActions()
            java.lang.Object r1 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x04f2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            int r3 = r0.size()
            r4 = r16
        L_0x04b3:
            if (r4 >= r3) goto L_0x04c5
            java.lang.Object r5 = r0.get(r4)
            androidx.compose.ui.semantics.CustomAccessibilityAction r5 = (androidx.compose.p002ui.semantics.CustomAccessibilityAction) r5
            java.lang.String r5 = r5.getLabel()
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x04b3
        L_0x04c5:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r3 = r1.size()
            r4 = r16
        L_0x04d0:
            if (r4 >= r3) goto L_0x04e2
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.ui.semantics.CustomAccessibilityAction r5 = (androidx.compose.p002ui.semantics.CustomAccessibilityAction) r5
            java.lang.String r5 = r5.getLabel()
            r0.add(r5)
            int r4 = r4 + 1
            goto L_0x04d0
        L_0x04e2:
            boolean r1 = r2.containsAll(r0)
            if (r1 == 0) goto L_0x0530
            boolean r0 = r0.containsAll(r2)
            if (r0 != 0) goto L_0x04ef
            goto L_0x0530
        L_0x04ef:
            r17 = r16
            goto L_0x0502
        L_0x04f2:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0502
            r8 = r28
            r17 = 1
            goto L_0x0061
        L_0x0502:
            r8 = r28
            goto L_0x0061
        L_0x0506:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof androidx.compose.p002ui.semantics.AccessibilityAction
            if (r1 == 0) goto L_0x0530
            java.lang.Object r1 = r0.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            kotlin.jvm.internal.C12775o.m28637g(r1, r2)
            androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.p002ui.semantics.AccessibilityAction) r1
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r12.getUnmergedConfig()
            java.lang.Object r0 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = (androidx.compose.p002ui.semantics.SemanticsPropertyKey) r0
            java.lang.Object r0 = androidx.compose.p002ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r0)
            boolean r0 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals(r1, r0)
            r17 = 1
            r17 = r0 ^ 1
            goto L_0x0502
        L_0x0530:
            r17 = 1
            goto L_0x0502
        L_0x0533:
            if (r17 != 0) goto L_0x0539
            boolean r17 = androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(r14, r12)
        L_0x0539:
            if (r17 == 0) goto L_0x054e
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
        L_0x054e:
            r8 = r28
            goto L_0x001f
        L_0x0552:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents$ui_release(java.util.Map):void");
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final void setPreviousSemanticsNodes$ui_release(Map<Integer, SemanticsNodeCopy> map) {
        C12775o.m28639i(map, "<set-?>");
        this.previousSemanticsNodes = map;
    }

    @VisibleForTesting
    public static /* synthetic */ void getAccessibilityManager$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEnabledStateListener$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTouchExplorationStateListener$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }
}
