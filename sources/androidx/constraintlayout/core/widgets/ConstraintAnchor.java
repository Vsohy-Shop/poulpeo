package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {
    private static final boolean ALLOW_BINARY = false;
    private static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
    private HashSet<ConstraintAnchor> mDependents = null;
    private int mFinalValue;
    int mGoneMargin = Integer.MIN_VALUE;
    private boolean mHasFinalValue;
    public int mMargin = 0;
    public final ConstraintWidget mOwner;
    SolverVariable mSolverVariable;
    public ConstraintAnchor mTarget;
    public final Type mType;

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$1 */
    static /* synthetic */ class C12711 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f416x6930e354;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f416x6930e354 = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f416x6930e354     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f416x6930e354     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f416x6930e354     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f416x6930e354     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f416x6930e354     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f416x6930e354     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f416x6930e354     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f416x6930e354     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.C12711.<clinit>():void");
        }
    }

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.mOwner = constraintWidget;
        this.mType = type;
    }

    private boolean isConnectionToMe(ConstraintWidget constraintWidget, HashSet<ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == getOwner()) {
            return true;
        }
        ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = anchors.get(i);
            if (constraintAnchor.isSimilarDimensionConnection(this) && constraintAnchor.isConnected() && isConnectionToMe(constraintAnchor.getTarget().getOwner(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean connect(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            reset();
            return true;
        } else if (!z && !isValidConnection(constraintAnchor)) {
            return false;
        } else {
            this.mTarget = constraintAnchor;
            if (constraintAnchor.mDependents == null) {
                constraintAnchor.mDependents = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.mTarget.mDependents;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.mMargin = i;
            this.mGoneMargin = i2;
            return true;
        }
    }

    public void copyFrom(ConstraintAnchor constraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor2 = this.mTarget;
        if (!(constraintAnchor2 == null || (hashSet = constraintAnchor2.mDependents) == null)) {
            hashSet.remove(this);
        }
        ConstraintAnchor constraintAnchor3 = constraintAnchor.mTarget;
        if (constraintAnchor3 != null) {
            this.mTarget = hashMap.get(constraintAnchor.mTarget.mOwner).getAnchor(constraintAnchor3.getType());
        } else {
            this.mTarget = null;
        }
        ConstraintAnchor constraintAnchor4 = this.mTarget;
        if (constraintAnchor4 != null) {
            if (constraintAnchor4.mDependents == null) {
                constraintAnchor4.mDependents = new HashSet<>();
            }
            this.mTarget.mDependents.add(this);
        }
        this.mMargin = constraintAnchor.mMargin;
        this.mGoneMargin = constraintAnchor.mGoneMargin;
    }

    public void findDependents(int i, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        HashSet<ConstraintAnchor> hashSet = this.mDependents;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.findDependents(it.next().mOwner, i, arrayList, widgetGroup);
            }
        }
    }

    public HashSet<ConstraintAnchor> getDependents() {
        return this.mDependents;
    }

    public int getFinalValue() {
        if (!this.mHasFinalValue) {
            return 0;
        }
        return this.mFinalValue;
    }

    public int getMargin() {
        ConstraintAnchor constraintAnchor;
        if (this.mOwner.getVisibility() == 8) {
            return 0;
        }
        if (this.mGoneMargin == Integer.MIN_VALUE || (constraintAnchor = this.mTarget) == null || constraintAnchor.mOwner.getVisibility() != 8) {
            return this.mMargin;
        }
        return this.mGoneMargin;
    }

    public final ConstraintAnchor getOpposite() {
        switch (C12711.f416x6930e354[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.mOwner.mRight;
            case 3:
                return this.mOwner.mLeft;
            case 4:
                return this.mOwner.mBottom;
            case 5:
                return this.mOwner.mTop;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public SolverVariable getSolverVariable() {
        return this.mSolverVariable;
    }

    public ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public Type getType() {
        return this.mType;
    }

    public boolean hasCenteredDependents() {
        HashSet<ConstraintAnchor> hashSet = this.mDependents;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().getOpposite().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDependents() {
        HashSet<ConstraintAnchor> hashSet = this.mDependents;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasFinalValue() {
        return this.mHasFinalValue;
    }

    public boolean isConnected() {
        if (this.mTarget != null) {
            return true;
        }
        return false;
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget, ConstraintAnchor constraintAnchor) {
        return isConnectionAllowed(constraintWidget);
    }

    public boolean isSideAnchor() {
        switch (C12711.f416x6930e354[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isSimilarDimensionConnection(ConstraintAnchor constraintAnchor) {
        Type type = constraintAnchor.getType();
        Type type2 = this.mType;
        if (type == type2) {
            return true;
        }
        switch (C12711.f416x6930e354[type2.ordinal()]) {
            case 1:
                if (type != Type.BASELINE) {
                    return true;
                }
                return false;
            case 2:
            case 3:
            case 7:
                if (type == Type.LEFT || type == Type.RIGHT || type == Type.CENTER_X) {
                    return true;
                }
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
                if (type == Type.TOP || type == Type.BOTTOM || type == Type.CENTER_Y || type == Type.BASELINE) {
                    return true;
                }
                return false;
            case 9:
                return false;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isValidConnection(ConstraintAnchor constraintAnchor) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.getType();
        Type type2 = this.mType;
        if (type != type2) {
            switch (C12711.f416x6930e354[type2.ordinal()]) {
                case 1:
                    if (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (type == Type.LEFT || type == Type.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(constraintAnchor.getOwner() instanceof Guideline)) {
                        return z;
                    }
                    if (z || type == Type.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                case 4:
                case 5:
                    if (type == Type.TOP || type == Type.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(constraintAnchor.getOwner() instanceof Guideline)) {
                        return z2;
                    }
                    if (z2 || type == Type.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                case 6:
                    if (type == Type.LEFT || type == Type.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.mType.name());
            }
        } else if (type2 != Type.BASELINE || (constraintAnchor.getOwner().hasBaseline() && getOwner().hasBaseline())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isVerticalAnchor() {
        switch (C12711.f416x6930e354[this.mType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public void reset() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.mTarget;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.mDependents) == null)) {
            hashSet.remove(this);
            if (this.mTarget.mDependents.size() == 0) {
                this.mTarget.mDependents = null;
            }
        }
        this.mDependents = null;
        this.mTarget = null;
        this.mMargin = 0;
        this.mGoneMargin = Integer.MIN_VALUE;
        this.mHasFinalValue = false;
        this.mFinalValue = 0;
    }

    public void resetFinalResolution() {
        this.mHasFinalValue = false;
        this.mFinalValue = 0;
    }

    public void resetSolverVariable(Cache cache) {
        SolverVariable solverVariable = this.mSolverVariable;
        if (solverVariable == null) {
            this.mSolverVariable = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.reset();
        }
    }

    public void setFinalValue(int i) {
        this.mFinalValue = i;
        this.mHasFinalValue = true;
    }

    public void setGoneMargin(int i) {
        if (isConnected()) {
            this.mGoneMargin = i;
        }
    }

    public void setMargin(int i) {
        if (isConnected()) {
            this.mMargin = i;
        }
    }

    public String toString() {
        return this.mOwner.getDebugName() + ":" + this.mType.toString();
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget) {
        if (isConnectionToMe(constraintWidget, new HashSet())) {
            return false;
        }
        ConstraintWidget parent = getOwner().getParent();
        if (parent == constraintWidget || constraintWidget.getParent() == parent) {
            return true;
        }
        return false;
    }

    public boolean connect(ConstraintAnchor constraintAnchor, int i) {
        return connect(constraintAnchor, i, Integer.MIN_VALUE, false);
    }
}
