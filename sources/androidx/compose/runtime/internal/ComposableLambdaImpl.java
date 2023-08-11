package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import p404of.C13075b;
import p404of.C13076c;
import p404of.C13078e;
import p404of.C13079f;
import p404of.C13080g;
import p404of.C13081h;
import p404of.C13082i;
import p404of.C13083j;
import p404of.C13084k;
import p404of.C13085l;
import p404of.C13086m;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13090q;
import p404of.C13091r;
import p404of.C13092s;
import p404of.C13093t;
import p404of.C13094u;
import p404of.C13095v;

@Stable
/* compiled from: ComposableLambda.jvm.kt */
public final class ComposableLambdaImpl implements ComposableLambda {
    private Object _block;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaImpl(int i, boolean z) {
        this.key = i;
        this.tracked = z;
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

    public final int getKey() {
        return this.key;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Composer) obj, ((Number) obj2).intValue());
    }

    public final void update(Object obj) {
        boolean z;
        C12775o.m28639i(obj, "block");
        if (!C12775o.m28634d(this._block, obj)) {
            if (this._block == null) {
                z = true;
            } else {
                z = false;
            }
            this._block = obj;
            if (!z) {
                trackWrite();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return invoke(obj, obj2, obj3, obj4, obj5, (Composer) obj6, ((Number) obj7).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, (Composer) obj7, ((Number) obj8).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, (Composer) obj8, ((Number) obj9).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (Composer) obj9, ((Number) obj10).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (Composer) obj10, ((Number) obj11).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, (Composer) obj11, ((Number) obj12).intValue(), ((Number) obj13).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, (Composer) obj12, ((Number) obj13).intValue(), ((Number) obj14).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, (Composer) obj13, ((Number) obj14).intValue(), ((Number) obj15).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, (Composer) obj14, ((Number) obj15).intValue(), ((Number) obj16).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, (Composer) obj15, ((Number) obj16).intValue(), ((Number) obj17).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, (Composer) obj16, ((Number) obj17).intValue(), ((Number) obj18).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, (Composer) obj17, ((Number) obj18).intValue(), ((Number) obj19).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, (Composer) obj18, ((Number) obj19).intValue(), ((Number) obj20).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, (Composer) obj19, ((Number) obj20).intValue(), ((Number) obj21).intValue());
    }

    public Object invoke(Composer composer, int i) {
        C12775o.m28639i(composer, "c");
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = i | (startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(0) : ComposableLambdaKt.sameBits(0));
        Object obj = this._block;
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13088o) C12772l0.m28614f(obj, 2)).invoke(startRestartGroup, Integer.valueOf(differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            C12775o.m28637g(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            endRestartGroup.updateScope((C13088o) C12772l0.m28614f(this, 2));
        }
        return invoke;
    }

    public Object invoke(Object obj, Composer composer, int i) {
        C12775o.m28639i(composer, "c");
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(1) : ComposableLambdaKt.sameBits(1);
        Object obj2 = this._block;
        C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13089p) C12772l0.m28614f(obj2, 3)).invoke(obj, startRestartGroup, Integer.valueOf(differentBits | i));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$1(this, obj, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Composer composer, int i) {
        C12775o.m28639i(composer, "c");
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(2) : ComposableLambdaKt.sameBits(2);
        Object obj3 = this._block;
        C12775o.m28637g(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13090q) C12772l0.m28614f(obj3, 4)).invoke(obj, obj2, startRestartGroup, Integer.valueOf(differentBits | i));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$2(this, obj, obj2, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Composer composer, int i) {
        C12775o.m28639i(composer, "c");
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(3) : ComposableLambdaKt.sameBits(3);
        Object obj4 = this._block;
        C12775o.m28637g(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13091r) C12772l0.m28614f(obj4, 5)).invoke(obj, obj2, obj3, startRestartGroup, Integer.valueOf(differentBits | i));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$3(this, obj, obj2, obj3, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i) {
        C12775o.m28639i(composer, "c");
        Composer startRestartGroup = composer.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(4) : ComposableLambdaKt.sameBits(4);
        Object obj5 = this._block;
        C12775o.m28637g(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13092s) C12772l0.m28614f(obj5, 6)).invoke(obj, obj2, obj3, obj4, startRestartGroup, Integer.valueOf(differentBits | i));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$4(this, obj, obj2, obj3, obj4, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, int i) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(5) : ComposableLambdaKt.sameBits(5);
        Object obj6 = this._block;
        C12775o.m28637g(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13093t) C12772l0.m28614f(obj6, 7)).invoke(obj, obj2, obj3, obj4, obj5, startRestartGroup, Integer.valueOf(i | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$5(this, obj, obj2, obj3, obj4, obj5, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Composer composer, int i) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(6) : ComposableLambdaKt.sameBits(6);
        Object obj7 = this._block;
        C12775o.m28637g(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13094u) C12772l0.m28614f(obj7, 8)).invoke(obj, obj2, obj3, obj4, obj5, obj6, startRestartGroup, Integer.valueOf(i | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$6(this, obj, obj2, obj3, obj4, obj5, obj6, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Composer composer, int i) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(7) : ComposableLambdaKt.sameBits(7);
        Object obj8 = this._block;
        C12775o.m28637g(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13095v) C12772l0.m28614f(obj8, 9)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, startRestartGroup, Integer.valueOf(i | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$7(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Composer composer, int i) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(8) : ComposableLambdaKt.sameBits(8);
        Object obj9 = this._block;
        C12775o.m28637g(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13075b) C12772l0.m28614f(obj9, 10)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, startRestartGroup, Integer.valueOf(i | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$8(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Composer composer, int i) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(9) : ComposableLambdaKt.sameBits(9);
        Object obj10 = this._block;
        C12775o.m28637g(obj10, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13076c) C12772l0.m28614f(obj10, 11)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, startRestartGroup, Integer.valueOf(i | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaImpl$invoke$9(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, i));
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(10) : ComposableLambdaKt.sameBits(10);
        Object obj11 = this._block;
        C12775o.m28637g(obj11, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13078e) C12772l0.m28614f(obj11, 13)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$10 composableLambdaImpl$invoke$10 = r0;
            ComposableLambdaImpl$invoke$10 composableLambdaImpl$invoke$102 = new ComposableLambdaImpl$invoke$10(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, i);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$10);
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(11) : ComposableLambdaKt.sameBits(11);
        Object obj12 = this._block;
        C12775o.m28637g(obj12, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13079f) C12772l0.m28614f(obj12, 14)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$11 composableLambdaImpl$invoke$11 = r0;
            ComposableLambdaImpl$invoke$11 composableLambdaImpl$invoke$112 = new ComposableLambdaImpl$invoke$11(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, i, i2);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$11);
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(12) : ComposableLambdaKt.sameBits(12);
        Object obj13 = this._block;
        C12775o.m28637g(obj13, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13080g) C12772l0.m28614f(obj13, 15)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$12 composableLambdaImpl$invoke$12 = r0;
            ComposableLambdaImpl$invoke$12 composableLambdaImpl$invoke$122 = new ComposableLambdaImpl$invoke$12(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, i, i2);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$12);
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(13) : ComposableLambdaKt.sameBits(13);
        Object obj14 = this._block;
        C12775o.m28637g(obj14, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13081h) C12772l0.m28614f(obj14, 16)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$13 composableLambdaImpl$invoke$13 = r0;
            ComposableLambdaImpl$invoke$13 composableLambdaImpl$invoke$132 = new ComposableLambdaImpl$invoke$13(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, i, i2);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$13);
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(14) : ComposableLambdaKt.sameBits(14);
        Object obj15 = this._block;
        C12775o.m28637g(obj15, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13082i) C12772l0.m28614f(obj15, 17)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$14 composableLambdaImpl$invoke$14 = r0;
            ComposableLambdaImpl$invoke$14 composableLambdaImpl$invoke$142 = new ComposableLambdaImpl$invoke$14(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, i, i2);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$14);
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(15) : ComposableLambdaKt.sameBits(15);
        Object obj16 = this._block;
        C12775o.m28637g(obj16, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13083j) C12772l0.m28614f(obj16, 18)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$15 composableLambdaImpl$invoke$15 = r0;
            ComposableLambdaImpl$invoke$15 composableLambdaImpl$invoke$152 = new ComposableLambdaImpl$invoke$15(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, i, i2);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$15);
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(16) : ComposableLambdaKt.sameBits(16);
        Object obj17 = this._block;
        C12775o.m28637g(obj17, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13084k) C12772l0.m28614f(obj17, 19)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$16 composableLambdaImpl$invoke$16 = r0;
            ComposableLambdaImpl$invoke$16 composableLambdaImpl$invoke$162 = new ComposableLambdaImpl$invoke$16(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, i, i2);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$16);
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(17) : ComposableLambdaKt.sameBits(17);
        Object obj18 = this._block;
        C12775o.m28637g(obj18, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13085l) C12772l0.m28614f(obj18, 20)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$17 composableLambdaImpl$invoke$17 = r0;
            ComposableLambdaImpl$invoke$17 composableLambdaImpl$invoke$172 = new ComposableLambdaImpl$invoke$17(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, i, i2);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$17);
        }
        return invoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "c");
        Composer startRestartGroup = composer2.startRestartGroup(this.key);
        trackRead(startRestartGroup);
        int differentBits = startRestartGroup.changed((Object) this) ? ComposableLambdaKt.differentBits(18) : ComposableLambdaKt.sameBits(18);
        Object obj19 = this._block;
        C12775o.m28637g(obj19, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'p18')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((C13086m) C12772l0.m28614f(obj19, 21)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, startRestartGroup, Integer.valueOf(i), Integer.valueOf(i2 | differentBits));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            ComposableLambdaImpl$invoke$18 composableLambdaImpl$invoke$18 = r0;
            ComposableLambdaImpl$invoke$18 composableLambdaImpl$invoke$182 = new ComposableLambdaImpl$invoke$18(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, i, i2);
            endRestartGroup.updateScope(composableLambdaImpl$invoke$18);
        }
        return invoke;
    }
}
