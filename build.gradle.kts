plugins {
    `kotlin-dsl`
}

allprojects {
    repositories {

        google()
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://kotlin.bintray.com/kotlinx")
        maven("https://dl.bintray.com/ekito/koin")
        maven("https://dl.bintray.com/arkivanov/maven")
        maven("https://dl.bintray.com/badoo/maven")
    }
}
