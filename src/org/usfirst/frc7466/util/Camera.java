package org.usfirst.frc7466.util;
import edu.wpi.cscore.MjpegServer;
import edu.wpi.cscore.UsbCamera;
public class Camera {
        private static UsbCamera usbCamera;
        public static void init() {
            usbCamera = new UsbCamera("USB Camera 0", 0); // get Camera
            MjpegServer mjpegServer1 = new MjpegServer("serve_USB Camera 0", 1181);
            mjpegServer1.setSource(usbCamera);
        }
}
