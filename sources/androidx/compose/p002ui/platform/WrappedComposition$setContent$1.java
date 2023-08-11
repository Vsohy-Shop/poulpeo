package androidx.compose.p002ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.lifecycle.Lifecycle;
import java.util.Set;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

/* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1 */
/* compiled from: Wrapper.android.kt */
final class WrappedComposition$setContent$1 extends C12777p implements Function1<AndroidComposeView.ViewTreeOwners, C11921v> {
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WrappedComposition$setContent$1(WrappedComposition wrappedComposition, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        super(1);
        this.this$0 = wrappedComposition;
        this.$content = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidComposeView.ViewTreeOwners) obj);
        return C11921v.f18618a;
    }

    public final void invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
        C12775o.m28639i(viewTreeOwners, "it");
        if (!this.this$0.disposed) {
            Lifecycle lifecycle = viewTreeOwners.getLifecycleOwner().getLifecycle();
            this.this$0.lastContent = this.$content;
            if (this.this$0.addedToLifecycle == null) {
                this.this$0.addedToLifecycle = lifecycle;
                lifecycle.addObserver(this.this$0);
            } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                Composition original = this.this$0.getOriginal();
                final WrappedComposition wrappedComposition = this.this$0;
                final C13088o<Composer, Integer, C11921v> oVar = this.$content;
                original.setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new C13088o<Composer, Integer, C11921v>() {

                    @C12739f(mo50609c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", mo50610f = "Wrapper.android.kt", mo50611l = {153}, mo50612m = "invokeSuspend")
                    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1 */
                    /* compiled from: Wrapper.android.kt */
                    static final class C11131 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
                        int label;

                        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                            return new C11131(wrappedComposition, dVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object c = C12150d.m26492c();
                            int i = this.label;
                            if (i == 0) {
                                C11910n.m25701b(obj);
                                AndroidComposeView owner = wrappedComposition.getOwner();
                                this.label = 1;
                                if (owner.boundsUpdatesEventLoop(this) == c) {
                                    return c;
                                }
                            } else if (i == 1) {
                                C11910n.m25701b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C11921v.f18618a;
                        }

                        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                            return ((C11131) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C11921v.f18618a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                            }
                            AndroidComposeView owner = wrappedComposition.getOwner();
                            int i2 = C0954R.C0956id.inspection_slot_table_set;
                            Object tag = owner.getTag(i2);
                            Set set = C12772l0.m28623o(tag) ? (Set) tag : null;
                            if (set == null) {
                                ViewParent parent = wrappedComposition.getOwner().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(i2) : null;
                                set = C12772l0.m28623o(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(composer.getCompositionData());
                                composer.collectParameterInformation();
                            }
                            AndroidComposeView owner2 = wrappedComposition.getOwner();
                            final WrappedComposition wrappedComposition = wrappedComposition;
                            EffectsKt.LaunchedEffect((Object) owner2, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new C11131((C12074d<? super C11131>) null), composer, 72);
                            ProvidedValue[] providedValueArr = {InspectionTablesKt.getLocalInspectionTables().provides(set)};
                            final WrappedComposition wrappedComposition2 = wrappedComposition;
                            final C13088o<Composer, Integer, C11921v> oVar = oVar;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, -1193460702, true, new C13088o<Composer, Integer, C11921v>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return C11921v.f18618a;
                                }

                                @Composable
                                public final void invoke(Composer composer, int i) {
                                    if ((i & 11) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1193460702, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                                        }
                                        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(wrappedComposition2.getOwner(), oVar, composer, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }
                            }), composer, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }));
            }
        }
    }
}
