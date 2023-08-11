package com.bumptech.glide.load.engine;

/* renamed from: com.bumptech.glide.load.engine.b */
/* compiled from: CallbackException */
final class C4389b extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    C4389b(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
