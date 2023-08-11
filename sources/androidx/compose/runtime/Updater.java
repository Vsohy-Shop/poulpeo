package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Composer.kt */
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer2) {
        this.composer = composer2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Updater m35291boximpl(Composer composer2) {
        return new Updater(composer2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Composer m35292constructorimpl(Composer composer2) {
        C12775o.m28639i(composer2, "composer");
        return composer2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35293equalsimpl(Composer composer2, Object obj) {
        if ((obj instanceof Updater) && C12775o.m28634d(composer2, ((Updater) obj).m35303unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35294equalsimpl0(Composer composer2, Composer composer3) {
        return C12775o.m28634d(composer2, composer3);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35295hashCodeimpl(Composer composer2) {
        return composer2.hashCode();
    }

    /* renamed from: init-impl  reason: not valid java name */
    public static final void m35296initimpl(Composer composer2, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        if (composer2.getInserting()) {
            composer2.apply(C11921v.f18618a, new Updater$init$1(function1));
        }
    }

    /* renamed from: reconcile-impl  reason: not valid java name */
    public static final void m35297reconcileimpl(Composer composer2, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        composer2.apply(C11921v.f18618a, new Updater$reconcile$1(function1));
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m35298setimpl(Composer composer2, int i, C13088o<? super T, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        if (composer2.getInserting() || !C12775o.m28634d(composer2.rememberedValue(), Integer.valueOf(i))) {
            composer2.updateRememberedValue(Integer.valueOf(i));
            composer2.apply(Integer.valueOf(i), oVar);
        }
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35300toStringimpl(Composer composer2) {
        return "Updater(composer=" + composer2 + ')';
    }

    /* renamed from: update-impl  reason: not valid java name */
    public static final void m35301updateimpl(Composer composer2, int i, C13088o<? super T, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        boolean inserting = composer2.getInserting();
        if (inserting || !C12775o.m28634d(composer2.rememberedValue(), Integer.valueOf(i))) {
            composer2.updateRememberedValue(Integer.valueOf(i));
            if (!inserting) {
                composer2.apply(Integer.valueOf(i), oVar);
            }
        }
    }

    public boolean equals(Object obj) {
        return m35293equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m35295hashCodeimpl(this.composer);
    }

    public String toString() {
        return m35300toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Composer m35303unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final <V> void m35299setimpl(Composer composer2, V v, C13088o<? super T, ? super V, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        if (composer2.getInserting() || !C12775o.m28634d(composer2.rememberedValue(), v)) {
            composer2.updateRememberedValue(v);
            composer2.apply(v, oVar);
        }
    }

    /* renamed from: update-impl  reason: not valid java name */
    public static final <V> void m35302updateimpl(Composer composer2, V v, C13088o<? super T, ? super V, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        boolean inserting = composer2.getInserting();
        if (inserting || !C12775o.m28634d(composer2.rememberedValue(), v)) {
            composer2.updateRememberedValue(v);
            if (!inserting) {
                composer2.apply(v, oVar);
            }
        }
    }

    public static /* synthetic */ void getComposer$annotations() {
    }
}
