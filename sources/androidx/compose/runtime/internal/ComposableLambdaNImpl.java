package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12768j0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13096w;

@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,176:1\n37#2,2:177\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n110#1:177,2\n*E\n"})
@Stable
/* compiled from: ComposableLambdaN.jvm.kt */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i, boolean z, int i2) {
        this.key = i;
        this.tracked = z;
        this.arity = i2;
    }

    private final int realParamCount(int i) {
        int i2 = (i - 1) - 1;
        for (int i3 = 1; i3 * 10 < i2; i3++) {
            i2--;
        }
        return i2;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (this.tracked && (recomposeScope = composer.getRecomposeScope()) != null) {
            composer.recordUsed(recomposeScope);
            if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
                this.scope = recomposeScope;
                return;
            }
            List<RecomposeScope> list = this.scopes;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.scopes = arrayList;
                arrayList.add(recomposeScope);
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (ComposableLambdaKt.replacableWith(list.get(i), recomposeScope)) {
                    list.set(i, recomposeScope);
                    return;
                }
            }
            list.add(recomposeScope);
        }
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    public Object invoke(Object... objArr) {
        int i;
        C12775o.m28639i(objArr, "args");
        int realParamCount = realParamCount(objArr.length);
        Composer composer = objArr[realParamCount];
        C12775o.m28637g(composer, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = C12710p.m28399a0(objArr, C13537l.m30893t(0, objArr.length - 1)).toArray(new Object[0]);
        Integer num = objArr[objArr.length - 1];
        C12775o.m28637g(num, "null cannot be cast to non-null type kotlin.Int");
        int intValue = num.intValue();
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        if (startRestartGroup.changed((Object) this)) {
            i = ComposableLambdaKt.differentBits(realParamCount);
        } else {
            i = ComposableLambdaKt.sameBits(realParamCount);
        }
        int i2 = intValue | i;
        Object obj = this._block;
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        C12768j0 j0Var = new C12768j0(2);
        j0Var.mo50669b(array);
        j0Var.mo50668a(Integer.valueOf(i2));
        Object invoke = ((C13096w) obj).invoke(j0Var.mo50671d(new Object[j0Var.mo50670c()]));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaNImpl$invoke$1(objArr, realParamCount, this));
        }
        return invoke;
    }

    public final void update(Object obj) {
        boolean z;
        C12775o.m28639i(obj, "block");
        if (!C12775o.m28634d(obj, this._block)) {
            if (this._block == null) {
                z = true;
            } else {
                z = false;
            }
            this._block = (C13096w) obj;
            if (!z) {
                trackWrite();
            }
        }
    }
}
