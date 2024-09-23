package com.app.invoice.shared.qr;

import java.io.IOException;

import com.google.zxing.WriterException;

public interface QRCodeGeneratorPort {
    byte[] generateQRCode(String  data) throws WriterException, IOException;
}
