package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentKt$AnimatedContent$1 extends C12777p implements Function1<AnimatedContentScope<S>, ContentTransform> {
    public static final AnimatedContentKt$AnimatedContent$1 INSTANCE = new AnimatedContentKt$AnimatedContent$1();

    AnimatedContentKt$AnimatedContent$1() {
        super(1);
    }

    public final ContentTransform invoke(AnimatedContentScope<S> animatedContentScope) {
        C12775o.m28639i(animatedContentScope, "$this$null");
        return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(OAuthErrorCodes.ERR_OAUTH_INVALID_SIG, 90, (Easing) null, 4, (Object) null), 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.m32843scaleInL8ZKhE$default(AnimationSpecKt.tween$default(OAuthErrorCodes.ERR_OAUTH_INVALID_SIG, 90, (Easing) null, 4, (Object) null), 0.92f, 0, 4, (Object) null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null));
    }
}
