package com.qbit_me.swiftklib_playground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform