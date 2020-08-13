buildTargets = setOf(
        //BuildTarget.Android,
        BuildTarget.Js)

setupMultiplatform()

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(Deps.MviKotlin.Core)
                implementation(Deps.MviKotlin.ExtCoroutines)
                api(project(":todo-common"))
                implementation(project(":todo-common-internal"))
                implementation(Deps.Jetbrains.Kotlinx.Coroutines.Core.Common)
            }
        }

        jvmCommonMain {
            dependencies {
                implementation(Deps.Jetbrains.Kotlinx.Coroutines.Core)
            }
        }

        nativeCommonMain {
            dependencies {
                implementation(Deps.Jetbrains.Kotlinx.Coroutines.Core.Native)
            }
        }

        jsMain {
            dependencies {
                implementation(Deps.Jetbrains.Kotlinx.Coroutines.Core.Js)
            }
        }
    }
}
