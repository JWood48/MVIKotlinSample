buildTargets = setOf(
    //BuildTarget.Android,
    BuildTarget.Js
    //BuildTarget.IosX64,
    //BuildTarget.IosArm64
)

setupMultiplatform()
//setupXcodeSync()

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(Deps.MviKotlin.Core)
                implementation(Deps.MviKotlin.Rx)
                implementation(Deps.MviKotlin.RxInt)
                implementation(Deps.Badoo.Reaktive.Utils)
            }
        }

        jsMain {

        }
    }
}
