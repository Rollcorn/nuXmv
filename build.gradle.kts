plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    id("org.jetbrains.intellij") version "1.13.3"
    id("org.jetbrains.grammarkit") version "2022.3.2"
    antlr
}
sourceSets["main"].java.srcDirs("src/main/gen")

group = "com.shkanduik.nuxmv"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2022.2.5")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf(/* Plugin Dependencies */))
}

dependencies {
//    implementation(libs.annotations)
//    antlr("org.antlr:antlr4:4.13.1")
//    implementation("org.antlr:antlr4-intellij-adaptor:0.1")
//    compile("org.antlr:antlr4-intellij-adaptor:0.1")
//    implementation("org.antlr:antlr4-runtime:4.12.0") // используйте актуальную версию
    implementation("org.antlr:antlr4-intellij-adaptor:0.1")

//    implementation("org.antlr:antlr4-idea-plugin:0.1") // укажите версию плагина IDEA

}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    patchPluginXml {
        sinceBuild.set("222")
        untilBuild.set("232.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}
