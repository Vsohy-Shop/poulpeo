package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ComposableLambda.jvm.kt */
final class ComposableLambdaImpl$invoke$12 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $changed;
    final /* synthetic */ int $changed1;
    final /* synthetic */ Object $p1;
    final /* synthetic */ Object $p10;
    final /* synthetic */ Object $p11;
    final /* synthetic */ Object $p12;
    final /* synthetic */ Object $p2;
    final /* synthetic */ Object $p3;
    final /* synthetic */ Object $p4;
    final /* synthetic */ Object $p5;
    final /* synthetic */ Object $p6;
    final /* synthetic */ Object $p7;
    final /* synthetic */ Object $p8;
    final /* synthetic */ Object $p9;
    final /* synthetic */ ComposableLambdaImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposableLambdaImpl$invoke$12(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, int i, int i2) {
        super(2);
        this.this$0 = composableLambdaImpl;
        this.$p1 = obj;
        this.$p2 = obj2;
        this.$p3 = obj3;
        this.$p4 = obj4;
        this.$p5 = obj5;
        this.$p6 = obj6;
        this.$p7 = obj7;
        this.$p8 = obj8;
        this.$p9 = obj9;
        this.$p10 = obj10;
        this.$p11 = obj11;
        this.$p12 = obj12;
        this.$changed = i;
        this.$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        C12775o.m28639i(composer2, "nc");
        this.this$0.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, composer2, this.$changed | 1, this.$changed1);
    }
}
