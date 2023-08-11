package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.MutableRect;
import androidx.compose.p002ui.geometry.MutableRectKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.Matrix;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.p002ui.layout.LookaheadScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1354:1\n100#1,9:1355\n100#1,9:1364\n100#1,9:1373\n111#1:1384\n100#1,15:1385\n111#1:1418\n100#1,15:1419\n121#1:1437\n100#1,9:1438\n122#1:1447\n111#1:1449\n100#1,15:1450\n111#1:1466\n100#1,15:1467\n1#2:1382\n71#3:1383\n79#3:1400\n79#3:1404\n81#3:1409\n81#3:1417\n71#3:1436\n81#3:1448\n81#3:1465\n69#3:1482\n69#3:1483\n75#3:1493\n75#3:1494\n664#4,3:1401\n667#4,3:1406\n196#5:1405\n480#6,4:1410\n485#6:1435\n122#7,3:1414\n126#7:1434\n276#8,9:1484\n290#8:1495\n262#8,7:1496\n291#8,2:1503\n270#8,3:1505\n66#9,5:1508\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n111#1:1355,9\n121#1:1364,9\n126#1:1373,9\n247#1:1384\n247#1:1385,15\n315#1:1418\n315#1:1419,15\n365#1:1437\n365#1:1438,9\n365#1:1447\n382#1:1449\n382#1:1450,15\n386#1:1466\n386#1:1467,15\n247#1:1383\n262#1:1400\n266#1:1404\n313#1:1409\n315#1:1417\n365#1:1436\n382#1:1448\n386#1:1465\n686#1:1482\n1075#1:1483\n1107#1:1493\n1108#1:1494\n264#1:1401,3\n264#1:1406,3\n266#1:1405\n314#1:1410,4\n314#1:1435\n314#1:1414,3\n314#1:1434\n1075#1:1484,9\n1108#1:1495\n1108#1:1496,7\n1108#1:1503,2\n1108#1:1505,3\n1150#1:1508,5\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeCoordinator */
/* compiled from: NodeCoordinator.kt */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, C11921v> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    /* access modifiers changed from: private */
    public static final HitTestSource<PointerInputModifierNode> PointerInputSource = new NodeCoordinator$Companion$PointerInputSource$1();
    /* access modifiers changed from: private */
    public static final HitTestSource<SemanticsModifierNode> SemanticsSource = new NodeCoordinator$Companion$SemanticsSource$1();
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    /* access modifiers changed from: private */
    public static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final Function1<NodeCoordinator, C11921v> onCommitAffectingLayer = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;
    private static final Function1<NodeCoordinator, C11921v> onCommitAffectingLayerParams = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m35898constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private final C13074a<C11921v> invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this);
    private boolean isClipping;
    private float lastLayerAlpha = 0.8f;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1<? super GraphicsLayerScope, C11921v> layerBlock;
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    /* access modifiers changed from: private */
    public LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private LookaheadDelegate lookaheadDelegate;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m38596getZeronOccac();
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* renamed from: androidx.compose.ui.node.NodeCoordinator$HitTestSource */
    /* compiled from: NodeCoordinator.kt */
    public interface HitTestSource<N extends DelegatableNode> {
        /* renamed from: childHitTest-YqVAtuI  reason: not valid java name */
        void m37620childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult<N> hitTestResult, boolean z, boolean z2);

        /* renamed from: entityType-OLwlOKw  reason: not valid java name */
        int m37621entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(N n);

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode2) {
        C12775o.m28639i(layoutNode2, "layoutNode");
        this.layoutNode = layoutNode2;
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator != this) {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z);
            }
            fromParentRect(mutableRect, z);
        }
    }

    /* renamed from: ancestorToLocal-R5De75A  reason: not valid java name */
    private final long m37585ancestorToLocalR5De75A(NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || C12775o.m28634d(nodeCoordinator, nodeCoordinator2)) {
            return m37594fromParentPositionMKHz9U(j);
        }
        return m37594fromParentPositionMKHz9U(nodeCoordinator2.m37585ancestorToLocalR5De75A(nodeCoordinator, j));
    }

    /* access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        int r0 = NodeKind.m37625constructorimpl(4);
        boolean r1 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(r0);
        DrawModifierNode drawModifierNode = null;
        Modifier.Node tail = getTail();
        if (r1 || (tail = tail.getParent$ui_release()) != null) {
            Modifier.Node access$headNode = headNode(r1);
            while (true) {
                if (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & r0) != 0) {
                    if ((access$headNode.getKindSet$ui_release() & r0) == 0) {
                        if (access$headNode == tail) {
                            break;
                        }
                        access$headNode = access$headNode.getChild$ui_release();
                    } else {
                        if (access$headNode instanceof DrawModifierNode) {
                            drawModifierNode = access$headNode;
                        }
                        drawModifierNode = drawModifierNode;
                    }
                } else {
                    break;
                }
            }
        }
        DrawModifierNode drawModifierNode2 = drawModifierNode;
        if (drawModifierNode2 == null) {
            performDraw(canvas);
            return;
        }
        getLayoutNode().getMDrawScope$ui_release().m37509drawx_KDEd0$ui_release(canvas, IntSizeKt.m38638toSizeozmzZPI(m37598getSizeYbymL2g()), this, drawModifierNode2);
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z) {
        float r0 = (float) IntOffset.m38586getXimpl(m37597getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - r0);
        mutableRect.setRight(mutableRect.getRight() - r0);
        float r02 = (float) IntOffset.m38587getYimpl(m37597getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - r02);
        mutableRect.setBottom(mutableRect.getBottom() - r02);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z) {
                mutableRect.intersect(0.0f, 0.0f, (float) IntSize.m38628getWidthimpl(m37598getSizeYbymL2g()), (float) IntSize.m38627getHeightimpl(m37598getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* access modifiers changed from: private */
    public final Modifier.Node headNode(boolean z) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (z) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (!(nodeCoordinator == null || (tail = nodeCoordinator.getTail()) == null)) {
                return tail.getChild$ui_release();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: hit-1hIXUjU  reason: not valid java name */
    public final <T extends DelegatableNode> void m37586hit1hIXUjU(T t, HitTestSource<T> hitTestSource, long j, HitTestResult<T> hitTestResult, boolean z, boolean z2) {
        if (t == null) {
            m37603hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
            return;
        }
        hitTestResult.hit(t, z2, new NodeCoordinator$hit$1(this, t, hitTestSource, j, hitTestResult, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: hitNear-JHbHoSQ  reason: not valid java name */
    public final <T extends DelegatableNode> void m37587hitNearJHbHoSQ(T t, HitTestSource<T> hitTestSource, long j, HitTestResult<T> hitTestResult, boolean z, boolean z2, float f) {
        if (t == null) {
            m37603hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
            return;
        }
        float f2 = f;
        hitTestResult.hitInMinimumTouchTarget(t, f2, z2, new NodeCoordinator$hitNear$1(this, t, hitTestSource, j, hitTestResult, z, z2, f));
    }

    /* renamed from: offsetFromEdge-MK-Hz9U  reason: not valid java name */
    private final long m37588offsetFromEdgeMKHz9U(long j) {
        float f;
        float f2;
        float r0 = Offset.m35422getXimpl(j);
        if (r0 < 0.0f) {
            f = -r0;
        } else {
            f = r0 - ((float) getMeasuredWidth());
        }
        float max = Math.max(0.0f, f);
        float r4 = Offset.m35423getYimpl(j);
        if (r4 < 0.0f) {
            f2 = -r4;
        } else {
            f2 = r4 - ((float) getMeasuredHeight());
        }
        return OffsetKt.Offset(max, Math.max(0.0f, f2));
    }

    private final void onLayerBlockUpdated(Function1<? super GraphicsLayerScope, C11921v> function1, boolean z) {
        boolean z2;
        Owner owner$ui_release;
        if (this.layerBlock != function1 || !C12775o.m28634d(this.layerDensity, getLayoutNode().getDensity()) || this.layerLayoutDirection != getLayoutNode().getLayoutDirection() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.layerBlock = function1;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        if (!isAttached() || function1 == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner$ui_release = getLayoutNode().getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(getLayoutNode());
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
        } else if (this.layer == null) {
            OwnedLayer createLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(this, this.invalidateParentLayer);
            createLayer.m37672resizeozmzZPI(m37400getMeasuredSizeYbymL2g());
            createLayer.m37671movegyyYBs(m37597getPositionnOccac());
            this.layer = createLayer;
            updateLayerParameters();
            getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
        } else if (z2) {
            updateLayerParameters();
        }
    }

    static /* synthetic */ void onLayerBlockUpdated$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            nodeCoordinator.onLayerBlockUpdated(function1, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLayerBlockUpdated");
    }

    static /* synthetic */ Object propagateRelocationRequest$suspendImpl(NodeCoordinator nodeCoordinator, Rect rect, C12074d<? super C11921v> dVar) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
        if (nodeCoordinator2 == null) {
            return C11921v.f18618a;
        }
        Object propagateRelocationRequest = nodeCoordinator2.propagateRelocationRequest(rect.m35459translatek4lQ0M(nodeCoordinator2.localBoundingBoxOf(nodeCoordinator, false).m35457getTopLeftF1C5BW0()), dVar);
        if (propagateRelocationRequest == C12150d.m26492c()) {
            return propagateRelocationRequest;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            nodeCoordinator.rectInParent$ui_release(mutableRect, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    /* access modifiers changed from: private */
    /* renamed from: speculativeHit-JHbHoSQ  reason: not valid java name */
    public final <T extends DelegatableNode> void m37589speculativeHitJHbHoSQ(T t, HitTestSource<T> hitTestSource, long j, HitTestResult<T> hitTestResult, boolean z, boolean z2, float f) {
        if (t == null) {
            m37603hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
            return;
        }
        HitTestSource<T> hitTestSource2 = hitTestSource;
        if (hitTestSource.interceptOutOfBoundsChildEvents(t)) {
            boolean z3 = z2;
            float f2 = f;
            hitTestResult.speculativeHit(t, f2, z3, new NodeCoordinator$speculativeHit$1(this, t, hitTestSource, j, hitTestResult, z, z3, f2));
            return;
        }
        HitTestResult<T> hitTestResult2 = hitTestResult;
        m37589speculativeHitJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m37623nextUncheckedUntilhw7D004(t, hitTestSource.m37621entityTypeOLwlOKw(), NodeKind.m37625constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl;
        NodeCoordinator coordinator;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl) {
            lookaheadLayoutCoordinatesImpl = (LookaheadLayoutCoordinatesImpl) layoutCoordinates;
        } else {
            lookaheadLayoutCoordinatesImpl = null;
        }
        if (lookaheadLayoutCoordinatesImpl != null && (coordinator = lookaheadLayoutCoordinatesImpl.getCoordinator()) != null) {
            return coordinator;
        }
        C12775o.m28637g(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* renamed from: transformFromAncestor-EL8BTi8  reason: not valid java name */
    private final void m37590transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (!C12775o.m28634d(nodeCoordinator, this)) {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            C12775o.m28636f(nodeCoordinator2);
            nodeCoordinator2.m37590transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
            if (!IntOffset.m38585equalsimpl0(m37597getPositionnOccac(), IntOffset.Companion.m38596getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m35907resetimpl(fArr2);
                Matrix.m35918translateimpl$default(fArr2, -((float) IntOffset.m38586getXimpl(m37597getPositionnOccac())), -((float) IntOffset.m38587getYimpl(m37597getPositionnOccac())), 0.0f, 4, (Object) null);
                Matrix.m35915timesAssign58bKbWc(fArr, fArr2);
            }
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.m37668inverseTransform58bKbWc(fArr);
            }
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8  reason: not valid java name */
    private final void m37591transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!C12775o.m28634d(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.m37673transform58bKbWc(fArr);
            }
            long r1 = nodeCoordinator2.m37597getPositionnOccac();
            if (!IntOffset.m38585equalsimpl0(r1, IntOffset.Companion.m38596getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m35907resetimpl(fArr2);
                Matrix.m35918translateimpl$default(fArr2, (float) IntOffset.m38586getXimpl(r1), (float) IntOffset.m38587getYimpl(r1), 0.0f, 4, (Object) null);
                Matrix.m35915timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            C12775o.m28636f(nodeCoordinator2);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            nodeCoordinator.updateLayerBlock(function1, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    /* access modifiers changed from: private */
    public final void updateLayerParameters() {
        boolean z;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            Function1<? super GraphicsLayerScope, C11921v> function1 = this.layerBlock;
            if (function1 != null) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
                reusableGraphicsLayerScope.reset();
                reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
                reusableGraphicsLayerScope.m36006setSizeuvyYCjk(IntSizeKt.m38638toSizeozmzZPI(m37598getSizeYbymL2g()));
                getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new NodeCoordinator$updateLayerParameters$1(function1));
                LayerPositionalProperties layerPositionalProperties2 = this.layerPositionalProperties;
                if (layerPositionalProperties2 == null) {
                    layerPositionalProperties2 = new LayerPositionalProperties();
                    this.layerPositionalProperties = layerPositionalProperties2;
                }
                layerPositionalProperties2.copyFrom((GraphicsLayerScope) reusableGraphicsLayerScope);
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = reusableGraphicsLayerScope;
                ownedLayer.m37674updateLayerPropertiesdDxrwY(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.m36003getTransformOriginSzJe1aQ(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope2.getRenderEffect(), reusableGraphicsLayerScope.m35999getAmbientShadowColor0d7_KjU(), reusableGraphicsLayerScope.m36002getSpotShadowColor0d7_KjU(), reusableGraphicsLayerScope2.m36000getCompositingStrategyNrFUSI(), getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
                this.isClipping = reusableGraphicsLayerScope2.getClip();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (this.layerBlock == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.lastLayerAlpha = graphicsLayerScope.getAlpha();
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU  reason: not valid java name */
    public final long m37592calculateMinimumTouchTargetPaddingE7KxVPU(long j) {
        return SizeKt.Size(Math.max(0.0f, (Size.m35491getWidthimpl(j) - ((float) getMeasuredWidth())) / 2.0f), Math.max(0.0f, (Size.m35488getHeightimpl(j) - ((float) getMeasuredHeight())) / 2.0f));
    }

    public abstract LookaheadDelegate createLookaheadDelegate(LookaheadScope lookaheadScope);

    /* access modifiers changed from: protected */
    /* renamed from: distanceInMinimumTouchTarget-tz77jQw  reason: not valid java name */
    public final float m37593distanceInMinimumTouchTargettz77jQw(long j, long j2) {
        if (((float) getMeasuredWidth()) >= Size.m35491getWidthimpl(j2) && ((float) getMeasuredHeight()) >= Size.m35488getHeightimpl(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long r6 = m37592calculateMinimumTouchTargetPaddingE7KxVPU(j2);
        float r0 = Size.m35491getWidthimpl(r6);
        float r62 = Size.m35488getHeightimpl(r6);
        long r4 = m37588offsetFromEdgeMKHz9U(j);
        if ((r0 > 0.0f || r62 > 0.0f) && Offset.m35422getXimpl(r4) <= r0 && Offset.m35423getYimpl(r4) <= r62) {
            return Offset.m35421getDistanceSquaredimpl(r4);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float r0 = (float) IntOffset.m38586getXimpl(m37597getPositionnOccac());
        float r1 = (float) IntOffset.m38587getYimpl(m37597getPositionnOccac());
        canvas.translate(r0, r1);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-r0, -r1);
    }

    /* access modifiers changed from: protected */
    public final void drawBorder(Canvas canvas, Paint paint) {
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, ((float) IntSize.m38628getWidthimpl(m37400getMeasuredSizeYbymL2g())) - 0.5f, ((float) IntSize.m38627getHeightimpl(m37400getMeasuredSizeYbymL2g())) - 0.5f), paint);
    }

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator nodeCoordinator) {
        C12775o.m28639i(nodeCoordinator, "other");
        LayoutNode layoutNode2 = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode3 = getLayoutNode();
        if (layoutNode2 == layoutNode3) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int r2 = NodeKind.m37625constructorimpl(2);
            if (tail2.getNode().isAttached()) {
                for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                    if ((parent$ui_release.getKindSet$ui_release() & r2) != 0 && parent$ui_release == tail) {
                        return nodeCoordinator;
                    }
                }
                return this;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode3.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            C12775o.m28636f(layoutNode2);
        }
        while (layoutNode3.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode3 = layoutNode3.getParent$ui_release();
            C12775o.m28636f(layoutNode3);
        }
        while (layoutNode2 != layoutNode3) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            layoutNode3 = layoutNode3.getParent$ui_release();
            if (layoutNode2 != null) {
                if (layoutNode3 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (layoutNode3 == getLayoutNode()) {
            return this;
        }
        if (layoutNode2 == nodeCoordinator.getLayoutNode()) {
            return nodeCoordinator;
        }
        return layoutNode2.getInnerCoordinator$ui_release();
    }

    /* renamed from: fromParentPosition-MK-Hz9U  reason: not valid java name */
    public long m37594fromParentPositionMKHz9U(long j) {
        long r3 = IntOffsetKt.m38598minusNvtHpc(j, m37597getPositionnOccac());
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            return ownedLayer.m37670mapOffset8S9VItk(r3, true);
        }
        return r3;
    }

    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public boolean getHasMeasureResult() {
        if (this._measureResult != null) {
            return true;
        }
        return false;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release  reason: not valid java name */
    public final long m37595getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m37401getMeasurementConstraintsmsEJaDk();
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    /* access modifiers changed from: protected */
    public final Function1<GraphicsLayerScope, C11921v> getLayerBlock() {
        return this.layerBlock;
    }

    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final LookaheadDelegate getLookaheadDelegate$ui_release() {
        return this.lookaheadDelegate;
    }

    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc  reason: not valid java name */
    public final long m37596getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.m38450toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().m37783getMinimumTouchTargetSizeMYxV2XQ());
    }

    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            return this.wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    public Object getParentData() {
        boolean z;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Modifier.Node tail = getTail();
        if (getLayoutNode().getNodes$ui_release().m37575hasH91voCI$ui_release(NodeKind.m37625constructorimpl(64))) {
            Density density = getLayoutNode().getDensity();
            for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if (tail$ui_release != tail) {
                    if ((NodeKind.m37625constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (tail$ui_release instanceof ParentDataModifierNode)) {
                        ref$ObjectRef.f20403b = ((ParentDataModifierNode) tail$ui_release).modifyParentData(density, ref$ObjectRef.f20403b);
                    }
                }
            }
        }
        return ref$ObjectRef.f20403b;
    }

    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* renamed from: getPosition-nOcc-ac  reason: not valid java name */
    public long m37597getPositionnOccac() {
        return this.position;
    }

    public Set<AlignmentLine> getProvidedAlignmentLines() {
        Map<AlignmentLine, Integer> map;
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            if (measureResult != null) {
                map = measureResult.getAlignmentLines();
            } else {
                map = null;
            }
            boolean z = false;
            if (map != null && (!map.isEmpty())) {
                z = true;
            }
            if (z) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(map.keySet());
            }
        }
        if (linkedHashSet == null) {
            return C12731y0.m28551e();
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m37598getSizeYbymL2g() {
        return m37400getMeasuredSizeYbymL2g();
    }

    public abstract Modifier.Node getTail();

    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: hasNode-H91voCI  reason: not valid java name */
    public final boolean m37599hasNodeH91voCI(int i) {
        Modifier.Node headNode = headNode(NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(i));
        if (headNode == null || !DelegatableNodeKt.m37463has64DMado(headNode, i)) {
            return false;
        }
        return true;
    }

    /* renamed from: head-H91voCI  reason: not valid java name */
    public final /* synthetic */ <T> T m37600headH91voCI(int i) {
        boolean r0 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(i);
        T tail = getTail();
        if (!r0 && (tail = tail.getParent$ui_release()) == null) {
            return null;
        }
        T access$headNode = headNode(r0);
        while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & i) != 0) {
            if ((access$headNode.getKindSet$ui_release() & i) != 0) {
                C12775o.m28644n(2, ExifInterface.GPS_DIRECTION_TRUE);
                return access$headNode;
            } else if (access$headNode == tail) {
                return null;
            } else {
                access$headNode = access$headNode.getChild$ui_release();
            }
        }
        return null;
    }

    /* renamed from: headUnchecked-H91voCI  reason: not valid java name */
    public final <T> T m37601headUncheckedH91voCI(int i) {
        boolean r0 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(i);
        T tail = getTail();
        if (!r0 && (tail = tail.getParent$ui_release()) == null) {
            return null;
        }
        T access$headNode = headNode(r0);
        while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & i) != 0) {
            if ((access$headNode.getKindSet$ui_release() & i) != 0) {
                return access$headNode;
            }
            if (access$headNode == tail) {
                return null;
            }
            access$headNode = access$headNode.getChild$ui_release();
        }
        return null;
    }

    /* renamed from: hitTest-YqVAtuI  reason: not valid java name */
    public final <T extends DelegatableNode> void m37602hitTestYqVAtuI(HitTestSource<T> hitTestSource, long j, HitTestResult<T> hitTestResult, boolean z, boolean z2) {
        float f;
        long j2 = j;
        HitTestResult<T> hitTestResult2 = hitTestResult;
        HitTestSource<T> hitTestSource2 = hitTestSource;
        C12775o.m28639i(hitTestSource, "hitTestSource");
        C12775o.m28639i(hitTestResult2, "hitTestResult");
        DelegatableNode delegatableNode = (DelegatableNode) m37601headUncheckedH91voCI(hitTestSource.m37621entityTypeOLwlOKw());
        boolean z3 = true;
        if (!m37615withinLayerBoundsk4lQ0M(j)) {
            if (z) {
                float r8 = m37593distanceInMinimumTouchTargettz77jQw(j, m37596getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(r8) || Float.isNaN(r8)) {
                    z3 = false;
                }
                if (z3 && hitTestResult2.isHitInMinimumTouchTargetBetter(r8, false)) {
                    m37587hitNearJHbHoSQ(delegatableNode, hitTestSource, j, hitTestResult, z, false, r8);
                }
            }
        } else if (delegatableNode == null) {
            m37603hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (m37604isPointerInBoundsk4lQ0M(j)) {
            m37586hit1hIXUjU(delegatableNode, hitTestSource, j, hitTestResult, z, z2);
        } else {
            if (!z) {
                f = Float.POSITIVE_INFINITY;
            } else {
                f = m37593distanceInMinimumTouchTargettz77jQw(j, m37596getMinimumTouchTargetSizeNHjbRc());
            }
            float f2 = f;
            if (Float.isInfinite(f2) || Float.isNaN(f2)) {
                z3 = false;
            }
            boolean z4 = z2;
            if (!z3 || !hitTestResult2.isHitInMinimumTouchTargetBetter(f2, z4)) {
                m37589speculativeHitJHbHoSQ(delegatableNode, hitTestSource, j, hitTestResult, z, z2, f2);
            } else {
                m37587hitNearJHbHoSQ(delegatableNode, hitTestSource, j, hitTestResult, z, z2, f2);
            }
        }
    }

    /* renamed from: hitTestChild-YqVAtuI  reason: not valid java name */
    public <T extends DelegatableNode> void m37603hitTestChildYqVAtuI(HitTestSource<T> hitTestSource, long j, HitTestResult<T> hitTestResult, boolean z, boolean z2) {
        C12775o.m28639i(hitTestSource, "hitTestSource");
        C12775o.m28639i(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m37602hitTestYqVAtuI(hitTestSource, nodeCoordinator.m37594fromParentPositionMKHz9U(j), hitTestResult, z, z2);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Canvas) obj);
        return C11921v.f18618a;
    }

    public boolean isAttached() {
        if (this.released || !getLayoutNode().isAttached()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: isPointerInBounds-k-4lQ0M  reason: not valid java name */
    public final boolean m37604isPointerInBoundsk4lQ0M(long j) {
        float r0 = Offset.m35422getXimpl(j);
        float r3 = Offset.m35423getYimpl(j);
        if (r0 < 0.0f || r3 < 0.0f || r0 >= ((float) getMeasuredWidth()) || r3 >= ((float) getMeasuredHeight())) {
            return false;
        }
        return true;
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    public boolean isValidOwnerScope() {
        if (this.layer == null || !isAttached()) {
            return false;
        }
        return true;
    }

    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        C12775o.m28639i(layoutCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        } else if (layoutCoordinates.isAttached()) {
            NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
            NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
            MutableRect rectCache = getRectCache();
            rectCache.setLeft(0.0f);
            rectCache.setTop(0.0f);
            rectCache.setRight((float) IntSize.m38628getWidthimpl(layoutCoordinates.m37341getSizeYbymL2g()));
            rectCache.setBottom((float) IntSize.m38627getHeightimpl(layoutCoordinates.m37341getSizeYbymL2g()));
            while (coordinator != findCommonAncestor$ui_release) {
                rectInParent$ui_release$default(coordinator, rectCache, z, false, 4, (Object) null);
                if (rectCache.isEmpty()) {
                    return Rect.Companion.getZero();
                }
                coordinator = coordinator.wrappedBy;
                C12775o.m28636f(coordinator);
            }
            ancestorToLocal(findCommonAncestor$ui_release, rectCache, z);
            return MutableRectKt.toRect(rectCache);
        } else {
            throw new IllegalStateException(("LayoutCoordinates " + layoutCoordinates + " is not attached!").toString());
        }
    }

    /* renamed from: localPositionOf-R5De75A  reason: not valid java name */
    public long m37605localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        C12775o.m28639i(layoutCoordinates, "sourceCoordinates");
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != findCommonAncestor$ui_release) {
            j = coordinator.m37611toParentPositionMKHz9U(j);
            coordinator = coordinator.wrappedBy;
            C12775o.m28636f(coordinator);
        }
        return m37585ancestorToLocalR5De75A(findCommonAncestor$ui_release, j);
    }

    /* renamed from: localToRoot-MK-Hz9U  reason: not valid java name */
    public long m37606localToRootMKHz9U(long j) {
        if (isAttached()) {
            for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
                j = nodeCoordinator.m37611toParentPositionMKHz9U(j);
            }
            return j;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* renamed from: localToWindow-MK-Hz9U  reason: not valid java name */
    public long m37607localToWindowMKHz9U(long j) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).m37676calculatePositionInWindowMKHz9U(m37606localToRootMKHz9U(j));
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        onLayerBlockUpdated$default(this, this.layerBlock, false, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onMeasureResultChanged(int i, int i2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.m37672resizeozmzZPI(IntSizeKt.IntSize(i, i2));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
        m37403setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
        graphicsLayerScope.m36006setSizeuvyYCjk(IntSizeKt.m38638toSizeozmzZPI(m37400getMeasuredSizeYbymL2g()));
        int r4 = NodeKind.m37625constructorimpl(4);
        boolean r5 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(r4);
        Modifier.Node tail = getTail();
        if (r5 || (tail = tail.getParent$ui_release()) != null) {
            Modifier.Node access$headNode = headNode(r5);
            while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & r4) != 0) {
                if ((access$headNode.getKindSet$ui_release() & r4) != 0 && (access$headNode instanceof DrawModifierNode)) {
                    ((DrawModifierNode) access$headNode).onMeasureResultChanged();
                }
                if (access$headNode != tail) {
                    access$headNode = access$headNode.getChild$ui_release();
                } else {
                    return;
                }
            }
        }
    }

    public final void onMeasured() {
        Snapshot makeCurrent;
        Modifier.Node node;
        if (m37599hasNodeH91voCI(NodeKind.m37625constructorimpl(128))) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                makeCurrent = createNonObservableSnapshot.makeCurrent();
                int r0 = NodeKind.m37625constructorimpl(128);
                boolean r3 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(r0);
                if (r3) {
                    node = getTail();
                } else {
                    node = getTail().getParent$ui_release();
                    if (node == null) {
                        C11921v vVar = C11921v.f18618a;
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        createNonObservableSnapshot.dispose();
                    }
                }
                Modifier.Node access$headNode = headNode(r3);
                while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & r0) != 0) {
                    if ((access$headNode.getKindSet$ui_release() & r0) != 0 && (access$headNode instanceof LayoutAwareModifierNode)) {
                        ((LayoutAwareModifierNode) access$headNode).m37491onRemeasuredozmzZPI(m37400getMeasuredSizeYbymL2g());
                    }
                    if (access$headNode == node) {
                        break;
                    }
                    access$headNode = access$headNode.getChild$ui_release();
                }
                C11921v vVar2 = C11921v.f18618a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
    }

    public final void onPlaced() {
        LookaheadDelegate lookaheadDelegate2 = this.lookaheadDelegate;
        if (lookaheadDelegate2 != null) {
            int r2 = NodeKind.m37625constructorimpl(128);
            boolean r3 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(r2);
            Modifier.Node tail = getTail();
            if (r3 || (tail = tail.getParent$ui_release()) != null) {
                Modifier.Node access$headNode = headNode(r3);
                while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & r2) != 0) {
                    if ((access$headNode.getKindSet$ui_release() & r2) != 0 && (access$headNode instanceof LayoutAwareModifierNode)) {
                        ((LayoutAwareModifierNode) access$headNode).onLookaheadPlaced(lookaheadDelegate2.getLookaheadLayoutCoordinates());
                    }
                    if (access$headNode == tail) {
                        break;
                    }
                    access$headNode = access$headNode.getChild$ui_release();
                }
            }
        }
        int r0 = NodeKind.m37625constructorimpl(128);
        boolean r1 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(r0);
        Modifier.Node tail2 = getTail();
        if (r1 || (tail2 = tail2.getParent$ui_release()) != null) {
            Modifier.Node access$headNode2 = headNode(r1);
            while (access$headNode2 != null && (access$headNode2.getAggregateChildKindSet$ui_release() & r0) != 0) {
                if ((access$headNode2.getKindSet$ui_release() & r0) != 0 && (access$headNode2 instanceof LayoutAwareModifierNode)) {
                    ((LayoutAwareModifierNode) access$headNode2).onPlaced(this);
                }
                if (access$headNode2 != tail2) {
                    access$headNode2 = access$headNode2.getChild$ui_release();
                } else {
                    return;
                }
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        if (this.layer != null) {
            onLayerBlockUpdated$default(this, (Function1) null, false, 2, (Object) null);
        }
    }

    public void performDraw(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: performingMeasure-K40F9xA  reason: not valid java name */
    public final Placeable m37608performingMeasureK40F9xA(long j, C13074a<? extends Placeable> aVar) {
        C12775o.m28639i(aVar, "block");
        m37404setMeasurementConstraintsBRTryo0(j);
        Placeable placeable = (Placeable) aVar.invoke();
        OwnedLayer layer2 = getLayer();
        if (layer2 != null) {
            layer2.m37672resizeozmzZPI(m37400getMeasuredSizeYbymL2g());
        }
        return placeable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public void m37609placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
        onLayerBlockUpdated$default(this, function1, false, 2, (Object) null);
        if (!IntOffset.m38585equalsimpl0(m37597getPositionnOccac(), j)) {
            m37610setPositiongyyYBs(j);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.m37671movegyyYBs(j);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f;
    }

    public Object propagateRelocationRequest(Rect rect, C12074d<? super C11921v> dVar) {
        return propagateRelocationRequest$suspendImpl(this, rect, dVar);
    }

    public final void rectInParent$ui_release(MutableRect mutableRect, boolean z, boolean z2) {
        C12775o.m28639i(mutableRect, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z2) {
                    long r8 = m37596getMinimumTouchTargetSizeNHjbRc();
                    float r1 = Size.m35491getWidthimpl(r8) / 2.0f;
                    float r82 = Size.m35488getHeightimpl(r8) / 2.0f;
                    mutableRect.intersect(-r1, -r82, ((float) IntSize.m38628getWidthimpl(m37598getSizeYbymL2g())) + r1, ((float) IntSize.m38627getHeightimpl(m37598getSizeYbymL2g())) + r82);
                } else if (z) {
                    mutableRect.intersect(0.0f, 0.0f, (float) IntSize.m38628getWidthimpl(m37598getSizeYbymL2g()), (float) IntSize.m38627getHeightimpl(m37598getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float r83 = (float) IntOffset.m38586getXimpl(m37597getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + r83);
        mutableRect.setRight(mutableRect.getRight() + r83);
        float r84 = (float) IntOffset.m38587getYimpl(m37597getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + r84);
        mutableRect.setBottom(mutableRect.getBottom() + r84);
    }

    public void replace$ui_release() {
        m37609placeAtf8xVGno(m37597getPositionnOccac(), this.zIndex, this.layerBlock);
    }

    public void setMeasureResult$ui_release(MeasureResult measureResult) {
        boolean z;
        C12775o.m28639i(measureResult, "value");
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (!(measureResult2 != null && measureResult.getWidth() == measureResult2.getWidth() && measureResult.getHeight() == measureResult2.getHeight())) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if ((!z || (!measureResult.getAlignmentLines().isEmpty())) && !C12775o.m28634d(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map map2 = this.oldAlignmentLines;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.oldAlignmentLines = map2;
                }
                map2.clear();
                map2.putAll(measureResult.getAlignmentLines());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: setPosition--gyyYBs  reason: not valid java name */
    public void m37610setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    /* access modifiers changed from: protected */
    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node headNode = headNode(NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(NodeKind.m37625constructorimpl(16)));
        if (headNode == null) {
            return false;
        }
        int r0 = NodeKind.m37625constructorimpl(16);
        if (headNode.getNode().isAttached()) {
            Modifier.Node node = headNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & r0) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & r0) != 0 && (child$ui_release instanceof PointerInputModifierNode) && ((PointerInputModifierNode) child$ui_release).sharePointerInputWithSiblings()) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: toParentPosition-MK-Hz9U  reason: not valid java name */
    public long m37611toParentPositionMKHz9U(long j) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j = ownedLayer.m37670mapOffset8S9VItk(j, false);
        }
        return IntOffsetKt.m38600plusNvtHpc(j, m37597getPositionnOccac());
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long r2 = m37592calculateMinimumTouchTargetPaddingE7KxVPU(m37596getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m35491getWidthimpl(r2));
        rectCache.setTop(-Size.m35488getHeightimpl(r2));
        rectCache.setRight(((float) getMeasuredWidth()) + Size.m35491getWidthimpl(r2));
        rectCache.setBottom(((float) getMeasuredHeight()) + Size.m35488getHeightimpl(r2));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != findRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            C12775o.m28636f(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    /* renamed from: transformFrom-EL8BTi8  reason: not valid java name */
    public void m37612transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        C12775o.m28639i(layoutCoordinates, "sourceCoordinates");
        C12775o.m28639i(fArr, "matrix");
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m35907resetimpl(fArr);
        coordinator.m37591transformToAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
        m37590transformFromAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
    }

    public final void updateLayerBlock(Function1<? super GraphicsLayerScope, C11921v> function1, boolean z) {
        boolean z2;
        if (this.layerBlock != function1 || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.layerBlock = function1;
        onLayerBlockUpdated(function1, z2);
    }

    /* access modifiers changed from: protected */
    public final void updateLookaheadDelegate(LookaheadDelegate lookaheadDelegate2) {
        C12775o.m28639i(lookaheadDelegate2, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate2;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.compose.ui.layout.LookaheadScope] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateLookaheadScope$ui_release(androidx.compose.p002ui.layout.LookaheadScope r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0019
            androidx.compose.ui.node.LookaheadDelegate r1 = r2.lookaheadDelegate
            if (r1 == 0) goto L_0x000b
            androidx.compose.ui.layout.LookaheadScope r0 = r1.getLookaheadScope()
        L_0x000b:
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r3, r0)
            if (r0 != 0) goto L_0x0016
            androidx.compose.ui.node.LookaheadDelegate r3 = r2.createLookaheadDelegate(r3)
            goto L_0x0018
        L_0x0016:
            androidx.compose.ui.node.LookaheadDelegate r3 = r2.lookaheadDelegate
        L_0x0018:
            r0 = r3
        L_0x0019:
            r2.lookaheadDelegate = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.NodeCoordinator.updateLookaheadScope$ui_release(androidx.compose.ui.layout.LookaheadScope):void");
    }

    public final void visitNodes(int i, boolean z, Function1<? super Modifier.Node, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        Modifier.Node tail = getTail();
        if (z || (tail = tail.getParent$ui_release()) != null) {
            Modifier.Node access$headNode = headNode(z);
            while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & i) != 0) {
                if ((access$headNode.getKindSet$ui_release() & i) != 0) {
                    function1.invoke(access$headNode);
                }
                if (access$headNode != tail) {
                    access$headNode = access$headNode.getChild$ui_release();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ  reason: not valid java name */
    public final /* synthetic */ <T> void m37613visitNodesaLcG6gQ(int i, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        boolean r0 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (r0 || (tail = tail.getParent$ui_release()) != null) {
            Modifier.Node access$headNode = headNode(r0);
            while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & i) != 0) {
                if ((access$headNode.getKindSet$ui_release() & i) != 0) {
                    C12775o.m28644n(3, ExifInterface.GPS_DIRECTION_TRUE);
                    function1.invoke(access$headNode);
                }
                if (access$headNode != tail) {
                    access$headNode = access$headNode.getChild$ui_release();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: windowToLocal-MK-Hz9U  reason: not valid java name */
    public long m37614windowToLocalMKHz9U(long j) {
        if (isAttached()) {
            LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
            return m37605localPositionOfR5De75A(findRootCoordinates, Offset.m35426minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).m37675calculateLocalPositionMKHz9U(j), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* access modifiers changed from: protected */
    public final void withPositionTranslation(Canvas canvas, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(function1, "block");
        float r0 = (float) IntOffset.m38586getXimpl(m37597getPositionnOccac());
        float r1 = (float) IntOffset.m38587getYimpl(m37597getPositionnOccac());
        canvas.translate(r0, r1);
        function1.invoke(canvas);
        canvas.translate(-r0, -r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: withinLayerBounds-k-4lQ0M  reason: not valid java name */
    public final boolean m37615withinLayerBoundsk4lQ0M(long j) {
        if (!OffsetKt.m35439isFinitek4lQ0M(j)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null || !this.isClipping || ownedLayer.m37669isInLayerk4lQ0M(j)) {
            return true;
        }
        return false;
    }

    public void invoke(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        if (getLayoutNode().isPlaced()) {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new NodeCoordinator$invoke$1(this, canvas));
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.lastLayerDrawingWasSkipped = true;
    }

    /* renamed from: androidx.compose.ui.node.NodeCoordinator$Companion */
    /* compiled from: NodeCoordinator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HitTestSource<PointerInputModifierNode> getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource<SemanticsModifierNode> getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        public static /* synthetic */ void getPointerInputSource$annotations() {
        }
    }

    public LayoutCoordinates getCoordinates() {
        return this;
    }
}
