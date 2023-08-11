package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

public class ChainRun extends WidgetRun {
    private int chainStyle;
    ArrayList<WidgetRun> widgets = new ArrayList<>();

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.orientation = i;
        build();
    }

    private void build() {
        ConstraintWidget constraintWidget;
        boolean z;
        int i;
        ConstraintWidget constraintWidget2 = this.widget;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            ConstraintWidget constraintWidget3 = previousChainMember;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            }
            previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        }
        this.widget = constraintWidget;
        this.widgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.widgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i2 = this.orientation;
            if (i2 == 0) {
                next.widget.horizontalChainRun = this;
            } else if (i2 == 1) {
                next.widget.verticalChainRun = this;
            }
        }
        if (this.orientation != 0 || !((ConstraintWidgetContainer) this.widget.getParent()).isRtl()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.widgets.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.widgets;
            this.widget = arrayList.get(arrayList.size() - 1).widget;
        }
        if (this.orientation == 0) {
            i = this.widget.getHorizontalChainStyle();
        } else {
            i = this.widget.getVerticalChainStyle();
        }
        this.chainStyle = i;
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            WidgetRun widgetRun = this.widgets.get(i);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.widgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.widgets.get(size);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void apply() {
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int size = this.widgets.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.widgets.get(0).widget;
            ConstraintWidget constraintWidget2 = this.widgets.get(size - 1).widget;
            if (this.orientation == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
                DependencyNode target = getTarget(constraintAnchor, 0);
                int margin = constraintAnchor.getMargin();
                ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
                if (firstVisibleWidget != null) {
                    margin = firstVisibleWidget.mLeft.getMargin();
                }
                if (target != null) {
                    addTarget(this.start, target, margin);
                }
                DependencyNode target2 = getTarget(constraintAnchor2, 0);
                int margin2 = constraintAnchor2.getMargin();
                ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
                if (lastVisibleWidget != null) {
                    margin2 = lastVisibleWidget.mRight.getMargin();
                }
                if (target2 != null) {
                    addTarget(this.end, target2, -margin2);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
                DependencyNode target3 = getTarget(constraintAnchor3, 1);
                int margin3 = constraintAnchor3.getMargin();
                ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
                if (firstVisibleWidget2 != null) {
                    margin3 = firstVisibleWidget2.mTop.getMargin();
                }
                if (target3 != null) {
                    addTarget(this.start, target3, margin3);
                }
                DependencyNode target4 = getTarget(constraintAnchor4, 1);
                int margin4 = constraintAnchor4.getMargin();
                ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
                if (lastVisibleWidget2 != null) {
                    margin4 = lastVisibleWidget2.mBottom.getMargin();
                }
                if (target4 != null) {
                    addTarget(this.end, target4, -margin4);
                }
            }
            this.start.updateDelegate = this;
            this.end.updateDelegate = this;
        }
    }

    public void applyToWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            this.widgets.get(i).applyToWidget();
        }
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.runGroup = null;
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    public long getWrapDimension() {
        int size = this.widgets.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.widgets.get(i);
            j = j + ((long) widgetRun.start.margin) + widgetRun.getWrapDimension() + ((long) widgetRun.end.margin);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    /* access modifiers changed from: package-private */
    public boolean supportsWrapComputation() {
        int size = this.widgets.size();
        for (int i = 0; i < size; i++) {
            if (!this.widgets.get(i).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.orientation == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r27) {
        /*
            r26 = this;
            r0 = r26
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r1 = r1.resolved
            if (r1 == 0) goto L_0x0427
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.end
            boolean r1 = r1.resolved
            if (r1 != 0) goto L_0x0010
            goto L_0x0427
        L_0x0010:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getParent()
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r2 == 0) goto L_0x0021
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            boolean r1 = r1.isRtl()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.end
            int r2 = r2.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.start
            int r4 = r4.value
            int r2 = r2 - r4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r0.widgets
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r8 = r0.widgets
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.widget
            int r8 = r8.getVisibility()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = r6
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.widget
            int r10 = r10.getVisibility()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r0.widgets
            java.lang.Object r3 = r3.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.widget
            int r11 = r11.getVisibility()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r3.start
            int r11 = r11.margin
            int r14 = r14 + r11
        L_0x008e:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r3.dimension
            int r7 = r11.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r3.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.orientation
            if (r11 != 0) goto L_0x00ac
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r3.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r12 = r12.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r12 = r12.dimension
            boolean r12 = r12.resolved
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r11 = r11.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r11.dimension
            boolean r11 = r11.resolved
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.matchConstraintsType
            if (r7 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            int r7 = r11.wrapValue
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            boolean r7 = r11.resolved
            if (r7 == 0) goto L_0x00d3
            r7 = r19
        L_0x00d1:
            r10 = 1
            goto L_0x00d5
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r3.widget
            float[] r7 = r7.mWeight
            int r10 = r0.orientation
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.end
            int r3 = r3.margin
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.start
            int r7 = r7.value
            if (r1 == 0) goto L_0x0118
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.end
            int r7 = r7.value
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0226
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d8
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r9.widget
            int r11 = r11.getVisibility()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0155
            goto L_0x01be
        L_0x0155:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01be
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r9.dimension
            boolean r14 = r11.resolved
            if (r14 != 0) goto L_0x01be
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0178
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.widget
            float[] r14 = r14.mWeight
            r21 = r7
            int r7 = r0.orientation
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017c
        L_0x0178:
            r21 = r7
            r7 = r19
        L_0x017c:
            int r14 = r0.orientation
            if (r14 != 0) goto L_0x018b
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.widget
            r22 = r10
            int r10 = r14.mMatchConstraintMaxWidth
            int r14 = r14.mMatchConstraintMinWidth
            r23 = r1
            goto L_0x019a
        L_0x018b:
            r22 = r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r9.widget
            int r14 = r10.mMatchConstraintMaxHeight
            int r10 = r10.mMatchConstraintMinHeight
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x019a:
            int r1 = r9.matchConstraintsType
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01a8
            int r1 = r11.wrapValue
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01a9
        L_0x01a8:
            r1 = r7
        L_0x01a9:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01b3
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01b3:
            if (r1 == r7) goto L_0x01b8
            int r13 = r13 + 1
            r7 = r1
        L_0x01b8:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r1.resolve(r7)
            goto L_0x01c6
        L_0x01be:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L_0x01c6:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d8:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0217
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L_0x01e5:
            if (r1 >= r4) goto L_0x0215
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r7 = r0.widgets
            java.lang.Object r7 = r7.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x01fa
            goto L_0x0212
        L_0x01fa:
            if (r1 <= 0) goto L_0x0203
            if (r1 < r5) goto L_0x0203
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r3 = r3 + r9
        L_0x0203:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r7.dimension
            int r9 = r9.value
            int r3 = r3 + r9
            if (r1 >= r8) goto L_0x0212
            if (r1 >= r6) goto L_0x0212
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r3 = r3 + r7
        L_0x0212:
            int r1 = r1 + 1
            goto L_0x01e5
        L_0x0215:
            r14 = r3
            goto L_0x0219
        L_0x0217:
            r14 = r20
        L_0x0219:
            int r1 = r0.chainStyle
            r3 = 2
            if (r1 != r3) goto L_0x0224
            if (r13 != 0) goto L_0x0224
            r1 = 0
            r0.chainStyle = r1
            goto L_0x0230
        L_0x0224:
            r1 = 0
            goto L_0x0230
        L_0x0226:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x0230:
            if (r14 <= r2) goto L_0x0234
            r0.chainStyle = r3
        L_0x0234:
            if (r24 <= 0) goto L_0x023c
            if (r15 != 0) goto L_0x023c
            if (r5 != r6) goto L_0x023c
            r0.chainStyle = r3
        L_0x023c:
            int r3 = r0.chainStyle
            r7 = 1
            if (r3 != r7) goto L_0x02e0
            r9 = r24
            if (r9 <= r7) goto L_0x024a
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x0251
        L_0x024a:
            if (r9 != r7) goto L_0x0250
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x0251
        L_0x0250:
            r2 = r1
        L_0x0251:
            if (r15 <= 0) goto L_0x0254
            r2 = r1
        L_0x0254:
            r3 = r1
            r7 = r21
        L_0x0257:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x0260
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0261
        L_0x0260:
            r1 = r3
        L_0x0261:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x027e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            goto L_0x02dc
        L_0x027e:
            if (r3 <= 0) goto L_0x0285
            if (r23 == 0) goto L_0x0284
            int r7 = r7 - r2
            goto L_0x0285
        L_0x0284:
            int r7 = r7 + r2
        L_0x0285:
            if (r3 <= 0) goto L_0x0296
            if (r3 < r5) goto L_0x0296
            if (r23 == 0) goto L_0x0291
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            int r7 = r7 - r9
            goto L_0x0296
        L_0x0291:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            int r7 = r7 + r9
        L_0x0296:
            if (r23 == 0) goto L_0x029e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.end
            r9.resolve(r7)
            goto L_0x02a3
        L_0x029e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
        L_0x02a3:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r1.dimension
            int r10 = r9.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b4
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L_0x02b4
            int r10 = r9.wrapValue
        L_0x02b4:
            if (r23 == 0) goto L_0x02b8
            int r7 = r7 - r10
            goto L_0x02b9
        L_0x02b8:
            int r7 = r7 + r10
        L_0x02b9:
            if (r23 == 0) goto L_0x02c1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            goto L_0x02c6
        L_0x02c1:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.end
            r9.resolve(r7)
        L_0x02c6:
            r9 = 1
            r1.resolved = r9
            if (r3 >= r8) goto L_0x02dc
            if (r3 >= r6) goto L_0x02dc
            if (r23 == 0) goto L_0x02d6
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02dc
        L_0x02d6:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02dc:
            int r3 = r3 + 1
            goto L_0x0257
        L_0x02e0:
            r9 = r24
            if (r3 != 0) goto L_0x0377
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ec
            r2 = r1
        L_0x02ec:
            r3 = r1
            r7 = r21
        L_0x02ef:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x02f8
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02f9
        L_0x02f8:
            r1 = r3
        L_0x02f9:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x0316
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            goto L_0x0373
        L_0x0316:
            if (r23 == 0) goto L_0x031a
            int r7 = r7 - r2
            goto L_0x031b
        L_0x031a:
            int r7 = r7 + r2
        L_0x031b:
            if (r3 <= 0) goto L_0x032c
            if (r3 < r5) goto L_0x032c
            if (r23 == 0) goto L_0x0327
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            int r7 = r7 - r9
            goto L_0x032c
        L_0x0327:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            int r9 = r9.margin
            int r7 = r7 + r9
        L_0x032c:
            if (r23 == 0) goto L_0x0334
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.end
            r9.resolve(r7)
            goto L_0x0339
        L_0x0334:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
        L_0x0339:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r1.dimension
            int r10 = r9.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034e
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L_0x034e
            int r9 = r9.wrapValue
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034e:
            if (r23 == 0) goto L_0x0352
            int r7 = r7 - r10
            goto L_0x0353
        L_0x0352:
            int r7 = r7 + r10
        L_0x0353:
            if (r23 == 0) goto L_0x035b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.start
            r9.resolve(r7)
            goto L_0x0360
        L_0x035b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.end
            r9.resolve(r7)
        L_0x0360:
            if (r3 >= r8) goto L_0x0373
            if (r3 >= r6) goto L_0x0373
            if (r23 == 0) goto L_0x036d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0373
        L_0x036d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0373:
            int r3 = r3 + 1
            goto L_0x02ef
        L_0x0377:
            r7 = 2
            if (r3 != r7) goto L_0x0427
            int r3 = r0.orientation
            if (r3 != 0) goto L_0x0385
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.widget
            float r3 = r3.getHorizontalBiasPercent()
            goto L_0x038b
        L_0x0385:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.widget
            float r3 = r3.getVerticalBiasPercent()
        L_0x038b:
            if (r23 == 0) goto L_0x0391
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x0391:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039c
            if (r15 <= 0) goto L_0x039d
        L_0x039c:
            r2 = r1
        L_0x039d:
            if (r23 == 0) goto L_0x03a2
            int r7 = r21 - r2
            goto L_0x03a4
        L_0x03a2:
            int r7 = r21 + r2
        L_0x03a4:
            r3 = r1
        L_0x03a5:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x03ae
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03af
        L_0x03ae:
            r1 = r3
        L_0x03af:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r2 = r0.widgets
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.widget
            int r2 = r2.getVisibility()
            r9 = 8
            if (r2 != r9) goto L_0x03cd
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            r2.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r1.resolve(r7)
            r12 = 1
            goto L_0x0423
        L_0x03cd:
            if (r3 <= 0) goto L_0x03de
            if (r3 < r5) goto L_0x03de
            if (r23 == 0) goto L_0x03d9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            int r2 = r2.margin
            int r7 = r7 - r2
            goto L_0x03de
        L_0x03d9:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            int r2 = r2.margin
            int r7 = r7 + r2
        L_0x03de:
            if (r23 == 0) goto L_0x03e6
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.end
            r2.resolve(r7)
            goto L_0x03eb
        L_0x03e6:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            r2.resolve(r7)
        L_0x03eb:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r1.dimension
            int r10 = r2.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03fd
            int r11 = r1.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L_0x03fe
            int r10 = r2.wrapValue
            goto L_0x03fe
        L_0x03fd:
            r12 = 1
        L_0x03fe:
            if (r23 == 0) goto L_0x0402
            int r7 = r7 - r10
            goto L_0x0403
        L_0x0402:
            int r7 = r7 + r10
        L_0x0403:
            if (r23 == 0) goto L_0x040b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            r2.resolve(r7)
            goto L_0x0410
        L_0x040b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.end
            r2.resolve(r7)
        L_0x0410:
            if (r3 >= r8) goto L_0x0423
            if (r3 >= r6) goto L_0x0423
            if (r23 == 0) goto L_0x041d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0423
        L_0x041d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            int r1 = r1.margin
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0423:
            int r3 = r3 + 1
            goto L_0x03a5
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.ChainRun.update(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }
}
