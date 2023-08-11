package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,201:1\n1182#2:202\n1161#2,2:203\n1182#2:217\n1161#2,2:218\n1#3:205\n460#4,7:206\n48#4:227\n467#4,4:243\n460#4,11:247\n460#4,11:258\n87#5:213\n340#6:214\n206#6,2:215\n208#6,7:220\n215#6,15:228\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n53#1:202\n53#1:203,2\n85#1:217\n85#1:218,2\n84#1:206,7\n85#1:227\n84#1:243,4\n113#1:247,11\n138#1:258,11\n85#1:213\n85#1:214\n85#1:215,2\n85#1:220,7\n85#1:228,15\n*E\n"})
@Stable
/* renamed from: androidx.compose.ui.focus.FocusRequester */
/* compiled from: FocusRequester.kt */
public final class FocusRequester {
    public static final int $stable = 0;
    /* access modifiers changed from: private */
    public static final FocusRequester Cancel = new FocusRequester();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final FocusRequester Default = new FocusRequester();
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);

    public final boolean captureFocus() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                while (!FocusRequesterModifierNodeKt.captureFocus((FocusRequesterModifierNode) content[i])) {
                    i++;
                    if (i >= size) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    public final boolean findFocusTarget$ui_release(Function1<? super FocusTargetModifierNode, Boolean> function1) {
        C12775o.m28639i(function1, "onFound");
        if (!(!C12775o.m28634d(this, Default))) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        } else if (!(!C12775o.m28634d(this, Cancel))) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        } else if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            Object[] content = mutableVector.getContent();
            int i = 0;
            boolean z = false;
            do {
                FocusRequesterModifierNode focusRequesterModifierNode = (FocusRequesterModifierNode) content[i];
                int r7 = NodeKind.m37625constructorimpl(1024);
                if (focusRequesterModifierNode.getNode().isAttached()) {
                    MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node child$ui_release = focusRequesterModifierNode.getNode().getChild$ui_release();
                    if (child$ui_release == null) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
                    } else {
                        mutableVector2.add(child$ui_release);
                    }
                    while (true) {
                        if (!mutableVector2.isNotEmpty()) {
                            break;
                        }
                        Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                        if ((node.getAggregateChildKindSet$ui_release() & r7) == 0) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                        } else {
                            while (true) {
                                if (node == null) {
                                    continue;
                                    break;
                                } else if ((node.getKindSet$ui_release() & r7) == 0) {
                                    node = node.getChild$ui_release();
                                } else if ((node instanceof FocusTargetModifierNode) && function1.invoke((FocusTargetModifierNode) node).booleanValue()) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    i++;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } while (i < size);
            return z;
        } else {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
    }

    public final boolean freeFocus() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                while (!FocusRequesterModifierNodeKt.freeFocus((FocusRequesterModifierNode) content[i])) {
                    i++;
                    if (i >= size) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        findFocusTarget$ui_release(FocusRequester$requestFocus$1.INSTANCE);
    }

    /* renamed from: androidx.compose.ui.focus.FocusRequester$Companion */
    /* compiled from: FocusRequester.kt */
    public static final class Companion {

        @StabilityInferred(parameters = 0)
        @ExperimentalComposeUiApi
        /* renamed from: androidx.compose.ui.focus.FocusRequester$Companion$FocusRequesterFactory */
        /* compiled from: FocusRequester.kt */
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            public final FocusRequester component1() {
                return new FocusRequester();
            }

            public final FocusRequester component10() {
                return new FocusRequester();
            }

            public final FocusRequester component11() {
                return new FocusRequester();
            }

            public final FocusRequester component12() {
                return new FocusRequester();
            }

            public final FocusRequester component13() {
                return new FocusRequester();
            }

            public final FocusRequester component14() {
                return new FocusRequester();
            }

            public final FocusRequester component15() {
                return new FocusRequester();
            }

            public final FocusRequester component16() {
                return new FocusRequester();
            }

            public final FocusRequester component2() {
                return new FocusRequester();
            }

            public final FocusRequester component3() {
                return new FocusRequester();
            }

            public final FocusRequester component4() {
                return new FocusRequester();
            }

            public final FocusRequester component5() {
                return new FocusRequester();
            }

            public final FocusRequester component6() {
                return new FocusRequester();
            }

            public final FocusRequester component7() {
                return new FocusRequester();
            }

            public final FocusRequester component8() {
                return new FocusRequester();
            }

            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @ExperimentalComposeUiApi
        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCancel$annotations() {
        }
    }

    public static /* synthetic */ void getFocusRequesterNodes$ui_release$annotations() {
    }
}
