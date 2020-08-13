buildTargets = setOf(
    //BuildTarget.Android,
    BuildTarget.Js
    //BuildTarget.IosX64,
    //BuildTarget.IosArm64
)

setupMultiplatform()

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(Deps.MviKotlin.Core)
                api(project(":todo-common"))
                implementation(Deps.Badoo.Reaktive.Utils)
            }
        }
    }
}
