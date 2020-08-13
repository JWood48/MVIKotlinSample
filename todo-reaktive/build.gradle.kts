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
                implementation(Deps.MviKotlin.ExtCoroutines)
                api(project(":todo-common"))
                implementation(project(":todo-common-internal"))
                implementation(Deps.Badoo.Reaktive.Reaktive)
                implementation(Deps.Badoo.Reaktive.Utils)
            }
        }

        commonTest {
            dependencies {
                implementation(Deps.MviKotlin.Main)
                implementation(Deps.Badoo.Reaktive.ReaktiveTesting)
            }
        }
    }
}
