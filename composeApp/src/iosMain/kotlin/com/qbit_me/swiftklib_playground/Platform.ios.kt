package com.qbit_me.swiftklib_playground

import com.qbit_me.swiftklib.native.DeviceInfo
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    @OptIn(ExperimentalForeignApi::class)
    override val name: String = DeviceInfo.getDeviceModel() + " AA " + DeviceInfo.getSystemVersion()
}

actual fun getPlatform(): Platform = IOSPlatform()