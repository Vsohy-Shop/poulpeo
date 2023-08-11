package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,349:1\n1#2:350\n1726#3,3:351\n159#4,4:354\n152#4,4:358\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n280#1:351,3\n298#1:354,4\n321#1:358,4\n*E\n"})
/* compiled from: RecomposeScopeImpl.kt */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    private Anchor anchor;
    private C13088o<? super Composer, ? super Integer, C11921v> block;
    private CompositionImpl composition;
    /* access modifiers changed from: private */
    public int currentToken;
    private int flags;
    /* access modifiers changed from: private */
    public IdentityArrayMap<DerivedState<?>, Object> trackedDependencies;
    /* access modifiers changed from: private */
    public IdentityArrayIntMap trackedInstances;

    public RecomposeScopeImpl(CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    private final boolean getRereading() {
        if ((this.flags & 32) != 0) {
            return true;
        }
        return false;
    }

    private final void setRereading(boolean z) {
        if (z) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void setSkipped(boolean z) {
        if (z) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void adoptedBy(CompositionImpl compositionImpl) {
        C12775o.m28639i(compositionImpl, "composition");
        this.composition = compositionImpl;
    }

    public final void compose(Composer composer) {
        C11921v vVar;
        C12775o.m28639i(composer, "composer");
        C13088o<? super Composer, ? super Integer, C11921v> oVar = this.block;
        if (oVar != null) {
            oVar.invoke(composer, 1);
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final Function1<Composition, C11921v> end(int i) {
        boolean z;
        IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        int size = identityArrayIntMap.getSize();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C12775o.m28637g(identityArrayIntMap.getKeys()[i2], "null cannot be cast to non-null type kotlin.Any");
            if (identityArrayIntMap.getValues()[i2] != i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            return new RecomposeScopeImpl$end$1$2(this, i, identityArrayIntMap);
        }
        return null;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        if (this.block != null) {
            return true;
        }
        return false;
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final boolean getDefaultsInScope() {
        if ((this.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getDefaultsInvalid() {
        if ((this.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getRequiresRecompose() {
        if ((this.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getSkipped$runtime_release() {
        if ((this.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getUsed() {
        if ((this.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getValid() {
        boolean z;
        if (this.composition == null) {
            return false;
        }
        Anchor anchor2 = this.anchor;
        if (anchor2 != null) {
            z = anchor2.getValid();
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public void invalidate() {
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl != null) {
            compositionImpl.invalidate(this, (Object) null);
        }
    }

    public final InvalidationResult invalidateForResult(Object obj) {
        InvalidationResult invalidate;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null || (invalidate = compositionImpl.invalidate(this, obj)) == null) {
            return InvalidationResult.IGNORED;
        }
        return invalidate;
    }

    public final boolean isConditional() {
        if (this.trackedDependencies != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isInvalidFor(androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r1 = r6.trackedDependencies
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            boolean r2 = r7.isNotEmpty()
            if (r2 == 0) goto L_0x004d
            boolean r2 = r7.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x0018
        L_0x0016:
            r7 = r0
            goto L_0x004a
        L_0x0018:
            java.util.Iterator r7 = r7.iterator()
        L_0x001c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0016
            java.lang.Object r2 = r7.next()
            boolean r4 = r2 instanceof androidx.compose.runtime.DerivedState
            if (r4 == 0) goto L_0x0046
            androidx.compose.runtime.DerivedState r2 = (androidx.compose.runtime.DerivedState) r2
            androidx.compose.runtime.SnapshotMutationPolicy r4 = r2.getPolicy()
            if (r4 != 0) goto L_0x0036
            androidx.compose.runtime.SnapshotMutationPolicy r4 = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy()
        L_0x0036:
            java.lang.Object r5 = r2.getCurrentValue()
            java.lang.Object r2 = r1.get(r2)
            boolean r2 = r4.equivalent(r5, r2)
            if (r2 == 0) goto L_0x0046
            r2 = r0
            goto L_0x0047
        L_0x0046:
            r2 = r3
        L_0x0047:
            if (r2 != 0) goto L_0x001c
            r7 = r3
        L_0x004a:
            if (r7 == 0) goto L_0x004d
            return r3
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.isInvalidFor(androidx.compose.runtime.collection.IdentityArraySet):boolean");
    }

    public final void recordRead(Object obj) {
        C12775o.m28639i(obj, "instance");
        if (!getRereading()) {
            IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
            if (identityArrayIntMap == null) {
                identityArrayIntMap = new IdentityArrayIntMap();
                this.trackedInstances = identityArrayIntMap;
            }
            identityArrayIntMap.add(obj, this.currentToken);
            if (obj instanceof DerivedState) {
                IdentityArrayMap<DerivedState<?>, Object> identityArrayMap = this.trackedDependencies;
                if (identityArrayMap == null) {
                    identityArrayMap = new IdentityArrayMap<>(0, 1, (DefaultConstructorMarker) null);
                    this.trackedDependencies = identityArrayMap;
                }
                identityArrayMap.set(obj, ((DerivedState) obj).getCurrentValue());
            }
        }
    }

    public final void release() {
        this.composition = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    public final void rereadTrackedInstances() {
        IdentityArrayIntMap identityArrayIntMap;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl != null && (identityArrayIntMap = this.trackedInstances) != null) {
            setRereading(true);
            try {
                int size = identityArrayIntMap.getSize();
                for (int i = 0; i < size; i++) {
                    Object obj = identityArrayIntMap.getKeys()[i];
                    C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i2 = identityArrayIntMap.getValues()[i];
                    compositionImpl.recordReadOf(obj);
                }
            } finally {
                setRereading(false);
            }
        }
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(Anchor anchor2) {
        this.anchor = anchor2;
    }

    public final void setDefaultsInScope(boolean z) {
        if (z) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z) {
        if (z) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void setRequiresRecompose(boolean z) {
        if (z) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void setUsed(boolean z) {
        if (z) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void start(int i) {
        this.currentToken = i;
        setSkipped(false);
    }

    public void updateScope(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        this.block = oVar;
    }
}
