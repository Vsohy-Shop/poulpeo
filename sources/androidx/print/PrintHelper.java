package androidx.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

public final class PrintHelper {
    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    static final boolean IS_MIN_MARGINS_HANDLING_CORRECT = true;
    private static final String LOG_TAG = "PrintHelper";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    static final boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION = true;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    int mColorMode = 2;
    final Context mContext;
    BitmapFactory.Options mDecodeOptions = null;
    final Object mLock = new Object();
    int mOrientation = 1;
    int mScaleMode = 2;

    public interface OnPrintFinishCallback {
        void onFinish();
    }

    @RequiresApi(19)
    private class PrintBitmapAdapter extends PrintDocumentAdapter {
        private PrintAttributes mAttributes;
        private final Bitmap mBitmap;
        private final OnPrintFinishCallback mCallback;
        private final int mFittingMode;
        private final String mJobName;

        PrintBitmapAdapter(String str, int i, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
            this.mJobName = str;
            this.mFittingMode = i;
            this.mBitmap = bitmap;
            this.mCallback = onPrintFinishCallback;
        }

        public void onFinish() {
            OnPrintFinishCallback onPrintFinishCallback = this.mCallback;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.mAttributes = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            PrintHelper.this.writeBitmap(this.mAttributes, this.mFittingMode, this.mBitmap, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @RequiresApi(19)
    private class PrintUriAdapter extends PrintDocumentAdapter {
        PrintAttributes mAttributes;
        Bitmap mBitmap = null;
        final OnPrintFinishCallback mCallback;
        final int mFittingMode;
        final Uri mImageFile;
        final String mJobName;
        AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;

        PrintUriAdapter(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback, int i) {
            this.mJobName = str;
            this.mImageFile = uri;
            this.mCallback = onPrintFinishCallback;
            this.mFittingMode = i;
        }

        /* access modifiers changed from: package-private */
        public void cancelLoad() {
            synchronized (PrintHelper.this.mLock) {
                PrintHelper printHelper = PrintHelper.this;
                if (printHelper.mDecodeOptions != null) {
                    printHelper.mDecodeOptions = null;
                }
            }
        }

        public void onFinish() {
            super.onFinish();
            cancelLoad();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.mLoadBitmap;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            OnPrintFinishCallback onPrintFinishCallback = this.mCallback;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.mBitmap = null;
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.mAttributes = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.mBitmap != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                final CancellationSignal cancellationSignal2 = cancellationSignal;
                final PrintAttributes printAttributes3 = printAttributes2;
                final PrintAttributes printAttributes4 = printAttributes;
                final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback2 = layoutResultCallback;
                this.mLoadBitmap = new AsyncTask<Uri, Boolean, Bitmap>() {
                    /* access modifiers changed from: protected */
                    public void onPreExecute() {
                        cancellationSignal2.setOnCancelListener(new CancellationSignal.OnCancelListener() {
                            public void onCancel() {
                                PrintUriAdapter.this.cancelLoad();
                                C25461.this.cancel(false);
                            }
                        });
                    }

                    /* access modifiers changed from: protected */
                    public Bitmap doInBackground(Uri... uriArr) {
                        try {
                            PrintUriAdapter printUriAdapter = PrintUriAdapter.this;
                            return PrintHelper.this.loadConstrainedBitmap(printUriAdapter.mImageFile);
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }

                    /* access modifiers changed from: protected */
                    public void onCancelled(Bitmap bitmap) {
                        layoutResultCallback2.onLayoutCancelled();
                        PrintUriAdapter.this.mLoadBitmap = null;
                    }

                    /* access modifiers changed from: protected */
                    public void onPostExecute(Bitmap bitmap) {
                        PrintAttributes.MediaSize mediaSize;
                        super.onPostExecute(bitmap);
                        if (bitmap != null && (!PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION || PrintHelper.this.mOrientation == 0)) {
                            synchronized (this) {
                                mediaSize = PrintUriAdapter.this.mAttributes.getMediaSize();
                            }
                            if (!(mediaSize == null || mediaSize.isPortrait() == PrintHelper.isPortrait(bitmap))) {
                                Matrix matrix = new Matrix();
                                matrix.postRotate(90.0f);
                                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                            }
                        }
                        PrintUriAdapter.this.mBitmap = bitmap;
                        if (bitmap != null) {
                            layoutResultCallback2.onLayoutFinished(new PrintDocumentInfo.Builder(PrintUriAdapter.this.mJobName).setContentType(1).setPageCount(1).build(), true ^ printAttributes3.equals(printAttributes4));
                        } else {
                            layoutResultCallback2.onLayoutFailed((CharSequence) null);
                        }
                        PrintUriAdapter.this.mLoadBitmap = null;
                    }
                }.execute(new Uri[0]);
            }
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            PrintHelper.this.writeBitmap(this.mAttributes, this.mFittingMode, this.mBitmap, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public PrintHelper(@NonNull Context context) {
        this.mContext = context;
    }

    static Bitmap convertBitmapForColorMode(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    @RequiresApi(19)
    private static PrintAttributes.Builder copyAttributes(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    static Matrix getMatrix(int i, int i2, RectF rectF, int i3) {
        float f;
        Matrix matrix = new Matrix();
        float f2 = (float) i;
        float width = rectF.width() / f2;
        if (i3 == 2) {
            f = Math.max(width, rectF.height() / ((float) i2));
        } else {
            f = Math.min(width, rectF.height() / ((float) i2));
        }
        matrix.postScale(f, f);
        matrix.postTranslate((rectF.width() - (f2 * f)) / 2.0f, (rectF.height() - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    static boolean isPortrait(Bitmap bitmap) {
        if (bitmap.getWidth() <= bitmap.getHeight()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[SYNTHETIC, Splitter:B:19:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap loadBitmap(android.net.Uri r5, android.graphics.BitmapFactory.Options r6) {
        /*
            r4 = this;
            java.lang.String r0 = "close fail "
            java.lang.String r1 = "PrintHelper"
            if (r5 == 0) goto L_0x0031
            android.content.Context r2 = r4.mContext
            if (r2 == 0) goto L_0x0031
            r3 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0025 }
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch:{ all -> 0x0025 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch:{ all -> 0x0022 }
            if (r5 == 0) goto L_0x0021
            r5.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0021
        L_0x001d:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0021:
            return r6
        L_0x0022:
            r6 = move-exception
            r3 = r5
            goto L_0x0026
        L_0x0025:
            r6 = move-exception
        L_0x0026:
            if (r3 == 0) goto L_0x0030
            r3.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0030:
            throw r6
        L_0x0031:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "bad argument to loadBitmap"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.print.PrintHelper.loadBitmap(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static boolean systemSupportsPrint() {
        return true;
    }

    public int getColorMode() {
        return this.mColorMode;
    }

    public int getOrientation() {
        int i = this.mOrientation;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public int getScaleMode() {
        return this.mScaleMode;
    }

    /* access modifiers changed from: package-private */
    public Bitmap loadConstrainedBitmap(Uri uri) {
        BitmapFactory.Options options;
        if (uri == null || this.mContext == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        loadBitmap(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int max = Math.max(i, i2);
            int i3 = 1;
            while (max > MAX_PRINT_SIZE) {
                max >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.mLock) {
                    options = new BitmapFactory.Options();
                    this.mDecodeOptions = options;
                    options.inMutable = true;
                    options.inSampleSize = i3;
                }
                try {
                    Bitmap loadBitmap = loadBitmap(uri, options);
                    synchronized (this.mLock) {
                        this.mDecodeOptions = null;
                    }
                    return loadBitmap;
                } catch (Throwable th) {
                    synchronized (this.mLock) {
                        this.mDecodeOptions = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public void printBitmap(@NonNull String str, @NonNull Bitmap bitmap) {
        printBitmap(str, bitmap, (OnPrintFinishCallback) null);
    }

    public void setColorMode(int i) {
        this.mColorMode = i;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public void setScaleMode(int i) {
        this.mScaleMode = i;
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(19)
    public void writeBitmap(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        final PrintAttributes printAttributes2;
        if (IS_MIN_MARGINS_HANDLING_CORRECT) {
            printAttributes2 = printAttributes;
        } else {
            printAttributes2 = copyAttributes(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
        }
        final CancellationSignal cancellationSignal2 = cancellationSignal;
        final Bitmap bitmap2 = bitmap;
        final PrintAttributes printAttributes3 = printAttributes;
        final int i2 = i;
        final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        final PrintDocumentAdapter.WriteResultCallback writeResultCallback2 = writeResultCallback;
        new AsyncTask<Void, Void, Throwable>() {
            /* access modifiers changed from: protected */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x009f */
            /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00bf */
            /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d2 */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Throwable doInBackground(java.lang.Void... r9) {
                /*
                    r8 = this;
                    android.os.CancellationSignal r9 = r4     // Catch:{ all -> 0x00da }
                    boolean r9 = r9.isCanceled()     // Catch:{ all -> 0x00da }
                    r0 = 0
                    if (r9 == 0) goto L_0x000a
                    return r0
                L_0x000a:
                    android.print.pdf.PrintedPdfDocument r9 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00da }
                    androidx.print.PrintHelper r1 = androidx.print.PrintHelper.this     // Catch:{ all -> 0x00da }
                    android.content.Context r1 = r1.mContext     // Catch:{ all -> 0x00da }
                    android.print.PrintAttributes r2 = r5     // Catch:{ all -> 0x00da }
                    r9.<init>(r1, r2)     // Catch:{ all -> 0x00da }
                    android.graphics.Bitmap r1 = r6     // Catch:{ all -> 0x00da }
                    android.print.PrintAttributes r2 = r5     // Catch:{ all -> 0x00da }
                    int r2 = r2.getColorMode()     // Catch:{ all -> 0x00da }
                    android.graphics.Bitmap r1 = androidx.print.PrintHelper.convertBitmapForColorMode(r1, r2)     // Catch:{ all -> 0x00da }
                    android.os.CancellationSignal r2 = r4     // Catch:{ all -> 0x00da }
                    boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00da }
                    if (r2 == 0) goto L_0x002a
                    return r0
                L_0x002a:
                    r2 = 1
                    android.graphics.pdf.PdfDocument$Page r3 = r9.startPage(r2)     // Catch:{ all -> 0x00c7 }
                    boolean r4 = androidx.print.PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT     // Catch:{ all -> 0x00c7 }
                    if (r4 == 0) goto L_0x0041
                    android.graphics.RectF r2 = new android.graphics.RectF     // Catch:{ all -> 0x00c7 }
                    android.graphics.pdf.PdfDocument$PageInfo r5 = r3.getInfo()     // Catch:{ all -> 0x00c7 }
                    android.graphics.Rect r5 = r5.getContentRect()     // Catch:{ all -> 0x00c7 }
                    r2.<init>(r5)     // Catch:{ all -> 0x00c7 }
                    goto L_0x0064
                L_0x0041:
                    android.print.pdf.PrintedPdfDocument r5 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00c7 }
                    androidx.print.PrintHelper r6 = androidx.print.PrintHelper.this     // Catch:{ all -> 0x00c7 }
                    android.content.Context r6 = r6.mContext     // Catch:{ all -> 0x00c7 }
                    android.print.PrintAttributes r7 = r7     // Catch:{ all -> 0x00c7 }
                    r5.<init>(r6, r7)     // Catch:{ all -> 0x00c7 }
                    android.graphics.pdf.PdfDocument$Page r2 = r5.startPage(r2)     // Catch:{ all -> 0x00c7 }
                    android.graphics.RectF r6 = new android.graphics.RectF     // Catch:{ all -> 0x00c7 }
                    android.graphics.pdf.PdfDocument$PageInfo r7 = r2.getInfo()     // Catch:{ all -> 0x00c7 }
                    android.graphics.Rect r7 = r7.getContentRect()     // Catch:{ all -> 0x00c7 }
                    r6.<init>(r7)     // Catch:{ all -> 0x00c7 }
                    r5.finishPage(r2)     // Catch:{ all -> 0x00c7 }
                    r5.close()     // Catch:{ all -> 0x00c7 }
                    r2 = r6
                L_0x0064:
                    int r5 = r1.getWidth()     // Catch:{ all -> 0x00c7 }
                    int r6 = r1.getHeight()     // Catch:{ all -> 0x00c7 }
                    int r7 = r8     // Catch:{ all -> 0x00c7 }
                    android.graphics.Matrix r5 = androidx.print.PrintHelper.getMatrix(r5, r6, r2, r7)     // Catch:{ all -> 0x00c7 }
                    if (r4 == 0) goto L_0x0075
                    goto L_0x0083
                L_0x0075:
                    float r4 = r2.left     // Catch:{ all -> 0x00c7 }
                    float r6 = r2.top     // Catch:{ all -> 0x00c7 }
                    r5.postTranslate(r4, r6)     // Catch:{ all -> 0x00c7 }
                    android.graphics.Canvas r4 = r3.getCanvas()     // Catch:{ all -> 0x00c7 }
                    r4.clipRect(r2)     // Catch:{ all -> 0x00c7 }
                L_0x0083:
                    android.graphics.Canvas r2 = r3.getCanvas()     // Catch:{ all -> 0x00c7 }
                    r2.drawBitmap(r1, r5, r0)     // Catch:{ all -> 0x00c7 }
                    r9.finishPage(r3)     // Catch:{ all -> 0x00c7 }
                    android.os.CancellationSignal r2 = r4     // Catch:{ all -> 0x00c7 }
                    boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00c7 }
                    if (r2 == 0) goto L_0x00a7
                    r9.close()     // Catch:{ all -> 0x00da }
                    android.os.ParcelFileDescriptor r9 = r9     // Catch:{ all -> 0x00da }
                    if (r9 == 0) goto L_0x009f
                    r9.close()     // Catch:{ IOException -> 0x009f }
                L_0x009f:
                    android.graphics.Bitmap r9 = r6     // Catch:{ all -> 0x00da }
                    if (r1 == r9) goto L_0x00a6
                    r1.recycle()     // Catch:{ all -> 0x00da }
                L_0x00a6:
                    return r0
                L_0x00a7:
                    java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c7 }
                    android.os.ParcelFileDescriptor r3 = r9     // Catch:{ all -> 0x00c7 }
                    java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x00c7 }
                    r2.<init>(r3)     // Catch:{ all -> 0x00c7 }
                    r9.writeTo(r2)     // Catch:{ all -> 0x00c7 }
                    r9.close()     // Catch:{ all -> 0x00da }
                    android.os.ParcelFileDescriptor r9 = r9     // Catch:{ all -> 0x00da }
                    if (r9 == 0) goto L_0x00bf
                    r9.close()     // Catch:{ IOException -> 0x00bf }
                L_0x00bf:
                    android.graphics.Bitmap r9 = r6     // Catch:{ all -> 0x00da }
                    if (r1 == r9) goto L_0x00c6
                    r1.recycle()     // Catch:{ all -> 0x00da }
                L_0x00c6:
                    return r0
                L_0x00c7:
                    r0 = move-exception
                    r9.close()     // Catch:{ all -> 0x00da }
                    android.os.ParcelFileDescriptor r9 = r9     // Catch:{ all -> 0x00da }
                    if (r9 == 0) goto L_0x00d2
                    r9.close()     // Catch:{ IOException -> 0x00d2 }
                L_0x00d2:
                    android.graphics.Bitmap r9 = r6     // Catch:{ all -> 0x00da }
                    if (r1 == r9) goto L_0x00d9
                    r1.recycle()     // Catch:{ all -> 0x00da }
                L_0x00d9:
                    throw r0     // Catch:{ all -> 0x00da }
                L_0x00da:
                    r9 = move-exception
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.print.PrintHelper.C25451.doInBackground(java.lang.Void[]):java.lang.Throwable");
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Throwable th) {
                if (cancellationSignal2.isCanceled()) {
                    writeResultCallback2.onWriteCancelled();
                } else if (th == null) {
                    writeResultCallback2.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                } else {
                    Log.e(PrintHelper.LOG_TAG, "Error writing printed content", th);
                    writeResultCallback2.onWriteFailed((CharSequence) null);
                }
            }
        }.execute(new Void[0]);
    }

    public void printBitmap(@NonNull String str, @NonNull Bitmap bitmap, @Nullable OnPrintFinishCallback onPrintFinishCallback) {
        PrintAttributes.MediaSize mediaSize;
        if (bitmap != null) {
            PrintManager printManager = (PrintManager) this.mContext.getSystemService("print");
            if (isPortrait(bitmap)) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
            } else {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
            }
            printManager.print(str, new PrintBitmapAdapter(str, this.mScaleMode, bitmap, onPrintFinishCallback), new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.mColorMode).build());
        }
    }

    public void printBitmap(@NonNull String str, @NonNull Uri uri) {
        printBitmap(str, uri, (OnPrintFinishCallback) null);
    }

    public void printBitmap(@NonNull String str, @NonNull Uri uri, @Nullable OnPrintFinishCallback onPrintFinishCallback) {
        PrintUriAdapter printUriAdapter = new PrintUriAdapter(str, uri, onPrintFinishCallback, this.mScaleMode);
        PrintManager printManager = (PrintManager) this.mContext.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.mColorMode);
        int i = this.mOrientation;
        if (i == 1 || i == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, printUriAdapter, builder.build());
    }
}
