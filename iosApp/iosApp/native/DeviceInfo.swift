
import Foundation
import UIKit

@objc public class DeviceInfo : NSObject {
    @objc public static func getDeviceModel() -> String {
        return UIDevice.current.model
    }

    @objc public static func getSystemVersion() -> String {
        return UIDevice.current.systemVersion
    }
}