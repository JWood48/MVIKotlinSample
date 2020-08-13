enableFeaturePreview("GRADLE_METADATA")

include(":todo-common")
include(":todo-common-internal")
include(":todo-reaktive")
include(":todo-coroutines")
//include(":todo-darwin-umbrella")
/*
doIfAndroidTargetAvailable {
    include(":todo-app-android")
}


 */

includeBuild("../MVIKotlin")

doIfJsTargetAvailable {
    include(":todo-app-js")
}
if (find("check_publication")?.toString()?.toBoolean() == true) {
    include(":tools:check-publication")
}

enum class BuildType {
    ALL, METADATA, NON_NATIVE, ANDROID, JVM, JS, LINUX, IOS, MAC_OS
}

val ExtensionAware.buildType: BuildType
    get() =
        find("build_type")
            ?.toString()
            ?.let(BuildType::valueOf)
            ?: BuildType.ALL

fun ExtensionAware.find(key: String) =
    if (extra.has(key)) extra.get(key) else null

fun doIfJvmTargetAvailable(block: () -> Unit) {
    if (buildType in setOf(BuildType.ALL, BuildType.METADATA, BuildType.NON_NATIVE, BuildType.JVM)) {
        block()
    }
}

fun doIfAndroidTargetAvailable(block: () -> Unit) {
    if (buildType in setOf(BuildType.ALL, BuildType.METADATA, BuildType.NON_NATIVE, BuildType.ANDROID)) {
        block()
    }
}

fun doIfJsTargetAvailable(block: () -> Unit) {
    if (buildType in setOf(BuildType.ALL, BuildType.METADATA, BuildType.NON_NATIVE, BuildType.JS)) {
        block()
    }
}
