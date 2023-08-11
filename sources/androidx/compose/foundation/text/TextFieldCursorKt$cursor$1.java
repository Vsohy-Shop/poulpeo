package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifierKt;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,100:1\n25#2:101\n1114#3,6:102\n652#4:108\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n47#1:101\n47#1:102,6\n48#1:108\n*E\n"})
/* compiled from: TextFieldCursor.kt */
final class TextFieldCursorKt$cursor$1 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;

    @C12739f(mo50609c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", mo50610f = "TextFieldCursor.kt", mo50611l = {52}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1 */
    /* compiled from: TextFieldCursor.kt */
    static final class C06261 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C06261(animatable, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
                final Animatable<Float, AnimationVector1D> animatable = animatable;
                C06271 r1 = new C13088o<C13995l0, C12074d<? super C11921v>, Object>((C12074d<? super C06271>) null) {
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        TextFieldCursorKt$cursor$1(Brush brush, TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
                            super(3);
                            this.$cursorBrush = brush;
                            this.$state = textFieldState;
                            this.$value = textFieldValue;
                            this.$offsetMapping = offsetMapping;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @Composable
                        public final Modifier invoke(Modifier modifier, Composer composer, int i) {
                            Modifier modifier2;
                            C12775o.m28639i(modifier, "$this$composed");
                            composer.startReplaceableGroup(1634330012);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1634330012, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                            }
                            composer.startReplaceableGroup(-492369756);
                            Object rememberedValue = composer.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, (Object) null);
                                composer.updateRememberedValue(rememberedValue);
                            }
                            composer.endReplaceableGroup();
                            final Animatable animatable = (Animatable) rememberedValue;
                            Brush brush = this.$cursorBrush;
                            boolean z = true;
                            if (brush instanceof SolidColor) {
                                if (((SolidColor) brush).m36036getValue0d7_KjU() == Color.Companion.m35707getUnspecified0d7_KjU()) {
                                    z = false;
                                }
                            }
                            if (!this.$state.getHasFocus() || !TextRange.m37969getCollapsedimpl(this.$value.m38194getSelectiond9O1mEE()) || !z) {
                                modifier2 = Modifier.Companion;
                            } else {
                                EffectsKt.LaunchedEffect(this.$value.getAnnotatedString(), TextRange.m37963boximpl(this.$value.m38194getSelectiond9O1mEE()), new C06261((C12074d<? super C06261>) null), composer, 512);
                                final OffsetMapping offsetMapping = this.$offsetMapping;
                                final TextFieldValue textFieldValue = this.$value;
                                final TextFieldState textFieldState = this.$state;
                                final Brush brush2 = this.$cursorBrush;
                                modifier2 = DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, C11921v>() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((ContentDrawScope) obj);
                                        return C11921v.f18618a;
                                    }

                                    public final void invoke(ContentDrawScope contentDrawScope) {
                                        Rect rect;
                                        TextLayoutResult value;
                                        ContentDrawScope contentDrawScope2 = contentDrawScope;
                                        C12775o.m28639i(contentDrawScope2, "$this$drawWithContent");
                                        contentDrawScope.drawContent();
                                        float l = C13537l.m30885l(animatable.getValue().floatValue(), 0.0f, 1.0f);
                                        if (!(l == 0.0f)) {
                                            int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m37975getStartimpl(textFieldValue.m38194getSelectiond9O1mEE()));
                                            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                                            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                                                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                            }
                                            float r7 = contentDrawScope2.m38449toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                                            float f = r7 / ((float) 2);
                                            float h = C13537l.m30881h(rect.getLeft() + f, Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc()) - f);
                                            DrawScope.m36241drawLine1RTmtNc$default(contentDrawScope, brush2, OffsetKt.Offset(h, rect.getTop()), OffsetKt.Offset(h, rect.getBottom()), r7, 0, (PathEffect) null, l, (ColorFilter) null, 0, 432, (Object) null);
                                        }
                                    }
                                });
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceableGroup();
                            return modifier2;
                        }
                    }
